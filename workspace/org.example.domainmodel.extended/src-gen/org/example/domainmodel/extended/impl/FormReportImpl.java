/**
 */
package org.example.domainmodel.extended.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.domainmodel.extended.ExtendedPackage;
import org.example.domainmodel.extended.FormReport;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.impl.FormReportImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.FormReportImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.FormReportImpl#getPagination <em>Pagination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormReportImpl extends FormTypesImpl implements FormReport
{
  /**
   * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected static final String FILTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected String filter = FILTER_EDEFAULT;

  /**
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final String ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected String order = ORDER_EDEFAULT;

  /**
   * The default value of the '{@link #getPagination() <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagination()
   * @generated
   * @ordered
   */
  protected static final String PAGINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPagination() <em>Pagination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagination()
   * @generated
   * @ordered
   */
  protected String pagination = PAGINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormReportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtendedPackage.Literals.FORM_REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(String newFilter)
  {
    String oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.FORM_REPORT__FILTER, oldFilter, filter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrder(String newOrder)
  {
    String oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.FORM_REPORT__ORDER, oldOrder, order));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPagination()
  {
    return pagination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPagination(String newPagination)
  {
    String oldPagination = pagination;
    pagination = newPagination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.FORM_REPORT__PAGINATION, oldPagination, pagination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtendedPackage.FORM_REPORT__FILTER:
        return getFilter();
      case ExtendedPackage.FORM_REPORT__ORDER:
        return getOrder();
      case ExtendedPackage.FORM_REPORT__PAGINATION:
        return getPagination();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtendedPackage.FORM_REPORT__FILTER:
        setFilter((String)newValue);
        return;
      case ExtendedPackage.FORM_REPORT__ORDER:
        setOrder((String)newValue);
        return;
      case ExtendedPackage.FORM_REPORT__PAGINATION:
        setPagination((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtendedPackage.FORM_REPORT__FILTER:
        setFilter(FILTER_EDEFAULT);
        return;
      case ExtendedPackage.FORM_REPORT__ORDER:
        setOrder(ORDER_EDEFAULT);
        return;
      case ExtendedPackage.FORM_REPORT__PAGINATION:
        setPagination(PAGINATION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtendedPackage.FORM_REPORT__FILTER:
        return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
      case ExtendedPackage.FORM_REPORT__ORDER:
        return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
      case ExtendedPackage.FORM_REPORT__PAGINATION:
        return PAGINATION_EDEFAULT == null ? pagination != null : !PAGINATION_EDEFAULT.equals(pagination);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (filter: ");
    result.append(filter);
    result.append(", order: ");
    result.append(order);
    result.append(", pagination: ");
    result.append(pagination);
    result.append(')');
    return result.toString();
  }

} //FormReportImpl
