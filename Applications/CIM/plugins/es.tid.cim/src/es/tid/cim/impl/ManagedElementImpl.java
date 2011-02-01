/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.tid.cim.Capabilities;
import es.tid.cim.CimPackage;
import es.tid.cim.ElementSettingData;
import es.tid.cim.ManagedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getElementCapabilities <em>Element Capabilities</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getHostedDependency <em>Hosted Dependency</em>}</li>
 *   <li>{@link es.tid.cim.impl.ManagedElementImpl#getElementSettingData <em>Element Setting Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ManagedElementImpl extends EObjectImpl implements ManagedElement {
	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagedElement> components;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagedElement> dependencies;

	/**
	 * The cached value of the '{@link #getElementCapabilities() <em>Element Capabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capabilities> elementCapabilities;

	/**
	 * The cached value of the '{@link #getHostedDependency() <em>Hosted Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<ManagedElement> hostedDependency;

	/**
	 * The cached value of the '{@link #getElementSettingData() <em>Element Setting Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSettingData()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementSettingData> elementSettingData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getManagedElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_ELEMENT__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.MANAGED_ELEMENT__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagedElement> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ManagedElement>(ManagedElement.class, this, CimPackage.MANAGED_ELEMENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagedElement> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<ManagedElement>(ManagedElement.class, this, CimPackage.MANAGED_ELEMENT__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capabilities> getElementCapabilities() {
		if (elementCapabilities == null) {
			elementCapabilities = new EObjectResolvingEList<Capabilities>(Capabilities.class, this, CimPackage.MANAGED_ELEMENT__ELEMENT_CAPABILITIES);
		}
		return elementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagedElement> getHostedDependency() {
		if (hostedDependency == null) {
			hostedDependency = new EObjectResolvingEList<ManagedElement>(ManagedElement.class, this, CimPackage.MANAGED_ELEMENT__HOSTED_DEPENDENCY);
		}
		return hostedDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementSettingData> getElementSettingData() {
		if (elementSettingData == null) {
			elementSettingData = new EObjectResolvingEList<ElementSettingData>(ElementSettingData.class, this, CimPackage.MANAGED_ELEMENT__ELEMENT_SETTING_DATA);
		}
		return elementSettingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CimPackage.MANAGED_ELEMENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.MANAGED_ELEMENT__CAPTION:
				return getCaption();
			case CimPackage.MANAGED_ELEMENT__DESCRIPTION:
				return getDescription();
			case CimPackage.MANAGED_ELEMENT__ELEMENT_NAME:
				return getElementName();
			case CimPackage.MANAGED_ELEMENT__COMPONENTS:
				return getComponents();
			case CimPackage.MANAGED_ELEMENT__DEPENDENCIES:
				return getDependencies();
			case CimPackage.MANAGED_ELEMENT__ELEMENT_CAPABILITIES:
				return getElementCapabilities();
			case CimPackage.MANAGED_ELEMENT__HOSTED_DEPENDENCY:
				return getHostedDependency();
			case CimPackage.MANAGED_ELEMENT__ELEMENT_SETTING_DATA:
				return getElementSettingData();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.MANAGED_ELEMENT__CAPTION:
				setCaption((String)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ManagedElement>)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends ManagedElement>)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__ELEMENT_CAPABILITIES:
				getElementCapabilities().clear();
				getElementCapabilities().addAll((Collection<? extends Capabilities>)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__HOSTED_DEPENDENCY:
				getHostedDependency().clear();
				getHostedDependency().addAll((Collection<? extends ManagedElement>)newValue);
				return;
			case CimPackage.MANAGED_ELEMENT__ELEMENT_SETTING_DATA:
				getElementSettingData().clear();
				getElementSettingData().addAll((Collection<? extends ElementSettingData>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.MANAGED_ELEMENT__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case CimPackage.MANAGED_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.MANAGED_ELEMENT__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.MANAGED_ELEMENT__COMPONENTS:
				getComponents().clear();
				return;
			case CimPackage.MANAGED_ELEMENT__DEPENDENCIES:
				getDependencies().clear();
				return;
			case CimPackage.MANAGED_ELEMENT__ELEMENT_CAPABILITIES:
				getElementCapabilities().clear();
				return;
			case CimPackage.MANAGED_ELEMENT__HOSTED_DEPENDENCY:
				getHostedDependency().clear();
				return;
			case CimPackage.MANAGED_ELEMENT__ELEMENT_SETTING_DATA:
				getElementSettingData().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.MANAGED_ELEMENT__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case CimPackage.MANAGED_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CimPackage.MANAGED_ELEMENT__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case CimPackage.MANAGED_ELEMENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case CimPackage.MANAGED_ELEMENT__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case CimPackage.MANAGED_ELEMENT__ELEMENT_CAPABILITIES:
				return elementCapabilities != null && !elementCapabilities.isEmpty();
			case CimPackage.MANAGED_ELEMENT__HOSTED_DEPENDENCY:
				return hostedDependency != null && !hostedDependency.isEmpty();
			case CimPackage.MANAGED_ELEMENT__ELEMENT_SETTING_DATA:
				return elementSettingData != null && !elementSettingData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (caption: ");
		result.append(caption);
		result.append(", description: ");
		result.append(description);
		result.append(", elementName: ");
		result.append(elementName);
		result.append(')');
		return result.toString();
	}

} //ManagedElementImpl
