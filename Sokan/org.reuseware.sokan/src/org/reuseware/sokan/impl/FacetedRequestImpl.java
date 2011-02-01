/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.reuseware.sokan.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.reuseware.sokan.Constraint;
import org.reuseware.sokan.FacetedRequest;
import org.reuseware.sokan.SokanPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Faceted Request</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.reuseware.sokan.impl.FacetedRequestImpl#getFacetFields <em>Facet Fields</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.FacetedRequestImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.FacetedRequestImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.FacetedRequestImpl#getKeywordSearchString <em>Keyword Search String</em>}</li>
 *   <li>{@link org.reuseware.sokan.impl.FacetedRequestImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetedRequestImpl extends EObjectImpl implements FacetedRequest {

	/**
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FacetedRequest)) return false;
	
		FacetedRequest otherRequest = (FacetedRequest) obj;	
		//is always null: if (!this.getFacetFields().equals(otherRequest.getFacetFields())) return false;
		//is always null: if (!this.getKeywordSearchString().equals(otherRequest.getKeywordSearchString())) return false;
		if (this.getOffset() != otherRequest.getOffset()) return false;
		if (this.getRows() != otherRequest.getRows()) return false;
		if (this.getConstraints().size() != otherRequest.getConstraints().size()) return false;
			
		Iterator<Constraint> thisIt = this.getConstraints().iterator();
		Iterator<Constraint> otherIt = otherRequest.getConstraints().iterator();
		
		while (thisIt.hasNext() && otherIt.hasNext()) {
			Constraint constraint1 = thisIt.next();
			Constraint constraint2 = otherIt.next();
			if (!constraint1.getName().equals(constraint2.getName())) return false;
			if (!constraint1.getValues().equals(constraint2.getValues())) return false;
		}
		
		return true;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public int hashCode() {
		String result = "";
		for (Constraint constraint : getConstraints()) {
			result += constraint.getName();
			result += constraint.getValues();
		}
		return result.hashCode();
	}
	
	/**
	 * The cached value of the '{@link #getFacetFields() <em>Facet Fields</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFacetFields()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facetFields;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeywordSearchString() <em>Keyword Search String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getKeywordSearchString()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_SEARCH_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywordSearchString() <em>Keyword Search String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getKeywordSearchString()
	 * @generated
	 * @ordered
	 */
	protected String keywordSearchString = KEYWORD_SEARCH_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FacetedRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SokanPackage.Literals.FACETED_REQUEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, SokanPackage.FACETED_REQUEST__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SokanPackage.FACETED_REQUEST__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFacetFields() {
		return facetFields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetFields(EList<String> newFacetFields) {
		EList<String> oldFacetFields = facetFields;
		facetFields = newFacetFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_REQUEST__FACET_FIELDS, oldFacetFields, facetFields));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeywordSearchString() {
		return keywordSearchString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywordSearchString(String newKeywordSearchString) {
		String oldKeywordSearchString = keywordSearchString;
		keywordSearchString = newKeywordSearchString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_REQUEST__KEYWORD_SEARCH_STRING, oldKeywordSearchString, keywordSearchString));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_REQUEST__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SokanPackage.FACETED_REQUEST__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SokanPackage.FACETED_REQUEST__FACET_FIELDS:
				return getFacetFields();
			case SokanPackage.FACETED_REQUEST__ROWS:
				return getRows();
			case SokanPackage.FACETED_REQUEST__OFFSET:
				return getOffset();
			case SokanPackage.FACETED_REQUEST__KEYWORD_SEARCH_STRING:
				return getKeywordSearchString();
			case SokanPackage.FACETED_REQUEST__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SokanPackage.FACETED_REQUEST__FACET_FIELDS:
				setFacetFields((EList<String>)newValue);
				return;
			case SokanPackage.FACETED_REQUEST__ROWS:
				setRows((Integer)newValue);
				return;
			case SokanPackage.FACETED_REQUEST__OFFSET:
				setOffset((Integer)newValue);
				return;
			case SokanPackage.FACETED_REQUEST__KEYWORD_SEARCH_STRING:
				setKeywordSearchString((String)newValue);
				return;
			case SokanPackage.FACETED_REQUEST__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SokanPackage.FACETED_REQUEST__FACET_FIELDS:
				setFacetFields((EList<String>)null);
				return;
			case SokanPackage.FACETED_REQUEST__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case SokanPackage.FACETED_REQUEST__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case SokanPackage.FACETED_REQUEST__KEYWORD_SEARCH_STRING:
				setKeywordSearchString(KEYWORD_SEARCH_STRING_EDEFAULT);
				return;
			case SokanPackage.FACETED_REQUEST__CONSTRAINTS:
				getConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SokanPackage.FACETED_REQUEST__FACET_FIELDS:
				return facetFields != null;
			case SokanPackage.FACETED_REQUEST__ROWS:
				return rows != ROWS_EDEFAULT;
			case SokanPackage.FACETED_REQUEST__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case SokanPackage.FACETED_REQUEST__KEYWORD_SEARCH_STRING:
				return KEYWORD_SEARCH_STRING_EDEFAULT == null ? keywordSearchString != null : !KEYWORD_SEARCH_STRING_EDEFAULT.equals(keywordSearchString);
			case SokanPackage.FACETED_REQUEST__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (facetFields: ");
		result.append(facetFields);
		result.append(", rows: ");
		result.append(rows);
		result.append(", offset: ");
		result.append(offset);
		result.append(", keywordSearchString: ");
		result.append(keywordSearchString);
		result.append(')');
		return result.toString();
	}

} // FacetedRequestImpl
