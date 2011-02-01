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
package org.reuseware.coconut.roundtrip.test;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.reuseware.coconut.fragment.util.CopiedFromAdapter;
import org.reuseware.coconut.fragment.util.EModificationType;
import org.reuseware.coconut.fragment.util.IModificationHandler;

public class TestModificationHandler implements IModificationHandler {
	
	public class ModificationEvent {
		private final EModificationType type;
		private final URI uri;
		private final CopiedFromAdapter adapter;
		
		public ModificationEvent(EModificationType type, URI uri, CopiedFromAdapter adapter) {
			super();
			this.type = type;
			this.uri = uri;
			this.adapter = adapter;
		}

		public EModificationType getType() {
			return type;
		}

		public URI getUri() {
			return uri;
		}

		public CopiedFromAdapter getAdapter() {
			return adapter;
		}
	}
	
	private List<ModificationEvent> events = new ArrayList<ModificationEvent>();
	
	public void handle(EModificationType type, URI uri, CopiedFromAdapter adapter) {
		events.add(new ModificationEvent(type, uri, adapter));
	}

	public List<ModificationEvent> getEvents() {
		return events;
	}
}
