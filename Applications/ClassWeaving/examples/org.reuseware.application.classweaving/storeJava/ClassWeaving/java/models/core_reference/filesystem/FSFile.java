package org.reuseware.test;


public class FSFile {
	public java.lang.String name;
	public java.util.List < org.reuseware.test.FileSystem >observers = new java.util.LinkedList < org.reuseware.test.FileSystem >();
	public void attach( org.reuseware.test.FileSystem observer) {
	observers.add(observer);
}
	public void detach( org.reuseware.test.FileSystem observer) {
	observers.remove(observer);
}
	public void notifyObserver() {
}
}