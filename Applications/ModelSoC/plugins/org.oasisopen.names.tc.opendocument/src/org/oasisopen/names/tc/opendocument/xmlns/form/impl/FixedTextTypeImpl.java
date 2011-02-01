/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.form.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.oasisopen.names.tc.opendocument.xmlns.form.FixedTextType;
import org.oasisopen.names.tc.opendocument.xmlns.form.FormPackage;
import org.oasisopen.names.tc.opendocument.xmlns.text.impl.CommonFormControlContentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getBind <em>Bind</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getControlImplementation <em>Control Implementation</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getMultiLine <em>Multi Line</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getPrintable <em>Printable</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.form.impl.FixedTextTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedTextTypeImpl extends CommonFormControlContentImpl implements FixedTextType {
	/**
	 * The default value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBind() <em>Bind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBind()
	 * @generated
	 * @ordered
	 */
	protected String bind = BIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlImplementation() <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlImplementation() <em>Control Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlImplementation()
	 * @generated
	 * @ordered
	 */
	protected String controlImplementation = CONTROL_IMPLEMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean DISABLED_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisabled()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean disabled = DISABLED_EDEFAULT;

	/**
	 * This is true if the Disabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disabledESet;

	/**
	 * The default value of the '{@link #getFor() <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected String for_ = FOR_EDEFAULT;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLine()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean MULTI_LINE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMultiLine() <em>Multi Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiLine()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean multiLine = MULTI_LINE_EDEFAULT;

	/**
	 * This is true if the Multi Line attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiLineESet;

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
	 * The default value of the '{@link #getPrintable() <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintable()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean PRINTABLE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getPrintable() <em>Printable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintable()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean printable = PRINTABLE_EDEFAULT;

	/**
	 * This is true if the Printable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean printableESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final Object TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Object title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormPackage.eINSTANCE.getFixedTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBind() {
		return bind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBind(String newBind) {
		String oldBind = bind;
		bind = newBind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__BIND, oldBind, bind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlImplementation() {
		return controlImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlImplementation(String newControlImplementation) {
		String oldControlImplementation = controlImplementation;
		controlImplementation = newControlImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__CONTROL_IMPLEMENTATION, oldControlImplementation, controlImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newDisabled) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisabled = disabled;
		disabled = newDisabled == null ? DISABLED_EDEFAULT : newDisabled;
		boolean oldDisabledESet = disabledESet;
		disabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisabled() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldDisabled = disabled;
		boolean oldDisabledESet = disabledESet;
		disabled = DISABLED_EDEFAULT;
		disabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FIXED_TEXT_TYPE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisabled() {
		return disabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(String newFor) {
		String oldFor = for_;
		for_ = newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__FOR, oldFor, for_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMultiLine() {
		return multiLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiLine(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newMultiLine) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMultiLine = multiLine;
		multiLine = newMultiLine == null ? MULTI_LINE_EDEFAULT : newMultiLine;
		boolean oldMultiLineESet = multiLineESet;
		multiLineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__MULTI_LINE, oldMultiLine, multiLine, !oldMultiLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiLine() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldMultiLine = multiLine;
		boolean oldMultiLineESet = multiLineESet;
		multiLine = MULTI_LINE_EDEFAULT;
		multiLineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FIXED_TEXT_TYPE__MULTI_LINE, oldMultiLine, MULTI_LINE_EDEFAULT, oldMultiLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiLine() {
		return multiLineESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getPrintable() {
		return printable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrintable(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newPrintable) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrintable = printable;
		printable = newPrintable == null ? PRINTABLE_EDEFAULT : newPrintable;
		boolean oldPrintableESet = printableESet;
		printableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__PRINTABLE, oldPrintable, printable, !oldPrintableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrintable() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldPrintable = printable;
		boolean oldPrintableESet = printableESet;
		printable = PRINTABLE_EDEFAULT;
		printableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FormPackage.FIXED_TEXT_TYPE__PRINTABLE, oldPrintable, PRINTABLE_EDEFAULT, oldPrintableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrintable() {
		return printableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Object newTitle) {
		Object oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormPackage.FIXED_TEXT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FormPackage.FIXED_TEXT_TYPE__BIND:
				return getBind();
			case FormPackage.FIXED_TEXT_TYPE__CONTROL_IMPLEMENTATION:
				return getControlImplementation();
			case FormPackage.FIXED_TEXT_TYPE__DISABLED:
				return getDisabled();
			case FormPackage.FIXED_TEXT_TYPE__FOR:
				return getFor();
			case FormPackage.FIXED_TEXT_TYPE__ID:
				return getId();
			case FormPackage.FIXED_TEXT_TYPE__LABEL:
				return getLabel();
			case FormPackage.FIXED_TEXT_TYPE__MULTI_LINE:
				return getMultiLine();
			case FormPackage.FIXED_TEXT_TYPE__NAME:
				return getName();
			case FormPackage.FIXED_TEXT_TYPE__PRINTABLE:
				return getPrintable();
			case FormPackage.FIXED_TEXT_TYPE__TITLE:
				return getTitle();
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
			case FormPackage.FIXED_TEXT_TYPE__BIND:
				setBind((String)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation((String)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__DISABLED:
				setDisabled((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__FOR:
				setFor((String)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__ID:
				setId((String)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__LABEL:
				setLabel((String)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__MULTI_LINE:
				setMultiLine((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__NAME:
				setName((String)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__PRINTABLE:
				setPrintable((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case FormPackage.FIXED_TEXT_TYPE__TITLE:
				setTitle(newValue);
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
			case FormPackage.FIXED_TEXT_TYPE__BIND:
				setBind(BIND_EDEFAULT);
				return;
			case FormPackage.FIXED_TEXT_TYPE__CONTROL_IMPLEMENTATION:
				setControlImplementation(CONTROL_IMPLEMENTATION_EDEFAULT);
				return;
			case FormPackage.FIXED_TEXT_TYPE__DISABLED:
				unsetDisabled();
				return;
			case FormPackage.FIXED_TEXT_TYPE__FOR:
				setFor(FOR_EDEFAULT);
				return;
			case FormPackage.FIXED_TEXT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case FormPackage.FIXED_TEXT_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case FormPackage.FIXED_TEXT_TYPE__MULTI_LINE:
				unsetMultiLine();
				return;
			case FormPackage.FIXED_TEXT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FormPackage.FIXED_TEXT_TYPE__PRINTABLE:
				unsetPrintable();
				return;
			case FormPackage.FIXED_TEXT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case FormPackage.FIXED_TEXT_TYPE__BIND:
				return BIND_EDEFAULT == null ? bind != null : !BIND_EDEFAULT.equals(bind);
			case FormPackage.FIXED_TEXT_TYPE__CONTROL_IMPLEMENTATION:
				return CONTROL_IMPLEMENTATION_EDEFAULT == null ? controlImplementation != null : !CONTROL_IMPLEMENTATION_EDEFAULT.equals(controlImplementation);
			case FormPackage.FIXED_TEXT_TYPE__DISABLED:
				return isSetDisabled();
			case FormPackage.FIXED_TEXT_TYPE__FOR:
				return FOR_EDEFAULT == null ? for_ != null : !FOR_EDEFAULT.equals(for_);
			case FormPackage.FIXED_TEXT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FormPackage.FIXED_TEXT_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case FormPackage.FIXED_TEXT_TYPE__MULTI_LINE:
				return isSetMultiLine();
			case FormPackage.FIXED_TEXT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FormPackage.FIXED_TEXT_TYPE__PRINTABLE:
				return isSetPrintable();
			case FormPackage.FIXED_TEXT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (bind: ");
		result.append(bind);
		result.append(", controlImplementation: ");
		result.append(controlImplementation);
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", for: ");
		result.append(for_);
		result.append(", id: ");
		result.append(id);
		result.append(", label: ");
		result.append(label);
		result.append(", multiLine: ");
		if (multiLineESet) result.append(multiLine); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", printable: ");
		if (printableESet) result.append(printable); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //FixedTextTypeImpl
