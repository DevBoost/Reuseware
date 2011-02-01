package org.reuseware.sokan.index.indexer;

/**
 * An indexer that performs important dependency calculations.
 * In contrast to a normal indexer, a dependency indexer also
 * get called for artifacts that are removed from a store
 * upon removal.
 */
public interface DependencyIndexer extends Indexer { }
