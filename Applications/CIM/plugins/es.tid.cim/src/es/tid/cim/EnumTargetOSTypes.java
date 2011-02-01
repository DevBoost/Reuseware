/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Target OS Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.tid.cim.CimPackage#getEnumTargetOSTypes()
 * @model
 * @generated
 */
public enum EnumTargetOSTypes implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(1, "Other", "Other"),

	/**
	 * The '<em><b>MACOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACOS_VALUE
	 * @generated
	 * @ordered
	 */
	MACOS(2, "MACOS", "MACOS"),

	/**
	 * The '<em><b>ATTUNIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTUNIX_VALUE
	 * @generated
	 * @ordered
	 */
	ATTUNIX(3, "ATTUNIX", "ATTUNIX"),

	/**
	 * The '<em><b>DGUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DGUX_VALUE
	 * @generated
	 * @ordered
	 */
	DGUX(4, "DGUX", "DGUX"),

	/**
	 * The '<em><b>DECNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECNT_VALUE
	 * @generated
	 * @ordered
	 */
	DECNT(5, "DECNT", "DECNT"),

	/**
	 * The '<em><b>Tru64 UNIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRU64_UNIX_VALUE
	 * @generated
	 * @ordered
	 */
	TRU64_UNIX(6, "Tru64UNIX", "Tru64 UNIX"),

	/**
	 * The '<em><b>Open VMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VMS_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_VMS(7, "OpenVMS", "OpenVMS"),

	/**
	 * The '<em><b>HPUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPUX_VALUE
	 * @generated
	 * @ordered
	 */
	HPUX(8, "HPUX", "HPUX"),

	/**
	 * The '<em><b>AIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIX_VALUE
	 * @generated
	 * @ordered
	 */
	AIX(9, "AIX", "AIX"),

	/**
	 * The '<em><b>MVS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MVS_VALUE
	 * @generated
	 * @ordered
	 */
	MVS(10, "MVS", "MVS"),

	/**
	 * The '<em><b>OS400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS400_VALUE
	 * @generated
	 * @ordered
	 */
	OS400(11, "OS400", "OS400"),

	/**
	 * The '<em><b>OS 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_2_VALUE
	 * @generated
	 * @ordered
	 */
	OS_2(12, "OS_2", "OS_2"),

	/**
	 * The '<em><b>Java VM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_VM_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA_VM(13, "JavaVM", "JavaVM"),

	/**
	 * The '<em><b>MSDOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MSDOS_VALUE
	 * @generated
	 * @ordered
	 */
	MSDOS(14, "MSDOS", "MSDOS"),

	/**
	 * The '<em><b>WIN 3x</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN_3X_VALUE
	 * @generated
	 * @ordered
	 */
	WIN_3X(15, "WIN3x", "WIN3x"),

	/**
	 * The '<em><b>WIN95</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN95_VALUE
	 * @generated
	 * @ordered
	 */
	WIN95(16, "WIN95", "WIN95"),

	/**
	 * The '<em><b>WIN98</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIN98_VALUE
	 * @generated
	 * @ordered
	 */
	WIN98(17, "WIN98", "WIN98"),

	/**
	 * The '<em><b>WINNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINNT_VALUE
	 * @generated
	 * @ordered
	 */
	WINNT(18, "WINNT", "WINNT"),

	/**
	 * The '<em><b>WINCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINCE_VALUE
	 * @generated
	 * @ordered
	 */
	WINCE(19, "WINCE", "WINCE"),

	/**
	 * The '<em><b>NCR3000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NCR3000_VALUE
	 * @generated
	 * @ordered
	 */
	NCR3000(20, "NCR3000", "NCR3000"),

	/**
	 * The '<em><b>Net Ware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NET_WARE_VALUE
	 * @generated
	 * @ordered
	 */
	NET_WARE(21, "NetWare", "NetWare"),

	/**
	 * The '<em><b>OSF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSF_VALUE
	 * @generated
	 * @ordered
	 */
	OSF(22, "OSF", "OSF"),

	/**
	 * The '<em><b>DC OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DC_OS_VALUE
	 * @generated
	 * @ordered
	 */
	DC_OS(23, "DC_OS", "DC_OS"),

	/**
	 * The '<em><b>Reliant UNIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIANT_UNIX_VALUE
	 * @generated
	 * @ordered
	 */
	RELIANT_UNIX(24, "ReliantUNIX", "Reliant UNIX"),

	/**
	 * The '<em><b>SCO Unix Ware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCO_UNIX_WARE_VALUE
	 * @generated
	 * @ordered
	 */
	SCO_UNIX_WARE(25, "SCOUnixWare", "SCOUnixWare"),

	/**
	 * The '<em><b>SCO Open Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCO_OPEN_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SCO_OPEN_SERVER(26, "SCOOpenServer", "SCO OpenServer"),

	/**
	 * The '<em><b>Sequent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENT_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENT(27, "Sequent", "Sequent"),

	/**
	 * The '<em><b>IRIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRIX_VALUE
	 * @generated
	 * @ordered
	 */
	IRIX(28, "IRIX", "IRIX"),

	/**
	 * The '<em><b>Solaris</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLARIS_VALUE
	 * @generated
	 * @ordered
	 */
	SOLARIS(29, "Solaris", "Solaris"),

	/**
	 * The '<em><b>Sun OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUN_OS_VALUE
	 * @generated
	 * @ordered
	 */
	SUN_OS(30, "SunOS", "SunOS"),

	/**
	 * The '<em><b>U6000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #U6000_VALUE
	 * @generated
	 * @ordered
	 */
	U6000(31, "U6000", "U6000"),

	/**
	 * The '<em><b>ASERIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASERIES_VALUE
	 * @generated
	 * @ordered
	 */
	ASERIES(32, "ASERIES", "ASERIES"),

	/**
	 * The '<em><b>HP Non Stop OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP_NON_STOP_OS_VALUE
	 * @generated
	 * @ordered
	 */
	HP_NON_STOP_OS(33, "HPNonStopOS", "HP NonStop OS"),

	/**
	 * The '<em><b>HP Non Stop OSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP_NON_STOP_OSS_VALUE
	 * @generated
	 * @ordered
	 */
	HP_NON_STOP_OSS(34, "HPNonStopOSS", "HP NonStop OSS"),

	/**
	 * The '<em><b>BS2000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BS2000_VALUE
	 * @generated
	 * @ordered
	 */
	BS2000(35, "BS2000", "BS2000"),

	/**
	 * The '<em><b>LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(36, "LINUX", "LINUX"),

	/**
	 * The '<em><b>Lynx</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LYNX_VALUE
	 * @generated
	 * @ordered
	 */
	LYNX(37, "Lynx", "Lynx"),

	/**
	 * The '<em><b>XENIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XENIX_VALUE
	 * @generated
	 * @ordered
	 */
	XENIX(38, "XENIX", "XENIX"),

	/**
	 * The '<em><b>VM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_VALUE
	 * @generated
	 * @ordered
	 */
	VM(39, "VM", "VM"),

	/**
	 * The '<em><b>Interactive UNIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_UNIX_VALUE
	 * @generated
	 * @ordered
	 */
	INTERACTIVE_UNIX(40, "InteractiveUNIX", "InteractiveUNIX"),

	/**
	 * The '<em><b>BSDUNIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BSDUNIX_VALUE
	 * @generated
	 * @ordered
	 */
	BSDUNIX(41, "BSDUNIX", "BSDUNIX"),

	/**
	 * The '<em><b>Free BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	FREE_BSD(42, "FreeBSD", "FreeBSD"),

	/**
	 * The '<em><b>Net BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NET_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	NET_BSD(43, "NetBSD", "NetBSD"),

	/**
	 * The '<em><b>GNU Hurd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNU_HURD_VALUE
	 * @generated
	 * @ordered
	 */
	GNU_HURD(44, "GNUHurd", "GNU Hurd"),

	/**
	 * The '<em><b>OS9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS9_VALUE
	 * @generated
	 * @ordered
	 */
	OS9(45, "OS9", "OS9"),

	/**
	 * The '<em><b>MACH Kernel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACH_KERNEL_VALUE
	 * @generated
	 * @ordered
	 */
	MACH_KERNEL(46, "MACHKernel", "MACHKernel"),

	/**
	 * The '<em><b>Inferno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFERNO_VALUE
	 * @generated
	 * @ordered
	 */
	INFERNO(47, "Inferno", "Inferno"),

	/**
	 * The '<em><b>QNX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QNX_VALUE
	 * @generated
	 * @ordered
	 */
	QNX(48, "QNX", "QNX"),

	/**
	 * The '<em><b>Ix Works</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IX_WORKS_VALUE
	 * @generated
	 * @ordered
	 */
	IX_WORKS(49, "IxWorks", "IxWorks"),

	/**
	 * The '<em><b>Vx Works</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VX_WORKS_VALUE
	 * @generated
	 * @ordered
	 */
	VX_WORKS(50, "VxWorks", "VxWorks"),

	/**
	 * The '<em><b>Mi NT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_NT_VALUE
	 * @generated
	 * @ordered
	 */
	MI_NT(51, "MiNT", "MiNT"),

	/**
	 * The '<em><b>Be OS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BE_OS_VALUE
	 * @generated
	 * @ordered
	 */
	BE_OS(52, "BeOS", "BeOS"),

	/**
	 * The '<em><b>HPMPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HPMPE_VALUE
	 * @generated
	 * @ordered
	 */
	HPMPE(53, "HPMPE", "HPMPE"),

	/**
	 * The '<em><b>Next Step</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_STEP_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_STEP(54, "NextStep", "NextStep"),

	/**
	 * The '<em><b>Palm Pilot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALM_PILOT_VALUE
	 * @generated
	 * @ordered
	 */
	PALM_PILOT(55, "PalmPilot", "PalmPilot"),

	/**
	 * The '<em><b>Rhapsody</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHAPSODY_VALUE
	 * @generated
	 * @ordered
	 */
	RHAPSODY(56, "Rhapsody", "Rhapsody"),

	/**
	 * The '<em><b>Windows2000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS2000_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS2000(57, "Windows2000", "Windows 2000"),

	/**
	 * The '<em><b>Dedicated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDICATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEDICATED(58, "Dedicated", "Dedicated"),

	/**
	 * The '<em><b>OS 390</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_390_VALUE
	 * @generated
	 * @ordered
	 */
	OS_390(59, "OS_390", "OS_390"),

	/**
	 * The '<em><b>VSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSE_VALUE
	 * @generated
	 * @ordered
	 */
	VSE(60, "VSE", "VSE"),

	/**
	 * The '<em><b>TPF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TPF_VALUE
	 * @generated
	 * @ordered
	 */
	TPF(61, "TPF", "TPF"),

	/**
	 * The '<em><b>Windows RMe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_RME_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS_RME(62, "Windows_R_Me", "Windows (R) Me"),

	/**
	 * The '<em><b>Caldera Open UNIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALDERA_OPEN_UNIX_VALUE
	 * @generated
	 * @ordered
	 */
	CALDERA_OPEN_UNIX(63, "CalderaOpenUNIX", "Caldera Open UNIX"),

	/**
	 * The '<em><b>Open BSD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_BSD_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_BSD(64, "OpenBSD", "OpenBSD"),

	/**
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(65, "NotApplicable", "Not Applicable");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 1;

	/**
	 * The '<em><b>MACOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MACOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MACOS_VALUE = 2;

	/**
	 * The '<em><b>ATTUNIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ATTUNIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTUNIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ATTUNIX_VALUE = 3;

	/**
	 * The '<em><b>DGUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DGUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DGUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DGUX_VALUE = 4;

	/**
	 * The '<em><b>DECNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECNT_VALUE = 5;

	/**
	 * The '<em><b>Tru64 UNIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tru64 UNIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRU64_UNIX
	 * @model name="Tru64UNIX" literal="Tru64 UNIX"
	 * @generated
	 * @ordered
	 */
	public static final int TRU64_UNIX_VALUE = 6;

	/**
	 * The '<em><b>Open VMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open VMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_VMS
	 * @model name="OpenVMS"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VMS_VALUE = 7;

	/**
	 * The '<em><b>HPUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HPUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPUX_VALUE = 8;

	/**
	 * The '<em><b>AIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AIX_VALUE = 9;

	/**
	 * The '<em><b>MVS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MVS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MVS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MVS_VALUE = 10;

	/**
	 * The '<em><b>OS400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS400_VALUE = 11;

	/**
	 * The '<em><b>OS 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS_2_VALUE = 12;

	/**
	 * The '<em><b>Java VM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java VM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA_VM
	 * @model name="JavaVM"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_VM_VALUE = 13;

	/**
	 * The '<em><b>MSDOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MSDOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MSDOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MSDOS_VALUE = 14;

	/**
	 * The '<em><b>WIN 3x</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIN 3x</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN_3X
	 * @model name="WIN3x"
	 * @generated
	 * @ordered
	 */
	public static final int WIN_3X_VALUE = 15;

	/**
	 * The '<em><b>WIN95</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIN95</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN95
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIN95_VALUE = 16;

	/**
	 * The '<em><b>WIN98</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WIN98</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WIN98
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WIN98_VALUE = 17;

	/**
	 * The '<em><b>WINNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WINNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINNT_VALUE = 18;

	/**
	 * The '<em><b>WINCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WINCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINCE_VALUE = 19;

	/**
	 * The '<em><b>NCR3000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NCR3000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NCR3000
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NCR3000_VALUE = 20;

	/**
	 * The '<em><b>Net Ware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Net Ware</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NET_WARE
	 * @model name="NetWare"
	 * @generated
	 * @ordered
	 */
	public static final int NET_WARE_VALUE = 21;

	/**
	 * The '<em><b>OSF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OSF_VALUE = 22;

	/**
	 * The '<em><b>DC OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DC OS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DC_OS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DC_OS_VALUE = 23;

	/**
	 * The '<em><b>Reliant UNIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reliant UNIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELIANT_UNIX
	 * @model name="ReliantUNIX" literal="Reliant UNIX"
	 * @generated
	 * @ordered
	 */
	public static final int RELIANT_UNIX_VALUE = 24;

	/**
	 * The '<em><b>SCO Unix Ware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCO Unix Ware</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCO_UNIX_WARE
	 * @model name="SCOUnixWare"
	 * @generated
	 * @ordered
	 */
	public static final int SCO_UNIX_WARE_VALUE = 25;

	/**
	 * The '<em><b>SCO Open Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCO Open Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCO_OPEN_SERVER
	 * @model name="SCOOpenServer" literal="SCO OpenServer"
	 * @generated
	 * @ordered
	 */
	public static final int SCO_OPEN_SERVER_VALUE = 26;

	/**
	 * The '<em><b>Sequent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENT
	 * @model name="Sequent"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENT_VALUE = 27;

	/**
	 * The '<em><b>IRIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IRIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IRIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRIX_VALUE = 28;

	/**
	 * The '<em><b>Solaris</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solaris</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLARIS
	 * @model name="Solaris"
	 * @generated
	 * @ordered
	 */
	public static final int SOLARIS_VALUE = 29;

	/**
	 * The '<em><b>Sun OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sun OS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUN_OS
	 * @model name="SunOS"
	 * @generated
	 * @ordered
	 */
	public static final int SUN_OS_VALUE = 30;

	/**
	 * The '<em><b>U6000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>U6000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #U6000
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int U6000_VALUE = 31;

	/**
	 * The '<em><b>ASERIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASERIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASERIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASERIES_VALUE = 32;

	/**
	 * The '<em><b>HP Non Stop OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HP Non Stop OS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HP_NON_STOP_OS
	 * @model name="HPNonStopOS" literal="HP NonStop OS"
	 * @generated
	 * @ordered
	 */
	public static final int HP_NON_STOP_OS_VALUE = 33;

	/**
	 * The '<em><b>HP Non Stop OSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HP Non Stop OSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HP_NON_STOP_OSS
	 * @model name="HPNonStopOSS" literal="HP NonStop OSS"
	 * @generated
	 * @ordered
	 */
	public static final int HP_NON_STOP_OSS_VALUE = 34;

	/**
	 * The '<em><b>BS2000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BS2000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BS2000
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BS2000_VALUE = 35;

	/**
	 * The '<em><b>LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 36;

	/**
	 * The '<em><b>Lynx</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lynx</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LYNX
	 * @model name="Lynx"
	 * @generated
	 * @ordered
	 */
	public static final int LYNX_VALUE = 37;

	/**
	 * The '<em><b>XENIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XENIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XENIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XENIX_VALUE = 38;

	/**
	 * The '<em><b>VM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VM_VALUE = 39;

	/**
	 * The '<em><b>Interactive UNIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interactive UNIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERACTIVE_UNIX
	 * @model name="InteractiveUNIX"
	 * @generated
	 * @ordered
	 */
	public static final int INTERACTIVE_UNIX_VALUE = 40;

	/**
	 * The '<em><b>BSDUNIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BSDUNIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BSDUNIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BSDUNIX_VALUE = 41;

	/**
	 * The '<em><b>Free BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Free BSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE_BSD
	 * @model name="FreeBSD"
	 * @generated
	 * @ordered
	 */
	public static final int FREE_BSD_VALUE = 42;

	/**
	 * The '<em><b>Net BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Net BSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NET_BSD
	 * @model name="NetBSD"
	 * @generated
	 * @ordered
	 */
	public static final int NET_BSD_VALUE = 43;

	/**
	 * The '<em><b>GNU Hurd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GNU Hurd</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GNU_HURD
	 * @model name="GNUHurd" literal="GNU Hurd"
	 * @generated
	 * @ordered
	 */
	public static final int GNU_HURD_VALUE = 44;

	/**
	 * The '<em><b>OS9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS9_VALUE = 45;

	/**
	 * The '<em><b>MACH Kernel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MACH Kernel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACH_KERNEL
	 * @model name="MACHKernel"
	 * @generated
	 * @ordered
	 */
	public static final int MACH_KERNEL_VALUE = 46;

	/**
	 * The '<em><b>Inferno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inferno</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFERNO
	 * @model name="Inferno"
	 * @generated
	 * @ordered
	 */
	public static final int INFERNO_VALUE = 47;

	/**
	 * The '<em><b>QNX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QNX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QNX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QNX_VALUE = 48;

	/**
	 * The '<em><b>Ix Works</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ix Works</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IX_WORKS
	 * @model name="IxWorks"
	 * @generated
	 * @ordered
	 */
	public static final int IX_WORKS_VALUE = 49;

	/**
	 * The '<em><b>Vx Works</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vx Works</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VX_WORKS
	 * @model name="VxWorks"
	 * @generated
	 * @ordered
	 */
	public static final int VX_WORKS_VALUE = 50;

	/**
	 * The '<em><b>Mi NT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mi NT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MI_NT
	 * @model name="MiNT"
	 * @generated
	 * @ordered
	 */
	public static final int MI_NT_VALUE = 51;

	/**
	 * The '<em><b>Be OS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Be OS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BE_OS
	 * @model name="BeOS"
	 * @generated
	 * @ordered
	 */
	public static final int BE_OS_VALUE = 52;

	/**
	 * The '<em><b>HPMPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HPMPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HPMPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HPMPE_VALUE = 53;

	/**
	 * The '<em><b>Next Step</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next Step</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_STEP
	 * @model name="NextStep"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_STEP_VALUE = 54;

	/**
	 * The '<em><b>Palm Pilot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Palm Pilot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PALM_PILOT
	 * @model name="PalmPilot"
	 * @generated
	 * @ordered
	 */
	public static final int PALM_PILOT_VALUE = 55;

	/**
	 * The '<em><b>Rhapsody</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rhapsody</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RHAPSODY
	 * @model name="Rhapsody"
	 * @generated
	 * @ordered
	 */
	public static final int RHAPSODY_VALUE = 56;

	/**
	 * The '<em><b>Windows2000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows2000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS2000
	 * @model name="Windows2000" literal="Windows 2000"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS2000_VALUE = 57;

	/**
	 * The '<em><b>Dedicated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dedicated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEDICATED
	 * @model name="Dedicated"
	 * @generated
	 * @ordered
	 */
	public static final int DEDICATED_VALUE = 58;

	/**
	 * The '<em><b>OS 390</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OS 390</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_390
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OS_390_VALUE = 59;

	/**
	 * The '<em><b>VSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VSE_VALUE = 60;

	/**
	 * The '<em><b>TPF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TPF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TPF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TPF_VALUE = 61;

	/**
	 * The '<em><b>Windows RMe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Windows RMe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_RME
	 * @model name="Windows_R_Me" literal="Windows (R) Me"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_RME_VALUE = 62;

	/**
	 * The '<em><b>Caldera Open UNIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caldera Open UNIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALDERA_OPEN_UNIX
	 * @model name="CalderaOpenUNIX" literal="Caldera Open UNIX"
	 * @generated
	 * @ordered
	 */
	public static final int CALDERA_OPEN_UNIX_VALUE = 63;

	/**
	 * The '<em><b>Open BSD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open BSD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_BSD
	 * @model name="OpenBSD"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_BSD_VALUE = 64;

	/**
	 * The '<em><b>Not Applicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Applicable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE
	 * @model name="NotApplicable" literal="Not Applicable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 65;

	/**
	 * An array of all the '<em><b>Enum Target OS Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumTargetOSTypes[] VALUES_ARRAY =
		new EnumTargetOSTypes[] {
			UNKNOWN,
			OTHER,
			MACOS,
			ATTUNIX,
			DGUX,
			DECNT,
			TRU64_UNIX,
			OPEN_VMS,
			HPUX,
			AIX,
			MVS,
			OS400,
			OS_2,
			JAVA_VM,
			MSDOS,
			WIN_3X,
			WIN95,
			WIN98,
			WINNT,
			WINCE,
			NCR3000,
			NET_WARE,
			OSF,
			DC_OS,
			RELIANT_UNIX,
			SCO_UNIX_WARE,
			SCO_OPEN_SERVER,
			SEQUENT,
			IRIX,
			SOLARIS,
			SUN_OS,
			U6000,
			ASERIES,
			HP_NON_STOP_OS,
			HP_NON_STOP_OSS,
			BS2000,
			LINUX,
			LYNX,
			XENIX,
			VM,
			INTERACTIVE_UNIX,
			BSDUNIX,
			FREE_BSD,
			NET_BSD,
			GNU_HURD,
			OS9,
			MACH_KERNEL,
			INFERNO,
			QNX,
			IX_WORKS,
			VX_WORKS,
			MI_NT,
			BE_OS,
			HPMPE,
			NEXT_STEP,
			PALM_PILOT,
			RHAPSODY,
			WINDOWS2000,
			DEDICATED,
			OS_390,
			VSE,
			TPF,
			WINDOWS_RME,
			CALDERA_OPEN_UNIX,
			OPEN_BSD,
			NOT_APPLICABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Target OS Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnumTargetOSTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Target OS Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumTargetOSTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumTargetOSTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Target OS Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumTargetOSTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumTargetOSTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Target OS Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumTargetOSTypes get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case OTHER_VALUE: return OTHER;
			case MACOS_VALUE: return MACOS;
			case ATTUNIX_VALUE: return ATTUNIX;
			case DGUX_VALUE: return DGUX;
			case DECNT_VALUE: return DECNT;
			case TRU64_UNIX_VALUE: return TRU64_UNIX;
			case OPEN_VMS_VALUE: return OPEN_VMS;
			case HPUX_VALUE: return HPUX;
			case AIX_VALUE: return AIX;
			case MVS_VALUE: return MVS;
			case OS400_VALUE: return OS400;
			case OS_2_VALUE: return OS_2;
			case JAVA_VM_VALUE: return JAVA_VM;
			case MSDOS_VALUE: return MSDOS;
			case WIN_3X_VALUE: return WIN_3X;
			case WIN95_VALUE: return WIN95;
			case WIN98_VALUE: return WIN98;
			case WINNT_VALUE: return WINNT;
			case WINCE_VALUE: return WINCE;
			case NCR3000_VALUE: return NCR3000;
			case NET_WARE_VALUE: return NET_WARE;
			case OSF_VALUE: return OSF;
			case DC_OS_VALUE: return DC_OS;
			case RELIANT_UNIX_VALUE: return RELIANT_UNIX;
			case SCO_UNIX_WARE_VALUE: return SCO_UNIX_WARE;
			case SCO_OPEN_SERVER_VALUE: return SCO_OPEN_SERVER;
			case SEQUENT_VALUE: return SEQUENT;
			case IRIX_VALUE: return IRIX;
			case SOLARIS_VALUE: return SOLARIS;
			case SUN_OS_VALUE: return SUN_OS;
			case U6000_VALUE: return U6000;
			case ASERIES_VALUE: return ASERIES;
			case HP_NON_STOP_OS_VALUE: return HP_NON_STOP_OS;
			case HP_NON_STOP_OSS_VALUE: return HP_NON_STOP_OSS;
			case BS2000_VALUE: return BS2000;
			case LINUX_VALUE: return LINUX;
			case LYNX_VALUE: return LYNX;
			case XENIX_VALUE: return XENIX;
			case VM_VALUE: return VM;
			case INTERACTIVE_UNIX_VALUE: return INTERACTIVE_UNIX;
			case BSDUNIX_VALUE: return BSDUNIX;
			case FREE_BSD_VALUE: return FREE_BSD;
			case NET_BSD_VALUE: return NET_BSD;
			case GNU_HURD_VALUE: return GNU_HURD;
			case OS9_VALUE: return OS9;
			case MACH_KERNEL_VALUE: return MACH_KERNEL;
			case INFERNO_VALUE: return INFERNO;
			case QNX_VALUE: return QNX;
			case IX_WORKS_VALUE: return IX_WORKS;
			case VX_WORKS_VALUE: return VX_WORKS;
			case MI_NT_VALUE: return MI_NT;
			case BE_OS_VALUE: return BE_OS;
			case HPMPE_VALUE: return HPMPE;
			case NEXT_STEP_VALUE: return NEXT_STEP;
			case PALM_PILOT_VALUE: return PALM_PILOT;
			case RHAPSODY_VALUE: return RHAPSODY;
			case WINDOWS2000_VALUE: return WINDOWS2000;
			case DEDICATED_VALUE: return DEDICATED;
			case OS_390_VALUE: return OS_390;
			case VSE_VALUE: return VSE;
			case TPF_VALUE: return TPF;
			case WINDOWS_RME_VALUE: return WINDOWS_RME;
			case CALDERA_OPEN_UNIX_VALUE: return CALDERA_OPEN_UNIX;
			case OPEN_BSD_VALUE: return OPEN_BSD;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumTargetOSTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EnumTargetOSTypes
