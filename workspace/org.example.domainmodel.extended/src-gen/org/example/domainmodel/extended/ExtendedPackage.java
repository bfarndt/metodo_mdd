/**
 */
package org.example.domainmodel.extended;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.domainmodel.extended.ExtendedFactory
 * @model kind="package"
 * @generated
 */
public interface ExtendedPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "extended";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.org/domainmodel/Extended";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "extended";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExtendedPackage eINSTANCE = org.example.domainmodel.extended.impl.ExtendedPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.DomainmodelImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Nome Proj</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__NOME_PROJ = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.AbstractElementImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.PackageDeclarationImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.ImportImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.AbstractTypeImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getAbstractType()
   * @generated
   */
  int ABSTRACT_TYPE = 4;

  /**
   * The number of structural features of the '<em>Abstract Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.EntityImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SUPER_TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FEATURES = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.FeatureImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 6;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__MAX = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.PageImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getPage()
   * @generated
   */
  int PAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__TITLE = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__HEADER = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Footer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__FOOTER = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Forms</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__FORMS = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.FormTypesImpl <em>Form Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.FormTypesImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFormTypes()
   * @generated
   */
  int FORM_TYPES = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_TYPES__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Form Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_TYPES_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.FormImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getForm()
   * @generated
   */
  int FORM = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__NAME = FORM_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__GET = FORM_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Post</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__POST = FORM_TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Put</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__PUT = FORM_TYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__DELETE = FORM_TYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__ENTITY = FORM_TYPES_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = FORM_TYPES_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.FormNewEntityOnlyImpl <em>Form New Entity Only</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.FormNewEntityOnlyImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFormNewEntityOnly()
   * @generated
   */
  int FORM_NEW_ENTITY_ONLY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_NEW_ENTITY_ONLY__NAME = FORM_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_NEW_ENTITY_ONLY__ENTITY = FORM_TYPES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Form New Entity Only</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_NEW_ENTITY_ONLY_FEATURE_COUNT = FORM_TYPES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.domainmodel.extended.impl.FormReportImpl <em>Form Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.domainmodel.extended.impl.FormReportImpl
   * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFormReport()
   * @generated
   */
  int FORM_REPORT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_REPORT__NAME = FORM_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_REPORT__FILTER = FORM_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_REPORT__ORDER = FORM_TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pagination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_REPORT__PAGINATION = FORM_TYPES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Form Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_REPORT_FEATURE_COUNT = FORM_TYPES_FEATURE_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see org.example.domainmodel.extended.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Domainmodel#getNomeProj <em>Nome Proj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome Proj</em>'.
   * @see org.example.domainmodel.extended.Domainmodel#getNomeProj()
   * @see #getDomainmodel()
   * @generated
   */
  EAttribute getDomainmodel_NomeProj();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.extended.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.example.domainmodel.extended.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.example.domainmodel.extended.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.extended.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.extended.PackageDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.example.domainmodel.extended.PackageDeclaration#getElements()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.example.domainmodel.extended.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.example.domainmodel.extended.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.example.domainmodel.extended.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.AbstractType <em>Abstract Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Type</em>'.
   * @see org.example.domainmodel.extended.AbstractType
   * @generated
   */
  EClass getAbstractType();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.example.domainmodel.extended.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.extended.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.extended.Entity#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.example.domainmodel.extended.Entity#getSuperType()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.domainmodel.extended.Entity#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.example.domainmodel.extended.Entity#getFeatures()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Features();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.example.domainmodel.extended.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Feature#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.example.domainmodel.extended.Feature#getMin()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Min();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Feature#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.example.domainmodel.extended.Feature#getMax()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Max();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.extended.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.example.domainmodel.extended.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.example.domainmodel.extended.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.example.domainmodel.extended.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.extended.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Page#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.example.domainmodel.extended.Page#getTitle()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Title();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Page#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see org.example.domainmodel.extended.Page#getHeader()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Header();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Page#getFooter <em>Footer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Footer</em>'.
   * @see org.example.domainmodel.extended.Page#getFooter()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Footer();

  /**
   * Returns the meta object for the reference list '{@link org.example.domainmodel.extended.Page#getForms <em>Forms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Forms</em>'.
   * @see org.example.domainmodel.extended.Page#getForms()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Forms();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.FormTypes <em>Form Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Types</em>'.
   * @see org.example.domainmodel.extended.FormTypes
   * @generated
   */
  EClass getFormTypes();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.FormTypes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.domainmodel.extended.FormTypes#getName()
   * @see #getFormTypes()
   * @generated
   */
  EAttribute getFormTypes_Name();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see org.example.domainmodel.extended.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Form#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.example.domainmodel.extended.Form#getGet()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Get();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Form#getPost <em>Post</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Post</em>'.
   * @see org.example.domainmodel.extended.Form#getPost()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Post();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Form#getPut <em>Put</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Put</em>'.
   * @see org.example.domainmodel.extended.Form#getPut()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Put();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.Form#getDelete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delete</em>'.
   * @see org.example.domainmodel.extended.Form#getDelete()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Delete();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.extended.Form#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.example.domainmodel.extended.Form#getEntity()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Entity();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.FormNewEntityOnly <em>Form New Entity Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form New Entity Only</em>'.
   * @see org.example.domainmodel.extended.FormNewEntityOnly
   * @generated
   */
  EClass getFormNewEntityOnly();

  /**
   * Returns the meta object for the reference '{@link org.example.domainmodel.extended.FormNewEntityOnly#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.example.domainmodel.extended.FormNewEntityOnly#getEntity()
   * @see #getFormNewEntityOnly()
   * @generated
   */
  EReference getFormNewEntityOnly_Entity();

  /**
   * Returns the meta object for class '{@link org.example.domainmodel.extended.FormReport <em>Form Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form Report</em>'.
   * @see org.example.domainmodel.extended.FormReport
   * @generated
   */
  EClass getFormReport();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.FormReport#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filter</em>'.
   * @see org.example.domainmodel.extended.FormReport#getFilter()
   * @see #getFormReport()
   * @generated
   */
  EAttribute getFormReport_Filter();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.FormReport#getOrder <em>Order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order</em>'.
   * @see org.example.domainmodel.extended.FormReport#getOrder()
   * @see #getFormReport()
   * @generated
   */
  EAttribute getFormReport_Order();

  /**
   * Returns the meta object for the attribute '{@link org.example.domainmodel.extended.FormReport#getPagination <em>Pagination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pagination</em>'.
   * @see org.example.domainmodel.extended.FormReport#getPagination()
   * @see #getFormReport()
   * @generated
   */
  EAttribute getFormReport_Pagination();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExtendedFactory getExtendedFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.DomainmodelImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Nome Proj</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAINMODEL__NOME_PROJ = eINSTANCE.getDomainmodel_NomeProj();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.PackageDeclarationImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_DECLARATION__ELEMENTS = eINSTANCE.getPackageDeclaration_Elements();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.AbstractElementImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.ImportImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.AbstractTypeImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getAbstractType()
     * @generated
     */
    EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.EntityImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.FeatureImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MIN = eINSTANCE.getFeature_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__MAX = eINSTANCE.getFeature_Max();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.PageImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__HEADER = eINSTANCE.getPage_Header();

    /**
     * The meta object literal for the '<em><b>Footer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__FOOTER = eINSTANCE.getPage_Footer();

    /**
     * The meta object literal for the '<em><b>Forms</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__FORMS = eINSTANCE.getPage_Forms();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.FormTypesImpl <em>Form Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.FormTypesImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFormTypes()
     * @generated
     */
    EClass FORM_TYPES = eINSTANCE.getFormTypes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_TYPES__NAME = eINSTANCE.getFormTypes_Name();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.FormImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__GET = eINSTANCE.getForm_Get();

    /**
     * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__POST = eINSTANCE.getForm_Post();

    /**
     * The meta object literal for the '<em><b>Put</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__PUT = eINSTANCE.getForm_Put();

    /**
     * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__DELETE = eINSTANCE.getForm_Delete();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__ENTITY = eINSTANCE.getForm_Entity();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.FormNewEntityOnlyImpl <em>Form New Entity Only</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.FormNewEntityOnlyImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFormNewEntityOnly()
     * @generated
     */
    EClass FORM_NEW_ENTITY_ONLY = eINSTANCE.getFormNewEntityOnly();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM_NEW_ENTITY_ONLY__ENTITY = eINSTANCE.getFormNewEntityOnly_Entity();

    /**
     * The meta object literal for the '{@link org.example.domainmodel.extended.impl.FormReportImpl <em>Form Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.domainmodel.extended.impl.FormReportImpl
     * @see org.example.domainmodel.extended.impl.ExtendedPackageImpl#getFormReport()
     * @generated
     */
    EClass FORM_REPORT = eINSTANCE.getFormReport();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_REPORT__FILTER = eINSTANCE.getFormReport_Filter();

    /**
     * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_REPORT__ORDER = eINSTANCE.getFormReport_Order();

    /**
     * The meta object literal for the '<em><b>Pagination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM_REPORT__PAGINATION = eINSTANCE.getFormReport_Pagination();

  }

} //ExtendedPackage
