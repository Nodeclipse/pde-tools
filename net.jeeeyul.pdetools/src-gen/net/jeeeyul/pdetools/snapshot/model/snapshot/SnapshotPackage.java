/**
 */
package net.jeeeyul.pdetools.snapshot.model.snapshot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='net.jeeeyul.pdetools.snapshot.model'"
 * @generated
 */
public interface SnapshotPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "snapshot";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://jeeeyul.net/pde-tools/snapshot";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "s";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SnapshotPackage eINSTANCE = net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl.init();

  /**
   * The meta object id for the '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotRepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotRepositoryImpl
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl#getSnapshotRepository()
   * @generated
   */
  int SNAPSHOT_REPOSITORY = 0;

  /**
   * The feature id for the '<em><b>Repository Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_REPOSITORY__REPOSITORY_LOCATION = 0;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_REPOSITORY__GROUPS = 1;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_REPOSITORY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_REPOSITORY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotGroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotGroupImpl
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl#getSnapshotGroup()
   * @generated
   */
  int SNAPSHOT_GROUP = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_GROUP__PARENT = 0;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_GROUP__DATE = 1;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_GROUP__ENTRIES = 2;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_GROUP_FEATURE_COUNT = 3;

  /**
   * The number of operations of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_GROUP_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotEntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotEntryImpl
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl#getSnapshotEntry()
   * @generated
   */
  int SNAPSHOT_ENTRY = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_ENTRY__PARENT = 0;

  /**
   * The feature id for the '<em><b>Taken Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_ENTRY__TAKEN_TIME = 1;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_ENTRY__FILE_NAME = 2;

  /**
   * The feature id for the '<em><b>Absoulte File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_ENTRY__ABSOULTE_FILE_PATH = 3;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_ENTRY_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SNAPSHOT_ENTRY_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotRepository
   * @generated
   */
  EClass getSnapshotRepository();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotRepository#getRepositoryLocation <em>Repository Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Repository Location</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotRepository#getRepositoryLocation()
   * @see #getSnapshotRepository()
   * @generated
   */
  EAttribute getSnapshotRepository_RepositoryLocation();

  /**
   * Returns the meta object for the containment reference list '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotRepository#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotRepository#getGroups()
   * @see #getSnapshotRepository()
   * @generated
   */
  EReference getSnapshotRepository_Groups();

  /**
   * Returns the meta object for class '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup
   * @generated
   */
  EClass getSnapshotGroup();

  /**
   * Returns the meta object for the container reference '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup#getParent()
   * @see #getSnapshotGroup()
   * @generated
   */
  EReference getSnapshotGroup_Parent();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup#getDate()
   * @see #getSnapshotGroup()
   * @generated
   */
  EAttribute getSnapshotGroup_Date();

  /**
   * Returns the meta object for the containment reference list '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotGroup#getEntries()
   * @see #getSnapshotGroup()
   * @generated
   */
  EReference getSnapshotGroup_Entries();

  /**
   * Returns the meta object for class '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry
   * @generated
   */
  EClass getSnapshotEntry();

  /**
   * Returns the meta object for the container reference '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getParent()
   * @see #getSnapshotEntry()
   * @generated
   */
  EReference getSnapshotEntry_Parent();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getTakenTime <em>Taken Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Taken Time</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getTakenTime()
   * @see #getSnapshotEntry()
   * @generated
   */
  EAttribute getSnapshotEntry_TakenTime();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getFileName()
   * @see #getSnapshotEntry()
   * @generated
   */
  EAttribute getSnapshotEntry_FileName();

  /**
   * Returns the meta object for the attribute '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getAbsoulteFilePath <em>Absoulte File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Absoulte File Path</em>'.
   * @see net.jeeeyul.pdetools.snapshot.model.snapshot.SnapshotEntry#getAbsoulteFilePath()
   * @see #getSnapshotEntry()
   * @generated
   */
  EAttribute getSnapshotEntry_AbsoulteFilePath();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SnapshotFactory getSnapshotFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotRepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotRepositoryImpl
     * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl#getSnapshotRepository()
     * @generated
     */
    EClass SNAPSHOT_REPOSITORY = eINSTANCE.getSnapshotRepository();

    /**
     * The meta object literal for the '<em><b>Repository Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SNAPSHOT_REPOSITORY__REPOSITORY_LOCATION = eINSTANCE.getSnapshotRepository_RepositoryLocation();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SNAPSHOT_REPOSITORY__GROUPS = eINSTANCE.getSnapshotRepository_Groups();

    /**
     * The meta object literal for the '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotGroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotGroupImpl
     * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl#getSnapshotGroup()
     * @generated
     */
    EClass SNAPSHOT_GROUP = eINSTANCE.getSnapshotGroup();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SNAPSHOT_GROUP__PARENT = eINSTANCE.getSnapshotGroup_Parent();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SNAPSHOT_GROUP__DATE = eINSTANCE.getSnapshotGroup_Date();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SNAPSHOT_GROUP__ENTRIES = eINSTANCE.getSnapshotGroup_Entries();

    /**
     * The meta object literal for the '{@link net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotEntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotEntryImpl
     * @see net.jeeeyul.pdetools.snapshot.model.snapshot.impl.SnapshotPackageImpl#getSnapshotEntry()
     * @generated
     */
    EClass SNAPSHOT_ENTRY = eINSTANCE.getSnapshotEntry();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SNAPSHOT_ENTRY__PARENT = eINSTANCE.getSnapshotEntry_Parent();

    /**
     * The meta object literal for the '<em><b>Taken Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SNAPSHOT_ENTRY__TAKEN_TIME = eINSTANCE.getSnapshotEntry_TakenTime();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SNAPSHOT_ENTRY__FILE_NAME = eINSTANCE.getSnapshotEntry_FileName();

    /**
     * The meta object literal for the '<em><b>Absoulte File Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SNAPSHOT_ENTRY__ABSOULTE_FILE_PATH = eINSTANCE.getSnapshotEntry_AbsoulteFilePath();

  }

} //SnapshotPackage