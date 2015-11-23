/**
 */
package org.example.domainmodel.extended.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.example.domainmodel.extended.ExtendedPackage;
import org.example.domainmodel.extended.FormTypes;
import org.example.domainmodel.extended.Page;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.PageImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.PageImpl#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.PageImpl#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends AbstractElementImpl implements Page
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected static final String HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected String header = HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getFooter() <em>Footer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFooter()
   * @generated
   * @ordered
   */
  protected static final String FOOTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFooter() <em>Footer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFooter()
   * @generated
   * @ordered
   */
  protected String footer = FOOTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getForms() <em>Forms</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForms()
   * @generated
   * @ordered
   */
  protected EList<FormTypes> forms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageImpl()
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
    return ExtendedPackage.Literals.PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PAGE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(String newHeader)
  {
    String oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PAGE__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFooter()
  {
    return footer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFooter(String newFooter)
  {
    String oldFooter = footer;
    footer = newFooter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.PAGE__FOOTER, oldFooter, footer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormTypes> getForms()
  {
    if (forms == null)
    {
      forms = new EObjectResolvingEList<FormTypes>(FormTypes.class, this, ExtendedPackage.PAGE__FORMS);
    }
    return forms;
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
      case ExtendedPackage.PAGE__NAME:
        return getName();
      case ExtendedPackage.PAGE__TITLE:
        return getTitle();
      case ExtendedPackage.PAGE__HEADER:
        return getHeader();
      case ExtendedPackage.PAGE__FOOTER:
        return getFooter();
      case ExtendedPackage.PAGE__FORMS:
        return getForms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtendedPackage.PAGE__NAME:
        setName((String)newValue);
        return;
      case ExtendedPackage.PAGE__TITLE:
        setTitle((String)newValue);
        return;
      case ExtendedPackage.PAGE__HEADER:
        setHeader((String)newValue);
        return;
      case ExtendedPackage.PAGE__FOOTER:
        setFooter((String)newValue);
        return;
      case ExtendedPackage.PAGE__FORMS:
        getForms().clear();
        getForms().addAll((Collection<? extends FormTypes>)newValue);
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
      case ExtendedPackage.PAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ExtendedPackage.PAGE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ExtendedPackage.PAGE__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case ExtendedPackage.PAGE__FOOTER:
        setFooter(FOOTER_EDEFAULT);
        return;
      case ExtendedPackage.PAGE__FORMS:
        getForms().clear();
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
      case ExtendedPackage.PAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ExtendedPackage.PAGE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ExtendedPackage.PAGE__HEADER:
        return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
      case ExtendedPackage.PAGE__FOOTER:
        return FOOTER_EDEFAULT == null ? footer != null : !FOOTER_EDEFAULT.equals(footer);
      case ExtendedPackage.PAGE__FORMS:
        return forms != null && !forms.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", title: ");
    result.append(title);
    result.append(", header: ");
    result.append(header);
    result.append(", footer: ");
    result.append(footer);
    result.append(')');
    return result.toString();
  }

} //PageImpl
