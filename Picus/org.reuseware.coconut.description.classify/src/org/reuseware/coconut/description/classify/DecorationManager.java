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
package org.reuseware.coconut.description.classify;

import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetTypeDecorator;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FacetValueDecorator;

public class DecorationManager {

	public static FacetTypeDecorator buildFacetTypeDecorator(FacetType type) {
		FacetTypeDecorator ftDecorator = DescriptionFactory.eINSTANCE.createFacetTypeDecorator();
		ftDecorator.setDecoratee(type);

		for (FacetValue value : type.getValues()) {
			buildFacetValueDecorator(value, ftDecorator);
		}

		return ftDecorator;
	}

	public static FacetValueDecorator buildFacetValueDecorator(FacetValue value,
			FacetTypeDecorator parent) {
		FacetValueDecorator fvDecorator = buildFacetValueDecorator(value);
		parent.getValues().add(fvDecorator);

		return fvDecorator;
	}

	public static FacetValueDecorator buildFacetValueDecorator(FacetValue value) {
		FacetValueDecorator fvDecorator = DescriptionFactory.eINSTANCE.createFacetValueDecorator();

		fvDecorator.setDecoratee(value);

		if (value.getChildren() != null) {
			for (FacetValue childValue : value.getChildren()) {
				fvDecorator.getChildren().add(buildFacetValueDecorator(childValue));
			}
		}

		return fvDecorator;
	}

	/**
	 * Retrieves whether to <code>FacetTypeDecorator</code> instances are equal.
	 * They meant to be equal if there decoratees are equal.
	 * 
	 * @param tDecor1
	 *            One <code>FacetTypeDecorator</code> instance.
	 * @param tDecor2
	 *            Another <code>FacetTypeDecorator</code> instance.
	 * @return <code>True</code> if both are not <code>null</code> and there
	 *         decoratees are equal.
	 */
	public static boolean equal(FacetTypeDecorator tDecor1, FacetTypeDecorator tDecor2) {
		if (tDecor1 == null && tDecor2 == null)
			return true;

		if (tDecor1 != null && tDecor2 != null)
			return tDecor1.getDecoratee().equals(tDecor2.getDecoratee());

		return false;
	}

}
