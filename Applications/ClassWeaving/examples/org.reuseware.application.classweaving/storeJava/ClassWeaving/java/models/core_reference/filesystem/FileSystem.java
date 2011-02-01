package org.reuseware.test;


public class FileSystem {
	public java.lang.String name ;
	public java.util.List < org.reuseware.test.FSFolder > subjectFolder = new java.util.LinkedList < org.reuseware.test.FSFolder > ( ) ;
	public void updatFolder () {
	java.util.Iterator < org.reuseware.test.FSFolder > it ;
	it = subjectFolder.iterator ( ) ;
	while ( it.hasNext ( ) ) {
		org.reuseware.test.FSFolder subject ;
		subject = it.next ( ) ;
		subject.notify ( ) ;
	}
}
	public java.util.List < org.reuseware.test.FSFile > subjectFile = new java.util.LinkedList < org.reuseware.test.FSFile > ( ) ;
	public void updatFile () {
	java.util.Iterator < org.reuseware.test.FSFile > it ;
	it = subjectFile.iterator ( ) ;
	while ( it.hasNext ( ) ) {
		org.reuseware.test.FSFile subject ;
		subject = it.next ( ) ;
		subject.notify ( ) ;
	}
}
}