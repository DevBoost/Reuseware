/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.drawing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.DrawingPackage;
import org.oasisopen.names.tc.opendocument.xmlns.drawing.HandleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleMirrorHorizontal <em>Handle Mirror Horizontal</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleMirrorVertical <em>Handle Mirror Vertical</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandlePolar <em>Handle Polar</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandlePosition <em>Handle Position</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleRadiusRangeMaximum <em>Handle Radius Range Maximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleRadiusRangeMinimum <em>Handle Radius Range Minimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleRangeXMaximum <em>Handle Range XMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleRangeXMinimum <em>Handle Range XMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleRangeYMaximum <em>Handle Range YMaximum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleRangeYMinimum <em>Handle Range YMinimum</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.drawing.impl.HandleTypeImpl#getHandleSwitched <em>Handle Switched</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HandleTypeImpl extends EObjectImpl implements HandleType {
	/**
	 * The default value of the '{@link #getHandleMirrorHorizontal() <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HANDLE_MIRROR_HORIZONTAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHandleMirrorHorizontal() <em>Handle Mirror Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorHorizontal()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean handleMirrorHorizontal = HANDLE_MIRROR_HORIZONTAL_EDEFAULT;

	/**
	 * This is true if the Handle Mirror Horizontal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleMirrorHorizontalESet;

	/**
	 * The default value of the '{@link #getHandleMirrorVertical() <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HANDLE_MIRROR_VERTICAL_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHandleMirrorVertical() <em>Handle Mirror Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleMirrorVertical()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean handleMirrorVertical = HANDLE_MIRROR_VERTICAL_EDEFAULT;

	/**
	 * This is true if the Handle Mirror Vertical attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleMirrorVerticalESet;

	/**
	 * The default value of the '{@link #getHandlePolar() <em>Handle Polar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePolar()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_POLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlePolar() <em>Handle Polar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePolar()
	 * @generated
	 * @ordered
	 */
	protected String handlePolar = HANDLE_POLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlePosition() <em>Handle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePosition()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlePosition() <em>Handle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlePosition()
	 * @generated
	 * @ordered
	 */
	protected String handlePosition = HANDLE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRadiusRangeMaximum() <em>Handle Radius Range Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRadiusRangeMaximum() <em>Handle Radius Range Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMaximum()
	 * @generated
	 * @ordered
	 */
	protected String handleRadiusRangeMaximum = HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRadiusRangeMinimum() <em>Handle Radius Range Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRadiusRangeMinimum() <em>Handle Radius Range Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRadiusRangeMinimum()
	 * @generated
	 * @ordered
	 */
	protected String handleRadiusRangeMinimum = HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeXMaximum() <em>Handle Range XMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_XMAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeXMaximum() <em>Handle Range XMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMaximum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeXMaximum = HANDLE_RANGE_XMAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeXMinimum() <em>Handle Range XMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_XMINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeXMinimum() <em>Handle Range XMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeXMinimum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeXMinimum = HANDLE_RANGE_XMINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeYMaximum() <em>Handle Range YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_YMAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeYMaximum() <em>Handle Range YMaximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMaximum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeYMaximum = HANDLE_RANGE_YMAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleRangeYMinimum() <em>Handle Range YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLE_RANGE_YMINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandleRangeYMinimum() <em>Handle Range YMinimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleRangeYMinimum()
	 * @generated
	 * @ordered
	 */
	protected String handleRangeYMinimum = HANDLE_RANGE_YMINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandleSwitched() <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleSwitched()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean HANDLE_SWITCHED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHandleSwitched() <em>Handle Switched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandleSwitched()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean handleSwitched = HANDLE_SWITCHED_EDEFAULT;

	/**
	 * This is true if the Handle Switched attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean handleSwitchedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DrawingPackage.eINSTANCE.getHandleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorHorizontal() {
		return handleMirrorHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleMirrorHorizontal(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHandleMirrorHorizontal) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorHorizontal = handleMirrorHorizontal;
		handleMirrorHorizontal = newHandleMirrorHorizontal == null ? HANDLE_MIRROR_HORIZONTAL_EDEFAULT : newHandleMirrorHorizontal;
		boolean oldHandleMirrorHorizontalESet = handleMirrorHorizontalESet;
		handleMirrorHorizontalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL, oldHandleMirrorHorizontal, handleMirrorHorizontal, !oldHandleMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleMirrorHorizontal() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorHorizontal = handleMirrorHorizontal;
		boolean oldHandleMirrorHorizontalESet = handleMirrorHorizontalESet;
		handleMirrorHorizontal = HANDLE_MIRROR_HORIZONTAL_EDEFAULT;
		handleMirrorHorizontalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL, oldHandleMirrorHorizontal, HANDLE_MIRROR_HORIZONTAL_EDEFAULT, oldHandleMirrorHorizontalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleMirrorHorizontal() {
		return handleMirrorHorizontalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleMirrorVertical() {
		return handleMirrorVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleMirrorVertical(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHandleMirrorVertical) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorVertical = handleMirrorVertical;
		handleMirrorVertical = newHandleMirrorVertical == null ? HANDLE_MIRROR_VERTICAL_EDEFAULT : newHandleMirrorVertical;
		boolean oldHandleMirrorVerticalESet = handleMirrorVerticalESet;
		handleMirrorVerticalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_VERTICAL, oldHandleMirrorVertical, handleMirrorVertical, !oldHandleMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleMirrorVertical() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleMirrorVertical = handleMirrorVertical;
		boolean oldHandleMirrorVerticalESet = handleMirrorVerticalESet;
		handleMirrorVertical = HANDLE_MIRROR_VERTICAL_EDEFAULT;
		handleMirrorVerticalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_VERTICAL, oldHandleMirrorVertical, HANDLE_MIRROR_VERTICAL_EDEFAULT, oldHandleMirrorVerticalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleMirrorVertical() {
		return handleMirrorVerticalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlePolar() {
		return handlePolar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlePolar(String newHandlePolar) {
		String oldHandlePolar = handlePolar;
		handlePolar = newHandlePolar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_POLAR, oldHandlePolar, handlePolar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlePosition() {
		return handlePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlePosition(String newHandlePosition) {
		String oldHandlePosition = handlePosition;
		handlePosition = newHandlePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_POSITION, oldHandlePosition, handlePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRadiusRangeMaximum() {
		return handleRadiusRangeMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRadiusRangeMaximum(String newHandleRadiusRangeMaximum) {
		String oldHandleRadiusRangeMaximum = handleRadiusRangeMaximum;
		handleRadiusRangeMaximum = newHandleRadiusRangeMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MAXIMUM, oldHandleRadiusRangeMaximum, handleRadiusRangeMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRadiusRangeMinimum() {
		return handleRadiusRangeMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRadiusRangeMinimum(String newHandleRadiusRangeMinimum) {
		String oldHandleRadiusRangeMinimum = handleRadiusRangeMinimum;
		handleRadiusRangeMinimum = newHandleRadiusRangeMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MINIMUM, oldHandleRadiusRangeMinimum, handleRadiusRangeMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeXMaximum() {
		return handleRangeXMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeXMaximum(String newHandleRangeXMaximum) {
		String oldHandleRangeXMaximum = handleRangeXMaximum;
		handleRangeXMaximum = newHandleRangeXMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMAXIMUM, oldHandleRangeXMaximum, handleRangeXMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeXMinimum() {
		return handleRangeXMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeXMinimum(String newHandleRangeXMinimum) {
		String oldHandleRangeXMinimum = handleRangeXMinimum;
		handleRangeXMinimum = newHandleRangeXMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMINIMUM, oldHandleRangeXMinimum, handleRangeXMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeYMaximum() {
		return handleRangeYMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeYMaximum(String newHandleRangeYMaximum) {
		String oldHandleRangeYMaximum = handleRangeYMaximum;
		handleRangeYMaximum = newHandleRangeYMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMAXIMUM, oldHandleRangeYMaximum, handleRangeYMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandleRangeYMinimum() {
		return handleRangeYMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleRangeYMinimum(String newHandleRangeYMinimum) {
		String oldHandleRangeYMinimum = handleRangeYMinimum;
		handleRangeYMinimum = newHandleRangeYMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMINIMUM, oldHandleRangeYMinimum, handleRangeYMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getHandleSwitched() {
		return handleSwitched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandleSwitched(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newHandleSwitched) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleSwitched = handleSwitched;
		handleSwitched = newHandleSwitched == null ? HANDLE_SWITCHED_EDEFAULT : newHandleSwitched;
		boolean oldHandleSwitchedESet = handleSwitchedESet;
		handleSwitchedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DrawingPackage.HANDLE_TYPE__HANDLE_SWITCHED, oldHandleSwitched, handleSwitched, !oldHandleSwitchedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHandleSwitched() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldHandleSwitched = handleSwitched;
		boolean oldHandleSwitchedESet = handleSwitchedESet;
		handleSwitched = HANDLE_SWITCHED_EDEFAULT;
		handleSwitchedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DrawingPackage.HANDLE_TYPE__HANDLE_SWITCHED, oldHandleSwitched, HANDLE_SWITCHED_EDEFAULT, oldHandleSwitchedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHandleSwitched() {
		return handleSwitchedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL:
				return getHandleMirrorHorizontal();
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_VERTICAL:
				return getHandleMirrorVertical();
			case DrawingPackage.HANDLE_TYPE__HANDLE_POLAR:
				return getHandlePolar();
			case DrawingPackage.HANDLE_TYPE__HANDLE_POSITION:
				return getHandlePosition();
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MAXIMUM:
				return getHandleRadiusRangeMaximum();
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MINIMUM:
				return getHandleRadiusRangeMinimum();
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMAXIMUM:
				return getHandleRangeXMaximum();
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMINIMUM:
				return getHandleRangeXMinimum();
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMAXIMUM:
				return getHandleRangeYMaximum();
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMINIMUM:
				return getHandleRangeYMinimum();
			case DrawingPackage.HANDLE_TYPE__HANDLE_SWITCHED:
				return getHandleSwitched();
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
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL:
				setHandleMirrorHorizontal((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_VERTICAL:
				setHandleMirrorVertical((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_POLAR:
				setHandlePolar((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_POSITION:
				setHandlePosition((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MAXIMUM:
				setHandleRadiusRangeMaximum((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MINIMUM:
				setHandleRadiusRangeMinimum((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMAXIMUM:
				setHandleRangeXMaximum((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMINIMUM:
				setHandleRangeXMinimum((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMAXIMUM:
				setHandleRangeYMaximum((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMINIMUM:
				setHandleRangeYMinimum((String)newValue);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_SWITCHED:
				setHandleSwitched((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL:
				unsetHandleMirrorHorizontal();
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_VERTICAL:
				unsetHandleMirrorVertical();
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_POLAR:
				setHandlePolar(HANDLE_POLAR_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_POSITION:
				setHandlePosition(HANDLE_POSITION_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MAXIMUM:
				setHandleRadiusRangeMaximum(HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MINIMUM:
				setHandleRadiusRangeMinimum(HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMAXIMUM:
				setHandleRangeXMaximum(HANDLE_RANGE_XMAXIMUM_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMINIMUM:
				setHandleRangeXMinimum(HANDLE_RANGE_XMINIMUM_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMAXIMUM:
				setHandleRangeYMaximum(HANDLE_RANGE_YMAXIMUM_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMINIMUM:
				setHandleRangeYMinimum(HANDLE_RANGE_YMINIMUM_EDEFAULT);
				return;
			case DrawingPackage.HANDLE_TYPE__HANDLE_SWITCHED:
				unsetHandleSwitched();
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
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_HORIZONTAL:
				return isSetHandleMirrorHorizontal();
			case DrawingPackage.HANDLE_TYPE__HANDLE_MIRROR_VERTICAL:
				return isSetHandleMirrorVertical();
			case DrawingPackage.HANDLE_TYPE__HANDLE_POLAR:
				return HANDLE_POLAR_EDEFAULT == null ? handlePolar != null : !HANDLE_POLAR_EDEFAULT.equals(handlePolar);
			case DrawingPackage.HANDLE_TYPE__HANDLE_POSITION:
				return HANDLE_POSITION_EDEFAULT == null ? handlePosition != null : !HANDLE_POSITION_EDEFAULT.equals(handlePosition);
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MAXIMUM:
				return HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT == null ? handleRadiusRangeMaximum != null : !HANDLE_RADIUS_RANGE_MAXIMUM_EDEFAULT.equals(handleRadiusRangeMaximum);
			case DrawingPackage.HANDLE_TYPE__HANDLE_RADIUS_RANGE_MINIMUM:
				return HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT == null ? handleRadiusRangeMinimum != null : !HANDLE_RADIUS_RANGE_MINIMUM_EDEFAULT.equals(handleRadiusRangeMinimum);
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMAXIMUM:
				return HANDLE_RANGE_XMAXIMUM_EDEFAULT == null ? handleRangeXMaximum != null : !HANDLE_RANGE_XMAXIMUM_EDEFAULT.equals(handleRangeXMaximum);
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_XMINIMUM:
				return HANDLE_RANGE_XMINIMUM_EDEFAULT == null ? handleRangeXMinimum != null : !HANDLE_RANGE_XMINIMUM_EDEFAULT.equals(handleRangeXMinimum);
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMAXIMUM:
				return HANDLE_RANGE_YMAXIMUM_EDEFAULT == null ? handleRangeYMaximum != null : !HANDLE_RANGE_YMAXIMUM_EDEFAULT.equals(handleRangeYMaximum);
			case DrawingPackage.HANDLE_TYPE__HANDLE_RANGE_YMINIMUM:
				return HANDLE_RANGE_YMINIMUM_EDEFAULT == null ? handleRangeYMinimum != null : !HANDLE_RANGE_YMINIMUM_EDEFAULT.equals(handleRangeYMinimum);
			case DrawingPackage.HANDLE_TYPE__HANDLE_SWITCHED:
				return isSetHandleSwitched();
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
		result.append(" (handleMirrorHorizontal: ");
		if (handleMirrorHorizontalESet) result.append(handleMirrorHorizontal); else result.append("<unset>");
		result.append(", handleMirrorVertical: ");
		if (handleMirrorVerticalESet) result.append(handleMirrorVertical); else result.append("<unset>");
		result.append(", handlePolar: ");
		result.append(handlePolar);
		result.append(", handlePosition: ");
		result.append(handlePosition);
		result.append(", handleRadiusRangeMaximum: ");
		result.append(handleRadiusRangeMaximum);
		result.append(", handleRadiusRangeMinimum: ");
		result.append(handleRadiusRangeMinimum);
		result.append(", handleRangeXMaximum: ");
		result.append(handleRangeXMaximum);
		result.append(", handleRangeXMinimum: ");
		result.append(handleRangeXMinimum);
		result.append(", handleRangeYMaximum: ");
		result.append(handleRangeYMaximum);
		result.append(", handleRangeYMinimum: ");
		result.append(handleRangeYMinimum);
		result.append(", handleSwitched: ");
		if (handleSwitchedESet) result.append(handleSwitched); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HandleTypeImpl
