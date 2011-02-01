package org.reuseware.lib.java.pattern.adviceobserver;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Observer {

	public List<Subject> subjects = new LinkedList<Subject>();

	public void update() {
		Iterator<Subject> it;
		it = subjects.iterator();
		
		while(it.hasNext()) {
			Subject subject;
			subject = it.next();
			subject.notify();
		}
	}
	
}