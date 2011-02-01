/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.math.BigDecimal;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.Product#getFamily <em>Family</em>}</li>
 *   <li>{@link es.tid.cim.Product#getIdentifyingNumber <em>Identifying Number</em>}</li>
 *   <li>{@link es.tid.cim.Product#getName <em>Name</em>}</li>
 *   <li>{@link es.tid.cim.Product#getSKUNumber <em>SKU Number</em>}</li>
 *   <li>{@link es.tid.cim.Product#getProductProductDependency <em>Product Product Dependency</em>}</li>
 *   <li>{@link es.tid.cim.Product#getProductServiceComponent <em>Product Service Component</em>}</li>
 *   <li>{@link es.tid.cim.Product#getVendor <em>Vendor</em>}</li>
 *   <li>{@link es.tid.cim.Product#getVersion <em>Version</em>}</li>
 *   <li>{@link es.tid.cim.Product#getWarrantyDuration <em>Warranty Duration</em>}</li>
 *   <li>{@link es.tid.cim.Product#getWarrantyStartDate <em>Warranty Start Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends ManagedElement {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see es.tid.cim.CimPackage#getProduct_Family()
	 * @model
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Identifying Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifying Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifying Number</em>' attribute.
	 * @see #setIdentifyingNumber(String)
	 * @see es.tid.cim.CimPackage#getProduct_IdentifyingNumber()
	 * @model
	 * @generated
	 */
	String getIdentifyingNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getIdentifyingNumber <em>Identifying Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifying Number</em>' attribute.
	 * @see #getIdentifyingNumber()
	 * @generated
	 */
	void setIdentifyingNumber(String value);

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
	 * @see es.tid.cim.CimPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>SKU Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SKU Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SKU Number</em>' attribute.
	 * @see #setSKUNumber(String)
	 * @see es.tid.cim.CimPackage#getProduct_SKUNumber()
	 * @model
	 * @generated
	 */
	String getSKUNumber();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getSKUNumber <em>SKU Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKU Number</em>' attribute.
	 * @see #getSKUNumber()
	 * @generated
	 */
	void setSKUNumber(String value);

	/**
	 * Returns the value of the '<em><b>Product Product Dependency</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Product Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Product Dependency</em>' reference list.
	 * @see es.tid.cim.CimPackage#getProduct_ProductProductDependency()
	 * @model
	 * @generated
	 */
	EList<Product> getProductProductDependency();

	/**
	 * Returns the value of the '<em><b>Product Service Component</b></em>' reference list.
	 * The list contents are of type {@link es.tid.cim.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Service Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Service Component</em>' reference list.
	 * @see es.tid.cim.CimPackage#getProduct_ProductServiceComponent()
	 * @model
	 * @generated
	 */
	EList<Service> getProductServiceComponent();

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see es.tid.cim.CimPackage#getProduct_Vendor()
	 * @model
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.tid.cim.CimPackage#getProduct_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Warranty Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty Duration</em>' attribute.
	 * @see #setWarrantyDuration(BigDecimal)
	 * @see es.tid.cim.CimPackage#getProduct_WarrantyDuration()
	 * @model
	 * @generated
	 */
	BigDecimal getWarrantyDuration();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getWarrantyDuration <em>Warranty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty Duration</em>' attribute.
	 * @see #getWarrantyDuration()
	 * @generated
	 */
	void setWarrantyDuration(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Warranty Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warranty Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warranty Start Date</em>' attribute.
	 * @see #setWarrantyStartDate(Date)
	 * @see es.tid.cim.CimPackage#getProduct_WarrantyStartDate()
	 * @model
	 * @generated
	 */
	Date getWarrantyStartDate();

	/**
	 * Sets the value of the '{@link es.tid.cim.Product#getWarrantyStartDate <em>Warranty Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warranty Start Date</em>' attribute.
	 * @see #getWarrantyStartDate()
	 * @generated
	 */
	void setWarrantyStartDate(Date value);

} // Product
