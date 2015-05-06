/**
 */
package org.example.domainmodel.extended;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.Form#getGet <em>Get</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Form#getPost <em>Post</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Form#getPut <em>Put</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Form#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.Form#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.domainmodel.extended.ExtendedPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends AbstractElement, FormTypes
{
  /**
   * Returns the value of the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get</em>' attribute.
   * @see #setGet(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Get()
   * @model
   * @generated
   */
  String getGet();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Form#getGet <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get</em>' attribute.
   * @see #getGet()
   * @generated
   */
  void setGet(String value);

  /**
   * Returns the value of the '<em><b>Post</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' attribute.
   * @see #setPost(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Post()
   * @model
   * @generated
   */
  String getPost();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Form#getPost <em>Post</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post</em>' attribute.
   * @see #getPost()
   * @generated
   */
  void setPost(String value);

  /**
   * Returns the value of the '<em><b>Put</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Put</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Put</em>' attribute.
   * @see #setPut(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Put()
   * @model
   * @generated
   */
  String getPut();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Form#getPut <em>Put</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Put</em>' attribute.
   * @see #getPut()
   * @generated
   */
  void setPut(String value);

  /**
   * Returns the value of the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delete</em>' attribute.
   * @see #setDelete(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Delete()
   * @model
   * @generated
   */
  String getDelete();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Form#getDelete <em>Delete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delete</em>' attribute.
   * @see #getDelete()
   * @generated
   */
  void setDelete(String value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.example.domainmodel.extended.ExtendedPackage#getForm_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.Form#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // Form
