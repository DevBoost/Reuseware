/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Access URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.ServiceAccessURI#getLabeledURI <em>Labeled URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getServiceAccessURI()
 * @model
 * @generated
 */
public interface ServiceAccessURI extends ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Labeled URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labeled URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labeled URI</em>' attribute.
	 * @see #setLabeledURI(String)
	 * @see es.tid.cim.CimPackage#getServiceAccessURI_LabeledURI()
	 * @model
	 * @generated
	 */
	String getLabeledURI();

	/**
	 * Sets the value of the '{@link es.tid.cim.ServiceAccessURI#getLabeledURI <em>Labeled URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labeled URI</em>' attribute.
	 * @see #getLabeledURI()
	 * @generated
	 */
	void setLabeledURI(String value);

} // ServiceAccessURI
