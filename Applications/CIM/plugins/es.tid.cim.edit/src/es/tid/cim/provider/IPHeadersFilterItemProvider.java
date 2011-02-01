/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package es.tid.cim.provider;



import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.tid.cim.CimPackage;
import es.tid.cim.IPHeadersFilter;

/**
 * This is the item provider adapter for a {@link es.tid.cim.IPHeadersFilter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IPHeadersFilterItemProvider
	extends FilterEntryBaseItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPHeadersFilterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHdrDestPortEndPropertyDescriptor(object);
			addHdrDestPortStartPropertyDescriptor(object);
			addHdrIPVersionPropertyDescriptor(object);
			addHdrProtocolIDPropertyDescriptor(object);
			addHdrSrcPortEndPropertyDescriptor(object);
			addHdrSrcPortStartPropertyDescriptor(object);
			addHdrDestAddressPropertyDescriptor(object);
			addHdrDestAddressEndOfRangePropertyDescriptor(object);
			addHdrDestMaskPropertyDescriptor(object);
			addHdrDSCPPropertyDescriptor(object);
			addHdrFlowLabelPropertyDescriptor(object);
			addHdrSrcAddressEndOfRangePropertyDescriptor(object);
			addHdrSrcMaskPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hdr Dest Port End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrDestPortEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrDestPortEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrDestPortEnd_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrDestPortEnd(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Dest Port Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrDestPortStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrDestPortStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrDestPortStart_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrDestPortStart(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr IP Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrIPVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrIPVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrIPVersion_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrIPVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Protocol ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrProtocolIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrProtocolID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrProtocolID_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrProtocolID(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Src Port End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrSrcPortEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrSrcPortEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrSrcPortEnd_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrSrcPortEnd(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Src Port Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrSrcPortStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrSrcPortStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrSrcPortStart_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrSrcPortStart(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Dest Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrDestAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrDestAddress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrDestAddress_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrDestAddress(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Dest Address End Of Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrDestAddressEndOfRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrDestAddressEndOfRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrDestAddressEndOfRange_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrDestAddressEndOfRange(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Dest Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrDestMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrDestMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrDestMask_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrDestMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr DSCP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrDSCPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrDSCP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrDSCP_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrDSCP(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Flow Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrFlowLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrFlowLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrFlowLabel_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrFlowLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Src Address End Of Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrSrcAddressEndOfRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrSrcAddressEndOfRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrSrcAddressEndOfRange_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrSrcAddressEndOfRange(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hdr Src Mask feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHdrSrcMaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPHeadersFilter_hdrSrcMask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPHeadersFilter_hdrSrcMask_feature", "_UI_IPHeadersFilter_type"),
				 CimPackage.eINSTANCE.getIPHeadersFilter_HdrSrcMask(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns IPHeadersFilter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IPHeadersFilter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IPHeadersFilter)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IPHeadersFilter_type") :
			getString("_UI_IPHeadersFilter_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(IPHeadersFilter.class)) {
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_END:
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_PORT_START:
			case CimPackage.IP_HEADERS_FILTER__HDR_IP_VERSION:
			case CimPackage.IP_HEADERS_FILTER__HDR_PROTOCOL_ID:
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_END:
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_PORT_START:
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS:
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_ADDRESS_END_OF_RANGE:
			case CimPackage.IP_HEADERS_FILTER__HDR_DEST_MASK:
			case CimPackage.IP_HEADERS_FILTER__HDR_DSCP:
			case CimPackage.IP_HEADERS_FILTER__HDR_FLOW_LABEL:
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_ADDRESS_END_OF_RANGE:
			case CimPackage.IP_HEADERS_FILTER__HDR_SRC_MASK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
