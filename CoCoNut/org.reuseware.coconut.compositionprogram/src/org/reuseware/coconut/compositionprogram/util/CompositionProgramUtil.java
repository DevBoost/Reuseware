/*******************************************************************************
 * Copyright (c) 2006-2010
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
package org.reuseware.coconut.compositionprogram.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.reuseware.coconut.compositionprogram.CompositionLink;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionprogram.CompositionprogramFactory;
import org.reuseware.coconut.compositionprogram.FragmentInstance;
import org.reuseware.coconut.compositionprogram.PortInstance;
import org.reuseware.coconut.fracol.Contribution;
import org.reuseware.coconut.fragment.AddressablePoint;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.HeterogeneousPort;
import org.reuseware.coconut.fragment.Hook;
import org.reuseware.coconut.reuseextension.CompositionLanguageSyntaxSpecification;
import org.reuseware.coconut.reuseextension.FragmentRole2SyntaxBinding;
import org.reuseware.coconut.reuseextension.evaluator.EvaluatorUtil;
import org.reuseware.coconut.reuseextensionactivator.Argument;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;

/**
 * Utility methods for user friendly editing of composition programs.
 */
public final class CompositionProgramUtil {
	
	private CompositionProgramUtil() { }

	/**
	 * Activates the given {@link CompositionLanguageSyntaxSpecification}s for
	 * the given {@link CompositionProgram} by instantiating all default fragments
	 * specified in the syntaxes.
	 * 
	 * @param compositionProgram the {@link CompositionProgram}.
	 * @param activatorList list of activators with {@link CompositionLanguageSyntaxSpecification}s.
	 */
	public static void activateCompositionLanguageSyntaxSpecifications(
			CompositionProgram compositionProgram, List<ReuseExtensionActivator> activatorList) {
		
		for (ReuseExtensionActivator activator : activatorList) {
			if (activator.getReuseExtension() instanceof CompositionLanguageSyntaxSpecification) {
				CompositionLanguageSyntaxSpecification clSyntax = 
					(CompositionLanguageSyntaxSpecification) activator.getReuseExtension();
				Map<String, String> args = new LinkedHashMap<String, String>();
				for (Argument arg : activator.getArguments()) {
					args.put(arg.getParameter(), arg.getValue());
				}
				
				for (FragmentRole2SyntaxBinding binding : clSyntax.getFragmentRoleBindings()) {
					if (binding.getUfiExpression() != null && binding.getNameExpression() != null) {			
						List<String> ufi = EvaluatorUtil.deriveID(
								compositionProgram.getUCPI(), compositionProgram, binding.getUfiExpression(), args);
						String name = EvaluatorUtil.derive(
								compositionProgram.getUCPI(), compositionProgram, binding.getNameExpression(), args);
						List<String> targetUfi = EvaluatorUtil.deriveID(
								compositionProgram.getUCPI(), compositionProgram, binding.getTargetUfiExpression(), args);
						String targetLocation = EvaluatorUtil.derive(
								compositionProgram.getUCPI(), compositionProgram, binding.getTargetPhysicalLocationExpression(), args);

						FragmentInstance fragmentInstance = CompositionprogramFactory.eINSTANCE
							.createFragmentInstance();
						fragmentInstance.getUFI().addAll(ufi);
						fragmentInstance.setName(name);
						
						if (targetUfi != null && !targetUfi.isEmpty()) {
							fragmentInstance.getTargetUFI().addAll(targetUfi);
							fragmentInstance.setTarget(true);
							fragmentInstance.setTargetPhysicalLocation(targetLocation);
						}
						
						if (!containsFragmentInstance(compositionProgram, fragmentInstance)) {
							compositionProgram.getFragmentInstances().add(fragmentInstance);
							fragmentInstance.update();							
						}
					}
				}
			}
		}
	}
	
	private static boolean containsFragmentInstance(
			CompositionProgram cp, FragmentInstance fi) {
		for (FragmentInstance existingFI : cp.getFragmentInstances()) {
			if (existingFI.getName().equals(fi.getName())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Creates a new instance of the given {@link Fragment} with an unique name in
	 * the given {@link CompositionProgram}.
	 * 
	 * @param fragment the {@link Fragment} to instantiate.
	 * @param compositionProgram the {@link CompositionProgram} to instantiate the fragment in.
	 * @return the new {@link FragmentInstance}.
	 */
	public static FragmentInstance createFragmentInstance(
			Fragment fragment, CompositionProgram compositionProgram) {
		
		FragmentInstance fInstance = 
			CompositionprogramFactory.eINSTANCE.createFragmentInstance();
		compositionProgram.getFragmentInstances().add(fInstance);
		
		updateFragmentInstance(fragment, fInstance);

		return fInstance;
	}
	
	/**
	 * Changes the given {@link FragmentInstance} to an instance of the
	 * given {@link Fragment}.
	 * 
	 * @param fragment the {@link Fragment} that should be instantiated.
	 * @param fragmentInstance the {@link FragmentInstance} to update.
	 */
	public static void updateFragmentInstance(
			Fragment fragment, FragmentInstance fragmentInstance) {
		fragmentInstance.getUFI().clear();
		fragmentInstance.getUFI().addAll(fragment.getUFI());
		
		//find a name not used so far in the c.p.
		String nameCand = fragment.getUFI().get(fragment.getUFI().size() - 1);
		
		String name = nameCand;
		int count = 2;
		boolean found = false;
		
		while (!found) {
			found = true;
			CompositionProgram compositionProgram = fragmentInstance.getCompositionProgram();
			for (FragmentInstance existingFI : compositionProgram.getFragmentInstances()) {
				if (name.equals(existingFI.getName())) {
					name = nameCand + count;
					count++;
					found = false;
					break;
				}
			}
		}
		
		fragmentInstance.setName(name);
		fragmentInstance.setFragment(fragment);
		
		fragmentInstance.update();
		
		//set an initial targetUFI
		EList<String> ufi = fragmentInstance.getUFI();
		if (ufi.size() >= 1) {
			EList<String> tufi = fragmentInstance.getTargetUFI();
			tufi.clear();
			tufi.addAll(ufi);
			tufi.add(tufi.size() - 1, "composed");
		}
	}

	
	/**
	 * Links all ports that can contribute to all receiving ports of existing target fragments in
	 * the composition programs that match.
	 * 
	 * @param compositionProgram the {@link CompositionProgram} with receiving fragments.
	 * @param contributor new contributing {@link FragmentInstance}.
	 */
	public static void linkImplicitInterface(CompositionProgram compositionProgram, 
			FragmentInstance contributor) {
		
		//check contributing ports of new fragment
		for (PortInstance contributingPort : contributor.getPortInstances()) {
			if (contributingPort.canContribute()) {
				if (contributingPort.getSourceLinks().isEmpty()
						&& contributingPort.getTargetLinks().isEmpty()) {
					
					//find a proper receiver
					for (FragmentInstance receivingFragment : compositionProgram.getFragmentInstances()) {
						if (receivingFragment.isTarget()) {
							//CompositionLink createdLink = null;
							for (PortInstance receivingPort : receivingFragment.getPortInstances()) {
								if (isImplicit(receivingPort)) {
									//create a link and check if it is valid
									CompositionLink link = CompositionprogramFactory.eINSTANCE.createCompositionLink();
									link.setSource(contributingPort);
									link.setTarget(receivingPort);
									compositionProgram.getCompositionLinks().add(link);
									
									//only declared contributions
									if (link.compositionAssociation() instanceof Contribution) {
										//does it match?
										link.match();
										if (!link.isValid()) {
											link.setSource(null);
											link.setTarget(null);
											compositionProgram.getCompositionLinks().remove(link);
										} else {
											//createdLink = link;
											break;
										}
										// there already a link? -> keep decide which to keep, or remove both (?)
										/*if (createdLink != null) {
											link.setSource(null);
											link.setTarget(null);
											cp.getCompositionLinks().remove(link);
											break;
										}*/
									} else {
										link.setSource(null);
										link.setTarget(null);
										compositionProgram.getCompositionLinks().remove(link);
									}
								}
							}
						}
					}					
				}
			}
		}
	}
	
	/**
	 * Checks whether the port of the given {@link PortInstance} contains only hooks that
	 * refer to a structural feature (and not an element).
	 * 
	 * @param portInstance {@link PortInstance} to check.
	 * @return true if implicit.
	 */
	private static boolean isImplicit(PortInstance portInstance) {
		//is receiving at all?
		if (portInstance == null) {
			return false;
		}
		if (!portInstance.canReceive()) {
			return false;
		}
		
		//ports are implicit if all their hooks refer to references and not element
		for (HeterogeneousPort port : portInstance.allPorts()) {
			for (AddressablePoint hook : port.getAddressablePoints()) {
				if (hook instanceof Hook && hook.getVarTypedEStructuralFeature() == null) {
					return false;
				}
			}
		}

		return true;
	}


}
