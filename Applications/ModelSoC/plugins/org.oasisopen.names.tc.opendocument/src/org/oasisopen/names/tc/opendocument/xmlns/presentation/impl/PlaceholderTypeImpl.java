/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PlaceholderType;
import org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.PresentationClasses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placeholder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.impl.PlaceholderTypeImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceholderTypeImpl extends EObjectImpl implements PlaceholderType {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final PresentationClasses OBJECT_EDEFAULT = PresentationClasses.TITLE;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected PresentationClasses object = OBJECT_EDEFAULT;

	/**
	 * This is true if the Object attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceholderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.PLACEHOLDER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLACEHOLDER_TYPE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationClasses getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(PresentationClasses newObject) {
		PresentationClasses oldObject = object;
		object = newObject == null ? OBJECT_EDEFAULT : newObject;
		boolean oldObjectESet = objectESet;
		objectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLACEHOLDER_TYPE__OBJECT, oldObject, object, !oldObjectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObject() {
		PresentationClasses oldObject = object;
		boolean oldObjectESet = objectESet;
		object = OBJECT_EDEFAULT;
		objectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PresentationPackage.PLACEHOLDER_TYPE__OBJECT, oldObject, OBJECT_EDEFAULT, oldObjectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObject() {
		return objectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLACEHOLDER_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLACEHOLDER_TYPE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.PLACEHOLDER_TYPE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.PLACEHOLDER_TYPE__HEIGHT:
				return getHeight();
			case PresentationPackage.PLACEHOLDER_TYPE__OBJECT:
				return getObject();
			case PresentationPackage.PLACEHOLDER_TYPE__WIDTH:
				return getWidth();
			case PresentationPackage.PLACEHOLDER_TYPE__X:
				return getX();
			case PresentationPackage.PLACEHOLDER_TYPE__Y:
				return getY();
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
			case PresentationPackage.PLACEHOLDER_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__OBJECT:
				setObject((PresentationClasses)newValue);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__X:
				setX((String)newValue);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__Y:
				setY((String)newValue);
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
			case PresentationPackage.PLACEHOLDER_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__OBJECT:
				unsetObject();
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__X:
				setX(X_EDEFAULT);
				return;
			case PresentationPackage.PLACEHOLDER_TYPE__Y:
				setY(Y_EDEFAULT);
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
			case PresentationPackage.PLACEHOLDER_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case PresentationPackage.PLACEHOLDER_TYPE__OBJECT:
				return isSetObject();
			case PresentationPackage.PLACEHOLDER_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case PresentationPackage.PLACEHOLDER_TYPE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case PresentationPackage.PLACEHOLDER_TYPE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
		result.append(" (height: ");
		result.append(height);
		result.append(", object: ");
		if (objectESet) result.append(object); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //PlaceholderTypeImpl
