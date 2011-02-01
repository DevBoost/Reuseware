/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.office.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.office.FontFaceDeclsType;
import org.oasisopen.names.tc.opendocument.xmlns.office.OfficePackage;
import org.oasisopen.names.tc.opendocument.xmlns.style.FontFaceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Face Decls Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.office.impl.FontFaceDeclsTypeImpl#getFontFace <em>Font Face</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontFaceDeclsTypeImpl extends EObjectImpl implements FontFaceDeclsType {
	/**
	 * The cached value of the '{@link #getFontFace() <em>Font Face</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFace()
	 * @generated
	 * @ordered
	 */
	protected EList<FontFaceType> fontFace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontFaceDeclsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OfficePackage.Literals.FONT_FACE_DECLS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FontFaceType> getFontFace() {
		if (fontFace == null) {
			fontFace = new EObjectContainmentEList<FontFaceType>(FontFaceType.class, this, OfficePackage.FONT_FACE_DECLS_TYPE__FONT_FACE);
		}
		return fontFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OfficePackage.FONT_FACE_DECLS_TYPE__FONT_FACE:
				return ((InternalEList<?>)getFontFace()).basicRemove(otherEnd, msgs);
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
			case OfficePackage.FONT_FACE_DECLS_TYPE__FONT_FACE:
				return getFontFace();
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
			case OfficePackage.FONT_FACE_DECLS_TYPE__FONT_FACE:
				getFontFace().clear();
				getFontFace().addAll((Collection<? extends FontFaceType>)newValue);
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
			case OfficePackage.FONT_FACE_DECLS_TYPE__FONT_FACE:
				getFontFace().clear();
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
			case OfficePackage.FONT_FACE_DECLS_TYPE__FONT_FACE:
				return fontFace != null && !fontFace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FontFaceDeclsTypeImpl
