/**
 */
package org.example.domainmodel.extended;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.Form#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Form#getEntitys <em>Entitys</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.domainmodel.extended.ExtendedPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject
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
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Form#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entitys</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.extended.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entitys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entitys</em>' containment reference list.
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Entitys()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntitys();

} // Form
