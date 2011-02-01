/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.SequenceDeclType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Decl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceDeclTypeImpl#getDisplayOutlineLevel <em>Display Outline Level</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceDeclTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.SequenceDeclTypeImpl#getSeparationCharacter <em>Separation Character</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceDeclTypeImpl extends EObjectImpl implements SequenceDeclType {
	/**
	 * The default value of the '{@link #getDisplayOutlineLevel() <em>Display Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISPLAY_OUTLINE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayOutlineLevel() <em>Display Outline Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOutlineLevel()
	 * @generated
	 * @ordered
	 */
	protected BigInteger displayOutlineLevel = DISPLAY_OUTLINE_LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getSeparationCharacter() <em>Separation Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparationCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATION_CHARACTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparationCharacter() <em>Separation Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparationCharacter()
	 * @generated
	 * @ordered
	 */
	protected String separationCharacter = SEPARATION_CHARACTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDeclTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getSequenceDeclType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDisplayOutlineLevel() {
		return displayOutlineLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayOutlineLevel(BigInteger newDisplayOutlineLevel) {
		BigInteger oldDisplayOutlineLevel = displayOutlineLevel;
		displayOutlineLevel = newDisplayOutlineLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SEQUENCE_DECL_TYPE__DISPLAY_OUTLINE_LEVEL, oldDisplayOutlineLevel, displayOutlineLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SEQUENCE_DECL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeparationCharacter() {
		return separationCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparationCharacter(String newSeparationCharacter) {
		String oldSeparationCharacter = separationCharacter;
		separationCharacter = newSeparationCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.SEQUENCE_DECL_TYPE__SEPARATION_CHARACTER, oldSeparationCharacter, separationCharacter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextPackage.SEQUENCE_DECL_TYPE__DISPLAY_OUTLINE_LEVEL:
				return getDisplayOutlineLevel();
			case TextPackage.SEQUENCE_DECL_TYPE__NAME:
				return getName();
			case TextPackage.SEQUENCE_DECL_TYPE__SEPARATION_CHARACTER:
				return getSeparationCharacter();
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
			case TextPackage.SEQUENCE_DECL_TYPE__DISPLAY_OUTLINE_LEVEL:
				setDisplayOutlineLevel((BigInteger)newValue);
				return;
			case TextPackage.SEQUENCE_DECL_TYPE__NAME:
				setName((String)newValue);
				return;
			case TextPackage.SEQUENCE_DECL_TYPE__SEPARATION_CHARACTER:
				setSeparationCharacter((String)newValue);
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
			case TextPackage.SEQUENCE_DECL_TYPE__DISPLAY_OUTLINE_LEVEL:
				setDisplayOutlineLevel(DISPLAY_OUTLINE_LEVEL_EDEFAULT);
				return;
			case TextPackage.SEQUENCE_DECL_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextPackage.SEQUENCE_DECL_TYPE__SEPARATION_CHARACTER:
				setSeparationCharacter(SEPARATION_CHARACTER_EDEFAULT);
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
			case TextPackage.SEQUENCE_DECL_TYPE__DISPLAY_OUTLINE_LEVEL:
				return DISPLAY_OUTLINE_LEVEL_EDEFAULT == null ? displayOutlineLevel != null : !DISPLAY_OUTLINE_LEVEL_EDEFAULT.equals(displayOutlineLevel);
			case TextPackage.SEQUENCE_DECL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextPackage.SEQUENCE_DECL_TYPE__SEPARATION_CHARACTER:
				return SEPARATION_CHARACTER_EDEFAULT == null ? separationCharacter != null : !SEPARATION_CHARACTER_EDEFAULT.equals(separationCharacter);
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
		result.append(" (displayOutlineLevel: ");
		result.append(displayOutlineLevel);
		result.append(", name: ");
		result.append(name);
		result.append(", separationCharacter: ");
		result.append(separationCharacter);
		result.append(')');
		return result.toString();
	}

} //SequenceDeclTypeImpl
