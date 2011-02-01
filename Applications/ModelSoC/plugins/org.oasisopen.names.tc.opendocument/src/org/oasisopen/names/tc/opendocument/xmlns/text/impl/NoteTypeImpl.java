/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.text.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.oasisopen.names.tc.opendocument.xmlns.text.NoteBodyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NoteCitationType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NoteClassType;
import org.oasisopen.names.tc.opendocument.xmlns.text.NoteType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NoteTypeImpl#getNoteCitation <em>Note Citation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NoteTypeImpl#getNoteBody <em>Note Body</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NoteTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.NoteTypeImpl#getNoteClass <em>Note Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteTypeImpl extends EObjectImpl implements NoteType {
	/**
	 * The cached value of the '{@link #getNoteCitation() <em>Note Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteCitation()
	 * @generated
	 * @ordered
	 */
	protected NoteCitationType noteCitation;

	/**
	 * The cached value of the '{@link #getNoteBody() <em>Note Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteBody()
	 * @generated
	 * @ordered
	 */
	protected NoteBodyType noteBody;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoteClass() <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteClass()
	 * @generated
	 * @ordered
	 */
	protected static final NoteClassType NOTE_CLASS_EDEFAULT = NoteClassType.FOOTNOTE;

	/**
	 * The cached value of the '{@link #getNoteClass() <em>Note Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteClass()
	 * @generated
	 * @ordered
	 */
	protected NoteClassType noteClass = NOTE_CLASS_EDEFAULT;

	/**
	 * This is true if the Note Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noteClassESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getNoteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteCitationType getNoteCitation() {
		return noteCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteCitation(NoteCitationType newNoteCitation, NotificationChain msgs) {
		NoteCitationType oldNoteCitation = noteCitation;
		noteCitation = newNoteCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.NOTE_TYPE__NOTE_CITATION, oldNoteCitation, newNoteCitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteCitation(NoteCitationType newNoteCitation) {
		if (newNoteCitation != noteCitation) {
			NotificationChain msgs = null;
			if (noteCitation != null)
				msgs = ((InternalEObject)noteCitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.NOTE_TYPE__NOTE_CITATION, null, msgs);
			if (newNoteCitation != null)
				msgs = ((InternalEObject)newNoteCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.NOTE_TYPE__NOTE_CITATION, null, msgs);
			msgs = basicSetNoteCitation(newNoteCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NOTE_TYPE__NOTE_CITATION, newNoteCitation, newNoteCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteBodyType getNoteBody() {
		return noteBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoteBody(NoteBodyType newNoteBody, NotificationChain msgs) {
		NoteBodyType oldNoteBody = noteBody;
		noteBody = newNoteBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.NOTE_TYPE__NOTE_BODY, oldNoteBody, newNoteBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteBody(NoteBodyType newNoteBody) {
		if (newNoteBody != noteBody) {
			NotificationChain msgs = null;
			if (noteBody != null)
				msgs = ((InternalEObject)noteBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.NOTE_TYPE__NOTE_BODY, null, msgs);
			if (newNoteBody != null)
				msgs = ((InternalEObject)newNoteBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.NOTE_TYPE__NOTE_BODY, null, msgs);
			msgs = basicSetNoteBody(newNoteBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NOTE_TYPE__NOTE_BODY, newNoteBody, newNoteBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NOTE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteClassType getNoteClass() {
		return noteClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoteClass(NoteClassType newNoteClass) {
		NoteClassType oldNoteClass = noteClass;
		noteClass = newNoteClass == null ? NOTE_CLASS_EDEFAULT : newNoteClass;
		boolean oldNoteClassESet = noteClassESet;
		noteClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.NOTE_TYPE__NOTE_CLASS, oldNoteClass, noteClass, !oldNoteClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoteClass() {
		NoteClassType oldNoteClass = noteClass;
		boolean oldNoteClassESet = noteClassESet;
		noteClass = NOTE_CLASS_EDEFAULT;
		noteClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.NOTE_TYPE__NOTE_CLASS, oldNoteClass, NOTE_CLASS_EDEFAULT, oldNoteClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoteClass() {
		return noteClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.NOTE_TYPE__NOTE_CITATION:
				return basicSetNoteCitation(null, msgs);
			case TextPackage.NOTE_TYPE__NOTE_BODY:
				return basicSetNoteBody(null, msgs);
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
			case TextPackage.NOTE_TYPE__NOTE_CITATION:
				return getNoteCitation();
			case TextPackage.NOTE_TYPE__NOTE_BODY:
				return getNoteBody();
			case TextPackage.NOTE_TYPE__ID:
				return getId();
			case TextPackage.NOTE_TYPE__NOTE_CLASS:
				return getNoteClass();
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
			case TextPackage.NOTE_TYPE__NOTE_CITATION:
				setNoteCitation((NoteCitationType)newValue);
				return;
			case TextPackage.NOTE_TYPE__NOTE_BODY:
				setNoteBody((NoteBodyType)newValue);
				return;
			case TextPackage.NOTE_TYPE__ID:
				setId((String)newValue);
				return;
			case TextPackage.NOTE_TYPE__NOTE_CLASS:
				setNoteClass((NoteClassType)newValue);
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
			case TextPackage.NOTE_TYPE__NOTE_CITATION:
				setNoteCitation((NoteCitationType)null);
				return;
			case TextPackage.NOTE_TYPE__NOTE_BODY:
				setNoteBody((NoteBodyType)null);
				return;
			case TextPackage.NOTE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case TextPackage.NOTE_TYPE__NOTE_CLASS:
				unsetNoteClass();
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
			case TextPackage.NOTE_TYPE__NOTE_CITATION:
				return noteCitation != null;
			case TextPackage.NOTE_TYPE__NOTE_BODY:
				return noteBody != null;
			case TextPackage.NOTE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TextPackage.NOTE_TYPE__NOTE_CLASS:
				return isSetNoteClass();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", noteClass: ");
		if (noteClassESet) result.append(noteClass); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NoteTypeImpl
