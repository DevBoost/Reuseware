package org.reuseware.lib.java.pattern.adviceobserver;

import java.util.List;
import java.util.LinkedList;

public class Subject {

	public List<Observer> observers = new LinkedList<Observer>(); 

	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
	}
}