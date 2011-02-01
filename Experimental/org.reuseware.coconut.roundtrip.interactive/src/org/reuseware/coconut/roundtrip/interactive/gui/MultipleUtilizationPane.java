/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.roundtrip.interactive.gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.border.BevelBorder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.reuseware.coconut.fragment.util.CopiedFromAdapter;
import org.reuseware.coconut.roundtrip.IConflictResolveResultHandler;
import org.reuseware.coconut.roundtrip.interactive.compare.EMFCompareViewOpener;

/**
 * MultipleUtilizationPane shows conflicts that may occur when fragments are
 * used in multiple composition programs.
 * 
 * @author Roland Samlaus
 */
public class MultipleUtilizationPane extends javax.swing.JDialog {

	private static final long serialVersionUID = 7225834347574379097L;
	
	private JDesktopPane conflictPane;
	private JPanel candidatesPanel;
	private JTextPane conflictDescription;
	private JList candidatesList;
	private JButton copyFragmentButton;
	private JButton confirmButton;
	private JButton discardButton;
	//private boolean isactive = true;
	//private String newSourceName;

	private IConflictResolveResultHandler resultHandler;
	private RoundTripAdapter adapter;

	/**
	 * Constructor of MultipleUtilizationPane.
	 * 
	 * @param compositionProgramUFIs
	 *            UFIs of compositions programs where the source fragment is
	 *            used in.
	 * @param resultHandler
	 *            The GUI of type ConflitcsGUI that uses this Dialog
	 */
	public MultipleUtilizationPane(List<URI> compositionProgramUFIs,
			RoundTripAdapter adapter,
			IConflictResolveResultHandler resultHandler) {

		super(new Frame());
		this.adapter = adapter;
		this.resultHandler = resultHandler;
		initGUI(compositionProgramUFIs);
	}

	public void closePanel() {
		dispose();
	}

	/**
	 * Opens the MultipleUtilizationPane.
	 * 
	 * @param compositionProgramUFIs
	 *            UFIs of composition programs that are using the source
	 *            fragment that was edited by the user.
	 */

	public void initGUI(List<URI> compositionProgramUFIs) {
		setTitle("Conflict");

		addConflictPane();
		addCandidatesPanel(compositionProgramUFIs);
		addDiscardChangesButton();
		addConfirmButton();
		addCopyFragmentButton();
		addConflictDescription();
		
		setSize(393, 300);
		pack();
		setAlwaysOnTop(true);
		setVisible(true);
	}

	private void addConflictDescription() {
		conflictDescription = new JTextPane();
		getContentPane().add(conflictDescription, BorderLayout.NORTH);
		conflictDescription
				.setText("Unresolved Conflict: The Fragment you edited is used in multiple Composition Programs. The following list shows all occurences. To view the result of changing the attribute, double-click the UFI of the source fragment.");
		conflictDescription.setPreferredSize(new java.awt.Dimension(
				385, 37));
	}

	private void addConflictPane() {
		conflictPane = new JDesktopPane();
		getContentPane().add(conflictPane, BorderLayout.CENTER);
		conflictPane.setPreferredSize(new java.awt.Dimension(662, 229));
		conflictPane.setBackground(new java.awt.Color(192, 192, 192));
	}

	private void addCandidatesPanel(List<URI> compositionProgramUFIs) {
		candidatesPanel = new JPanel();
		conflictPane.add(candidatesPanel);
		candidatesPanel.setBounds(0, 12, 654, 176);
		candidatesPanel.setBackground(new java.awt.Color(255, 255, 255));
		candidatesPanel.setForeground(new java.awt.Color(255, 0, 0));

		Object[] list = compositionProgramUFIs.toArray();
		ListModel candidatesListModel = new DefaultComboBoxModel(
				list);
		candidatesList = new JList();
		candidatesPanel.add(candidatesList);
		candidatesList.setModel(candidatesListModel);
		candidatesList.setPreferredSize(new java.awt.Dimension(
				635, 164));
		candidatesList.setBorder(BorderFactory
				.createEtchedBorder(BevelBorder.LOWERED));
		MouseAdapter ma = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() <= 1)
					return;
				int index = candidatesList.locationToIndex(e
						.getPoint());
				if (index < 0) {
					return;
				}
				Object o = candidatesList.getModel().getElementAt(index);
				//TODO jj: which objects are expected here?
				if (o instanceof URI) {
					showCompareView((URI) o);
				}
			}

		};
		candidatesList.addMouseListener(ma);
	}

	private void addDiscardChangesButton() {
		discardButton = new JButton();
		conflictPane.add(discardButton);
		discardButton.setText("Discard changes");
		discardButton.setBounds(12, 200, 92, 21);
		discardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				resultHandler.discardChanges(adapter);
			}
		});
	}

	private void addCopyFragmentButton() {
		copyFragmentButton = new JButton();
		conflictPane.add(copyFragmentButton);
		copyFragmentButton.setText("Copy Fragment ...");
		copyFragmentButton.setBounds(220, 200, 143, 21);
		copyFragmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultHandler.copyFragment(adapter);
			}
		});
	}

	private void addConfirmButton() {
		confirmButton = new JButton();
		conflictPane.add(confirmButton);
		confirmButton.setText("Confirm changes");
		confirmButton.setBounds(115, 200, 94, 21);
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				resultHandler.confirmChanges(adapter);

			}
		});
	}

	/**
	 * Sets the models and opens the compare view.
	 * 
	 * @param o
	 *            Object that was double-clicked by user. (UFI)
	 */
	private void showCompareView(URI uri) {

		final EMFCompareViewOpener viewOpener = new EMFCompareViewOpener();
		viewOpener.setModelOne(uri);
		resultHandler.preCompareAction(adapter);
		viewOpener.setModelTwo(uri);

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow dwindow = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow();
				IWorkbenchPage page = dwindow.getActivePage();
				if (page != null) {
					try {
						viewOpener.openCompareView();
					} catch (Exception pie) {
						pie.printStackTrace();
					}
				}
			}
		});

		resultHandler.postCompareAction(adapter);

	}

}
