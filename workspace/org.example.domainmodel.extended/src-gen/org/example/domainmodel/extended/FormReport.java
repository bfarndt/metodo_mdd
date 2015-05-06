/**
 */
package org.example.domainmodel.extended;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.FormReport#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.FormReport#getOrder <em>Order</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.FormReport#getPagination <em>Pagination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.domainmodel.extended.ExtendedPackage#getFormReport()
 * @model
 * @generated
 */
public interface FormReport extends FormTypes
{
  /**
   * Returns the value of the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' attribute.
   * @see #setFilter(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFormReport_Filter()
   * @model
   * @generated
   */
  String getFilter();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.FormReport#getFilter <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' attribute.
   * @see #getFilter()
   * @generated
   */
  void setFilter(String value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' attribute.
   * @see #setOrder(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFormReport_Order()
   * @model
   * @generated
   */
  String getOrder();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.FormReport#getOrder <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' attribute.
   * @see #getOrder()
   * @generated
   */
  void setOrder(String value);

  /**
   * Returns the value of the '<em><b>Pagination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pagination</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pagination</em>' attribute.
   * @see #setPagination(String)
   * @see org.example.domainmodel.extended.ExtendedPackage#getFormReport_Pagination()
   * @model
   * @generated
   */
  String getPagination();

  /**
   * Sets the value of the '{@link org.example.domainmodel.extended.FormReport#getPagination <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pagination</em>' attribute.
   * @see #getPagination()
   * @generated
   */
  void setPagination(String value);

} // FormReport
