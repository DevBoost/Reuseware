/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasisopen.names.tc.opendocument.xmlns.presentation;

import javax.xml.datatype.Duration;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow <em>Show</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getAnimations <em>Animations</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getEndless <em>Endless</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getForceManual <em>Force Manual</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getFullScreen <em>Full Screen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseAsPen <em>Mouse As Pen</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseVisible <em>Mouse Visible</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getPause <em>Pause</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow1 <em>Show1</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowLogo <em>Show Logo</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartPage <em>Start Page</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartWithNavigator <em>Start With Navigator</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStayOnTop <em>Stay On Top</em>}</li>
 *   <li>{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getTransitionOnClick <em>Transition On Click</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType()
 * @model extendedMetaData="name='settings_._type' kind='elementOnly'"
 * @generated
 */
public interface SettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Show</b></em>' containment reference list.
	 * The list contents are of type {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.ShowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' containment reference list.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_Show()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='show' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShowType> getShow();

	/**
	 * Returns the value of the '<em><b>Animations</b></em>' attribute.
	 * The default value is <code>"enabled"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @see #isSetAnimations()
	 * @see #unsetAnimations()
	 * @see #setAnimations(AnimationsType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_Animations()
	 * @model default="enabled" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='animations' namespace='##targetNamespace'"
	 * @generated
	 */
	AnimationsType getAnimations();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getAnimations <em>Animations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animations</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.AnimationsType
	 * @see #isSetAnimations()
	 * @see #unsetAnimations()
	 * @see #getAnimations()
	 * @generated
	 */
	void setAnimations(AnimationsType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getAnimations <em>Animations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnimations()
	 * @see #getAnimations()
	 * @see #setAnimations(AnimationsType)
	 * @generated
	 */
	void unsetAnimations();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getAnimations <em>Animations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Animations</em>' attribute is set.
	 * @see #unsetAnimations()
	 * @see #getAnimations()
	 * @see #setAnimations(AnimationsType)
	 * @generated
	 */
	boolean isSetAnimations();

	/**
	 * Returns the value of the '<em><b>Endless</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endless</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endless</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEndless()
	 * @see #unsetEndless()
	 * @see #setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_Endless()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endless' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getEndless();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getEndless <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endless</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetEndless()
	 * @see #unsetEndless()
	 * @see #getEndless()
	 * @generated
	 */
	void setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getEndless <em>Endless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndless()
	 * @see #getEndless()
	 * @see #setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetEndless();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getEndless <em>Endless</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endless</em>' attribute is set.
	 * @see #unsetEndless()
	 * @see #getEndless()
	 * @see #setEndless(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetEndless();

	/**
	 * Returns the value of the '<em><b>Force Manual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Manual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Manual</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetForceManual()
	 * @see #unsetForceManual()
	 * @see #setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_ForceManual()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='force-manual' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getForceManual();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getForceManual <em>Force Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Manual</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetForceManual()
	 * @see #unsetForceManual()
	 * @see #getForceManual()
	 * @generated
	 */
	void setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getForceManual <em>Force Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetForceManual()
	 * @see #getForceManual()
	 * @see #setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetForceManual();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getForceManual <em>Force Manual</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Force Manual</em>' attribute is set.
	 * @see #unsetForceManual()
	 * @see #getForceManual()
	 * @see #setForceManual(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetForceManual();

	/**
	 * Returns the value of the '<em><b>Full Screen</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Screen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFullScreen()
	 * @see #unsetFullScreen()
	 * @see #setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_FullScreen()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='full-screen' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getFullScreen();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Screen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetFullScreen()
	 * @see #unsetFullScreen()
	 * @see #getFullScreen()
	 * @generated
	 */
	void setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getFullScreen <em>Full Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFullScreen()
	 * @see #getFullScreen()
	 * @see #setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetFullScreen();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getFullScreen <em>Full Screen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Full Screen</em>' attribute is set.
	 * @see #unsetFullScreen()
	 * @see #getFullScreen()
	 * @see #setFullScreen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetFullScreen();

	/**
	 * Returns the value of the '<em><b>Mouse As Pen</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse As Pen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse As Pen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseAsPen()
	 * @see #unsetMouseAsPen()
	 * @see #setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_MouseAsPen()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mouse-as-pen' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMouseAsPen();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseAsPen <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse As Pen</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseAsPen()
	 * @see #unsetMouseAsPen()
	 * @see #getMouseAsPen()
	 * @generated
	 */
	void setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseAsPen <em>Mouse As Pen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMouseAsPen()
	 * @see #getMouseAsPen()
	 * @see #setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMouseAsPen();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseAsPen <em>Mouse As Pen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mouse As Pen</em>' attribute is set.
	 * @see #unsetMouseAsPen()
	 * @see #getMouseAsPen()
	 * @see #setMouseAsPen(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMouseAsPen();

	/**
	 * Returns the value of the '<em><b>Mouse Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseVisible()
	 * @see #unsetMouseVisible()
	 * @see #setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_MouseVisible()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mouse-visible' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getMouseVisible();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseVisible <em>Mouse Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse Visible</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetMouseVisible()
	 * @see #unsetMouseVisible()
	 * @see #getMouseVisible()
	 * @generated
	 */
	void setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseVisible <em>Mouse Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMouseVisible()
	 * @see #getMouseVisible()
	 * @see #setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetMouseVisible();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getMouseVisible <em>Mouse Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mouse Visible</em>' attribute is set.
	 * @see #unsetMouseVisible()
	 * @see #getMouseVisible()
	 * @see #setMouseVisible(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetMouseVisible();

	/**
	 * Returns the value of the '<em><b>Pause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pause</em>' attribute.
	 * @see #setPause(Duration)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_Pause()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.Duration"
	 *        extendedMetaData="kind='attribute' name='pause' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getPause();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getPause <em>Pause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pause</em>' attribute.
	 * @see #getPause()
	 * @generated
	 */
	void setPause(Duration value);

	/**
	 * Returns the value of the '<em><b>Show1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show1</em>' attribute.
	 * @see #setShow1(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_Show1()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='show' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShow1();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShow1 <em>Show1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show1</em>' attribute.
	 * @see #getShow1()
	 * @generated
	 */
	void setShow1(String value);

	/**
	 * Returns the value of the '<em><b>Show End Of Presentation Slide</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show End Of Presentation Slide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show End Of Presentation Slide</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEndOfPresentationSlide()
	 * @see #unsetShowEndOfPresentationSlide()
	 * @see #setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_ShowEndOfPresentationSlide()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-end-of-presentation-slide' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowEndOfPresentationSlide();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show End Of Presentation Slide</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowEndOfPresentationSlide()
	 * @see #unsetShowEndOfPresentationSlide()
	 * @see #getShowEndOfPresentationSlide()
	 * @generated
	 */
	void setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowEndOfPresentationSlide()
	 * @see #getShowEndOfPresentationSlide()
	 * @see #setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowEndOfPresentationSlide();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowEndOfPresentationSlide <em>Show End Of Presentation Slide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show End Of Presentation Slide</em>' attribute is set.
	 * @see #unsetShowEndOfPresentationSlide()
	 * @see #getShowEndOfPresentationSlide()
	 * @see #setShowEndOfPresentationSlide(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowEndOfPresentationSlide();

	/**
	 * Returns the value of the '<em><b>Show Logo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Logo</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowLogo()
	 * @see #unsetShowLogo()
	 * @see #setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_ShowLogo()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show-logo' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getShowLogo();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowLogo <em>Show Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Logo</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetShowLogo()
	 * @see #unsetShowLogo()
	 * @see #getShowLogo()
	 * @generated
	 */
	void setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowLogo <em>Show Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShowLogo()
	 * @see #getShowLogo()
	 * @see #setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetShowLogo();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getShowLogo <em>Show Logo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show Logo</em>' attribute is set.
	 * @see #unsetShowLogo()
	 * @see #getShowLogo()
	 * @see #setShowLogo(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetShowLogo();

	/**
	 * Returns the value of the '<em><b>Start Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Page</em>' attribute.
	 * @see #setStartPage(String)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_StartPage()
	 * @model dataType="org.oasisopen.names.tc.opendocument.xmlns.text.String"
	 *        extendedMetaData="kind='attribute' name='start-page' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartPage();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartPage <em>Start Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Page</em>' attribute.
	 * @see #getStartPage()
	 * @generated
	 */
	void setStartPage(String value);

	/**
	 * Returns the value of the '<em><b>Start With Navigator</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start With Navigator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start With Navigator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStartWithNavigator()
	 * @see #unsetStartWithNavigator()
	 * @see #setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_StartWithNavigator()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='start-with-navigator' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStartWithNavigator();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartWithNavigator <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start With Navigator</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStartWithNavigator()
	 * @see #unsetStartWithNavigator()
	 * @see #getStartWithNavigator()
	 * @generated
	 */
	void setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartWithNavigator <em>Start With Navigator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartWithNavigator()
	 * @see #getStartWithNavigator()
	 * @see #setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStartWithNavigator();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStartWithNavigator <em>Start With Navigator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start With Navigator</em>' attribute is set.
	 * @see #unsetStartWithNavigator()
	 * @see #getStartWithNavigator()
	 * @see #setStartWithNavigator(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStartWithNavigator();

	/**
	 * Returns the value of the '<em><b>Stay On Top</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.text.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay On Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay On Top</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStayOnTop()
	 * @see #unsetStayOnTop()
	 * @see #setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_StayOnTop()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stay-on-top' namespace='##targetNamespace'"
	 * @generated
	 */
	org.oasisopen.names.tc.opendocument.xmlns.text.Boolean getStayOnTop();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStayOnTop <em>Stay On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stay On Top</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.text.Boolean
	 * @see #isSetStayOnTop()
	 * @see #unsetStayOnTop()
	 * @see #getStayOnTop()
	 * @generated
	 */
	void setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStayOnTop <em>Stay On Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStayOnTop()
	 * @see #getStayOnTop()
	 * @see #setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	void unsetStayOnTop();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getStayOnTop <em>Stay On Top</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stay On Top</em>' attribute is set.
	 * @see #unsetStayOnTop()
	 * @see #getStayOnTop()
	 * @see #setStayOnTop(org.oasisopen.names.tc.opendocument.xmlns.text.Boolean)
	 * @generated
	 */
	boolean isSetStayOnTop();

	/**
	 * Returns the value of the '<em><b>Transition On Click</b></em>' attribute.
	 * The default value is <code>"enabled"</code>.
	 * The literals are from the enumeration {@link org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition On Click</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition On Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @see #isSetTransitionOnClick()
	 * @see #unsetTransitionOnClick()
	 * @see #setTransitionOnClick(TransitionOnClickType)
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.PresentationPackage#getSettingsType_TransitionOnClick()
	 * @model default="enabled" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='transition-on-click' namespace='##targetNamespace'"
	 * @generated
	 */
	TransitionOnClickType getTransitionOnClick();

	/**
	 * Sets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getTransitionOnClick <em>Transition On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition On Click</em>' attribute.
	 * @see org.oasisopen.names.tc.opendocument.xmlns.presentation.TransitionOnClickType
	 * @see #isSetTransitionOnClick()
	 * @see #unsetTransitionOnClick()
	 * @see #getTransitionOnClick()
	 * @generated
	 */
	void setTransitionOnClick(TransitionOnClickType value);

	/**
	 * Unsets the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getTransitionOnClick <em>Transition On Click</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransitionOnClick()
	 * @see #getTransitionOnClick()
	 * @see #setTransitionOnClick(TransitionOnClickType)
	 * @generated
	 */
	void unsetTransitionOnClick();

	/**
	 * Returns whether the value of the '{@link org.oasisopen.names.tc.opendocument.xmlns.presentation.SettingsType#getTransitionOnClick <em>Transition On Click</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transition On Click</em>' attribute is set.
	 * @see #unsetTransitionOnClick()
	 * @see #getTransitionOnClick()
	 * @see #setTransitionOnClick(TransitionOnClickType)
	 * @generated
	 */
	boolean isSetTransitionOnClick();

} // SettingsType
