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
package org.reuseware.sokan.index.indexer;

/**
 * An indexer that performs important dependency calculations.
 * In contrast to a normal indexer, a dependency indexer also
 * get called for artifacts that are removed from a store
 * upon removal.
 */
public interface DependencyIndexer extends Indexer { }
