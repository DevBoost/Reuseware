package org.reuseware.sokan.test.index.indexer;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.sokan.ID;
import org.reuseware.sokan.IndexMetaData;
import org.reuseware.sokan.index.DependencyMap;
import org.reuseware.sokan.index.indexer.Indexer;
import org.reuseware.sokan.index.util.ResourceUtil;
import org.reuseware.sokan.index.util.SokanConst;
import org.reuseware.sokan.test.index.indexer.util.DependencyTestUtil;

public class DependencyIndexer implements Indexer {

	private ID id;

	public void createIndex(URI artifactURI, IndexMetaData part,
			ResourceSet resourceSet) {

		part.putSingle("name", artifactURI.lastSegment());
		part.putSingle("time", DependencyTestUtil.now());
	}

	public void getDependent(ID artifactID, DependencyMap depMap) {
		id = artifactID;

		// 0
		if (id == null || id.equals(""))
			return;

		Map<ID, Set<String>> dep = trivial();

		if (dep == null)
			dep = list();

		if (dep == null)
			dep = binarList();

		if (dep == null)
			dep = binarTree();

		if (dep == null)
			dep = complexPositive();

		if (dep == null)
			dep = complexNegative();

		if (dep == null)
			dep = dualTrivial();

		if (dep == null)
			dep = dualNormal();

		if (dep == null)
			dep = dualComplex();

		if (dep == null)
			dep = multi();

		depMap.putAll(dep);
	}

	private Map<ID, Set<String>> trivial() {
		// 1
		if (equal("A1"))
			return dependsOn(null);

		// 2
		if (equal("A2"))
			return dependsOn("A2");

		return null;
	}

	private Map<ID, Set<String>> list() {
		// 3
		if (equal("A3"))
			return dependsOn("B3");

		// 4
		if (equal("A4"))
			return dependsOn("B4");
		if (equal("B4"))
			return dependsOn("B4");

		// 5
		if (equal("A5"))
			return dependsOn("B5");
		if (equal("B5"))
			return dependsOn("A5");

		// 6
		if (equal("A6"))
			return dependsOn("B6");
		if (equal("B6"))
			return dependsOn("C6");

		// 7
		if (equal("A7"))
			return dependsOn("B7");
		if (equal("B7"))
			return dependsOn("C7");
		if (equal("C7"))
			return dependsOn("C7");

		// 8
		if (equal("A8"))
			return dependsOn("B8");
		if (equal("B8"))
			return dependsOn("C8");
		if (equal("C8"))
			return dependsOn("A8");

		// 9
		if (equal("A9"))
			return dependsOn("B9");
		if (equal("B9"))
			return dependsOn("C9");
		if (equal("C9"))
			return dependsOn("B9");

		return null;
	}

	private Map<ID, Set<String>> binarList() {
		// 10
		if (equal("A10"))
			return dependsOn("A10,A10");

		// 11
		if (equal("A11"))
			return dependsOn("A11,B11");

		// 12
		if (equal("A12"))
			return dependsOn("B12,B12");

		// 13
		if (equal("A13"))
			return dependsOn("B13,B13");
		if (equal("B13"))
			return dependsOn("B13");

		// 14
		if (equal("A14"))
			return dependsOn("B14,B14");
		if (equal("B14"))
			return dependsOn("B14,B14");

		// 15
		if (equal("A15"))
			return dependsOn("B15,B15");
		if (equal("B15"))
			return dependsOn("A15");

		// 16
		if (equal("A16"))
			return dependsOn("B16,B16");
		if (equal("B16"))
			return dependsOn("A16,A16");

		return null;
	}

	private Map<ID, Set<String>> binarTree() {
		// 17
		if (equal("A17"))
			return dependsOn("B17,C17");

		// 18
		if (equal("A18"))
			return dependsOn("B18,C18");
		if (equal("B18"))
			return dependsOn("B18");

		// 19
		if (equal("A19"))
			return dependsOn("B19,C19");
		if (equal("B19"))
			return dependsOn("B19");
		if (equal("C19"))
			return dependsOn("C19");

		// 20
		if (equal("A20"))
			return dependsOn("B20,C20");
		if (equal("B20"))
			return dependsOn("A20");

		// 21
		if (equal("A21"))
			return dependsOn("B21,C21");
		if (equal("B21"))
			return dependsOn("A21");
		if (equal("C21"))
			return dependsOn("A21");

		// 22
		if (equal("A22"))
			return dependsOn("B22,C22");
		if (equal("B22"))
			return dependsOn("C22");

		// 23
		if (equal("A23"))
			return dependsOn("B23,C23");
		if (equal("B23"))
			return dependsOn("C23");
		if (equal("C23"))
			return dependsOn("C23");

		// 24
		if (equal("A24"))
			return dependsOn("B24,C24");
		if (equal("B24"))
			return dependsOn("C24");
		if (equal("C24"))
			return dependsOn("B24");

		return null;
	}

	private Map<ID, Set<String>> complexPositive() {
		// 25
		if (equal("A25"))
			return dependsOn("B25,C25,D25");

		// 26
		if (equal("A26"))
			return dependsOn("B26,C26,D26");
		if (equal("B26"))
			return dependsOn("C26");
		if (equal("C26"))
			return dependsOn("D26");

		// 27
		if (equal("A27"))
			return dependsOn("B27,C27,D27");
		if (equal("B27"))
			return dependsOn("E27");
		if (equal("C27"))
			return dependsOn("E27");
		if (equal("D27"))
			return dependsOn("E27");

		// 28
		if (equal("A28"))
			return dependsOn("B28,C28");
		if (equal("B28"))
			return dependsOn("D28,E28");
		if (equal("C28"))
			return dependsOn("E28,F28");

		// 29
		if (equal("A29"))
			return dependsOn("B29,C29");
		if (equal("B29"))
			return dependsOn("D29,E29");
		if (equal("C29"))
			return dependsOn("E29,F29");
		if (equal("D29"))
			return dependsOn("E29");
		if (equal("E29"))
			return dependsOn("F29");

		// 30
		if (equal("A30"))
			return dependsOn("B30,C30");
		if (equal("B30"))
			return dependsOn("D30,E30");
		if (equal("E30"))
			return dependsOn("G30,F30");

		// 31
		if (equal("A31"))
			return dependsOn("B31,C31,D31");
		if (equal("B31"))
			return dependsOn("E31,F31");
		if (equal("C31"))
			return dependsOn("F31");
		if (equal("F31"))
			return dependsOn("D31");

		return null;
	}

	private Map<ID, Set<String>> complexNegative() {
		// 32
		if (equal("A32"))
			return dependsOn("B32,C32,D32");
		if (equal("B32"))
			return dependsOn("A32");

		// 33
		if (equal("A33"))
			return dependsOn("B33,C33,D33");
		if (equal("B33"))
			return dependsOn("E33");
		if (equal("C33"))
			return dependsOn("E33");
		if (equal("D33"))
			return dependsOn("E33");
		if (equal("E33"))
			return dependsOn("A33");

		// 34
		if (equal("A34"))
			return dependsOn("B34,C34");
		if (equal("B34"))
			return dependsOn("D34,E34");
		if (equal("E34"))
			return dependsOn("F34");
		if (equal("F34"))
			return dependsOn("A34");

		// 35
		if (equal("A35"))
			return dependsOn("B35,C35");
		if (equal("B35"))
			return dependsOn("D35,E35");
		if (equal("D35"))
			return dependsOn("E35");
		if (equal("E35"))
			return dependsOn("F35,D35");

		return null;
	}

	private Map<ID, Set<String>> dualTrivial() {
		// 36
		if (equal("A36_1"))
			return dependsOn(null);
		if (equal("A36_2"))
			return dependsOn(null);

		// 37
		if (equal("A37_1"))
			return dependsOn("A37_2");
		if (equal("A37_2"))
			return dependsOn(null);

		// 38
		if (equal("A38_1"))
			return dependsOn("A38_2");
		if (equal("A38_2"))
			return dependsOn("A38_1");
		return null;
	}

	private Map<ID, Set<String>> dualNormal() {
		// 39
		if (equal("A39_1"))
			return dependsOn("A39_2");
		if (equal("A39_2"))
			return dependsOn("B39");

		// 40
		if (equal("A40_1"))
			return dependsOn("B40");
		if (equal("A40_2"))
			return dependsOn("B40");

		// 41
		if (equal("A41_1"))
			return dependsOn("B41");
		if (equal("A41_2"))
			return dependsOn("C41");

		// 42
		if (equal("A42_1"))
			return dependsOn("B42");
		if (equal("A42_2"))
			return dependsOn("C42");
		if (equal("B42"))
			return dependsOn("C42");

		// 43
		if (equal("A43_1"))
			return dependsOn("B43");
		if (equal("A43_2"))
			return dependsOn("C43");
		if (equal("B43"))
			return dependsOn("A43_2");

		// 44
		if (equal("A44_1"))
			return dependsOn("B44");
		if (equal("A44_2"))
			return dependsOn("C44");
		if (equal("B44"))
			return dependsOn("C44");
		if (equal("C44"))
			return dependsOn("B44");

		// 45
		if (equal("A45_1"))
			return dependsOn("B45");
		if (equal("A45_2"))
			return dependsOn("C45");
		if (equal("B45"))
			return dependsOn("C45");
		if (equal("C45"))
			return dependsOn("A45_1");

		return null;
	}

	private Map<ID, Set<String>> dualComplex() {
		// 46
		if (equal("A46_1"))
			return dependsOn("B46");
		if (equal("A46_2"))
			return dependsOn("C46");
		if (equal("B46"))
			return dependsOn("D46,E46");
		if (equal("E46"))
			return dependsOn("C46");

		// 47
		if (equal("A47_1"))
			return dependsOn("B47");
		if (equal("A47_2"))
			return dependsOn("C47");
		if (equal("B47"))
			return dependsOn("D47,E47");
		if (equal("E47"))
			return dependsOn("A47_2");

		// 48
		if (equal("A48_1"))
			return dependsOn("B48");
		if (equal("A48_2"))
			return dependsOn("C48");
		if (equal("B48"))
			return dependsOn("D48,E48");
		if (equal("D48"))
			return dependsOn("A48_1");
		if (equal("C48"))
			return dependsOn("B48");

		return null;
	}

	private Map<ID, Set<String>> multi() {
		// 49
		if (equal("A49_1"))
			return dependsOn("A49_3,B49");
		if (equal("A49_2"))
			return dependsOn("C49,D49");
		if (equal("A49_3"))
			return dependsOn("E49");
		if (equal("C49"))
			return dependsOn("F49,G49,H49");
		if (equal("E49"))
			return dependsOn("I49");
		if (equal("F49"))
			return dependsOn("A49_1");
		if (equal("I49"))
			return dependsOn("A49_2");

		// 50
		if (equal("A50_1"))
			return dependsOn(null);
		if (equal("A50_2"))
			return dependsOn("B50");
		if (equal("A50_3"))
			return dependsOn("C50");
		if (equal("A50_4"))
			return dependsOn("D50");
		if (equal("B50"))
			return dependsOn("F50,E50");
		if (equal("C50"))
			return dependsOn("A50_2");
		if (equal("D50"))
			return dependsOn("G50,H50");
		if (equal("E50"))
			return dependsOn("B50,F50");
		if (equal("F50"))
			return dependsOn("C50");
		if (equal("G50"))
			return dependsOn("C50");
		if (equal("H50"))
			return dependsOn("G50");

		return null;
	}

	private Map<ID, Set<String>> dependsOn(String fileName) {
	    Map<ID, Set<String>> depMap = new LinkedHashMap<ID, Set<String>>();
		Map<ID, List<Indexer>> d = DependencyTestUtil.dependsOn(fileName);
		for (ID depID : d.keySet()) {
			depMap.put(depID, Collections.singleton(
					DependencyIndexer.class.getCanonicalName()));
		}
		return depMap;
	}

	private boolean equal(String string) {
		return ResourceUtil.idString(id).equals(SokanConst.SEPERATOR + string);
	}
}
