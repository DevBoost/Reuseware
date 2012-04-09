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
package org.reuseware.coconut.resource.resourceset;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.reuseware.coconut.reuseextension.ReuseExtension;
import org.reuseware.coconut.reuseextension.RootElementContext;
import org.reuseware.coconut.reuseextension.evaluator.EvaluatorUtil;
import org.reuseware.coconut.reuseextensionactivator.Argument;
import org.reuseware.coconut.reuseextensionactivator.ReuseExtensionActivator;

public class ResourceSetReuseResourceUtil {
	
	public static boolean isInScopeOf(List<String> UFI, List<String> rexActivatorID) {
		return UFI.size() >= rexActivatorID.size() && 
				UFI.subList(0, rexActivatorID.size()-1).equals(rexActivatorID.subList(0, rexActivatorID.size()-1));
	}
	
	public static boolean extendsTypeOf(
			ReuseExtensionActivator rexActivator,
			Resource fragmentResource,
			List<String> UFI) {
		ReuseExtension rex = rexActivator.getReuseExtension();
		for(EObject root : fragmentResource.getContents()) {
			for(RootElementContext rootElementContext : rex.getRootElementContexts()) {
				if (rootElementContext.getEBoundClass().isInstance(root)) {
					Map<String, String> args = new LinkedHashMap<String, String>();
					for(Argument arg : rexActivator.getArguments()) {
						args.put(arg.getParameter(), arg.getValue());
					}
					if (EvaluatorUtil.eval(
							UFI, 
							root, 
							rootElementContext.getIsExpression(),
							args)) {
						return true;
					}
				}
			}
		}	
		return false;
	}

}
