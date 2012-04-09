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
package org.reuseware.sokan.test.util;

import java.io.File;

import org.reuseware.sokan.index.CommitCache;
import org.reuseware.sokan.index.indexer.IndexerConfiguration;
import org.reuseware.sokan.index.util.IndexUtil;

public class TestData extends AbstractData {
	public static final TestData INSTANCE = getInstance();
	public static final String ID_DEPENDENCY_INDEXER = "org.reuseware.sokan.test.index.dependencyIndexer";
	public static final String ID_FACET_COUNT_INDEXER = "org.reuseware.sokan.test.index.countIndexer";
	public static final String ID_FACET_COLOR_INDEXER = "org.reuseware.sokan.test.index.colorIndexer";
	private static TestData instance;

	// misc
	public boolean updateFlag;
	public int c_A7 = 0;
	public int c_B7 = 0;
	public File deltaTestADD;
	public File deltaTestREMOVE;

	// not indexed resources
	public File noStore;
	public File notExistFile;
	public File notinstorefile;

	// test artifacts
	// trivial
	public File a1;
	public File a2;

	// list
	public File a3, b3;
	public File a4, b4;
	public File a5, b5;
	public File a6, b6, c6;
	public File a7, b7, c7;
	public File a8, b8, c8;
	public File a9, b9, c9;

	// binaryList
	public File a10;
	public File a11, b11;
	public File a12, b12;
	public File a13, b13;
	public File a14, b14;
	public File a15, b15;
	public File a16, b16;

	// binaryTree
	public File a17, b17, c17;
	public File a18, b18, c18;
	public File a19, b19, c19;
	public File a20, b20, c20;
	public File a21, b21, c21;
	public File a22, b22, c22;
	public File a23, b23, c23;
	public File a24, b24, c24;

	// complexPos
	public File a25, b25, c25, d25;
	public File a26, b26, c26, d26;
	public File a27, b27, c27, d27, e27;
	public File a28, b28, c28, d28, e28, f28;
	public File a29, b29, c29, d29, e29, f29;
	public File a30, b30, c30, d30, e30, f30, g30;
	public File a31, b31, c31, d31, e31, f31;

	// complexNeg
	public File a32, b32, c32, d32;
	public File a33, b33, c33, d33, e33;
	public File a34, b34, c34, d34, e34, f34;
	public File a35, b35, c35, d35, e35, f35;

	// dualTrivial
	public File a36_1, a36_2;
	public File a37_1, a37_2;
	public File a38_1, a38_2;

	// dualNormal
	public File a39_1, a39_2, b39;
	public File a40_1, a40_2, b40;
	public File a41_1, a41_2, b41, c41;
	public File a42_1, a42_2, b42, c42;
	public File a43_1, a43_2, b43, c43;
	public File a44_1, a44_2, b44, c44;
	public File a45_1, a45_2, b45, c45;

	// dualComplex
	public File a46_1, a46_2, b46, c46, d46, e46;
	public File a47_1, a47_2, b47, c47, d47, e47;
	public File a48_1, a48_2, b48, c48, d48, e48;

	// multi
	public File a49_1, a49_2, a49_3, b49, c49, d49, e49, f49, g49, h49, i49;
	public File a50_1, a50_2, a50_3, a50_4, b50, c50, d50, e50, f50, g50, h50;

	// test folders containing the test artifacts
	public File trivial, list, binaryList, binaryTree, complexPos,
			complexNeg;
	public File dualTrivial, dualNormal, dualComplex;
	public File multi;

	// first level dependencies of cases 0-50
	// trivial
	public CommitCache fLvlDep0, fLvlDep1, fLvlDep2;

	// list
	public CommitCache fLvlDep3, fLvlDep4, fLvlDep5,
			fLvlDep6, fLvlDep7, fLvlDep8, fLvlDep9;

	// binaryList
	public CommitCache fLvlDep10, fLvlDep11, fLvlDep12,
			fLvlDep13, fLvlDep14, fLvlDep15, fLvlDep16;

	// binaryTree
	public CommitCache fLvlDep17, fLvlDep18, fLvlDep19,
			fLvlDep20, fLvlDep21, fLvlDep22, fLvlDep23, fLvlDep24;

	// complexPositive
	public CommitCache fLvlDep25, fLvlDep26, fLvlDep27,
			fLvlDep28, fLvlDep29, fLvlDep30, fLvlDep31;

	// complexNegative
	public CommitCache fLvlDep32, fLvlDep33, fLvlDep34,
			fLvlDep35;

	// dualTrivial
	public CommitCache fLvlDep36, fLvlDep37, fLvlDep38;

	// dualNormal
	public CommitCache fLvlDep39, fLvlDep40, fLvlDep41,
			fLvlDep42, fLvlDep43, fLvlDep44, fLvlDep45;

	// dualComplex
	public CommitCache fLvlDep46, fLvlDep47, fLvlDep48;

	// multi
	public CommitCache fLvlDep49, fLvlDep50;

	private TestData() {
	}

	private static TestData getInstance() {
		if (instance == null)
			instance = new TestData();
		return instance;
	}

	public String getCase(int number) {
		switch (number) {
		// trivial
		case 0:
			return null;
		case 1:
			return "A1";
		case 2:
			return "A2";

			// list
		case 3:
			return "A3,B3";
		case 4:
			return "A4,B4";
		case 5:
			return "A5,B5";
		case 6:
			return "A6,B6,C6";
		case 7:
			return "A7,B7,C7";
		case 8:
			return "A8,B8,C8";
		case 9:
			return "A9,B9,C9";

			// binaryList
		case 10:
			return "A10";
		case 11:
			return "A11,B11";
		case 12:
			return "A12,B12";
		case 13:
			return "A13,B13";
		case 14:
			return "A14,B14";
		case 15:
			return "A15,B15";
		case 16:
			return "A16,B16";

			// binaryTree
		case 17:
			return "A17,B17,C17";
		case 18:
			return "A18,B18,C18";
		case 19:
			return "A19,B19,C19";
		case 20:
			return "A20,B20,C20";
		case 21:
			return "A21,B21,C21";
		case 22:
			return "A22,B22,C22";
		case 23:
			return "A23,B23,C23";
		case 24:
			return "A24,B24,C24";

			// complex Positive
		case 25:
			return "A25,B25,C25,D25";
		case 26:
			return "A26,B26,C26,D26";
		case 27:
			return "A27,B27,C27,D27,E27";
		case 28:
			return "A28,B28,C28,D28,E28,F28";
		case 29:
			return "A29,B29,C29,D29,E29,F29";
		case 30:
			return "A30,B30,C30,D30,E30,F30,G30";
		case 31:
			return "A31,B31,C31,D31,E31,F31";

			// complex Negative
		case 32:
			return "A32,B32,C32,D32";
		case 33:
			return "A33,B33,C33,D33,E33";
		case 34:
			return "A34,B34,C34,D34,E34,F34";
		case 35:
			return "A35,B35,C35,D35,E35,F35";

			// dualTrivial
		case 36:
			return "A36_1,A36_2";
		case 37:
			return "A37_1,A37_2";
		case 38:
			return "A38_1,A38_2";

			// dualNormal
		case 39:
			return "A39_1,A39_2,B39";
		case 40:
			return "A40_1,A40_2,B40";
		case 41:
			return "A41_1,A41_2,B41,C41";
		case 42:
			return "A42_1,A42_2,B42,C42";
		case 43:
			return "A43_1,A43_2,B43,C43";
		case 44:
			return "A44_1,A44_2,B44,C44";
		case 45:
			return "A45_1,A45_2,B45,C45";

			// dualComplex
		case 46:
			return "A46_1,A46_2,B46,C46,D46,E46";
		case 47:
			return "A47_1,A47_2,B47,C47,D47,E47";
		case 48:
			return "A48_1,A48_2,B48,C48,D48,E48";

			// multi
		case 49:
			return "A49_1,A49_2,A49_3,B49,C49,D49,E49,F49,G49,H49,I49";
		case 50:
			return "A50_1,A50_2,A50_3,A50_4,B50,C50,D50,E50,F50,G50,H50";

		default:
			return null;
		}
	}

	public void addIndexer(IndexerConfiguration indexerConfiguration) {
		IndexUtil.INSTANCE.addIndexer(indexerConfiguration);
	}
}
