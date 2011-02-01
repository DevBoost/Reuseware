package org.reuseware.sokan.test.misc.cases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.reuseware.sokan.index.solr.SolrConst;
import org.reuseware.sokan.index.solr.SolrUtil;
import org.reuseware.sokan.test.misc.Activator;

/**
 * @author Matthias Schmidt
 * 
 */
public class SolrSchemaTest {
	private String schemaFile = File.separator + SolrConst.FILE_SCHEMA;

	@Test
	public void testSchema() {
		System.out.println("Hallo");

		try {
			copyTestSchema();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//
		// IndexSchema schema = SolrControler.INSTANCE.getIndexSchema();
		//
		// assertTrue(contains(schema, SolrConst.ALL_SYS_FIELDS));
		//
		// assertTrue(checkTypes(schema, SolrConst.ALL_SYS_TYPES));
	}

	// private boolean checkTypes(IndexSchema schema, Map<String, FieldType>
	// types) {
	// String field;
	// FieldType type;
	// for (Entry<String, SchemaField> entry : schema.getFields().entrySet()) {
	// field = entry.getKey();
	// type = entry.getValue().getType();
	//
	// if (!types.get(field).equals(type))
	// return false;
	// }
	//
	// return true;
	// }
	//
	// private boolean contains(IndexSchema schema, List<String> fields) {
	// Set<String> schemaFields = schema.getFields().keySet();
	//
	// boolean contains = true;
	// for (String testField : fields) {
	// contains = false;
	//
	// for (String sField : schemaFields) {
	// if (sField.equals(testField)) {
	// contains = true;
	// break;
	// }
	// }
	//
	// if (!contains)
	// return false;
	// }
	//
	// return true;
	// }

	private void copyTestSchema() {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		IPath path = new Path(schemaFile);
		InputStream in = null;
		FileOutputStream out = null;
		File solrFile = new File(SolrUtil.getConfigurationDir()
				+ File.separator + schemaFile);
		
		try {
			// create solreHome and configDir if needed
			File f = new File(SolrUtil.getConfigurationDir());
			if (!f.exists())
				f.mkdirs();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			in = FileLocator.find(bundle, path, null).openStream();
			out = new FileOutputStream(solrFile, false);

			byte[] buffer = new byte[0xFFFF];
			for (int len; (len = in.read(buffer)) != -1;)
				out.write(buffer, 0, len);
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
					return;
				}
			if (out != null)
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
					return;
				}
		}
	}
}
