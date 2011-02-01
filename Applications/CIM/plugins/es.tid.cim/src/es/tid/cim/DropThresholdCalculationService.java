/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Threshold Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.DropThresholdCalculationService#getSmoothingWeight <em>Smoothing Weight</em>}</li>
 *   <li>{@link es.tid.cim.DropThresholdCalculationService#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getDropThresholdCalculationService()
 * @model
 * @generated
 */
public interface DropThresholdCalculationService extends Service {
	/**
	 * Returns the value of the '<em><b>Smoothing Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smoothing Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smoothing Weight</em>' attribute.
	 * @see #setSmoothingWeight(int)
	 * @see es.tid.cim.CimPackage#getDropThresholdCalculationService_SmoothingWeight()
	 * @model
	 * @generated
	 */
	int getSmoothingWeight();

	/**
	 * Sets the value of the '{@link es.tid.cim.DropThresholdCalculationService#getSmoothingWeight <em>Smoothing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smoothing Weight</em>' attribute.
	 * @see #getSmoothingWeight()
	 * @generated
	 */
	void setSmoothingWeight(int value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(int)
	 * @see es.tid.cim.CimPackage#getDropThresholdCalculationService_TimeInterval()
	 * @model
	 * @generated
	 */
	int getTimeInterval();

	/**
	 * Sets the value of the '{@link es.tid.cim.DropThresholdCalculationService#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(int value);

} // DropThresholdCalculationService
