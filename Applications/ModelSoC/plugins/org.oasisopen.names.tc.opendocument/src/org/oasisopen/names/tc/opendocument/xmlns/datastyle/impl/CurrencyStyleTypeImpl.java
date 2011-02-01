/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl;

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
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencyStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.CurrencySymbolType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.DatastylePackage;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.NumberType;
import org.oasisopen.names.tc.opendocument.xmlns.datastyle.TransliterationStyleType;
import org.oasisopen.names.tc.opendocument.xmlns.style.MapType;
import org.oasisopen.names.tc.opendocument.xmlns.text.StyleTextPropertiesContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getTextProperties <em>Text Properties</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getText1 <em>Text1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getCurrencySymbol <em>Currency Symbol</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getText2 <em>Text2</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getCurrencySymbol1 <em>Currency Symbol1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getText3 <em>Text3</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getNumber1 <em>Number1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getText4 <em>Text4</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getAutomaticOrder <em>Automatic Order</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getTransliterationCountry <em>Transliteration Country</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getTransliterationFormat <em>Transliteration Format</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getTransliterationLanguage <em>Transliteration Language</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getTransliterationStyle <em>Transliteration Style</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.datastyle.impl.CurrencyStyleTypeImpl#getVolatile <em>Volatile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencyStyleTypeImpl extends EObjectImpl implements CurrencyStyleType {
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected NumberType number;

	/**
	 * The default value of the '{@link #getText1() <em>Text1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText1() <em>Text1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText1()
	 * @generated
	 * @ordered
	 */
	protected String text1 = TEXT1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrencySymbol() <em>Currency Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencySymbol()
	 * @generated
	 * @ordered
	 */
	protected CurrencySymbolType currencySymbol;

	/**
	 * The default value of the '{@link #getText2() <em>Text2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText2()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText2() <em>Text2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText2()
	 * @generated
	 * @ordered
	 */
	protected String text2 = TEXT2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrencySymbol1() <em>Currency Symbol1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencySymbol1()
	 * @generated
	 * @ordered
	 */
	protected CurrencySymbolType currencySymbol1;

	/**
	 * The default value of the '{@link #getText3() <em>Text3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText3()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText3() <em>Text3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText3()
	 * @generated
	 * @ordered
	 */
	protected String text3 = TEXT3_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumber1() <em>Number1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber1()
	 * @generated
	 * @ordered
	 */
	protected NumberType number1;

	/**
	 * The default value of the '{@link #getText4() <em>Text4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText4()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText4() <em>Text4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText4()
	 * @generated
	 * @ordered
	 */
	protected String text4 = TEXT4_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<MapType> map;

	/**
	 * The default value of the '{@link #getAutomaticOrder() <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticOrder()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean AUTOMATIC_ORDER_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutomaticOrder() <em>Automatic Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticOrder()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean automaticOrder = AUTOMATIC_ORDER_EDEFAULT;

	/**
	 * This is true if the Automatic Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticOrderESet;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

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
	 * The default value of the '{@link #getTransliterationCountry() <em>Transliteration Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLITERATION_COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransliterationCountry() <em>Transliteration Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationCountry()
	 * @generated
	 * @ordered
	 */
	protected String transliterationCountry = TRANSLITERATION_COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransliterationFormat() <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLITERATION_FORMAT_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getTransliterationFormat() <em>Transliteration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationFormat()
	 * @generated
	 * @ordered
	 */
	protected String transliterationFormat = TRANSLITERATION_FORMAT_EDEFAULT;

	/**
	 * This is true if the Transliteration Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transliterationFormatESet;

	/**
	 * The default value of the '{@link #getTransliterationLanguage() <em>Transliteration Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLITERATION_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransliterationLanguage() <em>Transliteration Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationLanguage()
	 * @generated
	 * @ordered
	 */
	protected String transliterationLanguage = TRANSLITERATION_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransliterationStyle() <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationStyle()
	 * @generated
	 * @ordered
	 */
	protected static final TransliterationStyleType TRANSLITERATION_STYLE_EDEFAULT = TransliterationStyleType.SHORT;

	/**
	 * The cached value of the '{@link #getTransliterationStyle() <em>Transliteration Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransliterationStyle()
	 * @generated
	 * @ordered
	 */
	protected TransliterationStyleType transliterationStyle = TRANSLITERATION_STYLE_EDEFAULT;

	/**
	 * This is true if the Transliteration Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transliterationStyleESet;

	/**
	 * The default value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final org.oasisopen.names.tc.opendocument.xmlns.text.Boolean VOLATILE_EDEFAULT = org.oasisopen.names.tc.opendocument.xmlns.text.Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected org.oasisopen.names.tc.opendocument.xmlns.text.Boolean volatile_ = VOLATILE_EDEFAULT;

	/**
	 * This is true if the Volatile attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean volatileESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrencyStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatastylePackage.Literals.CURRENCY_STYLE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES, oldTextProperties, newTextProperties);
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
				msgs = ((InternalEObject)textProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES, null, msgs);
			if (newTextProperties != null)
				msgs = ((InternalEObject)newTextProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES, null, msgs);
			msgs = basicSetTextProperties(newTextProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES, newTextProperties, newTextProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(NumberType newNumber, NotificationChain msgs) {
		NumberType oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(NumberType newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText1(String newText1) {
		String oldText1 = text1;
		text1 = newText1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT1, oldText1, text1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolType getCurrencySymbol() {
		return currencySymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencySymbol(CurrencySymbolType newCurrencySymbol, NotificationChain msgs) {
		CurrencySymbolType oldCurrencySymbol = currencySymbol;
		currencySymbol = newCurrencySymbol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL, oldCurrencySymbol, newCurrencySymbol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencySymbol(CurrencySymbolType newCurrencySymbol) {
		if (newCurrencySymbol != currencySymbol) {
			NotificationChain msgs = null;
			if (currencySymbol != null)
				msgs = ((InternalEObject)currencySymbol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL, null, msgs);
			if (newCurrencySymbol != null)
				msgs = ((InternalEObject)newCurrencySymbol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL, null, msgs);
			msgs = basicSetCurrencySymbol(newCurrencySymbol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL, newCurrencySymbol, newCurrencySymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText2() {
		return text2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText2(String newText2) {
		String oldText2 = text2;
		text2 = newText2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT2, oldText2, text2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySymbolType getCurrencySymbol1() {
		return currencySymbol1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrencySymbol1(CurrencySymbolType newCurrencySymbol1, NotificationChain msgs) {
		CurrencySymbolType oldCurrencySymbol1 = currencySymbol1;
		currencySymbol1 = newCurrencySymbol1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1, oldCurrencySymbol1, newCurrencySymbol1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrencySymbol1(CurrencySymbolType newCurrencySymbol1) {
		if (newCurrencySymbol1 != currencySymbol1) {
			NotificationChain msgs = null;
			if (currencySymbol1 != null)
				msgs = ((InternalEObject)currencySymbol1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1, null, msgs);
			if (newCurrencySymbol1 != null)
				msgs = ((InternalEObject)newCurrencySymbol1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1, null, msgs);
			msgs = basicSetCurrencySymbol1(newCurrencySymbol1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1, newCurrencySymbol1, newCurrencySymbol1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText3() {
		return text3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText3(String newText3) {
		String oldText3 = text3;
		text3 = newText3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT3, oldText3, text3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberType getNumber1() {
		return number1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber1(NumberType newNumber1, NotificationChain msgs) {
		NumberType oldNumber1 = number1;
		number1 = newNumber1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1, oldNumber1, newNumber1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber1(NumberType newNumber1) {
		if (newNumber1 != number1) {
			NotificationChain msgs = null;
			if (number1 != null)
				msgs = ((InternalEObject)number1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1, null, msgs);
			if (newNumber1 != null)
				msgs = ((InternalEObject)newNumber1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1, null, msgs);
			msgs = basicSetNumber1(newNumber1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1, newNumber1, newNumber1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText4() {
		return text4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText4(String newText4) {
		String oldText4 = text4;
		text4 = newText4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TEXT4, oldText4, text4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		if (map == null) {
			map = new EObjectContainmentEList<MapType>(MapType.class, this, DatastylePackage.CURRENCY_STYLE_TYPE__MAP);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getAutomaticOrder() {
		return automaticOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticOrder(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newAutomaticOrder) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticOrder = automaticOrder;
		automaticOrder = newAutomaticOrder == null ? AUTOMATIC_ORDER_EDEFAULT : newAutomaticOrder;
		boolean oldAutomaticOrderESet = automaticOrderESet;
		automaticOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER, oldAutomaticOrder, automaticOrder, !oldAutomaticOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticOrder() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldAutomaticOrder = automaticOrder;
		boolean oldAutomaticOrderESet = automaticOrderESet;
		automaticOrder = AUTOMATIC_ORDER_EDEFAULT;
		automaticOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER, oldAutomaticOrder, AUTOMATIC_ORDER_EDEFAULT, oldAutomaticOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticOrder() {
		return automaticOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransliterationCountry() {
		return transliterationCountry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationCountry(String newTransliterationCountry) {
		String oldTransliterationCountry = transliterationCountry;
		transliterationCountry = newTransliterationCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY, oldTransliterationCountry, transliterationCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransliterationFormat() {
		return transliterationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationFormat(String newTransliterationFormat) {
		String oldTransliterationFormat = transliterationFormat;
		transliterationFormat = newTransliterationFormat;
		boolean oldTransliterationFormatESet = transliterationFormatESet;
		transliterationFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT, oldTransliterationFormat, transliterationFormat, !oldTransliterationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransliterationFormat() {
		String oldTransliterationFormat = transliterationFormat;
		boolean oldTransliterationFormatESet = transliterationFormatESet;
		transliterationFormat = TRANSLITERATION_FORMAT_EDEFAULT;
		transliterationFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT, oldTransliterationFormat, TRANSLITERATION_FORMAT_EDEFAULT, oldTransliterationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransliterationFormat() {
		return transliterationFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransliterationLanguage() {
		return transliterationLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationLanguage(String newTransliterationLanguage) {
		String oldTransliterationLanguage = transliterationLanguage;
		transliterationLanguage = newTransliterationLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE, oldTransliterationLanguage, transliterationLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransliterationStyleType getTransliterationStyle() {
		return transliterationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransliterationStyle(TransliterationStyleType newTransliterationStyle) {
		TransliterationStyleType oldTransliterationStyle = transliterationStyle;
		transliterationStyle = newTransliterationStyle == null ? TRANSLITERATION_STYLE_EDEFAULT : newTransliterationStyle;
		boolean oldTransliterationStyleESet = transliterationStyleESet;
		transliterationStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE, oldTransliterationStyle, transliterationStyle, !oldTransliterationStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransliterationStyle() {
		TransliterationStyleType oldTransliterationStyle = transliterationStyle;
		boolean oldTransliterationStyleESet = transliterationStyleESet;
		transliterationStyle = TRANSLITERATION_STYLE_EDEFAULT;
		transliterationStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE, oldTransliterationStyle, TRANSLITERATION_STYLE_EDEFAULT, oldTransliterationStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransliterationStyle() {
		return transliterationStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getVolatile() {
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatile(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean newVolatile) {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVolatile = volatile_;
		volatile_ = newVolatile == null ? VOLATILE_EDEFAULT : newVolatile;
		boolean oldVolatileESet = volatileESet;
		volatileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatastylePackage.CURRENCY_STYLE_TYPE__VOLATILE, oldVolatile, volatile_, !oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVolatile() {
		org.oasisopen.names.tc.opendocument.xmlns.text.Boolean oldVolatile = volatile_;
		boolean oldVolatileESet = volatileESet;
		volatile_ = VOLATILE_EDEFAULT;
		volatileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatastylePackage.CURRENCY_STYLE_TYPE__VOLATILE, oldVolatile, VOLATILE_EDEFAULT, oldVolatileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVolatile() {
		return volatileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES:
				return basicSetTextProperties(null, msgs);
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER:
				return basicSetNumber(null, msgs);
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL:
				return basicSetCurrencySymbol(null, msgs);
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1:
				return basicSetCurrencySymbol1(null, msgs);
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1:
				return basicSetNumber1(null, msgs);
			case DatastylePackage.CURRENCY_STYLE_TYPE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
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
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES:
				return getTextProperties();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT:
				return getText();
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER:
				return getNumber();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT1:
				return getText1();
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL:
				return getCurrencySymbol();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT2:
				return getText2();
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1:
				return getCurrencySymbol1();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT3:
				return getText3();
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1:
				return getNumber1();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT4:
				return getText4();
			case DatastylePackage.CURRENCY_STYLE_TYPE__MAP:
				return getMap();
			case DatastylePackage.CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER:
				return getAutomaticOrder();
			case DatastylePackage.CURRENCY_STYLE_TYPE__COUNTRY:
				return getCountry();
			case DatastylePackage.CURRENCY_STYLE_TYPE__LANGUAGE:
				return getLanguage();
			case DatastylePackage.CURRENCY_STYLE_TYPE__NAME:
				return getName();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TITLE:
				return getTitle();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				return getTransliterationCountry();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT:
				return getTransliterationFormat();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				return getTransliterationLanguage();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE:
				return getTransliterationStyle();
			case DatastylePackage.CURRENCY_STYLE_TYPE__VOLATILE:
				return getVolatile();
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
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT:
				setText((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER:
				setNumber((NumberType)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT1:
				setText1((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL:
				setCurrencySymbol((CurrencySymbolType)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT2:
				setText2((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1:
				setCurrencySymbol1((CurrencySymbolType)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT3:
				setText3((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1:
				setNumber1((NumberType)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT4:
				setText4((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER:
				setAutomaticOrder((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__COUNTRY:
				setCountry((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__NAME:
				setName((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TITLE:
				setTitle(newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				setTransliterationCountry((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT:
				setTransliterationFormat((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage((String)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE:
				setTransliterationStyle((TransliterationStyleType)newValue);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__VOLATILE:
				setVolatile((org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)newValue);
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
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES:
				setTextProperties((StyleTextPropertiesContent)null);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER:
				setNumber((NumberType)null);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT1:
				setText1(TEXT1_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL:
				setCurrencySymbol((CurrencySymbolType)null);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT2:
				setText2(TEXT2_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1:
				setCurrencySymbol1((CurrencySymbolType)null);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT3:
				setText3(TEXT3_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1:
				setNumber1((NumberType)null);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT4:
				setText4(TEXT4_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__MAP:
				getMap().clear();
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER:
				unsetAutomaticOrder();
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				setTransliterationCountry(TRANSLITERATION_COUNTRY_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT:
				unsetTransliterationFormat();
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				setTransliterationLanguage(TRANSLITERATION_LANGUAGE_EDEFAULT);
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE:
				unsetTransliterationStyle();
				return;
			case DatastylePackage.CURRENCY_STYLE_TYPE__VOLATILE:
				unsetVolatile();
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
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT_PROPERTIES:
				return textProperties != null;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER:
				return number != null;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT1:
				return TEXT1_EDEFAULT == null ? text1 != null : !TEXT1_EDEFAULT.equals(text1);
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL:
				return currencySymbol != null;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT2:
				return TEXT2_EDEFAULT == null ? text2 != null : !TEXT2_EDEFAULT.equals(text2);
			case DatastylePackage.CURRENCY_STYLE_TYPE__CURRENCY_SYMBOL1:
				return currencySymbol1 != null;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT3:
				return TEXT3_EDEFAULT == null ? text3 != null : !TEXT3_EDEFAULT.equals(text3);
			case DatastylePackage.CURRENCY_STYLE_TYPE__NUMBER1:
				return number1 != null;
			case DatastylePackage.CURRENCY_STYLE_TYPE__TEXT4:
				return TEXT4_EDEFAULT == null ? text4 != null : !TEXT4_EDEFAULT.equals(text4);
			case DatastylePackage.CURRENCY_STYLE_TYPE__MAP:
				return map != null && !map.isEmpty();
			case DatastylePackage.CURRENCY_STYLE_TYPE__AUTOMATIC_ORDER:
				return isSetAutomaticOrder();
			case DatastylePackage.CURRENCY_STYLE_TYPE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case DatastylePackage.CURRENCY_STYLE_TYPE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case DatastylePackage.CURRENCY_STYLE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DatastylePackage.CURRENCY_STYLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_COUNTRY:
				return TRANSLITERATION_COUNTRY_EDEFAULT == null ? transliterationCountry != null : !TRANSLITERATION_COUNTRY_EDEFAULT.equals(transliterationCountry);
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_FORMAT:
				return isSetTransliterationFormat();
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_LANGUAGE:
				return TRANSLITERATION_LANGUAGE_EDEFAULT == null ? transliterationLanguage != null : !TRANSLITERATION_LANGUAGE_EDEFAULT.equals(transliterationLanguage);
			case DatastylePackage.CURRENCY_STYLE_TYPE__TRANSLITERATION_STYLE:
				return isSetTransliterationStyle();
			case DatastylePackage.CURRENCY_STYLE_TYPE__VOLATILE:
				return isSetVolatile();
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
		result.append(" (text: ");
		result.append(text);
		result.append(", text1: ");
		result.append(text1);
		result.append(", text2: ");
		result.append(text2);
		result.append(", text3: ");
		result.append(text3);
		result.append(", text4: ");
		result.append(text4);
		result.append(", automaticOrder: ");
		if (automaticOrderESet) result.append(automaticOrder); else result.append("<unset>");
		result.append(", country: ");
		result.append(country);
		result.append(", language: ");
		result.append(language);
		result.append(", name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", transliterationCountry: ");
		result.append(transliterationCountry);
		result.append(", transliterationFormat: ");
		if (transliterationFormatESet) result.append(transliterationFormat); else result.append("<unset>");
		result.append(", transliterationLanguage: ");
		result.append(transliterationLanguage);
		result.append(", transliterationStyle: ");
		if (transliterationStyleESet) result.append(transliterationStyle); else result.append("<unset>");
		result.append(", volatile: ");
		if (volatileESet) result.append(volatile_); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CurrencyStyleTypeImpl
