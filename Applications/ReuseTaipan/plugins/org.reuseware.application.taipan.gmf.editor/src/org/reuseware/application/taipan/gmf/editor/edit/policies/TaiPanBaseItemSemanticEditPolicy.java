/*******************************************************************************
 * Copyright (c) 2006-2012
 * Software Technology Group, Dresden University of Technology
 * DevBoost GmbH, Berlin, Amtsgericht Charlottenburg, HRB 140026
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany;
 *   DevBoost GmbH - Berlin, Germany
 *      - initial API and implementation
 ******************************************************************************/
/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.reuseware.application.taipan.gmf.editor.edit.policies;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

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
import org.reuseware.application.taipan.Aquatory;
import org.reuseware.application.taipan.DestinationType;
import org.reuseware.application.taipan.Port;
import org.reuseware.application.taipan.PortType;
import org.reuseware.application.taipan.RouteType;
import org.reuseware.application.taipan.Ship;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.Warship;
import org.reuseware.application.taipan.gmf.editor.edit.helpers.TaiPanBaseEditHelper;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanAbstractExpression;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanOCLFactory;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanDiagramEditorPlugin;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry;

/**
 * @generated
 */
public class TaiPanBaseItemSemanticEditPolicy extends SemanticEditPolicy {

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
				Integer id = new Integer(TaiPanVisualIDRegistry
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
				completedRequest.setParameter(
						TaiPanBaseEditHelper.EDIT_POLICY_COMMAND, command);
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
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$
		/**
		 * @generated
		 */
		private static TaiPanAbstractExpression BesiegePortOrder_4005_SourceExpression;
		/**
		 * @generated
		 */
		private static TaiPanAbstractExpression EscortShipsOrder_4006_SourceExpression;
		/**
		 * @generated
		 */
		private static TaiPanAbstractExpression EscortShipsOrder_4006_TargetExpression;

		/**
		 * @generated
		 */
		public static boolean canCreateShipDestination_4001(Ship source,
				PortType target) {
			if (source != null) {
				if (source.getDestination() != null) {
					return false;
				}
			}
			return canExistShipDestination_4001(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRoute_4002(Aquatory container,
				DestinationType source, DestinationType target) {
			return canExistRoute_4002(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateRoute_4003(Aquatory container,
				DestinationType source, DestinationType target) {
			return canExistRoute_4003(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateShipRoute_4004(Ship source,
				RouteType target) {
			if (source != null) {
				if (source.getRoute() != null) {
					return false;
				}
			}
			return canExistShipRoute_4004(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateBesiegePortOrder_4005(Warship source,
				PortType target) {
			return canExistBesiegePortOrder_4005(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateEscortShipsOrder_4006(Warship source,
				Ship target) {
			if (source != null) {
				if (source.getEscortOrder() != null) {
					return false;
				}
			}
			return canExistEscortShipsOrder_4006(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePortRegister_4007(Port source,
				Ship target) {
			if (source != null) {
				if (source.getRegister().contains(target)) {
					return false;
				}
			}
			return canExistPortRegister_4007(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistShipDestination_4001(Ship source,
				PortType target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRoute_4002(Aquatory container,
				DestinationType source, DestinationType target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRoute_4003(Aquatory container,
				DestinationType source, DestinationType target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistShipRoute_4004(Ship source,
				RouteType target) {

			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistBesiegePortOrder_4005(Warship source,
				PortType target) {
			try {
				if (source == null) {
					return true;
				}
				if (BesiegePortOrder_4005_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaiPanPackage.eINSTANCE.getPortType());
					BesiegePortOrder_4005_SourceExpression = TaiPanOCLFactory
							.getExpression(
									"self.attackOrders->select(order | order.port = oppositeEnd)->isEmpty()", TaiPanPackage.eINSTANCE.getWarship(), env); //$NON-NLS-1$
				}
				Object sourceVal = BesiegePortOrder_4005_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaiPanDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistEscortShipsOrder_4006(Warship source,
				Ship target) {
			try {
				if (source == null) {
					return true;
				}
				if (EscortShipsOrder_4006_SourceExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaiPanPackage.eINSTANCE.getShip());
					EscortShipsOrder_4006_SourceExpression = TaiPanOCLFactory
							.getExpression(
									"self.escortOrder->isEmpty() or self.escortOrder.ships->select(ship | ship = oppositeEnd)->isEmpty()", TaiPanPackage.eINSTANCE.getWarship(), env); //$NON-NLS-1$
				}
				Object sourceVal = EscortShipsOrder_4006_SourceExpression
						.evaluate(source, Collections.singletonMap(
								OPPOSITE_END_VAR, target));
				if (false == sourceVal instanceof Boolean
						|| !((Boolean) sourceVal).booleanValue()) {
					return false;
				} // else fall-through
				if (target == null) {
					return true;
				}
				if (EscortShipsOrder_4006_TargetExpression == null) {
					Map env = Collections.singletonMap(OPPOSITE_END_VAR,
							TaiPanPackage.eINSTANCE.getWarship());
					EscortShipsOrder_4006_TargetExpression = TaiPanOCLFactory
							.getExpression(
									"not self.oclIsKindOf(Warship)", TaiPanPackage.eINSTANCE.getShip(), env); //$NON-NLS-1$
				}
				Object targetVal = EscortShipsOrder_4006_TargetExpression
						.evaluate(target, Collections.singletonMap(
								OPPOSITE_END_VAR, source));
				if (false == targetVal instanceof Boolean
						|| !((Boolean) targetVal).booleanValue()) {
					return false;
				} // else fall-through
				return true;
			} catch (Exception e) {
				TaiPanDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated
		 */
		public static boolean canExistPortRegister_4007(Port source, Ship target) {

			return true;
		}

	}

}
