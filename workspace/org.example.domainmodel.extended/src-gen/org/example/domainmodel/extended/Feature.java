/**
 */
package org.example.domainmodel.extended;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.Feature#getRequired <em>Required</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Feature#getMin <em>Min</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Feature#getMax <em>Max</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Feature#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Feature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.domainmodel.extended.ExtendedPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
{
  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFeature_Required()
   * @model
   * @generated
   */
  String getRequired();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Feature#getRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #getRequired()
   * @generated
   */
  void setRequired(String value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFeature_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Feature#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' attribute.
   * @see #setMax(int)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFeature_Max()
   * @model
   * @generated
   */
  int getMax();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Feature#getMax <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' attribute.
   * @see #getMax()
   * @generated
   */
  void setMax(int value);

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
   * @see org.example.domainmodel.extended.ExtendedPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AbstractType)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFeature_Type()
   * @model containment="true"
   * @generated
   */
  AbstractType getType();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Feature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AbstractType value);

} // Feature
