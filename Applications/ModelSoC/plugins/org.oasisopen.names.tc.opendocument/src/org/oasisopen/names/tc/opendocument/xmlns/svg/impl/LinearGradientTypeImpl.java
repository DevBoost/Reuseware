/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.svg.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.svg.GradientUnitsType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.LinearGradientType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SpreadMethodType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.StopType;
import org.oasisopen.names.tc.opendocument.xmlns.svg.SvgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Gradient Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getStop <em>Stop</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getGradientTransform <em>Gradient Transform</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getGradientUnits <em>Gradient Units</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.svg.impl.LinearGradientTypeImpl#getY2 <em>Y2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearGradientTypeImpl extends EObjectImpl implements LinearGradientType {
	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected EList<StopType> stop;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADIENT_TRANSFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradientTransform() <em>Gradient Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTransform()
	 * @generated
	 * @ordered
	 */
	protected String gradientTransform = GRADIENT_TRANSFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected static final GradientUnitsType GRADIENT_UNITS_EDEFAULT = GradientUnitsType.OBJECT_BOUNDING_BOX;

	/**
	 * The cached value of the '{@link #getGradientUnits() <em>Gradient Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientUnits()
	 * @generated
	 * @ordered
	 */
	protected GradientUnitsType gradientUnits = GRADIENT_UNITS_EDEFAULT;

	/**
	 * This is true if the Gradient Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradientUnitsESet;

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
	 * The default value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected static final SpreadMethodType SPREAD_METHOD_EDEFAULT = SpreadMethodType.PAD;

	/**
	 * The cached value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected SpreadMethodType spreadMethod = SPREAD_METHOD_EDEFAULT;

	/**
	 * This is true if the Spread Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spreadMethodESet;

	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final String X1_EDEFAULT = "0%";

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected String x1 = X1_EDEFAULT;

	/**
	 * This is true if the X1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x1ESet;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final String X2_EDEFAULT = "100%";

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected String x2 = X2_EDEFAULT;

	/**
	 * This is true if the X2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean x2ESet;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final String Y1_EDEFAULT = "0%";

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected String y1 = Y1_EDEFAULT;

	/**
	 * This is true if the Y1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y1ESet;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final String Y2_EDEFAULT = "100%";

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected String y2 = Y2_EDEFAULT;

	/**
	 * This is true if the Y2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean y2ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearGradientTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvgPackage.Literals.LINEAR_GRADIENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopType> getStop() {
		if (stop == null) {
			stop = new EObjectContainmentEList<StopType>(StopType.class, this, SvgPackage.LINEAR_GRADIENT_TYPE__STOP);
		}
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradientTransform() {
		return gradientTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientTransform(String newGradientTransform) {
		String oldGradientTransform = gradientTransform;
		gradientTransform = newGradientTransform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM, oldGradientTransform, gradientTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientUnitsType getGradientUnits() {
		return gradientUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientUnits(GradientUnitsType newGradientUnits) {
		GradientUnitsType oldGradientUnits = gradientUnits;
		gradientUnits = newGradientUnits == null ? GRADIENT_UNITS_EDEFAULT : newGradientUnits;
		boolean oldGradientUnitsESet = gradientUnitsESet;
		gradientUnitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_UNITS, oldGradientUnits, gradientUnits, !oldGradientUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGradientUnits() {
		GradientUnitsType oldGradientUnits = gradientUnits;
		boolean oldGradientUnitsESet = gradientUnitsESet;
		gradientUnits = GRADIENT_UNITS_EDEFAULT;
		gradientUnitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_UNITS, oldGradientUnits, GRADIENT_UNITS_EDEFAULT, oldGradientUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGradientUnits() {
		return gradientUnitsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethodType getSpreadMethod() {
		return spreadMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadMethod(SpreadMethodType newSpreadMethod) {
		SpreadMethodType oldSpreadMethod = spreadMethod;
		spreadMethod = newSpreadMethod == null ? SPREAD_METHOD_EDEFAULT : newSpreadMethod;
		boolean oldSpreadMethodESet = spreadMethodESet;
		spreadMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__SPREAD_METHOD, oldSpreadMethod, spreadMethod, !oldSpreadMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpreadMethod() {
		SpreadMethodType oldSpreadMethod = spreadMethod;
		boolean oldSpreadMethodESet = spreadMethodESet;
		spreadMethod = SPREAD_METHOD_EDEFAULT;
		spreadMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.LINEAR_GRADIENT_TYPE__SPREAD_METHOD, oldSpreadMethod, SPREAD_METHOD_EDEFAULT, oldSpreadMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpreadMethod() {
		return spreadMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(String newX1) {
		String oldX1 = x1;
		x1 = newX1;
		boolean oldX1ESet = x1ESet;
		x1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__X1, oldX1, x1, !oldX1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX1() {
		String oldX1 = x1;
		boolean oldX1ESet = x1ESet;
		x1 = X1_EDEFAULT;
		x1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.LINEAR_GRADIENT_TYPE__X1, oldX1, X1_EDEFAULT, oldX1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX1() {
		return x1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(String newX2) {
		String oldX2 = x2;
		x2 = newX2;
		boolean oldX2ESet = x2ESet;
		x2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__X2, oldX2, x2, !oldX2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetX2() {
		String oldX2 = x2;
		boolean oldX2ESet = x2ESet;
		x2 = X2_EDEFAULT;
		x2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.LINEAR_GRADIENT_TYPE__X2, oldX2, X2_EDEFAULT, oldX2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetX2() {
		return x2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(String newY1) {
		String oldY1 = y1;
		y1 = newY1;
		boolean oldY1ESet = y1ESet;
		y1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__Y1, oldY1, y1, !oldY1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY1() {
		String oldY1 = y1;
		boolean oldY1ESet = y1ESet;
		y1 = Y1_EDEFAULT;
		y1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.LINEAR_GRADIENT_TYPE__Y1, oldY1, Y1_EDEFAULT, oldY1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY1() {
		return y1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(String newY2) {
		String oldY2 = y2;
		y2 = newY2;
		boolean oldY2ESet = y2ESet;
		y2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvgPackage.LINEAR_GRADIENT_TYPE__Y2, oldY2, y2, !oldY2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetY2() {
		String oldY2 = y2;
		boolean oldY2ESet = y2ESet;
		y2 = Y2_EDEFAULT;
		y2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SvgPackage.LINEAR_GRADIENT_TYPE__Y2, oldY2, Y2_EDEFAULT, oldY2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetY2() {
		return y2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvgPackage.LINEAR_GRADIENT_TYPE__STOP:
				return ((InternalEList<?>)getStop()).basicRemove(otherEnd, msgs);
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
			case SvgPackage.LINEAR_GRADIENT_TYPE__STOP:
				return getStop();
			case SvgPackage.LINEAR_GRADIENT_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				return getGradientTransform();
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_UNITS:
				return getGradientUnits();
			case SvgPackage.LINEAR_GRADIENT_TYPE__NAME:
				return getName();
			case SvgPackage.LINEAR_GRADIENT_TYPE__SPREAD_METHOD:
				return getSpreadMethod();
			case SvgPackage.LINEAR_GRADIENT_TYPE__X1:
				return getX1();
			case SvgPackage.LINEAR_GRADIENT_TYPE__X2:
				return getX2();
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y1:
				return getY1();
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y2:
				return getY2();
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
			case SvgPackage.LINEAR_GRADIENT_TYPE__STOP:
				getStop().clear();
				getStop().addAll((Collection<? extends StopType>)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				setGradientTransform((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_UNITS:
				setGradientUnits((GradientUnitsType)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__SPREAD_METHOD:
				setSpreadMethod((SpreadMethodType)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__X1:
				setX1((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__X2:
				setX2((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y1:
				setY1((String)newValue);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y2:
				setY2((String)newValue);
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
			case SvgPackage.LINEAR_GRADIENT_TYPE__STOP:
				getStop().clear();
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				setGradientTransform(GRADIENT_TRANSFORM_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_UNITS:
				unsetGradientUnits();
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__SPREAD_METHOD:
				unsetSpreadMethod();
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__X1:
				unsetX1();
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__X2:
				unsetX2();
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y1:
				unsetY1();
				return;
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y2:
				unsetY2();
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
			case SvgPackage.LINEAR_GRADIENT_TYPE__STOP:
				return stop != null && !stop.isEmpty();
			case SvgPackage.LINEAR_GRADIENT_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_TRANSFORM:
				return GRADIENT_TRANSFORM_EDEFAULT == null ? gradientTransform != null : !GRADIENT_TRANSFORM_EDEFAULT.equals(gradientTransform);
			case SvgPackage.LINEAR_GRADIENT_TYPE__GRADIENT_UNITS:
				return isSetGradientUnits();
			case SvgPackage.LINEAR_GRADIENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SvgPackage.LINEAR_GRADIENT_TYPE__SPREAD_METHOD:
				return isSetSpreadMethod();
			case SvgPackage.LINEAR_GRADIENT_TYPE__X1:
				return isSetX1();
			case SvgPackage.LINEAR_GRADIENT_TYPE__X2:
				return isSetX2();
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y1:
				return isSetY1();
			case SvgPackage.LINEAR_GRADIENT_TYPE__Y2:
				return isSetY2();
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", gradientTransform: ");
		result.append(gradientTransform);
		result.append(", gradientUnits: ");
		if (gradientUnitsESet) result.append(gradientUnits); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", spreadMethod: ");
		if (spreadMethodESet) result.append(spreadMethod); else result.append("<unset>");
		result.append(", x1: ");
		if (x1ESet) result.append(x1); else result.append("<unset>");
		result.append(", x2: ");
		if (x2ESet) result.append(x2); else result.append("<unset>");
		result.append(", y1: ");
		if (y1ESet) result.append(y1); else result.append("<unset>");
		result.append(", y2: ");
		if (y2ESet) result.append(y2); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LinearGradientTypeImpl
