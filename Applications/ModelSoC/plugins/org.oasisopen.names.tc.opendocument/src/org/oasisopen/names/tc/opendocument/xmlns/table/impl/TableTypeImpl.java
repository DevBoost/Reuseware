/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.oasisopen.names.tc.opendocument.xmlns.office.FormsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ScenarioType;
import org.oasisopen.names.tc.opendocument.xmlns.table.ShapesType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderColumnsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableHeaderRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TablePackage;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowGroupType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableRowsType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableSourceType;
import org.oasisopen.names.tc.opendocument.xmlns.table.TableType;
import org.oasisopen.names.tc.opendocument.xmlns.text.SoftPageBreakType;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextSectionSourceDdeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableSource <em>Table Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getDdeSource <em>Dde Source</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumnGroup <em>Table Column Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumns <em>Table Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumn <em>Table Column</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableHeaderColumns <em>Table Header Columns</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumns1 <em>Table Columns1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumn1 <em>Table Column1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableHeaderColumns1 <em>Table Header Columns1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumns2 <em>Table Columns2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableColumn2 <em>Table Column2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRowGroup <em>Table Row Group</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRows <em>Table Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getSoftPageBreak <em>Soft Page Break</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRow <em>Table Row</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableHeaderRows <em>Table Header Rows</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRows1 <em>Table Rows1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getSoftPageBreak1 <em>Soft Page Break1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRow1 <em>Table Row1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableHeaderRows1 <em>Table Header Rows1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRows2 <em>Table Rows2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getSoftPageBreak2 <em>Soft Page Break2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getTableRow2 <em>Table Row2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getIsSubTable <em>Is Sub Table</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getPrint <em>Print</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getPrintRanges <em>Print Ranges</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getProtectionKey <em>Protection Key</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.table.impl.TableTypeImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableTypeImpl extends EObjectImpl implements TableType {
	/**
	 * The cached value of the '{@link #getTableSource() <em>Table Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSource()
	 * @generated
	 * @ordered
	 */
	protected TableSourceType tableSource;

	/**
	 * The cached value of the '{@link #getDdeSource() <em>Dde Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdeSource()
	 * @generated
	 * @ordered
	 */
	protected TextSectionSourceDdeType ddeSource;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected ScenarioType scenario;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected FormsType forms;

	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected ShapesType shapes;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

	/**
	 * The default value of the '{@link #getIsSubTable() <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubTable()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean IS_SUB_TABLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsSubTable() <em>Is Sub Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSubTable()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean isSubTable = IS_SUB_TABLE_EDEFAULT;

	/**
	 * This is true if the Is Sub Table attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSubTableESet;

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
	 * The default value of the '{@link #getPrint() <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRINT_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrint() <em>Print</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrint()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean print = PRINT_EDEFAULT;

	/**
	 * This is true if the Print attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printESet;

	/**
	 * The default value of the '{@link #getPrintRanges() <em>Print Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintRanges()
	 * @generated
	 * @ordered
	 */
	protected static final String PRINT_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrintRanges() <em>Print Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintRanges()
	 * @generated
	 * @ordered
	 */
	protected String printRanges = PRINT_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PROTECTED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * This is true if the Protected attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectedESet;

	/**
	 * The default value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROTECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectionKey() <em>Protection Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionKey()
	 * @generated
	 * @ordered
	 */
	protected Object protectionKey = PROTECTION_KEY_EDEFAULT;

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
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.eINSTANCE.getTableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableSourceType getTableSource() {
		return tableSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableSource(TableSourceType newTableSource, NotificationChain msgs) {
		TableSourceType oldTableSource = tableSource;
		tableSource = newTableSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__TABLE_SOURCE, oldTableSource, newTableSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableSource(TableSourceType newTableSource) {
		if (newTableSource != tableSource) {
			NotificationChain msgs = null;
			if (tableSource != null)
				msgs = ((InternalEObject)tableSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__TABLE_SOURCE, null, msgs);
			if (newTableSource != null)
				msgs = ((InternalEObject)newTableSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__TABLE_SOURCE, null, msgs);
			msgs = basicSetTableSource(newTableSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__TABLE_SOURCE, newTableSource, newTableSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextSectionSourceDdeType getDdeSource() {
		return ddeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdeSource(TextSectionSourceDdeType newDdeSource, NotificationChain msgs) {
		TextSectionSourceDdeType oldDdeSource = ddeSource;
		ddeSource = newDdeSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__DDE_SOURCE, oldDdeSource, newDdeSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdeSource(TextSectionSourceDdeType newDdeSource) {
		if (newDdeSource != ddeSource) {
			NotificationChain msgs = null;
			if (ddeSource != null)
				msgs = ((InternalEObject)ddeSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__DDE_SOURCE, null, msgs);
			if (newDdeSource != null)
				msgs = ((InternalEObject)newDdeSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__DDE_SOURCE, null, msgs);
			msgs = basicSetDdeSource(newDdeSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__DDE_SOURCE, newDdeSource, newDdeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioType getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(ScenarioType newScenario, NotificationChain msgs) {
		ScenarioType oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(ScenarioType newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsType getForms() {
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForms(FormsType newForms, NotificationChain msgs) {
		FormsType oldForms = forms;
		forms = newForms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__FORMS, oldForms, newForms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForms(FormsType newForms) {
		if (newForms != forms) {
			NotificationChain msgs = null;
			if (forms != null)
				msgs = ((InternalEObject)forms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__FORMS, null, msgs);
			if (newForms != null)
				msgs = ((InternalEObject)newForms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__FORMS, null, msgs);
			msgs = basicSetForms(newForms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__FORMS, newForms, newForms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesType getShapes() {
		return shapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapes(ShapesType newShapes, NotificationChain msgs) {
		ShapesType oldShapes = shapes;
		shapes = newShapes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__SHAPES, oldShapes, newShapes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapes(ShapesType newShapes) {
		if (newShapes != shapes) {
			NotificationChain msgs = null;
			if (shapes != null)
				msgs = ((InternalEObject)shapes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__SHAPES, null, msgs);
			if (newShapes != null)
				msgs = ((InternalEObject)newShapes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.TABLE_TYPE__SHAPES, null, msgs);
			msgs = basicSetShapes(newShapes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__SHAPES, newShapes, newShapes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TablePackage.TABLE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnGroupType> getTableColumnGroup() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumnGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnsType> getTableColumns() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderColumnsType> getTableHeaderColumns() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableHeaderColumns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnsType> getTableColumns1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumns1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumn1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderColumnsType> getTableHeaderColumns1() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableHeaderColumns1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnsType> getTableColumns2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumns2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableColumnType> getTableColumn2() {
		return getGroup().list(TablePackage.eINSTANCE.getTableType_TableColumn2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, TablePackage.TABLE_TYPE__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowGroupType> getTableRowGroup() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRowGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowsType> getTableRows() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRows());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_SoftPageBreak());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowType> getTableRow() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRow());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderRowsType> getTableHeaderRows() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableHeaderRows());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowsType> getTableRows1() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRows1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak1() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_SoftPageBreak1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowType> getTableRow1() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRow1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableHeaderRowsType> getTableHeaderRows1() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableHeaderRows1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowsType> getTableRows2() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRows2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftPageBreakType> getSoftPageBreak2() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_SoftPageBreak2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRowType> getTableRow2() {
		return getGroup1().list(TablePackage.eINSTANCE.getTableType_TableRow2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getIsSubTable() {
		return isSubTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSubTable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newIsSubTable) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSubTable = isSubTable;
		isSubTable = newIsSubTable == null ? IS_SUB_TABLE_EDEFAULT : newIsSubTable;
		boolean oldIsSubTableESet = isSubTableESet;
		isSubTableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__IS_SUB_TABLE, oldIsSubTable, isSubTable, !oldIsSubTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSubTable() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldIsSubTable = isSubTable;
		boolean oldIsSubTableESet = isSubTableESet;
		isSubTable = IS_SUB_TABLE_EDEFAULT;
		isSubTableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TYPE__IS_SUB_TABLE, oldIsSubTable, IS_SUB_TABLE_EDEFAULT, oldIsSubTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSubTable() {
		return isSubTableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrint() {
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrint(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrint) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrint = print;
		print = newPrint == null ? PRINT_EDEFAULT : newPrint;
		boolean oldPrintESet = printESet;
		printESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__PRINT, oldPrint, print, !oldPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrint() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrint = print;
		boolean oldPrintESet = printESet;
		print = PRINT_EDEFAULT;
		printESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TYPE__PRINT, oldPrint, PRINT_EDEFAULT, oldPrintESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrint() {
		return printESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrintRanges() {
		return printRanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintRanges(String newPrintRanges) {
		String oldPrintRanges = printRanges;
		printRanges = newPrintRanges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__PRINT_RANGES, oldPrintRanges, printRanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newProtected) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		protected_ = newProtected == null ? PROTECTED_EDEFAULT : newProtected;
		boolean oldProtectedESet = protectedESet;
		protectedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__PROTECTED, oldProtected, protected_, !oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtected() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldProtected = protected_;
		boolean oldProtectedESet = protectedESet;
		protected_ = PROTECTED_EDEFAULT;
		protectedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TablePackage.TABLE_TYPE__PROTECTED, oldProtected, PROTECTED_EDEFAULT, oldProtectedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtected() {
		return protectedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProtectionKey() {
		return protectionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionKey(Object newProtectionKey) {
		Object oldProtectionKey = protectionKey;
		protectionKey = newProtectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__PROTECTION_KEY, oldProtectionKey, protectionKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.TABLE_TYPE__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.TABLE_TYPE__TABLE_SOURCE:
				return basicSetTableSource(null, msgs);
			case TablePackage.TABLE_TYPE__DDE_SOURCE:
				return basicSetDdeSource(null, msgs);
			case TablePackage.TABLE_TYPE__SCENARIO:
				return basicSetScenario(null, msgs);
			case TablePackage.TABLE_TYPE__FORMS:
				return basicSetForms(null, msgs);
			case TablePackage.TABLE_TYPE__SHAPES:
				return basicSetShapes(null, msgs);
			case TablePackage.TABLE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMN_GROUP:
				return ((InternalEList<?>)getTableColumnGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS:
				return ((InternalEList<?>)getTableColumns()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMN:
				return ((InternalEList<?>)getTableColumn()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS:
				return ((InternalEList<?>)getTableHeaderColumns()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS1:
				return ((InternalEList<?>)getTableColumns1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMN1:
				return ((InternalEList<?>)getTableColumn1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS1:
				return ((InternalEList<?>)getTableHeaderColumns1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS2:
				return ((InternalEList<?>)getTableColumns2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_COLUMN2:
				return ((InternalEList<?>)getTableColumn2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROW_GROUP:
				return ((InternalEList<?>)getTableRowGroup()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROWS:
				return ((InternalEList<?>)getTableRows()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK:
				return ((InternalEList<?>)getSoftPageBreak()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROW:
				return ((InternalEList<?>)getTableRow()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS:
				return ((InternalEList<?>)getTableHeaderRows()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROWS1:
				return ((InternalEList<?>)getTableRows1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK1:
				return ((InternalEList<?>)getSoftPageBreak1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROW1:
				return ((InternalEList<?>)getTableRow1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS1:
				return ((InternalEList<?>)getTableHeaderRows1()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROWS2:
				return ((InternalEList<?>)getTableRows2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK2:
				return ((InternalEList<?>)getSoftPageBreak2()).basicRemove(otherEnd, msgs);
			case TablePackage.TABLE_TYPE__TABLE_ROW2:
				return ((InternalEList<?>)getTableRow2()).basicRemove(otherEnd, msgs);
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
			case TablePackage.TABLE_TYPE__TABLE_SOURCE:
				return getTableSource();
			case TablePackage.TABLE_TYPE__DDE_SOURCE:
				return getDdeSource();
			case TablePackage.TABLE_TYPE__SCENARIO:
				return getScenario();
			case TablePackage.TABLE_TYPE__FORMS:
				return getForms();
			case TablePackage.TABLE_TYPE__SHAPES:
				return getShapes();
			case TablePackage.TABLE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN_GROUP:
				return getTableColumnGroup();
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS:
				return getTableColumns();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN:
				return getTableColumn();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS:
				return getTableHeaderColumns();
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS1:
				return getTableColumns1();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN1:
				return getTableColumn1();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS1:
				return getTableHeaderColumns1();
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS2:
				return getTableColumns2();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN2:
				return getTableColumn2();
			case TablePackage.TABLE_TYPE__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case TablePackage.TABLE_TYPE__TABLE_ROW_GROUP:
				return getTableRowGroup();
			case TablePackage.TABLE_TYPE__TABLE_ROWS:
				return getTableRows();
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK:
				return getSoftPageBreak();
			case TablePackage.TABLE_TYPE__TABLE_ROW:
				return getTableRow();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS:
				return getTableHeaderRows();
			case TablePackage.TABLE_TYPE__TABLE_ROWS1:
				return getTableRows1();
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK1:
				return getSoftPageBreak1();
			case TablePackage.TABLE_TYPE__TABLE_ROW1:
				return getTableRow1();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS1:
				return getTableHeaderRows1();
			case TablePackage.TABLE_TYPE__TABLE_ROWS2:
				return getTableRows2();
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK2:
				return getSoftPageBreak2();
			case TablePackage.TABLE_TYPE__TABLE_ROW2:
				return getTableRow2();
			case TablePackage.TABLE_TYPE__IS_SUB_TABLE:
				return getIsSubTable();
			case TablePackage.TABLE_TYPE__NAME:
				return getName();
			case TablePackage.TABLE_TYPE__PRINT:
				return getPrint();
			case TablePackage.TABLE_TYPE__PRINT_RANGES:
				return getPrintRanges();
			case TablePackage.TABLE_TYPE__PROTECTED:
				return getProtected();
			case TablePackage.TABLE_TYPE__PROTECTION_KEY:
				return getProtectionKey();
			case TablePackage.TABLE_TYPE__STYLE_NAME:
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
			case TablePackage.TABLE_TYPE__TABLE_SOURCE:
				setTableSource((TableSourceType)newValue);
				return;
			case TablePackage.TABLE_TYPE__DDE_SOURCE:
				setDdeSource((TextSectionSourceDdeType)newValue);
				return;
			case TablePackage.TABLE_TYPE__SCENARIO:
				setScenario((ScenarioType)newValue);
				return;
			case TablePackage.TABLE_TYPE__FORMS:
				setForms((FormsType)newValue);
				return;
			case TablePackage.TABLE_TYPE__SHAPES:
				setShapes((ShapesType)newValue);
				return;
			case TablePackage.TABLE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN_GROUP:
				getTableColumnGroup().clear();
				getTableColumnGroup().addAll((Collection<? extends TableColumnGroupType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS:
				getTableColumns().clear();
				getTableColumns().addAll((Collection<? extends TableColumnsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN:
				getTableColumn().clear();
				getTableColumn().addAll((Collection<? extends TableColumnType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS:
				getTableHeaderColumns().clear();
				getTableHeaderColumns().addAll((Collection<? extends TableHeaderColumnsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS1:
				getTableColumns1().clear();
				getTableColumns1().addAll((Collection<? extends TableColumnsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN1:
				getTableColumn1().clear();
				getTableColumn1().addAll((Collection<? extends TableColumnType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS1:
				getTableHeaderColumns1().clear();
				getTableHeaderColumns1().addAll((Collection<? extends TableHeaderColumnsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS2:
				getTableColumns2().clear();
				getTableColumns2().addAll((Collection<? extends TableColumnsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN2:
				getTableColumn2().clear();
				getTableColumn2().addAll((Collection<? extends TableColumnType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW_GROUP:
				getTableRowGroup().clear();
				getTableRowGroup().addAll((Collection<? extends TableRowGroupType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROWS:
				getTableRows().clear();
				getTableRows().addAll((Collection<? extends TableRowsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				getSoftPageBreak().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW:
				getTableRow().clear();
				getTableRow().addAll((Collection<? extends TableRowType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS:
				getTableHeaderRows().clear();
				getTableHeaderRows().addAll((Collection<? extends TableHeaderRowsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROWS1:
				getTableRows1().clear();
				getTableRows1().addAll((Collection<? extends TableRowsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK1:
				getSoftPageBreak1().clear();
				getSoftPageBreak1().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW1:
				getTableRow1().clear();
				getTableRow1().addAll((Collection<? extends TableRowType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS1:
				getTableHeaderRows1().clear();
				getTableHeaderRows1().addAll((Collection<? extends TableHeaderRowsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROWS2:
				getTableRows2().clear();
				getTableRows2().addAll((Collection<? extends TableRowsType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK2:
				getSoftPageBreak2().clear();
				getSoftPageBreak2().addAll((Collection<? extends SoftPageBreakType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW2:
				getTableRow2().clear();
				getTableRow2().addAll((Collection<? extends TableRowType>)newValue);
				return;
			case TablePackage.TABLE_TYPE__IS_SUB_TABLE:
				setIsSubTable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.TABLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case TablePackage.TABLE_TYPE__PRINT:
				setPrint((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.TABLE_TYPE__PRINT_RANGES:
				setPrintRanges((String)newValue);
				return;
			case TablePackage.TABLE_TYPE__PROTECTED:
				setProtected((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case TablePackage.TABLE_TYPE__PROTECTION_KEY:
				setProtectionKey(newValue);
				return;
			case TablePackage.TABLE_TYPE__STYLE_NAME:
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
			case TablePackage.TABLE_TYPE__TABLE_SOURCE:
				setTableSource((TableSourceType)null);
				return;
			case TablePackage.TABLE_TYPE__DDE_SOURCE:
				setDdeSource((TextSectionSourceDdeType)null);
				return;
			case TablePackage.TABLE_TYPE__SCENARIO:
				setScenario((ScenarioType)null);
				return;
			case TablePackage.TABLE_TYPE__FORMS:
				setForms((FormsType)null);
				return;
			case TablePackage.TABLE_TYPE__SHAPES:
				setShapes((ShapesType)null);
				return;
			case TablePackage.TABLE_TYPE__GROUP:
				getGroup().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN_GROUP:
				getTableColumnGroup().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS:
				getTableColumns().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN:
				getTableColumn().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS:
				getTableHeaderColumns().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS1:
				getTableColumns1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN1:
				getTableColumn1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS1:
				getTableHeaderColumns1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS2:
				getTableColumns2().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_COLUMN2:
				getTableColumn2().clear();
				return;
			case TablePackage.TABLE_TYPE__GROUP1:
				getGroup1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW_GROUP:
				getTableRowGroup().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROWS:
				getTableRows().clear();
				return;
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK:
				getSoftPageBreak().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW:
				getTableRow().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS:
				getTableHeaderRows().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROWS1:
				getTableRows1().clear();
				return;
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK1:
				getSoftPageBreak1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW1:
				getTableRow1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS1:
				getTableHeaderRows1().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROWS2:
				getTableRows2().clear();
				return;
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK2:
				getSoftPageBreak2().clear();
				return;
			case TablePackage.TABLE_TYPE__TABLE_ROW2:
				getTableRow2().clear();
				return;
			case TablePackage.TABLE_TYPE__IS_SUB_TABLE:
				unsetIsSubTable();
				return;
			case TablePackage.TABLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablePackage.TABLE_TYPE__PRINT:
				unsetPrint();
				return;
			case TablePackage.TABLE_TYPE__PRINT_RANGES:
				setPrintRanges(PRINT_RANGES_EDEFAULT);
				return;
			case TablePackage.TABLE_TYPE__PROTECTED:
				unsetProtected();
				return;
			case TablePackage.TABLE_TYPE__PROTECTION_KEY:
				setProtectionKey(PROTECTION_KEY_EDEFAULT);
				return;
			case TablePackage.TABLE_TYPE__STYLE_NAME:
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
			case TablePackage.TABLE_TYPE__TABLE_SOURCE:
				return tableSource != null;
			case TablePackage.TABLE_TYPE__DDE_SOURCE:
				return ddeSource != null;
			case TablePackage.TABLE_TYPE__SCENARIO:
				return scenario != null;
			case TablePackage.TABLE_TYPE__FORMS:
				return forms != null;
			case TablePackage.TABLE_TYPE__SHAPES:
				return shapes != null;
			case TablePackage.TABLE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN_GROUP:
				return !getTableColumnGroup().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS:
				return !getTableColumns().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN:
				return !getTableColumn().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS:
				return !getTableHeaderColumns().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS1:
				return !getTableColumns1().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN1:
				return !getTableColumn1().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_COLUMNS1:
				return !getTableHeaderColumns1().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMNS2:
				return !getTableColumns2().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_COLUMN2:
				return !getTableColumn2().isEmpty();
			case TablePackage.TABLE_TYPE__GROUP1:
				return group1 != null && !group1.isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROW_GROUP:
				return !getTableRowGroup().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROWS:
				return !getTableRows().isEmpty();
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK:
				return !getSoftPageBreak().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROW:
				return !getTableRow().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS:
				return !getTableHeaderRows().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROWS1:
				return !getTableRows1().isEmpty();
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK1:
				return !getSoftPageBreak1().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROW1:
				return !getTableRow1().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_HEADER_ROWS1:
				return !getTableHeaderRows1().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROWS2:
				return !getTableRows2().isEmpty();
			case TablePackage.TABLE_TYPE__SOFT_PAGE_BREAK2:
				return !getSoftPageBreak2().isEmpty();
			case TablePackage.TABLE_TYPE__TABLE_ROW2:
				return !getTableRow2().isEmpty();
			case TablePackage.TABLE_TYPE__IS_SUB_TABLE:
				return isSetIsSubTable();
			case TablePackage.TABLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablePackage.TABLE_TYPE__PRINT:
				return isSetPrint();
			case TablePackage.TABLE_TYPE__PRINT_RANGES:
				return PRINT_RANGES_EDEFAULT == null ? printRanges != null : !PRINT_RANGES_EDEFAULT.equals(printRanges);
			case TablePackage.TABLE_TYPE__PROTECTED:
				return isSetProtected();
			case TablePackage.TABLE_TYPE__PROTECTION_KEY:
				return PROTECTION_KEY_EDEFAULT == null ? protectionKey != null : !PROTECTION_KEY_EDEFAULT.equals(protectionKey);
			case TablePackage.TABLE_TYPE__STYLE_NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", group1: ");
		result.append(group1);
		result.append(", isSubTable: ");
		if (isSubTableESet) result.append(isSubTable); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", print: ");
		if (printESet) result.append(print); else result.append("<unset>");
		result.append(", printRanges: ");
		result.append(printRanges);
		result.append(", protected: ");
		if (protectedESet) result.append(protected_); else result.append("<unset>");
		result.append(", protectionKey: ");
		result.append(protectionKey);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //TableTypeImpl
