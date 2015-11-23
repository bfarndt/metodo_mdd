/**
 */
package org.example.domainmodel.extended;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.Domainmodel#getNomeProj <em>Nome Proj</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Domainmodel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.domainmodel.extended.ExtendedPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Proj</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome Proj</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Proj</em>' attribute.
   * @see #setNomeProj(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getDomainmodel_NomeProj()
   * @model
   * @generated
   */
  String getNomeProj();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Domainmodel#getNomeProj <em>Nome Proj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Proj</em>' attribute.
   * @see #getNomeProj()
   * @generated
   */
  void setNomeProj(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.extended.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.example.domainmodel.extended.ExtendedPackage#getDomainmodel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Domainmodel
