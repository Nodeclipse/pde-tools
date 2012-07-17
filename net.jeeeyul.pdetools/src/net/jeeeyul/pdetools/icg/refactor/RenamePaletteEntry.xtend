package net.jeeeyul.pdetools.icg.refactor

import java.util.HashMap
import java.util.List
import net.jeeeyul.pdetools.Activator
import net.jeeeyul.pdetools.icg.builder.model.ICGConfiguration
import net.jeeeyul.pdetools.icg.builder.model.PaletteModelDeltaGenerator
import net.jeeeyul.pdetools.icg.builder.model.PaletteModelGenerator
import net.jeeeyul.pdetools.icg.builder.model.palette.FieldNameOwner
import net.jeeeyul.pdetools.icg.builder.model.palette.ImageFile
import net.jeeeyul.pdetools.icg.builder.model.palette.Palette
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.ltk.core.refactoring.Change
import org.eclipse.ltk.core.refactoring.CompositeChange
import org.eclipse.ltk.core.refactoring.RefactoringStatus
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant

class RenamePaletteEntry extends RenameParticipant {
	ICGConfiguration config
	IResource resource
	List<Change> result
	
	new(){
	}

	override checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		println("컨디션")
		return null
	}

	override createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		println("체인지 작성")
		result = newArrayList()
		var palette = loadPreviousPaletteModel()
		var newPalette = createNewPaletteModel()
		var deltaGenerator = new PaletteModelDeltaGenerator();
		var diffs = deltaGenerator.compare(palette, newPalette)
		
		for(eachDelta : diffs){
			if(eachDelta.refactorTarget){
				try{
					var javaRefactor = new JavaRefactor(eachDelta.before.resource.project)
					var desc = javaRefactor.createDescriptor(eachDelta)
					var refactor = desc.createRefactoring(RefactoringStatus::createFatalErrorStatus("Error"));
					var status = refactor.checkAllConditions(new NullProgressMonitor)
					if(!status.hasFatalError){
						var change = refactor.createChange(new NullProgressMonitor)
						result += change
					}	
				}catch(Exception e){
					e.printStackTrace()
				}
			}
		}
		
		if(!result.empty){
			return new CompositeChange("아오 씨바", result)
		}
		return null
	} 

	override getName() {
	}

	override protected initialize(Object element) {
		resource = Platform::adapterManager.getAdapter(element, typeof(IResource)) as IResource
		config = new ICGConfiguration(resource.project)
		if(!config.monitoringFolder.fullPath.isPrefixOf(resource.fullPath)) {
			return false
		}
		return true
	}

	def loadPreviousPaletteModel(){
		try{
			var uri = URI::createPlatformResourceURI(resource.project.fullPath.append('''.settings/«Activator::^default.bundle.symbolicName».palette.xml''').toPortableString, true)
			var resource = new XMLResourceImpl(uri)
			resource.load(new HashMap)
			resource.contents.get(0) as Palette
		}catch(Exception e){
			e.printStackTrace()
			return null
		}
	}

	def createNewPaletteModel(){
		var generator = new PaletteModelGenerator(config)
		generator.nameProvider = [
			if(it == resource) {
				new Path(arguments.newName).removeFileExtension.lastSegment
			}
		]
		generator.generate()
	}
	
	def dispatch getResource(FieldNameOwner obj){
		null
	}
	
	def dispatch getResource(Palette palette){
		palette.folder
	}
	
	def dispatch getResource(ImageFile file){
		file.file
	}
}