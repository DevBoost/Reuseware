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
package org.reuseware.application.taipan.gmf.editor.providers;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.AbstractContributionItemProvider;
import org.eclipse.gmf.runtime.common.ui.util.IWorkbenchPartDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableColorProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;
import org.reuseware.application.taipan.Ship;
import org.reuseware.application.taipan.TaiPanPackage;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanAbstractExpression;
import org.reuseware.application.taipan.gmf.editor.expressions.TaiPanOCLFactory;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanDiagramEditor;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanDiagramEditorPlugin;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanDiagramEditorUtil;
import org.reuseware.application.taipan.gmf.editor.part.TaiPanVisualIDRegistry;

/**
 * @generated
 */
public class TaiPanMetricProvider extends AbstractContributionItemProvider {

	/**
	 * @generated
	 */
	private static HashMap context2MetricsMap;

	/**
	 * @generated
	 */
	private static List metricsRegistry;

	/**
	 * @generated
	 */
	private static HashMap key2MetricMap;

	/**
	 * @generated
	 */
	private static int MAX_VISIBLE_KEY_CHAR_COUNT = 8;

	/**
	 * @generated
	 */
	protected IAction createAction(String actionId,
			IWorkbenchPartDescriptor partDescriptor) {
		if (MetricsAction.ACTION_KEY.equals(actionId)) {
			return new MetricsAction(partDescriptor);
		}
		return super.createAction(actionId, partDescriptor);
	}

	/**
	 * @generated
	 */
	private static class MetricsAction extends Action {

		/**
		 * @generated
		 */
		public static final String ACTION_KEY = "metricsAction"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private IWorkbenchPartDescriptor workbenchPartDescriptor;

		/**
		 * @generated
		 */
		public MetricsAction(IWorkbenchPartDescriptor workbenchPartDescriptor) {
			setId(ACTION_KEY);
			setText("Metrics");
			this.workbenchPartDescriptor = workbenchPartDescriptor;
		}

		/**
		 * @generated
		 */
		public void run() {
			IWorkbenchPart workbenchPart = workbenchPartDescriptor
					.getPartPage().getActivePart();
			IViewPart metricsView = null;
			try {
				metricsView = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage().findView(
								ResultView.VIEW_ID);
				if (metricsView == null) {
					metricsView = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage()
							.showView(ResultView.VIEW_ID);
				} else {
					if (metricsView != null
							&& workbenchPart instanceof IDiagramWorkbenchPart) {
						final IDiagramWorkbenchPart part = (IDiagramWorkbenchPart) workbenchPart;
						((ResultView) metricsView).setInput(part);
					}
					workbenchPart.getSite().getPage().activate(metricsView);
				}
			} catch (PartInitException e) {
				TaiPanDiagramEditorPlugin.getInstance().logError(
						"Diagram metric view failure", e); //$NON-NLS-1$
			}
		}
	}

	/**
	 * @generated
	 */
	static List calculateMetrics(IDiagramWorkbenchPart diagramPart) {
		final DiagramEditPart diagramEditPart = diagramPart
				.getDiagramEditPart();
		try {
			return (List) diagramPart.getDiagramEditPart().getEditingDomain()
					.runExclusive(new RunnableWithResult.Impl() {

						public void run() {
							Diagram diagram = diagramEditPart.getDiagramView();
							List metrics = calculateMetrics(diagram,
									new ArrayList(50));
							if (diagram.getElement() != null) {
								calculateMetrics(diagram.getElement(), metrics);
							}
							// detach from EObject and bind to viewID
							HashSet elements = new HashSet();
							for (Iterator it = metrics.iterator(); it.hasNext();) {
								ElementMetrics elementMetrics = (ElementMetrics) it
										.next();
								elements.add(elementMetrics.target);
							}
							TaiPanDiagramEditorUtil.LazyElement2ViewMap element2ViewMap = new TaiPanDiagramEditorUtil.LazyElement2ViewMap(
									diagram, elements);
							for (Iterator it = metrics.iterator(); it.hasNext();) {
								ElementMetrics elementMetrics = (ElementMetrics) it
										.next();
								View targetView = TaiPanDiagramEditorUtil
										.findView(diagramEditPart,
												elementMetrics.target,
												element2ViewMap);
								elementMetrics.target = null; // detach EObject
								elementMetrics.diagramElementID = targetView
										.eResource().getURIFragment(targetView);
							}
							setResult(metrics);
						}
					});
		} catch (InterruptedException e) {
			return Collections.EMPTY_LIST;
		}
	}

	/**
	 * @generated
	 */
	static List calculateMetrics(EObject target, List metricsList) {
		final EObject root = target;
		Iterator it = new Iterator() {

			Iterator contentsIt = root.eAllContents();
			boolean isInRoot = true;

			public boolean hasNext() {
				return isInRoot || contentsIt.hasNext();
			}

			public Object next() {
				if (isInRoot) {
					isInRoot = false;
					return root;
				}
				return contentsIt.next();
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
		ArrayList metricsPerContext = new ArrayList();
		while (it.hasNext()) {
			Object nextElement = it.next();
			if (nextElement instanceof EObject) {
				EObject nextEObj = (EObject) nextElement;
				EClass nextTarget = nextEObj.eClass();
				Iterator superTypeIt = nextTarget.getEAllSuperTypes()
						.iterator();
				while (nextTarget != null) {
					List metricList = getMetricsForTarget(nextTarget);
					if (metricList != null) {
						for (Iterator metricIt = metricList.iterator(); metricIt
								.hasNext();) {
							MetricDef nextMetric = (MetricDef) metricIt.next();
							if (nextMetric.appliesTo(nextEObj)) {
								Metric metric = new Metric(nextMetric, nextEObj);
								metricsPerContext.add(metric);
							}
						}
					}
					nextTarget = superTypeIt.hasNext() ? (EClass) superTypeIt
							.next() : null;
				}
				if (!metricsPerContext.isEmpty()) {
					metricsList.add(new ElementMetrics(nextEObj,
							(Metric[]) metricsPerContext
									.toArray(new Metric[metricsPerContext
											.size()])));
					metricsPerContext.clear();
				}
			}
		}
		return metricsList;
	}

	/**
	 * @generated
	 */
	public static class ResultView extends ViewPart {

		/**
		 * @generated
		 */
		public static final String VIEW_ID = "org.reuseware.application.taipan.gmf.editor.metricView"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		private TableViewer viewer;

		/**
		 * @generated
		 */
		private Resource diagramResource;

		/**
		 * @generated
		 */
		void setInput(IDiagramWorkbenchPart diagramPart) {
			diagramResource = diagramPart.getDiagram().eResource();
			setTitleToolTip(diagramResource.getURI().path());
			List metrics = calculateMetrics(diagramPart);
			adjustLayout(metrics);
			viewer.setInput(metrics);
		}

		/**
		 * @generated
		 */
		private void adjustLayout(List metricResultList) {
			Map maxValStrMap = calcMetricMaxValueStrLenMap(metricResultList);
			Table table = viewer.getTable();
			TableLayout layout = new TableLayout();
			org.eclipse.swt.graphics.GC gc = new org.eclipse.swt.graphics.GC(
					table);
			gc.setFont(JFaceResources.getDialogFont());
			int padding = gc.stringExtent("X").x * 2; //$NON-NLS-1$
			for (int i = 0; i < getMetrics().size(); i++) {
				MetricDef nextMetric = (MetricDef) getMetrics().get(i);
				String valueStr = (String) maxValStrMap.get(nextMetric.key);
				int minWidth = valueStr != null ? gc.stringExtent(valueStr).x
						+ padding : 20;
				layout.addColumnData(new ColumnPixelData(minWidth, true));
			}
			gc.dispose();
			layout.addColumnData(new ColumnWeightData(1, 50, true));
			viewer.getTable().setLayout(layout);
			viewer.getTable().layout(true, true);
		}

		/**
		 * @generated
		 */
		public void createPartControl(Composite parent) {
			this.viewer = new TableViewer(parent, SWT.FULL_SELECTION);
			final Table table = viewer.getTable();
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
			for (int i = 0; i < getMetrics().size(); i++) {
				MetricDef nextMetric = ((MetricDef) getMetrics().get(i));
				TableColumn column = new TableColumn(table, SWT.NONE);
				column.setAlignment(SWT.RIGHT);
				column.setMoveable(true);
				column.setText(nextMetric.key);
				column.setToolTipText(nextMetric.getToolTipText());
			}
			TableColumn objectColumn = new TableColumn(table, SWT.NONE);
			objectColumn.setText("Element");
			objectColumn.setToolTipText("Measurement element");
			viewer.setLabelProvider(new Labels());
			viewer.setContentProvider(new ArrayContentProvider());
			viewer.addOpenListener(new IOpenListener() {

				public void open(OpenEvent event) {
					handleOpen(event);
				}
			});
			SelectionListener headerSelListener = new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					table.setSortColumn((TableColumn) e.getSource());
					table
							.setSortDirection((table.getSortDirection() != SWT.DOWN) ? SWT.DOWN
									: SWT.UP);
					viewer.refresh();
				}

				public void widgetDefaultSelected(SelectionEvent e) {
				}
			};
			TableColumn[] columns = viewer.getTable().getColumns();
			for (int i = 0; i < columns.length; i++) {
				columns[i].addSelectionListener(headerSelListener);
			}
			viewer.setSorter(new ViewerSorter() {

				public int compare(Viewer viewer, Object e1, Object e2) {
					TableColumn c = table.getSortColumn();
					int result = 0;
					if (c != null) {
						Metric mc1 = ((ElementMetrics) e1).getMetricByKey(c
								.getText());
						Metric mc2 = ((ElementMetrics) e2).getMetricByKey(c
								.getText());
						result = (mc1 != null && mc2 != null) ? mc1
								.compareTo(mc2) : (mc1 == null ? -1 : 1);
					} else {
						result = ((ElementMetrics) e1).targetElementQName
								.compareTo(((ElementMetrics) e2).targetElementQName);
					}
					return table.getSortDirection() == SWT.DOWN ? result
							: -result;
				}
			});
			IEditorPart editor = getSite().getPage().getActiveEditor();
			if (editor != null
					&& editor.getClass().equals(TaiPanDiagramEditor.class)) {
				setInput((TaiPanDiagramEditor) editor);
			}
		}

		/**
		 * @generated
		 */
		private void handleOpen(OpenEvent event) {
			try {
				IEditorPart editorPart = getSite().getPage().openEditor(
						new FileEditorInput(WorkspaceSynchronizer
								.getFile(diagramResource)),
						TaiPanDiagramEditor.ID);
				if (editorPart == null) {
					return;
				}
				IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart) editorPart
						.getAdapter(IDiagramWorkbenchPart.class);
				ElementMetrics selection = (ElementMetrics) ((IStructuredSelection) event
						.getSelection()).getFirstElement();
				String viewID = selection.diagramElementID;
				if (viewID != null) {
					View targetView = (View) diagramPart.getDiagram()
							.eResource().getEObject(viewID);
					if (targetView != null) {
						EditPart targetEditPart = (EditPart) diagramPart
								.getDiagramGraphicalViewer()
								.getEditPartRegistry().get(targetView);
						if (targetEditPart != null) {
							TaiPanDiagramEditorUtil.selectElementsInDiagram(
									diagramPart, Collections
											.singletonList(targetEditPart));
						}
					}
				}
			} catch (PartInitException e) {
				TaiPanDiagramEditorPlugin.getInstance().logError(
						"Can't open diagram editor", e); //$NON-NLS-1$
			}
		}

		/**
		 * @generated
		 */
		private static Map calcMetricMaxValueStrLenMap(List allMetrics) {
			Map metric2MaxStrLen = new HashMap();
			for (int i = 0; i < getMetrics().size(); i++) {
				String nextKey = ((MetricDef) getMetrics().get(i)).key;
				int trimPos = Math.min(nextKey.length(),
						MAX_VISIBLE_KEY_CHAR_COUNT);
				metric2MaxStrLen.put(nextKey, nextKey.substring(0, trimPos));
			}
			for (Iterator it = allMetrics.iterator(); it.hasNext();) {
				ElementMetrics elementMetrics = (ElementMetrics) it.next();
				for (int i = 0; i < elementMetrics.metrics.length; i++) {
					Metric metric = elementMetrics.metrics[i];
					String valueStr = (String) metric2MaxStrLen
							.get(metric.def.key);
					if (valueStr == null
							|| metric.displayValue.length() > valueStr.length()) {
						metric2MaxStrLen.put(metric.def.key,
								metric.displayValue);
					}
				}
			}
			return metric2MaxStrLen;
		}

		/**
		 * @generated
		 */
		public void setFocus() {
		}

		/**
		 * @generated
		 */
		private class Labels extends LabelProvider implements
				ITableLabelProvider, ITableColorProvider {

			/**
			 * @generated
			 */
			private boolean isElementColumn(int columnIndex) {
				return columnIndex >= getMetrics().size();
			}

			/**
			 * @generated
			 */
			public Image getColumnImage(Object element, int columnIndex) {
				return isElementColumn(columnIndex) ? ((ElementMetrics) element).elementImage
						: null;
			}

			/**
			 * @generated
			 */
			public String getColumnText(Object element, int columnIndex) {
				ElementMetrics elementMetrics = (ElementMetrics) element;
				if (columnIndex == getMetrics().size()) {
					return elementMetrics.targetElementQName;
				}
				String key = ((MetricDef) getMetrics().get(columnIndex)).key;
				Metric metric = elementMetrics.getMetricByKey(key);
				return (metric != null) ? metric.displayValue : "-"; //$NON-NLS-1$
			}

			/**
			 * @generated
			 */
			public Color getBackground(Object element, int columnIndex) {
				return null;
			}

			/**
			 * @generated
			 */
			public Color getForeground(Object element, int columnIndex) {
				if (isElementColumn(columnIndex)) {
					return null;
				}
				ElementMetrics columnElement = (ElementMetrics) element;
				String key = ((MetricDef) getMetrics().get(columnIndex)).key;
				Metric metric = columnElement.getMetricByKey(key);
				if (metric != null && metric.value != null) {
					if (metric.def.highLimit != null
							&& metric.def.highLimit.longValue() < metric.value
									.longValue()) {
						return ColorConstants.red;
					} else if (metric.def.lowLimit != null
							&& metric.def.lowLimit.longValue() > metric.value
									.longValue()) {
						return ColorConstants.blue;
					}
				}
				return null;
			}
		}
	}

	/**
	 * @generated
	 */
	private static class ElementMetrics {

		/**
		 * @generated
		 */
		final Metric[] metrics;

		/**
		 * @generated
		 */
		final String targetElementQName;

		/**
		 * @generated
		 */
		final Image elementImage;

		/**
		 * @generated
		 */
		String diagramElementID;

		/**
		 * @generated
		 */
		EObject target;

		/**
		 * @generated
		 */
		ElementMetrics(EObject target, Metric[] metrics) {
			this.metrics = metrics;
			assert metrics.length > 0;
			this.target = target;
			EClass imageTarget = target.eClass();
			if (target instanceof View) {
				View viewTarget = (View) target;
				StringBuffer notationQNameBuf = new StringBuffer();
				notationQNameBuf.append(EMFCoreUtil.getQualifiedName(
						viewTarget, true));
				if ("".equals(viewTarget.getType()) && viewTarget.getElement() != null) { //$NON-NLS-1$
					notationQNameBuf.append('-').append('>').append(
							EMFCoreUtil.getQualifiedName(viewTarget
									.getElement(), true));
					imageTarget = viewTarget.getElement().eClass();
				}
				int visualID = TaiPanVisualIDRegistry.getVisualID(viewTarget);
				notationQNameBuf.append('[').append(
						visualID < 0 ? Integer.toString(System
								.identityHashCode(viewTarget)) : Integer
								.toString(visualID)).append(']');
				this.targetElementQName = notationQNameBuf.toString();
			} else {
				this.targetElementQName = EMFCoreUtil.getQualifiedName(target,
						true);
			}
			this.elementImage = TaiPanElementTypes.getImage(imageTarget);
		}

		/**
		 * @generated
		 */
		Metric getMetricByKey(String key) {
			for (int i = 0; i < metrics.length; i++) {
				if (metrics[i].def.key.equals(key)) {
					return metrics[i];
				}
			}
			return null;
		}
	}

	/**
	 * @generated
	 */
	private static class Metric implements Comparable {

		/**
		 * @generated
		 */
		final MetricDef def;

		/**
		 * @generated
		 */
		final Number value;

		/**
		 * @generated
		 */
		final String displayValue;

		/**
		 * @generated
		 */
		Metric(MetricDef def, EObject target) {
			this.def = def;
			value = def.calcMetric(target);
			this.displayValue = (value != null) ? NumberFormat.getInstance()
					.format(value) : "null"; //$NON-NLS-1$
		}

		/**
		 * @generated
		 */
		public int compareTo(Object other) {
			Metric otherMetric = (Metric) other;
			if (value != null && otherMetric.value != null) {
				return (value.longValue() < otherMetric.value.longValue()) ? -1
						: (value.longValue() == otherMetric.value.longValue() ? 0
								: 1);
			}
			return (value == null && otherMetric.value == null) ? 0
					: (value == null) ? -1 : 1;
		}
	}

	/**
	 * @generated
	 */
	private static class MetricDef {

		/**
		 * @generated
		 */
		final Double lowLimit;

		/**
		 * @generated
		 */
		final Double highLimit;

		/**
		 * @generated
		 */
		final String key;

		/**
		 * @generated
		 */
		final TaiPanAbstractExpression expression;

		/**
		 * @generated
		 */
		final int[] semanticIDs;

		/**
		 * @generated
		 */
		final String name;

		/**
		 * @generated
		 */
		final String description;

		/**
		 * @generated
		 */
		MetricDef(String key, TaiPanAbstractExpression expression,
				int[] semanticIDs, Double low, Double high, String name,
				String description) {
			this.key = key;
			this.expression = expression;
			this.semanticIDs = semanticIDs;
			this.lowLimit = low;
			this.highLimit = high;
			this.name = name;
			this.description = description;
		}

		/**
		 * @generated
		 */
		Number calcMetric(Object contextInstance) {
			Object val = expression.evaluate(contextInstance);
			return (val instanceof Number) ? (Number) val : null;
		}

		/**
		 * @generated
		 */
		boolean appliesTo(EObject eObject) {
			if (eObject instanceof View && semanticIDs != null) {
				int eObjectID = TaiPanVisualIDRegistry
						.getVisualID((View) eObject);
				for (int i = 0; i < semanticIDs.length; i++) {
					if (semanticIDs[i] == eObjectID) {
						return true;
					}
				}
				return false;
			}
			return eObject != null
					&& (expression.context() instanceof EClass)
					&& ((EClass) expression.context()).isSuperTypeOf(eObject
							.eClass());
		}

		/**
		 * @generated
		 */
		String getToolTipText() {
			StringBuffer buf = new StringBuffer();
			if (name != null) {
				buf.append(name);
			}
			if (description != null) {
				buf.append('\n').append(description).append('\n');
			}
			if (lowLimit != null) {
				buf.append("low:").append(lowLimit);
			}
			if (highLimit != null) {
				buf.append(" high:").append(highLimit);
			}
			return buf.toString();
		}
	}

	/**
	 * @generated
	 */
	public static List/*MetricDef*/getMetricsForTarget(EClass target) {
		if (context2MetricsMap == null) {
			initializeRegistry();
		}
		return (List) context2MetricsMap.get(target);
	}

	/**
	 * @generated
	 */
	public static List getMetrics() {
		if (metricsRegistry == null) {
			initializeRegistry();
		}
		return metricsRegistry;
	}

	/**
	 * @generated
	 */
	public static Number calculateMetric(String metricKey,
			Object contextInstance) {
		if (key2MetricMap == null) {
			initializeRegistry();
		}
		MetricDef metric = (MetricDef) key2MetricMap.get(metricKey);
		Number value = (metric != null) ? metric.calcMetric(contextInstance)
				: null;
		return (value != null && !(value instanceof Double)) ? new Double(value
				.doubleValue()) : value;
	}

	/**
	 * @generated
	 */
	private static void initializeRegistry() {
		if (context2MetricsMap != null) {
			return;
		}
		register(new MetricDef("RouteRelb", TaiPanOCLFactory.getExpression(
				"reliability", //$NON-NLS-1$
				TaiPanPackage.eINSTANCE.getRoute()), null, new Double(0.1),
				new Double(0.9), "Route Reliability", "Safety of the route."));
		register(new MetricDef("ShipLoad", new TaiPanAbstractExpression("ShipLoad",
				TaiPanPackage.eINSTANCE.getShip()) {

			protected Object doEvaluate(Object context, Map env) {
				Ship self = (Ship) context;
				return JavaRules.cargosize(self);
			}
		}, null, new Double(1.0), new Double(5.0), "Ship Load",
				"Quantity of items loaded on ship."));
	}

	/**
	 * @generated
	 */
	private static void register(MetricDef metric) {
		if (context2MetricsMap == null) {
			context2MetricsMap = new HashMap();
			metricsRegistry = new ArrayList();
			key2MetricMap = new HashMap();
		}
		List metrics = (List) context2MetricsMap.get(metric.expression
				.context());
		if (metrics == null) {
			metrics = new ArrayList();
			context2MetricsMap.put(metric.expression.context(), metrics);
		}
		metricsRegistry.add(metric);
		metrics.add(metric);
		key2MetricMap.put(metric.key, metric);
	}

	/**
	 * @generated
	 */
	private static class JavaRules {

		/**
		 * @generated NOT
		 */
		private static Double cargosize(Ship self) {
			return new Double(self.getCargo().size());
		}
	}
}
