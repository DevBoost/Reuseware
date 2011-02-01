/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import es.tid.cim.CimPackage;
import es.tid.cim.Product;
import es.tid.cim.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getSKUNumber <em>SKU Number</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getProductProductDependency <em>Product Product Dependency</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getProductServiceComponent <em>Product Service Component</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getWarrantyDuration <em>Warranty Duration</em>}</li>
 *   <li>{@link es.tid.cim.impl.ProductImpl#getWarrantyStartDate <em>Warranty Start Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends ManagedElementImpl implements Product {
	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifyingNumber() <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFYING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifyingNumber() <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingNumber()
	 * @generated
	 * @ordered
	 */
	protected String identifyingNumber = IDENTIFYING_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getSKUNumber() <em>SKU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKUNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SKU_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKUNumber() <em>SKU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKUNumber()
	 * @generated
	 * @ordered
	 */
	protected String skuNumber = SKU_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductProductDependency() <em>Product Product Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductProductDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> productProductDependency;

	/**
	 * The cached value of the '{@link #getProductServiceComponent() <em>Product Service Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductServiceComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> productServiceComponent;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarrantyDuration() <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyDuration()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WARRANTY_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyDuration() <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyDuration()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal warrantyDuration = WARRANTY_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarrantyStartDate() <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date WARRANTY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarrantyStartDate() <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarrantyStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date warrantyStartDate = WARRANTY_START_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getProduct();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifyingNumber() {
		return identifyingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifyingNumber(String newIdentifyingNumber) {
		String oldIdentifyingNumber = identifyingNumber;
		identifyingNumber = newIdentifyingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__IDENTIFYING_NUMBER, oldIdentifyingNumber, identifyingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSKUNumber() {
		return skuNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSKUNumber(String newSKUNumber) {
		String oldSKUNumber = skuNumber;
		skuNumber = newSKUNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__SKU_NUMBER, oldSKUNumber, skuNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProductProductDependency() {
		if (productProductDependency == null) {
			productProductDependency = new EObjectResolvingEList<Product>(Product.class, this, CimPackage.PRODUCT__PRODUCT_PRODUCT_DEPENDENCY);
		}
		return productProductDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getProductServiceComponent() {
		if (productServiceComponent == null) {
			productServiceComponent = new EObjectResolvingEList<Service>(Service.class, this, CimPackage.PRODUCT__PRODUCT_SERVICE_COMPONENT);
		}
		return productServiceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getWarrantyDuration() {
		return warrantyDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarrantyDuration(BigDecimal newWarrantyDuration) {
		BigDecimal oldWarrantyDuration = warrantyDuration;
		warrantyDuration = newWarrantyDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__WARRANTY_DURATION, oldWarrantyDuration, warrantyDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWarrantyStartDate() {
		return warrantyStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarrantyStartDate(Date newWarrantyStartDate) {
		Date oldWarrantyStartDate = warrantyStartDate;
		warrantyStartDate = newWarrantyStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.PRODUCT__WARRANTY_START_DATE, oldWarrantyStartDate, warrantyStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.PRODUCT__FAMILY:
				return getFamily();
			case CimPackage.PRODUCT__IDENTIFYING_NUMBER:
				return getIdentifyingNumber();
			case CimPackage.PRODUCT__NAME:
				return getName();
			case CimPackage.PRODUCT__SKU_NUMBER:
				return getSKUNumber();
			case CimPackage.PRODUCT__PRODUCT_PRODUCT_DEPENDENCY:
				return getProductProductDependency();
			case CimPackage.PRODUCT__PRODUCT_SERVICE_COMPONENT:
				return getProductServiceComponent();
			case CimPackage.PRODUCT__VENDOR:
				return getVendor();
			case CimPackage.PRODUCT__VERSION:
				return getVersion();
			case CimPackage.PRODUCT__WARRANTY_DURATION:
				return getWarrantyDuration();
			case CimPackage.PRODUCT__WARRANTY_START_DATE:
				return getWarrantyStartDate();
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
			case CimPackage.PRODUCT__FAMILY:
				setFamily((String)newValue);
				return;
			case CimPackage.PRODUCT__IDENTIFYING_NUMBER:
				setIdentifyingNumber((String)newValue);
				return;
			case CimPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case CimPackage.PRODUCT__SKU_NUMBER:
				setSKUNumber((String)newValue);
				return;
			case CimPackage.PRODUCT__PRODUCT_PRODUCT_DEPENDENCY:
				getProductProductDependency().clear();
				getProductProductDependency().addAll((Collection<? extends Product>)newValue);
				return;
			case CimPackage.PRODUCT__PRODUCT_SERVICE_COMPONENT:
				getProductServiceComponent().clear();
				getProductServiceComponent().addAll((Collection<? extends Service>)newValue);
				return;
			case CimPackage.PRODUCT__VENDOR:
				setVendor((String)newValue);
				return;
			case CimPackage.PRODUCT__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.PRODUCT__WARRANTY_DURATION:
				setWarrantyDuration((BigDecimal)newValue);
				return;
			case CimPackage.PRODUCT__WARRANTY_START_DATE:
				setWarrantyStartDate((Date)newValue);
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
			case CimPackage.PRODUCT__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case CimPackage.PRODUCT__IDENTIFYING_NUMBER:
				setIdentifyingNumber(IDENTIFYING_NUMBER_EDEFAULT);
				return;
			case CimPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.PRODUCT__SKU_NUMBER:
				setSKUNumber(SKU_NUMBER_EDEFAULT);
				return;
			case CimPackage.PRODUCT__PRODUCT_PRODUCT_DEPENDENCY:
				getProductProductDependency().clear();
				return;
			case CimPackage.PRODUCT__PRODUCT_SERVICE_COMPONENT:
				getProductServiceComponent().clear();
				return;
			case CimPackage.PRODUCT__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case CimPackage.PRODUCT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.PRODUCT__WARRANTY_DURATION:
				setWarrantyDuration(WARRANTY_DURATION_EDEFAULT);
				return;
			case CimPackage.PRODUCT__WARRANTY_START_DATE:
				setWarrantyStartDate(WARRANTY_START_DATE_EDEFAULT);
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
			case CimPackage.PRODUCT__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case CimPackage.PRODUCT__IDENTIFYING_NUMBER:
				return IDENTIFYING_NUMBER_EDEFAULT == null ? identifyingNumber != null : !IDENTIFYING_NUMBER_EDEFAULT.equals(identifyingNumber);
			case CimPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.PRODUCT__SKU_NUMBER:
				return SKU_NUMBER_EDEFAULT == null ? skuNumber != null : !SKU_NUMBER_EDEFAULT.equals(skuNumber);
			case CimPackage.PRODUCT__PRODUCT_PRODUCT_DEPENDENCY:
				return productProductDependency != null && !productProductDependency.isEmpty();
			case CimPackage.PRODUCT__PRODUCT_SERVICE_COMPONENT:
				return productServiceComponent != null && !productServiceComponent.isEmpty();
			case CimPackage.PRODUCT__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case CimPackage.PRODUCT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.PRODUCT__WARRANTY_DURATION:
				return WARRANTY_DURATION_EDEFAULT == null ? warrantyDuration != null : !WARRANTY_DURATION_EDEFAULT.equals(warrantyDuration);
			case CimPackage.PRODUCT__WARRANTY_START_DATE:
				return WARRANTY_START_DATE_EDEFAULT == null ? warrantyStartDate != null : !WARRANTY_START_DATE_EDEFAULT.equals(warrantyStartDate);
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
		result.append(" (family: ");
		result.append(family);
		result.append(", identifyingNumber: ");
		result.append(identifyingNumber);
		result.append(", name: ");
		result.append(name);
		result.append(", SKUNumber: ");
		result.append(skuNumber);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", warrantyDuration: ");
		result.append(warrantyDuration);
		result.append(", warrantyStartDate: ");
		result.append(warrantyStartDate);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
