/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.chart.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.chart.AxisType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.CategoriesType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.ChartPackage;
import org.oasisopen.names.tc.opendocument.xmlns.chart.DimensionType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.GridType;
import org.oasisopen.names.tc.opendocument.xmlns.chart.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.chart.impl.AxisTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisTypeImpl extends EObjectImpl implements AxisType {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected CategoriesType categories;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected EList<GridType> grid;

	/**
	 * The default value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionType DIMENSION_EDEFAULT = DimensionType.X;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected DimensionType dimension = DIMENSION_EDEFAULT;

	/**
	 * This is true if the Dimension attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dimensionESet;

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
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartPackage.Literals.AXIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.AXIS_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.AXIS_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoriesType getCategories() {
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategories(CategoriesType newCategories, NotificationChain msgs) {
		CategoriesType oldCategories = categories;
		categories = newCategories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__CATEGORIES, oldCategories, newCategories);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(CategoriesType newCategories) {
		if (newCategories != categories) {
			NotificationChain msgs = null;
			if (categories != null)
				msgs = ((InternalEObject)categories).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChartPackage.AXIS_TYPE__CATEGORIES, null, msgs);
			if (newCategories != null)
				msgs = ((InternalEObject)newCategories).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChartPackage.AXIS_TYPE__CATEGORIES, null, msgs);
			msgs = basicSetCategories(newCategories, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__CATEGORIES, newCategories, newCategories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GridType> getGrid() {
		if (grid == null) {
			grid = new EObjectContainmentEList<GridType>(GridType.class, this, ChartPackage.AXIS_TYPE__GRID);
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType getDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(DimensionType newDimension) {
		DimensionType oldDimension = dimension;
		dimension = newDimension == null ? DIMENSION_EDEFAULT : newDimension;
		boolean oldDimensionESet = dimensionESet;
		dimensionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__DIMENSION, oldDimension, dimension, !oldDimensionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDimension() {
		DimensionType oldDimension = dimension;
		boolean oldDimensionESet = dimensionESet;
		dimension = DIMENSION_EDEFAULT;
		dimensionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ChartPackage.AXIS_TYPE__DIMENSION, oldDimension, DIMENSION_EDEFAULT, oldDimensionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDimension() {
		return dimensionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartPackage.AXIS_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChartPackage.AXIS_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case ChartPackage.AXIS_TYPE__CATEGORIES:
				return basicSetCategories(null, msgs);
			case ChartPackage.AXIS_TYPE__GRID:
				return ((InternalEList<?>)getGrid()).basicRemove(otherEnd, msgs);
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
			case ChartPackage.AXIS_TYPE__TITLE:
				return getTitle();
			case ChartPackage.AXIS_TYPE__CATEGORIES:
				return getCategories();
			case ChartPackage.AXIS_TYPE__GRID:
				return getGrid();
			case ChartPackage.AXIS_TYPE__DIMENSION:
				return getDimension();
			case ChartPackage.AXIS_TYPE__NAME:
				return getName();
			case ChartPackage.AXIS_TYPE__STYLE_NAME:
				return getStyleName();
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
			case ChartPackage.AXIS_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case ChartPackage.AXIS_TYPE__CATEGORIES:
				setCategories((CategoriesType)newValue);
				return;
			case ChartPackage.AXIS_TYPE__GRID:
				getGrid().clear();
				getGrid().addAll((Collection<? extends GridType>)newValue);
				return;
			case ChartPackage.AXIS_TYPE__DIMENSION:
				setDimension((DimensionType)newValue);
				return;
			case ChartPackage.AXIS_TYPE__NAME:
				setName((String)newValue);
				return;
			case ChartPackage.AXIS_TYPE__STYLE_NAME:
				setStyleName((String)newValue);
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
			case ChartPackage.AXIS_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case ChartPackage.AXIS_TYPE__CATEGORIES:
				setCategories((CategoriesType)null);
				return;
			case ChartPackage.AXIS_TYPE__GRID:
				getGrid().clear();
				return;
			case ChartPackage.AXIS_TYPE__DIMENSION:
				unsetDimension();
				return;
			case ChartPackage.AXIS_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ChartPackage.AXIS_TYPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case ChartPackage.AXIS_TYPE__TITLE:
				return title != null;
			case ChartPackage.AXIS_TYPE__CATEGORIES:
				return categories != null;
			case ChartPackage.AXIS_TYPE__GRID:
				return grid != null && !grid.isEmpty();
			case ChartPackage.AXIS_TYPE__DIMENSION:
				return isSetDimension();
			case ChartPackage.AXIS_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ChartPackage.AXIS_TYPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(" (dimension: ");
		if (dimensionESet) result.append(dimension); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //AxisTypeImpl
