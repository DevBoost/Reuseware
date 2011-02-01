/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrative Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getDirectConnect <em>Direct Connect</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getStatic <em>Static</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getEBGP <em>EBGP</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getEIGRPInternal <em>EIGRP Internal</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getIGRP <em>IGRP</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getOSPF <em>OSPF</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getISIS <em>ISIS</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getRIP <em>RIP</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getEGP <em>EGP</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getIEGRPExternal <em>IEGRP External</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getIBGP <em>IBGP</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getBGPLocal <em>BGP Local</em>}</li>
 *   <li>{@link es.tid.cim.AdministrativeDistance#getUnknown <em>Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.tid.cim.CimPackage#getAdministrativeDistance()
 * @model
 * @generated
 */
public interface AdministrativeDistance extends LogicalElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_CreationClassName()
	 * @model
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Direct Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Connect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Connect</em>' attribute.
	 * @see #setDirectConnect(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_DirectConnect()
	 * @model
	 * @generated
	 */
	int getDirectConnect();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getDirectConnect <em>Direct Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Connect</em>' attribute.
	 * @see #getDirectConnect()
	 * @generated
	 */
	void setDirectConnect(int value);

	/**
	 * Returns the value of the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' attribute.
	 * @see #setStatic(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_Static()
	 * @model
	 * @generated
	 */
	int getStatic();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getStatic <em>Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static</em>' attribute.
	 * @see #getStatic()
	 * @generated
	 */
	void setStatic(int value);

	/**
	 * Returns the value of the '<em><b>EBGP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EBGP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EBGP</em>' attribute.
	 * @see #setEBGP(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_EBGP()
	 * @model
	 * @generated
	 */
	int getEBGP();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getEBGP <em>EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EBGP</em>' attribute.
	 * @see #getEBGP()
	 * @generated
	 */
	void setEBGP(int value);

	/**
	 * Returns the value of the '<em><b>EIGRP Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EIGRP Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIGRP Internal</em>' attribute.
	 * @see #setEIGRPInternal(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_EIGRPInternal()
	 * @model
	 * @generated
	 */
	int getEIGRPInternal();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getEIGRPInternal <em>EIGRP Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIGRP Internal</em>' attribute.
	 * @see #getEIGRPInternal()
	 * @generated
	 */
	void setEIGRPInternal(int value);

	/**
	 * Returns the value of the '<em><b>IGRP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IGRP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IGRP</em>' attribute.
	 * @see #setIGRP(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_IGRP()
	 * @model
	 * @generated
	 */
	int getIGRP();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getIGRP <em>IGRP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IGRP</em>' attribute.
	 * @see #getIGRP()
	 * @generated
	 */
	void setIGRP(int value);

	/**
	 * Returns the value of the '<em><b>OSPF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OSPF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OSPF</em>' attribute.
	 * @see #setOSPF(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_OSPF()
	 * @model
	 * @generated
	 */
	int getOSPF();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getOSPF <em>OSPF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OSPF</em>' attribute.
	 * @see #getOSPF()
	 * @generated
	 */
	void setOSPF(int value);

	/**
	 * Returns the value of the '<em><b>ISIS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISIS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISIS</em>' attribute.
	 * @see #setISIS(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_ISIS()
	 * @model
	 * @generated
	 */
	int getISIS();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getISIS <em>ISIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISIS</em>' attribute.
	 * @see #getISIS()
	 * @generated
	 */
	void setISIS(int value);

	/**
	 * Returns the value of the '<em><b>RIP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RIP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RIP</em>' attribute.
	 * @see #setRIP(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_RIP()
	 * @model
	 * @generated
	 */
	int getRIP();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getRIP <em>RIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RIP</em>' attribute.
	 * @see #getRIP()
	 * @generated
	 */
	void setRIP(int value);

	/**
	 * Returns the value of the '<em><b>EGP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGP</em>' attribute.
	 * @see #setEGP(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_EGP()
	 * @model
	 * @generated
	 */
	int getEGP();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getEGP <em>EGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGP</em>' attribute.
	 * @see #getEGP()
	 * @generated
	 */
	void setEGP(int value);

	/**
	 * Returns the value of the '<em><b>IEGRP External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IEGRP External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IEGRP External</em>' attribute.
	 * @see #setIEGRPExternal(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_IEGRPExternal()
	 * @model
	 * @generated
	 */
	int getIEGRPExternal();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getIEGRPExternal <em>IEGRP External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IEGRP External</em>' attribute.
	 * @see #getIEGRPExternal()
	 * @generated
	 */
	void setIEGRPExternal(int value);

	/**
	 * Returns the value of the '<em><b>IBGP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBGP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBGP</em>' attribute.
	 * @see #setIBGP(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_IBGP()
	 * @model
	 * @generated
	 */
	int getIBGP();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getIBGP <em>IBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBGP</em>' attribute.
	 * @see #getIBGP()
	 * @generated
	 */
	void setIBGP(int value);

	/**
	 * Returns the value of the '<em><b>BGP Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BGP Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BGP Local</em>' attribute.
	 * @see #setBGPLocal(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_BGPLocal()
	 * @model
	 * @generated
	 */
	int getBGPLocal();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getBGPLocal <em>BGP Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Local</em>' attribute.
	 * @see #getBGPLocal()
	 * @generated
	 */
	void setBGPLocal(int value);

	/**
	 * Returns the value of the '<em><b>Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown</em>' attribute.
	 * @see #setUnknown(int)
	 * @see es.tid.cim.CimPackage#getAdministrativeDistance_Unknown()
	 * @model
	 * @generated
	 */
	int getUnknown();

	/**
	 * Sets the value of the '{@link es.tid.cim.AdministrativeDistance#getUnknown <em>Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown</em>' attribute.
	 * @see #getUnknown()
	 * @generated
	 */
	void setUnknown(int value);

} // AdministrativeDistance
