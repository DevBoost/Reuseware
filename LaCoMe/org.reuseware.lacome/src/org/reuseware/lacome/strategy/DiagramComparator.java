/*******************************************************************************
 * Copyright (c) 2006-2011
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Software Technology Group - TU Dresden, Germany 
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.lacome.strategy;

import java.util.Comparator;

import org.reuseware.lacome.DiagramDescription;

/**
 * Interface for comparators the sort diagram descriptions.
 */
public interface DiagramComparator extends Comparator<DiagramDescription> { }
