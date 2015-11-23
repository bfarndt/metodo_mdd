/**
 */
package org.example.domainmodel.extended.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.domainmodel.extended.AbstractElement;
import org.example.domainmodel.extended.Domainmodel;
import org.example.domainmodel.extended.ExtendedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.example.domainmodel.extended.impl.DomainmodelImpl#getNomeProj <em>Nome Proj</em>}</li>
 *   <li>{@link org.example.domainmodel.extended.impl.DomainmodelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainmodelImpl extends MinimalEObjectImpl.Container implements Domainmodel
{
  /**
   * The default value of the '{@link #getNomeProj() <em>Nome Proj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeProj()
   * @generated
   * @ordered
   */
  protected static final String NOME_PROJ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNomeProj() <em>Nome Proj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeProj()
   * @generated
   * @ordered
   */
  protected String nomeProj = NOME_PROJ_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainmodelImpl()
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
    return ExtendedPackage.Literals.DOMAINMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNomeProj()
  {
    return nomeProj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomeProj(String newNomeProj)
  {
    String oldNomeProj = nomeProj;
    nomeProj = newNomeProj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtendedPackage.DOMAINMODEL__NOME_PROJ, oldNomeProj, nomeProj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, ExtendedPackage.DOMAINMODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtendedPackage.DOMAINMODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExtendedPackage.DOMAINMODEL__NOME_PROJ:
        return getNomeProj();
      case ExtendedPackage.DOMAINMODEL__ELEMENTS:
        return getElements();
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
      case ExtendedPackage.DOMAINMODEL__NOME_PROJ:
        setNomeProj((String)newValue);
        return;
      case ExtendedPackage.DOMAINMODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
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
      case ExtendedPackage.DOMAINMODEL__NOME_PROJ:
        setNomeProj(NOME_PROJ_EDEFAULT);
        return;
      case ExtendedPackage.DOMAINMODEL__ELEMENTS:
        getElements().clear();
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
      case ExtendedPackage.DOMAINMODEL__NOME_PROJ:
        return NOME_PROJ_EDEFAULT == null ? nomeProj != null : !NOME_PROJ_EDEFAULT.equals(nomeProj);
      case ExtendedPackage.DOMAINMODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (nomeProj: ");
    result.append(nomeProj);
    result.append(')');
    return result.toString();
  }

} //DomainmodelImpl
