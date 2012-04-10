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
public class PLACEHOLDER { 

	protected void PLACEHOLDER() {
		{
			SLOT1 producer = new SLOT1();
			SLOT2 consumer = new SLOT2();

			TYPE_SLOT ID_SLOT =  producer.produce(GIVER);
			if (ID_SLOT == null) {
				return;
			} 
			//send value...
			else {							
				consumer.consume(TAKER, ID_SLOT);
			}
		}
		NEXT :;
	}

	private Object GIVER;
	private Object TAKER;

	public abstract class TYPE_SLOT {} 
	public abstract class SLOT1 implements org.reuseware.lib.systems.exchange.lib.IProducer {}	
	public abstract class SLOT2 implements org.reuseware.lib.systems.exchange.lib.IConsumer {}
}

