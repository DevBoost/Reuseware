package es.tid.cim.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IEditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import es.tid.cim.AFService;
import es.tid.cim.Action;
import es.tid.cim.AdminDomain;
import es.tid.cim.AdministrativeDistance;
import es.tid.cim.AutonomousSystem;
import es.tid.cim.BGPCluster;
import es.tid.cim.BGPPeerGroup;
import es.tid.cim.BGPService;
import es.tid.cim.CIM_Model;
import es.tid.cim.Capabilities;
import es.tid.cim.Check;
import es.tid.cim.Collection;
import es.tid.cim.ComputerSystem;
import es.tid.cim.ConditioningService;
import es.tid.cim.DirectorySpecification;
import es.tid.cim.ElementSettingData;
import es.tid.cim.ElementSoftwareIdentity;
import es.tid.cim.EnabledLogicalElement;
import es.tid.cim.FileSpecification;
import es.tid.cim.FilterList;
import es.tid.cim.ForwardingService;
import es.tid.cim.IPRoute;
import es.tid.cim.InstalledProduct;
import es.tid.cim.LANEndpoint;
import es.tid.cim.LANSegment;
import es.tid.cim.LogicalDevice;
import es.tid.cim.LogicalModule;
import es.tid.cim.LogicalNetwork;
import es.tid.cim.LogicalPort;
import es.tid.cim.ManagedElement;
import es.tid.cim.ManagedSystemElement;
import es.tid.cim.NATListBasedSettings;
import es.tid.cim.NATService;
import es.tid.cim.NetworkPort;
import es.tid.cim.NextHopRoute;
import es.tid.cim.NextHopRouting;
import es.tid.cim.OperatingSystem;
import es.tid.cim.Product;
import es.tid.cim.ProtocolEndpoint;
import es.tid.cim.QoSService;
import es.tid.cim.RangeOfIPAddresses;
import es.tid.cim.RemoteServiceAccessPoint;
import es.tid.cim.Role;
import es.tid.cim.RouteCalculationService;
import es.tid.cim.RoutingPolicy;
import es.tid.cim.RoutingProtocolDomain;
import es.tid.cim.SNMPService;
import es.tid.cim.Service;
import es.tid.cim.ServiceAccessPoint;
import es.tid.cim.SettingData;
import es.tid.cim.SoftwareElement;
import es.tid.cim.SoftwareFeature;
import es.tid.cim.SoftwareIdentity;
import es.tid.cim.StatusDescription;
import es.tid.cim.System;
import es.tid.cim.SystemSpecificCollection;
import es.tid.cim.diagram.edit.helpers.CIMLevelZeroBaseEditHelper;
import es.tid.cim.diagram.part.CIMLevelZeroVisualIDRegistry;

/**
 * @generated
 */
public class CIMLevelZeroBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(CIMLevelZeroVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Object editHelperContext = completedRequest.getEditHelperContext();
		if (editHelperContext instanceof View
				|| (editHelperContext instanceof IEditHelperContext && ((IEditHelperContext) editHelperContext)
						.getEObject() instanceof View)) {
			// no semantic commands are provided for pure design elements
			return null;
		}
		if (editHelperContext == null) {
			editHelperContext = ViewUtil
					.resolveSemanticElement((View) getHost().getModel());
		}
		IElementType elementType = ElementTypeRegistry.getInstance()
				.getElementType(editHelperContext);
		if (elementType == ElementTypeRegistry.getInstance().getType(
				"org.eclipse.gmf.runtime.emf.type.core.default")) { //$NON-NLS-1$ 
			elementType = null;
		}
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		if (elementType != null) {
			if (semanticCommand != null) {
				ICommand command = semanticCommand instanceof ICommandProxy ? ((ICommandProxy) semanticCommand)
						.getICommand()
						: new CommandProxy(semanticCommand);
				completedRequest
						.setParameter(
								CIMLevelZeroBaseEditHelper.EDIT_POLICY_COMMAND,
								command);
			}
			ICommand command = elementType.getEditCommand(completedRequest);
			if (command != null) {
				if (!(command instanceof CompositeTransactionalCommand)) {
					TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
							.getEditingDomain();
					command = new CompositeTransactionalCommand(editingDomain,
							command.getLabel()).compose(command);
				}
				semanticCommand = new ICommandProxy(command);
			}
		}
		boolean shouldProceed = true;
		if (completedRequest instanceof DestroyRequest) {
			shouldProceed = shouldProceed((DestroyRequest) completedRequest);
		}
		if (shouldProceed) {
			if (completedRequest instanceof DestroyRequest) {
				TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
						.getEditingDomain();
				Command deleteViewCommand = new ICommandProxy(
						new DeleteCommand(editingDomain, (View) getHost()
								.getModel()));
				semanticCommand = semanticCommand == null ? deleteViewCommand
						: semanticCommand.chain(deleteViewCommand);
			}
			return semanticCommand;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * @deprecated use getGEFWrapper() instead
	 * @generated
	 */
	protected final Command getMSLWrapper(ICommand cmd) {
		// XXX deprecated: use getGEFWrapper() instead
		return getGEFWrapper(cmd);
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement() {
		return ViewUtil.resolveSemanticElement((View) getHost().getModel());
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Creates command to destroy the link.
	 * 
	 * @generated
	 */
	protected Command getDestroyElementCommand(View view) {
		EditPart editPart = (EditPart) getHost().getViewer()
				.getEditPartRegistry().get(view);
		DestroyElementRequest request = new DestroyElementRequest(
				getEditingDomain(), false);
		return editPart.getCommand(new EditCommandRequestWrapper(request,
				Collections.EMPTY_MAP));
	}

	/**
	 * Creates commands to destroy all host incoming and outgoing links.
	 * 
	 * @generated
	 */
	protected CompoundCommand getDestroyEdgesCommand() {
		CompoundCommand cmd = new CompoundCommand();
		View view = (View) getHost().getModel();
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		return cmd;
	}

	/**
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(CompoundCommand command) {
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return;
		}
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			command.add(getDestroyElementCommand(nextView));
		}
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		public static boolean canCreateDirectorySpecificationDirectorySpecificationFiles_4001(
				DirectorySpecification source, FileSpecification target) {
			if (source != null) {
				if (source.getDirectorySpecificationFiles().contains(target)) {
					return false;
				}
			}
			return canExistDirectorySpecificationDirectorySpecificationFiles_4001(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateOperatingSystemOperatingSystemSoftwareFeature_4002(
				OperatingSystem source, SoftwareFeature target) {
			if (source != null) {
				if (source.getOperatingSystemSoftwareFeature().contains(target)) {
					return false;
				}
			}
			return canExistOperatingSystemOperatingSystemSoftwareFeature_4002(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSoftwareElementSoftwareElementActions_4003(
				SoftwareElement source, Action target) {
			if (source != null) {
				if (source.getSoftwareElementActions().contains(target)) {
					return false;
				}
			}
			return canExistSoftwareElementSoftwareElementActions_4003(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSoftwareElementSoftwareElementChecks_4004(
				SoftwareElement source, Check target) {
			if (source != null) {
				if (source.getSoftwareElementChecks().contains(target)) {
					return false;
				}
			}
			return canExistSoftwareElementSoftwareElementChecks_4004(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateInstalledProductSoftwareElements_4005(
				InstalledProduct source, SoftwareElement target) {
			if (source != null) {
				if (source.getSoftwareElements().contains(target)) {
					return false;
				}
			}
			return canExistInstalledProductSoftwareElements_4005(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBGPServiceBGPPeerGroupServices_4006(
				BGPService source, BGPPeerGroup target) {
			if (source != null) {
				if (source.getBGPPeerGroupServices().contains(target)) {
					return false;
				}
			}
			return canExistBGPServiceBGPPeerGroupServices_4006(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBGPClusterReflectorClientService_4007(
				BGPCluster source, BGPService target) {
			if (source != null) {
				if (source.getReflectorClientService().contains(target)) {
					return false;
				}
			}
			return canExistBGPClusterReflectorClientService_4007(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBGPClusterReflectorNonClientService_4008(
				BGPCluster source, BGPService target) {
			if (source != null) {
				if (source.getReflectorNonClientService().contains(target)) {
					return false;
				}
			}
			return canExistBGPClusterReflectorNonClientService_4008(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBGPClusterReflectorService_4009(
				BGPCluster source, BGPService target) {
			if (source != null) {
				if (source.getReflectorService().contains(target)) {
					return false;
				}
			}
			return canExistBGPClusterReflectorService_4009(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceAccessPointBindsTo_4010(
				ServiceAccessPoint source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getBindsTo().contains(target)) {
					return false;
				}
			}
			return canExistServiceAccessPointBindsTo_4010(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateManagedElementComponents_4011(
				ManagedElement source, ManagedElement target) {
			if (source != null) {
				if (source.getComponents().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistManagedElementComponents_4011(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAdminDomainContainedDomain_4012(
				AdminDomain source, AdminDomain target) {
			if (source != null) {
				if (source.getContainedDomain().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistAdminDomainContainedDomain_4012(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateManagedElementDependencies_4013(
				ManagedElement source, ManagedElement target) {
			if (source != null) {
				if (source.getDependencies().contains(target)) {
					return false;
				}
			}
			return canExistManagedElementDependencies_4013(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalDeviceDeviceConnection_4014(
				LogicalDevice source, LogicalDevice target) {
			if (source != null) {
				if (source.getDeviceConnection().contains(target)) {
					return false;
				}
			}
			return canExistLogicalDeviceDeviceConnection_4014(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalDeviceDeviceIdentity_4015(
				LogicalDevice source, LogicalDevice target) {
			if (source != null) {
				if (source.getDeviceIdentity() != null) {
					return false;
				}
			}
			return canExistLogicalDeviceDeviceIdentity_4015(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalDeviceDeviceSAPImplementation_4016(
				LogicalDevice source, ServiceAccessPoint target) {
			if (source != null) {
				if (source.getDeviceSAPImplementation().contains(target)) {
					return false;
				}
			}
			return canExistLogicalDeviceDeviceSAPImplementation_4016(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateManagedElementElementCapabilities_4017(
				ManagedElement source, Capabilities target) {
			if (source != null) {
				if (source.getElementCapabilities().contains(target)) {
					return false;
				}
			}
			return canExistManagedElementElementCapabilities_4017(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateManagedElementElementSettingData_4018(
				ManagedElement source, ElementSettingData target) {
			if (source != null) {
				if (source.getElementSettingData().contains(target)) {
					return false;
				}
			}
			return canExistManagedElementElementSettingData_4018(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSoftwareIdentityElementSoftwareIdentity_4019(
				SoftwareIdentity source, ElementSoftwareIdentity target) {
			if (source != null) {
				if (source.getElementSoftwareIdentity() != null) {
					return false;
				}
			}
			return canExistSoftwareIdentityElementSoftwareIdentity_4019(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemHostedAccessPoint_4020(
				System source, ServiceAccessPoint target) {
			if (source != null) {
				if (source.getHostedAccessPoint().contains(target)) {
					return false;
				}
			}
			return canExistSystemHostedAccessPoint_4020(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemHostedCollection_4021(
				System source, SystemSpecificCollection target) {
			if (source != null) {
				if (source.getHostedCollection().contains(target)) {
					return false;
				}
			}
			return canExistSystemHostedCollection_4021(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateManagedElementHostedDependency_4022(
				ManagedElement source, ManagedElement target) {
			if (source != null) {
				if (source.getHostedDependency().contains(target)) {
					return false;
				}
			}
			return canExistManagedElementHostedDependency_4022(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemHostedServices_4023(System source,
				Service target) {
			if (source != null) {
				if (source.getHostedServices().contains(target)) {
					return false;
				}
			}
			return canExistSystemHostedServices_4023(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateElementSoftwareIdentityManagedElement_4024(
				ElementSoftwareIdentity source, ManagedElement target) {
			if (source != null) {
				if (source.getManagedElement() != null) {
					return false;
				}
			}
			return canExistElementSoftwareIdentityManagedElement_4024(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProductProductProductDependency_4025(
				Product source, Product target) {
			if (source != null) {
				if (source.getProductProductDependency().contains(target)) {
					return false;
				}
			}
			return canExistProductProductProductDependency_4025(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProductProductServiceComponent_4026(
				Product source, Service target) {
			if (source != null) {
				if (source.getProductServiceComponent().contains(target)) {
					return false;
				}
			}
			return canExistProductProductServiceComponent_4026(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateEnabledLogicalElementRemoteAccessAvailableToElement_4027(
				EnabledLogicalElement source, RemoteServiceAccessPoint target) {
			if (source != null) {
				if (source.getRemoteAccessAvailableToElement().contains(target)) {
					return false;
				}
			}
			return canExistEnabledLogicalElementRemoteAccessAvailableToElement_4027(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemRoles_4028(System source,
				Role target) {
			if (source != null) {
				if (source.getRoles().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistSystemRoles_4028(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceAccessPointSAPSAPDependency_4029(
				ServiceAccessPoint source, ServiceAccessPoint target) {
			if (source != null) {
				if (source.getSAPSAPDependency().contains(target)) {
					return false;
				}
			}
			return canExistServiceAccessPointSAPSAPDependency_4029(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceServiceAccessBySAP_4030(
				Service source, ServiceAccessPoint target) {
			if (source != null) {
				if (source.getServiceAccessBySAP().contains(target)) {
					return false;
				}
			}
			return canExistServiceServiceAccessBySAP_4030(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceServiceComponents_4031(
				Service source, Service target) {
			if (source != null) {
				if (source.getServiceComponents().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistServiceServiceComponents_4031(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceServiceServiceDependency_4032(
				Service source, Service target) {
			if (source != null) {
				if (source.getServiceServiceDependency().contains(target)) {
					return false;
				}
			}
			return canExistServiceServiceServiceDependency_4032(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateElementSettingDataSettingData_4033(
				ElementSettingData source, SettingData target) {
			if (source != null) {
				if (source.getSettingData() != null) {
					return false;
				}
			}
			return canExistElementSettingDataSettingData_4033(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSettingDataSettingsDefineCapabilities_4034(
				SettingData source, Capabilities target) {
			if (source != null) {
				if (source.getSettingsDefineCapabilities().contains(target)) {
					return false;
				}
			}
			return canExistSettingDataSettingsDefineCapabilities_4034(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateManagedSystemElementStatusDescriptions_4035(
				ManagedSystemElement source, StatusDescription target) {
			if (source != null) {
				if (source.getStatusDescriptions().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistManagedSystemElementStatusDescriptions_4035(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemSystemComponents_4036(
				System source, ManagedElement target) {
			if (source != null) {
				if (source.getSystemComponents().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistSystemSystemComponents_4036(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemSystemDevices_4037(System source,
				LogicalDevice target) {
			if (source != null) {
				if (source.getSystemDevices().contains(target)) {
					return false;
				}
			}
			return canExistSystemSystemDevices_4037(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalModuleModulePort_4038(
				LogicalModule source, NetworkPort target) {
			if (source != null) {
				if (source.getModulePort().contains(target)) {
					return false;
				}
			}
			return canExistLogicalModuleModulePort_4038(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAFServiceAFRelatedServices_4039(
				AFService source, AFService target) {
			if (source != null) {
				if (source.getAFRelatedServices().contains(target)) {
					return false;
				}
			}
			return canExistAFServiceAFRelatedServices_4039(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateQoSServiceQoSConditioningSubService_4040(
				QoSService source, ConditioningService target) {
			if (source != null) {
				if (source.getQoSConditioningSubService().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistQoSServiceQoSConditioningSubService_4040(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateQoSServiceQoSSubService_4041(
				QoSService source, QoSService target) {
			if (source != null) {
				if (source.getQoSSubService().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistQoSServiceQoSSubService_4041(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCollectionMembers_4042(
				Collection source, ManagedElement target) {
			if (source != null) {
				if (source.getMembers().contains(target)) {
					return false;
				}
			}
			return canExistCollectionMembers_4042(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateNATListBasedSettingsAddressesToBeTranslated_4043(
				NATListBasedSettings source, FilterList target) {
			if (source != null) {
				if (source.getAddressesToBeTranslated() != null) {
					return false;
				}
			}
			return canExistNATListBasedSettingsAddressesToBeTranslated_4043(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBGPServiceBGPAdminDistance_4044(
				BGPService source, AdministrativeDistance target) {
			if (source != null) {
				if (source.getBGPAdminDistance() != null) {
					return false;
				}
			}
			return canExistBGPServiceBGPAdminDistance_4044(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceAccessPointBindsToLANEndpoint_4045(
				ServiceAccessPoint source, LANEndpoint target) {
			if (source != null) {
				if (source.getBindsToLANEndpoint().contains(target)) {
					return false;
				}
			}
			return canExistServiceAccessPointBindsToLANEndpoint_4045(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRouteCalculationServiceCalculatesAmong_4046(
				RouteCalculationService source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getCalculatesAmong().contains(target)) {
					return false;
				}
			}
			return canExistRouteCalculationServiceCalculatesAmong_4046(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProtocolEndpointEgressConditioningServiceOnEndpoint_4047(
				ProtocolEndpoint source, ConditioningService target) {
			if (source != null) {
				if (source.getEgressConditioningServiceOnEndpoint().contains(
						target)) {
					return false;
				}
			}
			return canExistProtocolEndpointEgressConditioningServiceOnEndpoint_4047(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCIM_ModelElements_4048(CIM_Model source,
				ManagedElement target) {
			if (source != null) {
				if (source.getElements().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistCIM_ModelElements_4048(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateForwardingServiceForwardedRoutes_4049(
				ForwardingService source, IPRoute target) {
			if (source != null) {
				if (source.getForwardedRoutes().contains(target)) {
					return false;
				}
			}
			return canExistForwardingServiceForwardedRoutes_4049(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateForwardingServiceForwardsAmong_4050(
				ForwardingService source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getForwardsAmong().contains(target)) {
					return false;
				}
			}
			return canExistForwardingServiceForwardsAmong_4050(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateComputerSystemHostedFilterList_4051(
				ComputerSystem source, FilterList target) {
			if (source != null) {
				if (source.getHostedFilterList().contains(target)) {
					return false;
				}
			}
			return canExistComputerSystemHostedFilterList_4051(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateComputerSystemHostedForwardingServices_4052(
				ComputerSystem source, ForwardingService target) {
			if (source != null) {
				if (source.getHostedForwardingServices().contains(target)) {
					return false;
				}
			}
			return canExistComputerSystemHostedForwardingServices_4052(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSystemHostedRoute_4053(System source,
				NextHopRoute target) {
			if (source != null) {
				if (source.getHostedRoute().contains(target)) {
					return false;
				}
			}
			return canExistSystemHostedRoute_4053(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateComputerSystemHostedRoutingPolicy_4054(
				ComputerSystem source, RoutingPolicy target) {
			if (source != null) {
				if (source.getHostedRoutingPolicy().contains(target)) {
					return false;
				}
			}
			return canExistComputerSystemHostedRoutingPolicy_4054(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateProtocolEndpointIngressConditioningServiceOnEndpoint_4055(
				ProtocolEndpoint source, ConditioningService target) {
			if (source != null) {
				if (source.getIngressConditioningServiceOnEndpoint().contains(
						target)) {
					return false;
				}
			}
			return canExistProtocolEndpointIngressConditioningServiceOnEndpoint_4055(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalNetworkInLogicalNetwork_4056(
				LogicalNetwork source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getInLogicalNetwork().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistLogicalNetworkInLogicalNetwork_4056(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLANSegmentInSegment_4057(
				LANSegment source, LANEndpoint target) {
			if (source != null) {
				if (source.getInSegment().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistLANSegmentInSegment_4057(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateNATServiceNATServiceRunningOnEndpoint_4058(
				NATService source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getNATServiceRunningOnEndpoint().contains(target)) {
					return false;
				}
			}
			return canExistNATServiceNATServiceRunningOnEndpoint_4058(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAdminDomainNetworksInAdminDomain_4059(
				AdminDomain source, LogicalNetwork target) {
			if (source != null) {
				if (source.getNetworksInAdminDomain().contains(target)) {
					return false;
				}
			}
			return canExistAdminDomainNetworksInAdminDomain_4059(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalPortPortImplementsEndPoint_4060(
				LogicalPort source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getPortImplementsEndPoint().contains(target)) {
					return false;
				}
			}
			return canExistLogicalPortPortImplementsEndPoint_4060(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateLogicalDevicePortOnDevice_4061(
				LogicalDevice source, LogicalPort target) {
			if (source != null) {
				if (source.getPortOnDevice().contains(target)) {
					return false;
				}
			}
			return canExistLogicalDevicePortOnDevice_4061(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateForwardingServiceRouteForwardedByService_4062(
				ForwardingService source, NextHopRouting target) {
			if (source != null) {
				if (source.getRouteForwardedByService().contains(target)) {
					return false;
				}
			}
			return canExistForwardingServiceRouteForwardedByService_4062(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAutonomousSystemRouterInAS_4063(
				AutonomousSystem source, ComputerSystem target) {
			if (source != null) {
				if (source.getRouterInAS().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistAutonomousSystemRouterInAS_4063(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBGPClusterRoutersInBGPCluster_4064(
				BGPCluster source, ComputerSystem target) {
			if (source != null) {
				if (source.getRoutersInBGPCluster().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistBGPClusterRoutersInBGPCluster_4064(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateNextHopRouteRouteUsesEndpoint_4065(
				NextHopRoute source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getRouteUsesEndpoint() != null) {
					return false;
				}
			}
			return canExistNextHopRouteRouteUsesEndpoint_4065(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAutonomousSystemRoutingProtocolDomainInAS_4066(
				AutonomousSystem source, RoutingProtocolDomain target) {
			if (source != null) {
				if (source.getRoutingProtocolDomainInAS().contains(target)) {
					return false;
				}
				if (source == target) {
					return false;
				}
			}
			return canExistAutonomousSystemRoutingProtocolDomainInAS_4066(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateComputerSystemRunningOS_4067(
				ComputerSystem source, OperatingSystem target) {
			if (source != null) {
				if (source.getRunningOS() != null) {
					return false;
				}
			}
			return canExistComputerSystemRunningOS_4067(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateServiceSoftwareFeatureServiceImplementation_4068(
				Service source, SoftwareFeature target) {
			if (source != null) {
				if (source.getSoftwareFeatureServiceImplementation().contains(
						target)) {
					return false;
				}
			}
			return canExistServiceSoftwareFeatureServiceImplementation_4068(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateNATListBasedSettingsTranslationPoolForNAT_4069(
				NATListBasedSettings source, RangeOfIPAddresses target) {
			if (source != null) {
				if (source.getTranslationPoolForNAT() != null) {
					return false;
				}
			}
			return canExistNATListBasedSettingsTranslationPoolForNAT_4069(
					source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSNMPServiceTrapSourceForSNMPService_4070(
				SNMPService source, ProtocolEndpoint target) {
			if (source != null) {
				if (source.getTrapSourceForSNMPService() != null) {
					return false;
				}
			}
			return canExistSNMPServiceTrapSourceForSNMPService_4070(source,
					target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateNextHopRouteAssociatedNextHop_4071(
				NextHopRoute source, RemoteServiceAccessPoint target) {
			if (source != null) {
				if (source.getAssociatedNextHop() != null) {
					return false;
				}
			}
			return canExistNextHopRouteAssociatedNextHop_4071(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistDirectorySpecificationDirectorySpecificationFiles_4001(
				DirectorySpecification source, FileSpecification target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistOperatingSystemOperatingSystemSoftwareFeature_4002(
				OperatingSystem source, SoftwareFeature target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSoftwareElementSoftwareElementActions_4003(
				SoftwareElement source, Action target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSoftwareElementSoftwareElementChecks_4004(
				SoftwareElement source, Check target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistInstalledProductSoftwareElements_4005(
				InstalledProduct source, SoftwareElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBGPServiceBGPPeerGroupServices_4006(
				BGPService source, BGPPeerGroup target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBGPClusterReflectorClientService_4007(
				BGPCluster source, BGPService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBGPClusterReflectorNonClientService_4008(
				BGPCluster source, BGPService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBGPClusterReflectorService_4009(
				BGPCluster source, BGPService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceAccessPointBindsTo_4010(
				ServiceAccessPoint source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistManagedElementComponents_4011(
				ManagedElement source, ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAdminDomainContainedDomain_4012(
				AdminDomain source, AdminDomain target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistManagedElementDependencies_4013(
				ManagedElement source, ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalDeviceDeviceConnection_4014(
				LogicalDevice source, LogicalDevice target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalDeviceDeviceIdentity_4015(
				LogicalDevice source, LogicalDevice target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalDeviceDeviceSAPImplementation_4016(
				LogicalDevice source, ServiceAccessPoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistManagedElementElementCapabilities_4017(
				ManagedElement source, Capabilities target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistManagedElementElementSettingData_4018(
				ManagedElement source, ElementSettingData target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSoftwareIdentityElementSoftwareIdentity_4019(
				SoftwareIdentity source, ElementSoftwareIdentity target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemHostedAccessPoint_4020(
				System source, ServiceAccessPoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemHostedCollection_4021(
				System source, SystemSpecificCollection target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistManagedElementHostedDependency_4022(
				ManagedElement source, ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemHostedServices_4023(System source,
				Service target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistElementSoftwareIdentityManagedElement_4024(
				ElementSoftwareIdentity source, ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProductProductProductDependency_4025(
				Product source, Product target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProductProductServiceComponent_4026(
				Product source, Service target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistEnabledLogicalElementRemoteAccessAvailableToElement_4027(
				EnabledLogicalElement source, RemoteServiceAccessPoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemRoles_4028(System source,
				Role target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceAccessPointSAPSAPDependency_4029(
				ServiceAccessPoint source, ServiceAccessPoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceServiceAccessBySAP_4030(
				Service source, ServiceAccessPoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceServiceComponents_4031(
				Service source, Service target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceServiceServiceDependency_4032(
				Service source, Service target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistElementSettingDataSettingData_4033(
				ElementSettingData source, SettingData target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSettingDataSettingsDefineCapabilities_4034(
				SettingData source, Capabilities target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistManagedSystemElementStatusDescriptions_4035(
				ManagedSystemElement source, StatusDescription target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemSystemComponents_4036(
				System source, ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemSystemDevices_4037(System source,
				LogicalDevice target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalModuleModulePort_4038(
				LogicalModule source, NetworkPort target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAFServiceAFRelatedServices_4039(
				AFService source, AFService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistQoSServiceQoSConditioningSubService_4040(
				QoSService source, ConditioningService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistQoSServiceQoSSubService_4041(
				QoSService source, QoSService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCollectionMembers_4042(Collection source,
				ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistNATListBasedSettingsAddressesToBeTranslated_4043(
				NATListBasedSettings source, FilterList target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBGPServiceBGPAdminDistance_4044(
				BGPService source, AdministrativeDistance target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceAccessPointBindsToLANEndpoint_4045(
				ServiceAccessPoint source, LANEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRouteCalculationServiceCalculatesAmong_4046(
				RouteCalculationService source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProtocolEndpointEgressConditioningServiceOnEndpoint_4047(
				ProtocolEndpoint source, ConditioningService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCIM_ModelElements_4048(CIM_Model source,
				ManagedElement target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistForwardingServiceForwardedRoutes_4049(
				ForwardingService source, IPRoute target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistForwardingServiceForwardsAmong_4050(
				ForwardingService source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistComputerSystemHostedFilterList_4051(
				ComputerSystem source, FilterList target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistComputerSystemHostedForwardingServices_4052(
				ComputerSystem source, ForwardingService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSystemHostedRoute_4053(System source,
				NextHopRoute target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistComputerSystemHostedRoutingPolicy_4054(
				ComputerSystem source, RoutingPolicy target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProtocolEndpointIngressConditioningServiceOnEndpoint_4055(
				ProtocolEndpoint source, ConditioningService target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalNetworkInLogicalNetwork_4056(
				LogicalNetwork source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLANSegmentInSegment_4057(
				LANSegment source, LANEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistNATServiceNATServiceRunningOnEndpoint_4058(
				NATService source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAdminDomainNetworksInAdminDomain_4059(
				AdminDomain source, LogicalNetwork target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalPortPortImplementsEndPoint_4060(
				LogicalPort source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistLogicalDevicePortOnDevice_4061(
				LogicalDevice source, LogicalPort target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistForwardingServiceRouteForwardedByService_4062(
				ForwardingService source, NextHopRouting target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAutonomousSystemRouterInAS_4063(
				AutonomousSystem source, ComputerSystem target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBGPClusterRoutersInBGPCluster_4064(
				BGPCluster source, ComputerSystem target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistNextHopRouteRouteUsesEndpoint_4065(
				NextHopRoute source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAutonomousSystemRoutingProtocolDomainInAS_4066(
				AutonomousSystem source, RoutingProtocolDomain target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistComputerSystemRunningOS_4067(
				ComputerSystem source, OperatingSystem target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistServiceSoftwareFeatureServiceImplementation_4068(
				Service source, SoftwareFeature target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistNATListBasedSettingsTranslationPoolForNAT_4069(
				NATListBasedSettings source, RangeOfIPAddresses target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSNMPServiceTrapSourceForSNMPService_4070(
				SNMPService source, ProtocolEndpoint target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistNextHopRouteAssociatedNextHop_4071(
				NextHopRoute source, RemoteServiceAccessPoint target) {

			return true;
		}
	}

}
