package org.reuseware.sokan.index.indexer;

/**
 * An indexer that is never invoked automatically but has
 * to be called by the <code>getDependent()</code> method 
 * of another indexer.
 */
public interface CalledIndexer extends Indexer { }
