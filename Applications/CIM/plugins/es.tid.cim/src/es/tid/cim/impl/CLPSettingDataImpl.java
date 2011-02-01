/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import es.tid.cim.CLPSettingData;
import es.tid.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CLP Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getCurrentDefaultTarget <em>Current Default Target</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getKeepTime <em>Keep Time</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#isWaitBehaviour <em>Wait Behaviour</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getOutputVerbosity <em>Output Verbosity</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getOutputLanguage <em>Output Language</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getOutputPosition <em>Output Position</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getOutputOrder <em>Output Order</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getOutputCount <em>Output Count</em>}</li>
 *   <li>{@link es.tid.cim.impl.CLPSettingDataImpl#getDisplayOption <em>Display Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLPSettingDataImpl extends SettingDataImpl implements CLPSettingData {
	/**
	 * The default value of the '{@link #getCurrentDefaultTarget() <em>Current Default Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDefaultTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_DEFAULT_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentDefaultTarget() <em>Current Default Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDefaultTarget()
	 * @generated
	 * @ordered
	 */
	protected String currentDefaultTarget = CURRENT_DEFAULT_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepTime() <em>Keep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepTime()
	 * @generated
	 * @ordered
	 */
	protected static final int KEEP_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeepTime() <em>Keep Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepTime()
	 * @generated
	 * @ordered
	 */
	protected int keepTime = KEEP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isWaitBehaviour() <em>Wait Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaitBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAIT_BEHAVIOUR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWaitBehaviour() <em>Wait Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWaitBehaviour()
	 * @generated
	 * @ordered
	 */
	protected boolean waitBehaviour = WAIT_BEHAVIOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_FORMAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected int outputFormat = OUTPUT_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputVerbosity() <em>Output Verbosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVerbosity()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_VERBOSITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputVerbosity() <em>Output Verbosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVerbosity()
	 * @generated
	 * @ordered
	 */
	protected int outputVerbosity = OUTPUT_VERBOSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputLanguage() <em>Output Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputLanguage() <em>Output Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLanguage()
	 * @generated
	 * @ordered
	 */
	protected String outputLanguage = OUTPUT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputPosition() <em>Output Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputPosition() <em>Output Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPosition()
	 * @generated
	 * @ordered
	 */
	protected int outputPosition = OUTPUT_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputOrder() <em>Output Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputOrder() <em>Output Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOrder()
	 * @generated
	 * @ordered
	 */
	protected int outputOrder = OUTPUT_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputCount() <em>Output Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputCount() <em>Output Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCount()
	 * @generated
	 * @ordered
	 */
	protected int outputCount = OUTPUT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected static final int DISPLAY_OPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDisplayOption() <em>Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOption()
	 * @generated
	 * @ordered
	 */
	protected int displayOption = DISPLAY_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CLPSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCLPSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentDefaultTarget() {
		return currentDefaultTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDefaultTarget(String newCurrentDefaultTarget) {
		String oldCurrentDefaultTarget = currentDefaultTarget;
		currentDefaultTarget = newCurrentDefaultTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET, oldCurrentDefaultTarget, currentDefaultTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeepTime() {
		return keepTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepTime(int newKeepTime) {
		int oldKeepTime = keepTime;
		keepTime = newKeepTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__KEEP_TIME, oldKeepTime, keepTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWaitBehaviour() {
		return waitBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitBehaviour(boolean newWaitBehaviour) {
		boolean oldWaitBehaviour = waitBehaviour;
		waitBehaviour = newWaitBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__WAIT_BEHAVIOUR, oldWaitBehaviour, waitBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputFormat() {
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFormat(int newOutputFormat) {
		int oldOutputFormat = outputFormat;
		outputFormat = newOutputFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__OUTPUT_FORMAT, oldOutputFormat, outputFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputVerbosity() {
		return outputVerbosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputVerbosity(int newOutputVerbosity) {
		int oldOutputVerbosity = outputVerbosity;
		outputVerbosity = newOutputVerbosity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__OUTPUT_VERBOSITY, oldOutputVerbosity, outputVerbosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputLanguage() {
		return outputLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLanguage(String newOutputLanguage) {
		String oldOutputLanguage = outputLanguage;
		outputLanguage = newOutputLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__OUTPUT_LANGUAGE, oldOutputLanguage, outputLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputPosition() {
		return outputPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPosition(int newOutputPosition) {
		int oldOutputPosition = outputPosition;
		outputPosition = newOutputPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__OUTPUT_POSITION, oldOutputPosition, outputPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputOrder() {
		return outputOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputOrder(int newOutputOrder) {
		int oldOutputOrder = outputOrder;
		outputOrder = newOutputOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__OUTPUT_ORDER, oldOutputOrder, outputOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputCount() {
		return outputCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputCount(int newOutputCount) {
		int oldOutputCount = outputCount;
		outputCount = newOutputCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__OUTPUT_COUNT, oldOutputCount, outputCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDisplayOption() {
		return displayOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayOption(int newDisplayOption) {
		int oldDisplayOption = displayOption;
		displayOption = newDisplayOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CLP_SETTING_DATA__DISPLAY_OPTION, oldDisplayOption, displayOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				return getCurrentDefaultTarget();
			case CimPackage.CLP_SETTING_DATA__KEEP_TIME:
				return getKeepTime();
			case CimPackage.CLP_SETTING_DATA__WAIT_BEHAVIOUR:
				return isWaitBehaviour();
			case CimPackage.CLP_SETTING_DATA__OUTPUT_FORMAT:
				return getOutputFormat();
			case CimPackage.CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				return getOutputVerbosity();
			case CimPackage.CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				return getOutputLanguage();
			case CimPackage.CLP_SETTING_DATA__OUTPUT_POSITION:
				return getOutputPosition();
			case CimPackage.CLP_SETTING_DATA__OUTPUT_ORDER:
				return getOutputOrder();
			case CimPackage.CLP_SETTING_DATA__OUTPUT_COUNT:
				return getOutputCount();
			case CimPackage.CLP_SETTING_DATA__DISPLAY_OPTION:
				return getDisplayOption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				setCurrentDefaultTarget((String)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__KEEP_TIME:
				setKeepTime((Integer)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__WAIT_BEHAVIOUR:
				setWaitBehaviour((Boolean)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_FORMAT:
				setOutputFormat((Integer)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				setOutputVerbosity((Integer)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				setOutputLanguage((String)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_POSITION:
				setOutputPosition((Integer)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_ORDER:
				setOutputOrder((Integer)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_COUNT:
				setOutputCount((Integer)newValue);
				return;
			case CimPackage.CLP_SETTING_DATA__DISPLAY_OPTION:
				setDisplayOption((Integer)newValue);
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
			case CimPackage.CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				setCurrentDefaultTarget(CURRENT_DEFAULT_TARGET_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__KEEP_TIME:
				setKeepTime(KEEP_TIME_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__WAIT_BEHAVIOUR:
				setWaitBehaviour(WAIT_BEHAVIOUR_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_FORMAT:
				setOutputFormat(OUTPUT_FORMAT_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				setOutputVerbosity(OUTPUT_VERBOSITY_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				setOutputLanguage(OUTPUT_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_POSITION:
				setOutputPosition(OUTPUT_POSITION_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_ORDER:
				setOutputOrder(OUTPUT_ORDER_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_COUNT:
				setOutputCount(OUTPUT_COUNT_EDEFAULT);
				return;
			case CimPackage.CLP_SETTING_DATA__DISPLAY_OPTION:
				setDisplayOption(DISPLAY_OPTION_EDEFAULT);
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
			case CimPackage.CLP_SETTING_DATA__CURRENT_DEFAULT_TARGET:
				return CURRENT_DEFAULT_TARGET_EDEFAULT == null ? currentDefaultTarget != null : !CURRENT_DEFAULT_TARGET_EDEFAULT.equals(currentDefaultTarget);
			case CimPackage.CLP_SETTING_DATA__KEEP_TIME:
				return keepTime != KEEP_TIME_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__WAIT_BEHAVIOUR:
				return waitBehaviour != WAIT_BEHAVIOUR_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_FORMAT:
				return outputFormat != OUTPUT_FORMAT_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_VERBOSITY:
				return outputVerbosity != OUTPUT_VERBOSITY_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_LANGUAGE:
				return OUTPUT_LANGUAGE_EDEFAULT == null ? outputLanguage != null : !OUTPUT_LANGUAGE_EDEFAULT.equals(outputLanguage);
			case CimPackage.CLP_SETTING_DATA__OUTPUT_POSITION:
				return outputPosition != OUTPUT_POSITION_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_ORDER:
				return outputOrder != OUTPUT_ORDER_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__OUTPUT_COUNT:
				return outputCount != OUTPUT_COUNT_EDEFAULT;
			case CimPackage.CLP_SETTING_DATA__DISPLAY_OPTION:
				return displayOption != DISPLAY_OPTION_EDEFAULT;
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
		result.append(" (currentDefaultTarget: ");
		result.append(currentDefaultTarget);
		result.append(", keepTime: ");
		result.append(keepTime);
		result.append(", waitBehaviour: ");
		result.append(waitBehaviour);
		result.append(", outputFormat: ");
		result.append(outputFormat);
		result.append(", outputVerbosity: ");
		result.append(outputVerbosity);
		result.append(", outputLanguage: ");
		result.append(outputLanguage);
		result.append(", outputPosition: ");
		result.append(outputPosition);
		result.append(", outputOrder: ");
		result.append(outputOrder);
		result.append(", outputCount: ");
		result.append(outputCount);
		result.append(", displayOption: ");
		result.append(displayOption);
		result.append(')');
		return result.toString();
	}

} //CLPSettingDataImpl
