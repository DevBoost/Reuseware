package org.reuseware.sokan.index.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.IndexRow;
import org.reuseware.sokan.SokanFactory;

/**
 * Utility class for working with index row objects.
 */
public final class RowUtil {

	private RowUtil() { }
	
	/**
	 * Constructs a new index row object based on the arguments.
	 * 
	 * @param idString id of the artifact indexed in the row (as String)
	 * @param phyURI   URI of the artifacts
	 * @param metaData meta-data of the artifact
	 * @return a new index row
	 */
	public static IndexRow buildIndexRow(String idString, String phyURI,
			IndexMetaData metaData) {
		IndexRow row = SokanFactory.eINSTANCE.createIndexRow();

		row.setArtifactID(ResourceUtil.idFrom(idString));
		row.setPhyURI(phyURI);

		IndexMetaData newMetaData = buildMetaData();
		newMetaData.putAll(metaData);
		row.setMetaData(newMetaData);

		return row;
	}
	
	/**
	 * Constructs a new index row object based on the arguments.
	 * 
	 * @param idString id of the artifact indexed in the row (as String)
	 * @param phyURI   URI of the artifacts
	 * @param metaData meta-data of the artifact
	 * @param generated whether the artifact is generated or not
	 * @return a new index row
	 */
	public static IndexRow buildIndexRow(String idString, String phyURI,
			IndexMetaData metaData, boolean generated) {
		IndexRow row = buildIndexRow(idString, phyURI, metaData);
		row.setGenerated(generated);
		return row;
	}

	/**
	 * @return an empty meta-data object
	 */
	public static IndexMetaData buildMetaData() {
		IndexMetaData data = SokanFactory.eINSTANCE.createIndexMetaData();
		return data;
	}

	/**
	 * Creates a copy of the given index row.
	 * 
	 * @param indexRow the index row to clone
	 * @return the clone of the row
	 */
	public static IndexRow clone(IndexRow indexRow) {
		String idString = ResourceUtil.idString(indexRow.getArtifactID());
		String phyURI = indexRow.getPhyURI();
		IndexMetaData metaData = indexRow.getMetaData();
		boolean generated = indexRow.isGenerated();

		return buildIndexRow(idString, phyURI, metaData, generated);
	}

	/**
	 * Finds the row for the artifact with the given ID in the given collection of rows.
	 * 
	 * @param artifactID the ID of the artifact
	 * @param rows the collection of rows to query
	 * @return the row of the artifact (null if not found in given collection)
	 */
	public static IndexRow findRowFor(ID artifactID, Collection<IndexRow> rows) {
		if (rows == null) {
			return null;
		}
		for (IndexRow indexRow : rows) {
			if (indexRow.getArtifactID().equals(artifactID)) {
				return indexRow;
			}
		}

		return null;
	}

	/**
	 * Retrieves the artifact identifiers stored in the given index rows.
	 * <code>null</code> is retrieved if the requested list of index rows is
	 * <code>null</code>.
	 * 
	 * @param indexRows
	 *            The rows identifiers should be extracted from.
	 * @return A list of artifact identifiers.
	 */
	public static List<ID> idListFromRows(List<IndexRow> indexRows) {
		if (indexRows == null) {
			return Collections.emptyList();
		}
		List<ID> idList = new ArrayList<ID>(indexRows.size());
		for (IndexRow indexRow : indexRows) {
			idList.add(indexRow.getArtifactID());
		}
		return idList;
	}



}
