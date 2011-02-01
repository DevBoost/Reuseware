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
import es.tid.cim.RemoteServiceAccessPoint;

/**
 * This is the item provider adapter for a {@link es.tid.cim.RemoteServiceAccessPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoteServiceAccessPointItemProvider
	extends ServiceAccessPointItemProvider
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
	public RemoteServiceAccessPointItemProvider(AdapterFactory adapterFactory) {
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

			addAccessInfoPropertyDescriptor(object);
			addAccessContextPropertyDescriptor(object);
			addInfoFormatPropertyDescriptor(object);
			addOtherAccessContextPropertyDescriptor(object);
			addOtherInfoFormatDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Access Info feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessInfoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteServiceAccessPoint_accessInfo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteServiceAccessPoint_accessInfo_feature", "_UI_RemoteServiceAccessPoint_type"),
				 CimPackage.eINSTANCE.getRemoteServiceAccessPoint_AccessInfo(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteServiceAccessPoint_accessContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteServiceAccessPoint_accessContext_feature", "_UI_RemoteServiceAccessPoint_type"),
				 CimPackage.eINSTANCE.getRemoteServiceAccessPoint_AccessContext(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Info Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfoFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteServiceAccessPoint_infoFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteServiceAccessPoint_infoFormat_feature", "_UI_RemoteServiceAccessPoint_type"),
				 CimPackage.eINSTANCE.getRemoteServiceAccessPoint_InfoFormat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Access Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherAccessContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteServiceAccessPoint_otherAccessContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteServiceAccessPoint_otherAccessContext_feature", "_UI_RemoteServiceAccessPoint_type"),
				 CimPackage.eINSTANCE.getRemoteServiceAccessPoint_OtherAccessContext(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Other Info Format Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherInfoFormatDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoteServiceAccessPoint_otherInfoFormatDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoteServiceAccessPoint_otherInfoFormatDescription_feature", "_UI_RemoteServiceAccessPoint_type"),
				 CimPackage.eINSTANCE.getRemoteServiceAccessPoint_OtherInfoFormatDescription(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RemoteServiceAccessPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoteServiceAccessPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RemoteServiceAccessPoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RemoteServiceAccessPoint_type") :
			getString("_UI_RemoteServiceAccessPoint_type") + " " + label;
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

		switch (notification.getFeatureID(RemoteServiceAccessPoint.class)) {
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_INFO:
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__ACCESS_CONTEXT:
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__INFO_FORMAT:
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_ACCESS_CONTEXT:
			case CimPackage.REMOTE_SERVICE_ACCESS_POINT__OTHER_INFO_FORMAT_DESCRIPTION:
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
