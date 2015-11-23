/**
 */
package org.example.domainmodel.extended;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.Page#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Page#getHeader <em>Header</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Page#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Page#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.domainmodel.extended.ExtendedPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getPage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Page#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getPage_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Page#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' attribute.
   * @see #setHeader(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getPage_Header()
   * @model
   * @generated
   */
  String getHeader();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Page#getHeader <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' attribute.
   * @see #getHeader()
   * @generated
   */
  void setHeader(String value);

  /**
   * Returns the value of the '<em><b>Footer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Footer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Footer</em>' attribute.
   * @see #setFooter(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getPage_Footer()
   * @model
   * @generated
   */
  String getFooter();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Page#getFooter <em>Footer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Footer</em>' attribute.
   * @see #getFooter()
   * @generated
   */
  void setFooter(String value);

  /**
   * Returns the value of the '<em><b>Forms</b></em>' reference list.
   * The list contents are of type {@link org.example.domainmodel.extended.FormTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forms</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forms</em>' reference list.
   * @see org.example.domainmodel.extended.ExtendedPackage#getPage_Forms()
   * @model
   * @generated
   */
  EList<FormTypes> getForms();

} // Page
