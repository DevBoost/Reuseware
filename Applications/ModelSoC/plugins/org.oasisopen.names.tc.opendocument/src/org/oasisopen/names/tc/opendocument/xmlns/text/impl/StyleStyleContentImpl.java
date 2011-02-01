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
import org.oasisopen.names.tc.opendocument.xmlns.style.FamilyType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleChartPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleDrawingPagePropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleGraphicPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleParagraphPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleRubyPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleSectionPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleStyleContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableCellPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableColumnPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTablePropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTableRowPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;
import org.oasisopen.names.tc.opendocument.xmlns.text.TextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Style Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getParagraphProperties <em>Paragraph Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTextProperties1 <em>Text Properties1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getSectionProperties <em>Section Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getRubyProperties <em>Ruby Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTableProperties <em>Table Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTableColumnProperties <em>Table Column Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTableRowProperties <em>Table Row Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTableCellProperties <em>Table Cell Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getParagraphProperties1 <em>Paragraph Properties1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTextProperties2 <em>Text Properties2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getGraphicProperties <em>Graphic Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getParagraphProperties2 <em>Paragraph Properties2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTextProperties3 <em>Text Properties3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getDrawingPageProperties <em>Drawing Page Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getChartProperties <em>Chart Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getGraphicProperties1 <em>Graphic Properties1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getParagraphProperties3 <em>Paragraph Properties3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getTextProperties4 <em>Text Properties4</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.text.impl.StyleStyleContentImpl#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleStyleContentImpl extends EObjectImpl implements StyleStyleContent {
	/**
	 * The cached value of the '{@link #getTextProperties() <em>Text Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleTextPropertiesContent textProperties;

	/**
	 * The cached value of the '{@link #getParagraphProperties() <em>Paragraph Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleParagraphPropertiesContent paragraphProperties;

	/**
	 * The cached value of the '{@link #getTextProperties1() <em>Text Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextProperties1()
	 * @generated
	 * @ordered
	 */
	protected StyleTextPropertiesContent textProperties1;

	/**
	 * The cached value of the '{@link #getSectionProperties() <em>Section Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleSectionPropertiesContent sectionProperties;

	/**
	 * The cached value of the '{@link #getRubyProperties() <em>Ruby Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleRubyPropertiesContent rubyProperties;

	/**
	 * The cached value of the '{@link #getTableProperties() <em>Table Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleTablePropertiesContent tableProperties;

	/**
	 * The cached value of the '{@link #getTableColumnProperties() <em>Table Column Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableColumnProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleTableColumnPropertiesContent tableColumnProperties;

	/**
	 * The cached value of the '{@link #getTableRowProperties() <em>Table Row Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableRowProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleTableRowPropertiesContent tableRowProperties;

	/**
	 * The cached value of the '{@link #getTableCellProperties() <em>Table Cell Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCellProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleTableCellPropertiesContent tableCellProperties;

	/**
	 * The cached value of the '{@link #getParagraphProperties1() <em>Paragraph Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphProperties1()
	 * @generated
	 * @ordered
	 */
	protected StyleParagraphPropertiesContent paragraphProperties1;

	/**
	 * The cached value of the '{@link #getTextProperties2() <em>Text Properties2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextProperties2()
	 * @generated
	 * @ordered
	 */
	protected StyleTextPropertiesContent textProperties2;

	/**
	 * The cached value of the '{@link #getGraphicProperties() <em>Graphic Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleGraphicPropertiesContent graphicProperties;

	/**
	 * The cached value of the '{@link #getParagraphProperties2() <em>Paragraph Properties2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphProperties2()
	 * @generated
	 * @ordered
	 */
	protected StyleParagraphPropertiesContent paragraphProperties2;

	/**
	 * The cached value of the '{@link #getTextProperties3() <em>Text Properties3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextProperties3()
	 * @generated
	 * @ordered
	 */
	protected StyleTextPropertiesContent textProperties3;

	/**
	 * The cached value of the '{@link #getDrawingPageProperties() <em>Drawing Page Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawingPageProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleDrawingPagePropertiesContent drawingPageProperties;

	/**
	 * The cached value of the '{@link #getChartProperties() <em>Chart Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChartProperties()
	 * @generated
	 * @ordered
	 */
	protected StyleChartPropertiesContent chartProperties;

	/**
	 * The cached value of the '{@link #getGraphicProperties1() <em>Graphic Properties1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphicProperties1()
	 * @generated
	 * @ordered
	 */
	protected StyleGraphicPropertiesContent graphicProperties1;

	/**
	 * The cached value of the '{@link #getParagraphProperties3() <em>Paragraph Properties3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphProperties3()
	 * @generated
	 * @ordered
	 */
	protected StyleParagraphPropertiesContent paragraphProperties3;

	/**
	 * The cached value of the '{@link #getTextProperties4() <em>Text Properties4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextProperties4()
	 * @generated
	 * @ordered
	 */
	protected StyleTextPropertiesContent textProperties4;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final FamilyType FAMILY_EDEFAULT = FamilyType.TEXT;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected FamilyType family = FAMILY_EDEFAULT;

	/**
	 * This is true if the Family attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean familyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleStyleContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextPackage.eINSTANCE.getStyleStyleContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties() {
		return textProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties(StyleTextPropertiesContent newTextProperties, NotificationChain msgs) {
		StyleTextPropertiesContent oldTextProperties = textProperties;
		textProperties = newTextProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES, oldTextProperties, newTextProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties(StyleTextPropertiesContent newTextProperties) {
		if (newTextProperties != textProperties) {
			NotificationChain msgs = null;
			if (textProperties != null)
				msgs = ((InternalEObject)textProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES, null, msgs);
			if (newTextProperties != null)
				msgs = ((InternalEObject)newTextProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES, null, msgs);
			msgs = basicSetTextProperties(newTextProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES, newTextProperties, newTextProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleParagraphPropertiesContent getParagraphProperties() {
		return paragraphProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphProperties(StyleParagraphPropertiesContent newParagraphProperties, NotificationChain msgs) {
		StyleParagraphPropertiesContent oldParagraphProperties = paragraphProperties;
		paragraphProperties = newParagraphProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES, oldParagraphProperties, newParagraphProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphProperties(StyleParagraphPropertiesContent newParagraphProperties) {
		if (newParagraphProperties != paragraphProperties) {
			NotificationChain msgs = null;
			if (paragraphProperties != null)
				msgs = ((InternalEObject)paragraphProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES, null, msgs);
			if (newParagraphProperties != null)
				msgs = ((InternalEObject)newParagraphProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES, null, msgs);
			msgs = basicSetParagraphProperties(newParagraphProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES, newParagraphProperties, newParagraphProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties1() {
		return textProperties1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties1(StyleTextPropertiesContent newTextProperties1, NotificationChain msgs) {
		StyleTextPropertiesContent oldTextProperties1 = textProperties1;
		textProperties1 = newTextProperties1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1, oldTextProperties1, newTextProperties1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties1(StyleTextPropertiesContent newTextProperties1) {
		if (newTextProperties1 != textProperties1) {
			NotificationChain msgs = null;
			if (textProperties1 != null)
				msgs = ((InternalEObject)textProperties1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1, null, msgs);
			if (newTextProperties1 != null)
				msgs = ((InternalEObject)newTextProperties1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1, null, msgs);
			msgs = basicSetTextProperties1(newTextProperties1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1, newTextProperties1, newTextProperties1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSectionPropertiesContent getSectionProperties() {
		return sectionProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionProperties(StyleSectionPropertiesContent newSectionProperties, NotificationChain msgs) {
		StyleSectionPropertiesContent oldSectionProperties = sectionProperties;
		sectionProperties = newSectionProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES, oldSectionProperties, newSectionProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionProperties(StyleSectionPropertiesContent newSectionProperties) {
		if (newSectionProperties != sectionProperties) {
			NotificationChain msgs = null;
			if (sectionProperties != null)
				msgs = ((InternalEObject)sectionProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES, null, msgs);
			if (newSectionProperties != null)
				msgs = ((InternalEObject)newSectionProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES, null, msgs);
			msgs = basicSetSectionProperties(newSectionProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES, newSectionProperties, newSectionProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleRubyPropertiesContent getRubyProperties() {
		return rubyProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyProperties(StyleRubyPropertiesContent newRubyProperties, NotificationChain msgs) {
		StyleRubyPropertiesContent oldRubyProperties = rubyProperties;
		rubyProperties = newRubyProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES, oldRubyProperties, newRubyProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyProperties(StyleRubyPropertiesContent newRubyProperties) {
		if (newRubyProperties != rubyProperties) {
			NotificationChain msgs = null;
			if (rubyProperties != null)
				msgs = ((InternalEObject)rubyProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES, null, msgs);
			if (newRubyProperties != null)
				msgs = ((InternalEObject)newRubyProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES, null, msgs);
			msgs = basicSetRubyProperties(newRubyProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES, newRubyProperties, newRubyProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTablePropertiesContent getTableProperties() {
		return tableProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableProperties(StyleTablePropertiesContent newTableProperties, NotificationChain msgs) {
		StyleTablePropertiesContent oldTableProperties = tableProperties;
		tableProperties = newTableProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES, oldTableProperties, newTableProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableProperties(StyleTablePropertiesContent newTableProperties) {
		if (newTableProperties != tableProperties) {
			NotificationChain msgs = null;
			if (tableProperties != null)
				msgs = ((InternalEObject)tableProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES, null, msgs);
			if (newTableProperties != null)
				msgs = ((InternalEObject)newTableProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES, null, msgs);
			msgs = basicSetTableProperties(newTableProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES, newTableProperties, newTableProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableColumnPropertiesContent getTableColumnProperties() {
		return tableColumnProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableColumnProperties(StyleTableColumnPropertiesContent newTableColumnProperties, NotificationChain msgs) {
		StyleTableColumnPropertiesContent oldTableColumnProperties = tableColumnProperties;
		tableColumnProperties = newTableColumnProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES, oldTableColumnProperties, newTableColumnProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableColumnProperties(StyleTableColumnPropertiesContent newTableColumnProperties) {
		if (newTableColumnProperties != tableColumnProperties) {
			NotificationChain msgs = null;
			if (tableColumnProperties != null)
				msgs = ((InternalEObject)tableColumnProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES, null, msgs);
			if (newTableColumnProperties != null)
				msgs = ((InternalEObject)newTableColumnProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES, null, msgs);
			msgs = basicSetTableColumnProperties(newTableColumnProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES, newTableColumnProperties, newTableColumnProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableRowPropertiesContent getTableRowProperties() {
		return tableRowProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableRowProperties(StyleTableRowPropertiesContent newTableRowProperties, NotificationChain msgs) {
		StyleTableRowPropertiesContent oldTableRowProperties = tableRowProperties;
		tableRowProperties = newTableRowProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES, oldTableRowProperties, newTableRowProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableRowProperties(StyleTableRowPropertiesContent newTableRowProperties) {
		if (newTableRowProperties != tableRowProperties) {
			NotificationChain msgs = null;
			if (tableRowProperties != null)
				msgs = ((InternalEObject)tableRowProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES, null, msgs);
			if (newTableRowProperties != null)
				msgs = ((InternalEObject)newTableRowProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES, null, msgs);
			msgs = basicSetTableRowProperties(newTableRowProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES, newTableRowProperties, newTableRowProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTableCellPropertiesContent getTableCellProperties() {
		return tableCellProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableCellProperties(StyleTableCellPropertiesContent newTableCellProperties, NotificationChain msgs) {
		StyleTableCellPropertiesContent oldTableCellProperties = tableCellProperties;
		tableCellProperties = newTableCellProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES, oldTableCellProperties, newTableCellProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableCellProperties(StyleTableCellPropertiesContent newTableCellProperties) {
		if (newTableCellProperties != tableCellProperties) {
			NotificationChain msgs = null;
			if (tableCellProperties != null)
				msgs = ((InternalEObject)tableCellProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES, null, msgs);
			if (newTableCellProperties != null)
				msgs = ((InternalEObject)newTableCellProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES, null, msgs);
			msgs = basicSetTableCellProperties(newTableCellProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES, newTableCellProperties, newTableCellProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleParagraphPropertiesContent getParagraphProperties1() {
		return paragraphProperties1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphProperties1(StyleParagraphPropertiesContent newParagraphProperties1, NotificationChain msgs) {
		StyleParagraphPropertiesContent oldParagraphProperties1 = paragraphProperties1;
		paragraphProperties1 = newParagraphProperties1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1, oldParagraphProperties1, newParagraphProperties1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphProperties1(StyleParagraphPropertiesContent newParagraphProperties1) {
		if (newParagraphProperties1 != paragraphProperties1) {
			NotificationChain msgs = null;
			if (paragraphProperties1 != null)
				msgs = ((InternalEObject)paragraphProperties1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1, null, msgs);
			if (newParagraphProperties1 != null)
				msgs = ((InternalEObject)newParagraphProperties1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1, null, msgs);
			msgs = basicSetParagraphProperties1(newParagraphProperties1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1, newParagraphProperties1, newParagraphProperties1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties2() {
		return textProperties2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties2(StyleTextPropertiesContent newTextProperties2, NotificationChain msgs) {
		StyleTextPropertiesContent oldTextProperties2 = textProperties2;
		textProperties2 = newTextProperties2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2, oldTextProperties2, newTextProperties2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties2(StyleTextPropertiesContent newTextProperties2) {
		if (newTextProperties2 != textProperties2) {
			NotificationChain msgs = null;
			if (textProperties2 != null)
				msgs = ((InternalEObject)textProperties2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2, null, msgs);
			if (newTextProperties2 != null)
				msgs = ((InternalEObject)newTextProperties2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2, null, msgs);
			msgs = basicSetTextProperties2(newTextProperties2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2, newTextProperties2, newTextProperties2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleGraphicPropertiesContent getGraphicProperties() {
		return graphicProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicProperties(StyleGraphicPropertiesContent newGraphicProperties, NotificationChain msgs) {
		StyleGraphicPropertiesContent oldGraphicProperties = graphicProperties;
		graphicProperties = newGraphicProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES, oldGraphicProperties, newGraphicProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicProperties(StyleGraphicPropertiesContent newGraphicProperties) {
		if (newGraphicProperties != graphicProperties) {
			NotificationChain msgs = null;
			if (graphicProperties != null)
				msgs = ((InternalEObject)graphicProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES, null, msgs);
			if (newGraphicProperties != null)
				msgs = ((InternalEObject)newGraphicProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES, null, msgs);
			msgs = basicSetGraphicProperties(newGraphicProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES, newGraphicProperties, newGraphicProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleParagraphPropertiesContent getParagraphProperties2() {
		return paragraphProperties2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphProperties2(StyleParagraphPropertiesContent newParagraphProperties2, NotificationChain msgs) {
		StyleParagraphPropertiesContent oldParagraphProperties2 = paragraphProperties2;
		paragraphProperties2 = newParagraphProperties2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2, oldParagraphProperties2, newParagraphProperties2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphProperties2(StyleParagraphPropertiesContent newParagraphProperties2) {
		if (newParagraphProperties2 != paragraphProperties2) {
			NotificationChain msgs = null;
			if (paragraphProperties2 != null)
				msgs = ((InternalEObject)paragraphProperties2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2, null, msgs);
			if (newParagraphProperties2 != null)
				msgs = ((InternalEObject)newParagraphProperties2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2, null, msgs);
			msgs = basicSetParagraphProperties2(newParagraphProperties2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2, newParagraphProperties2, newParagraphProperties2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties3() {
		return textProperties3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties3(StyleTextPropertiesContent newTextProperties3, NotificationChain msgs) {
		StyleTextPropertiesContent oldTextProperties3 = textProperties3;
		textProperties3 = newTextProperties3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3, oldTextProperties3, newTextProperties3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties3(StyleTextPropertiesContent newTextProperties3) {
		if (newTextProperties3 != textProperties3) {
			NotificationChain msgs = null;
			if (textProperties3 != null)
				msgs = ((InternalEObject)textProperties3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3, null, msgs);
			if (newTextProperties3 != null)
				msgs = ((InternalEObject)newTextProperties3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3, null, msgs);
			msgs = basicSetTextProperties3(newTextProperties3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3, newTextProperties3, newTextProperties3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleDrawingPagePropertiesContent getDrawingPageProperties() {
		return drawingPageProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrawingPageProperties(StyleDrawingPagePropertiesContent newDrawingPageProperties, NotificationChain msgs) {
		StyleDrawingPagePropertiesContent oldDrawingPageProperties = drawingPageProperties;
		drawingPageProperties = newDrawingPageProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES, oldDrawingPageProperties, newDrawingPageProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawingPageProperties(StyleDrawingPagePropertiesContent newDrawingPageProperties) {
		if (newDrawingPageProperties != drawingPageProperties) {
			NotificationChain msgs = null;
			if (drawingPageProperties != null)
				msgs = ((InternalEObject)drawingPageProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES, null, msgs);
			if (newDrawingPageProperties != null)
				msgs = ((InternalEObject)newDrawingPageProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES, null, msgs);
			msgs = basicSetDrawingPageProperties(newDrawingPageProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES, newDrawingPageProperties, newDrawingPageProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleChartPropertiesContent getChartProperties() {
		return chartProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChartProperties(StyleChartPropertiesContent newChartProperties, NotificationChain msgs) {
		StyleChartPropertiesContent oldChartProperties = chartProperties;
		chartProperties = newChartProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES, oldChartProperties, newChartProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChartProperties(StyleChartPropertiesContent newChartProperties) {
		if (newChartProperties != chartProperties) {
			NotificationChain msgs = null;
			if (chartProperties != null)
				msgs = ((InternalEObject)chartProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES, null, msgs);
			if (newChartProperties != null)
				msgs = ((InternalEObject)newChartProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES, null, msgs);
			msgs = basicSetChartProperties(newChartProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES, newChartProperties, newChartProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleGraphicPropertiesContent getGraphicProperties1() {
		return graphicProperties1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphicProperties1(StyleGraphicPropertiesContent newGraphicProperties1, NotificationChain msgs) {
		StyleGraphicPropertiesContent oldGraphicProperties1 = graphicProperties1;
		graphicProperties1 = newGraphicProperties1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1, oldGraphicProperties1, newGraphicProperties1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphicProperties1(StyleGraphicPropertiesContent newGraphicProperties1) {
		if (newGraphicProperties1 != graphicProperties1) {
			NotificationChain msgs = null;
			if (graphicProperties1 != null)
				msgs = ((InternalEObject)graphicProperties1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1, null, msgs);
			if (newGraphicProperties1 != null)
				msgs = ((InternalEObject)newGraphicProperties1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1, null, msgs);
			msgs = basicSetGraphicProperties1(newGraphicProperties1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1, newGraphicProperties1, newGraphicProperties1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleParagraphPropertiesContent getParagraphProperties3() {
		return paragraphProperties3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphProperties3(StyleParagraphPropertiesContent newParagraphProperties3, NotificationChain msgs) {
		StyleParagraphPropertiesContent oldParagraphProperties3 = paragraphProperties3;
		paragraphProperties3 = newParagraphProperties3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3, oldParagraphProperties3, newParagraphProperties3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphProperties3(StyleParagraphPropertiesContent newParagraphProperties3) {
		if (newParagraphProperties3 != paragraphProperties3) {
			NotificationChain msgs = null;
			if (paragraphProperties3 != null)
				msgs = ((InternalEObject)paragraphProperties3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3, null, msgs);
			if (newParagraphProperties3 != null)
				msgs = ((InternalEObject)newParagraphProperties3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3, null, msgs);
			msgs = basicSetParagraphProperties3(newParagraphProperties3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3, newParagraphProperties3, newParagraphProperties3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleTextPropertiesContent getTextProperties4() {
		return textProperties4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextProperties4(StyleTextPropertiesContent newTextProperties4, NotificationChain msgs) {
		StyleTextPropertiesContent oldTextProperties4 = textProperties4;
		textProperties4 = newTextProperties4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4, oldTextProperties4, newTextProperties4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextProperties4(StyleTextPropertiesContent newTextProperties4) {
		if (newTextProperties4 != textProperties4) {
			NotificationChain msgs = null;
			if (textProperties4 != null)
				msgs = ((InternalEObject)textProperties4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4, null, msgs);
			if (newTextProperties4 != null)
				msgs = ((InternalEObject)newTextProperties4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4, null, msgs);
			msgs = basicSetTextProperties4(newTextProperties4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4, newTextProperties4, newTextProperties4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyType getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(FamilyType newFamily) {
		FamilyType oldFamily = family;
		family = newFamily == null ? FAMILY_EDEFAULT : newFamily;
		boolean oldFamilyESet = familyESet;
		familyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextPackage.STYLE_STYLE_CONTENT__FAMILY, oldFamily, family, !oldFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFamily() {
		FamilyType oldFamily = family;
		boolean oldFamilyESet = familyESet;
		family = FAMILY_EDEFAULT;
		familyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TextPackage.STYLE_STYLE_CONTENT__FAMILY, oldFamily, FAMILY_EDEFAULT, oldFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFamily() {
		return familyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES:
				return basicSetTextProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES:
				return basicSetParagraphProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1:
				return basicSetTextProperties1(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES:
				return basicSetSectionProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES:
				return basicSetRubyProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES:
				return basicSetTableProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES:
				return basicSetTableColumnProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES:
				return basicSetTableRowProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES:
				return basicSetTableCellProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1:
				return basicSetParagraphProperties1(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2:
				return basicSetTextProperties2(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES:
				return basicSetGraphicProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2:
				return basicSetParagraphProperties2(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3:
				return basicSetTextProperties3(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES:
				return basicSetDrawingPageProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES:
				return basicSetChartProperties(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1:
				return basicSetGraphicProperties1(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3:
				return basicSetParagraphProperties3(null, msgs);
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4:
				return basicSetTextProperties4(null, msgs);
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
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES:
				return getTextProperties();
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES:
				return getParagraphProperties();
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1:
				return getTextProperties1();
			case TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES:
				return getSectionProperties();
			case TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES:
				return getRubyProperties();
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES:
				return getTableProperties();
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES:
				return getTableColumnProperties();
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES:
				return getTableRowProperties();
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES:
				return getTableCellProperties();
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1:
				return getParagraphProperties1();
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2:
				return getTextProperties2();
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES:
				return getGraphicProperties();
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2:
				return getParagraphProperties2();
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3:
				return getTextProperties3();
			case TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES:
				return getDrawingPageProperties();
			case TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES:
				return getChartProperties();
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1:
				return getGraphicProperties1();
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3:
				return getParagraphProperties3();
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4:
				return getTextProperties4();
			case TextPackage.STYLE_STYLE_CONTENT__FAMILY:
				return getFamily();
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
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES:
				setParagraphProperties((StyleParagraphPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1:
				setTextProperties1((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES:
				setSectionProperties((StyleSectionPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES:
				setRubyProperties((StyleRubyPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES:
				setTableProperties((StyleTablePropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES:
				setTableColumnProperties((StyleTableColumnPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES:
				setTableRowProperties((StyleTableRowPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES:
				setTableCellProperties((StyleTableCellPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1:
				setParagraphProperties1((StyleParagraphPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2:
				setTextProperties2((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES:
				setGraphicProperties((StyleGraphicPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2:
				setParagraphProperties2((StyleParagraphPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3:
				setTextProperties3((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES:
				setDrawingPageProperties((StyleDrawingPagePropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES:
				setChartProperties((StyleChartPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1:
				setGraphicProperties1((StyleGraphicPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3:
				setParagraphProperties3((StyleParagraphPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4:
				setTextProperties4((StyleTextPropertiesContent)newValue);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__FAMILY:
				setFamily((FamilyType)newValue);
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
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES:
				setParagraphProperties((StyleParagraphPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1:
				setTextProperties1((StyleTextPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES:
				setSectionProperties((StyleSectionPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES:
				setRubyProperties((StyleRubyPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES:
				setTableProperties((StyleTablePropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES:
				setTableColumnProperties((StyleTableColumnPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES:
				setTableRowProperties((StyleTableRowPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES:
				setTableCellProperties((StyleTableCellPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1:
				setParagraphProperties1((StyleParagraphPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2:
				setTextProperties2((StyleTextPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES:
				setGraphicProperties((StyleGraphicPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2:
				setParagraphProperties2((StyleParagraphPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3:
				setTextProperties3((StyleTextPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES:
				setDrawingPageProperties((StyleDrawingPagePropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES:
				setChartProperties((StyleChartPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1:
				setGraphicProperties1((StyleGraphicPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3:
				setParagraphProperties3((StyleParagraphPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4:
				setTextProperties4((StyleTextPropertiesContent)null);
				return;
			case TextPackage.STYLE_STYLE_CONTENT__FAMILY:
				unsetFamily();
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
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES:
				return textProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES:
				return paragraphProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES1:
				return textProperties1 != null;
			case TextPackage.STYLE_STYLE_CONTENT__SECTION_PROPERTIES:
				return sectionProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__RUBY_PROPERTIES:
				return rubyProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_PROPERTIES:
				return tableProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_COLUMN_PROPERTIES:
				return tableColumnProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_ROW_PROPERTIES:
				return tableRowProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__TABLE_CELL_PROPERTIES:
				return tableCellProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES1:
				return paragraphProperties1 != null;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES2:
				return textProperties2 != null;
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES:
				return graphicProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES2:
				return paragraphProperties2 != null;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES3:
				return textProperties3 != null;
			case TextPackage.STYLE_STYLE_CONTENT__DRAWING_PAGE_PROPERTIES:
				return drawingPageProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__CHART_PROPERTIES:
				return chartProperties != null;
			case TextPackage.STYLE_STYLE_CONTENT__GRAPHIC_PROPERTIES1:
				return graphicProperties1 != null;
			case TextPackage.STYLE_STYLE_CONTENT__PARAGRAPH_PROPERTIES3:
				return paragraphProperties3 != null;
			case TextPackage.STYLE_STYLE_CONTENT__TEXT_PROPERTIES4:
				return textProperties4 != null;
			case TextPackage.STYLE_STYLE_CONTENT__FAMILY:
				return isSetFamily();
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
		result.append(" (family: ");
		if (familyESet) result.append(family); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StyleStyleContentImpl
