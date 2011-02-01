/*******************************************************************************
 * Copyright (c) 2006-2009
 * Software Technology Group, Dresden University of Technology
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Software Technology Group - TU Dresden, Germany
 *      - initial API and implementation
 ******************************************************************************/
package org.reuseware.coconut.roundtrip.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.emftext.language.java.classifiers.ClassifiersPackage;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.MembersFactory;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.statements.LocalVariableStatement;
import org.emftext.language.java.statements.StatementsPackage;
import org.emftext.language.java.statements.impl.LocalVariableStatementImpl;
import org.emftext.language.java.types.TypesFactory;
import org.emftext.language.java.variables.LocalVariable;
import org.emftext.language.java.variables.VariablesPackage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.reuseware.coconut.compositionprogram.CompositionProgram;
import org.reuseware.coconut.compositionsystem.resource.csys.util.CsysEObjectUtil;
import org.reuseware.coconut.compositionsystem.resource.csys.util.CsysStreamUtil;
import org.reuseware.coconut.fragment.ComposedFragment;
import org.reuseware.coconut.fragment.Fragment;
import org.reuseware.coconut.fragment.util.IModificationHandler;
import org.reuseware.coconut.resource.update.CyclicDependencyException;
import org.reuseware.coconut.roundtrip.RoundtripModificationHandlerFactory;
import org.reuseware.coconut.roundtrip.test.util.FileHelper;

public class RoundtripTest extends AbstractRoundtripTest {
	
	private LocalVariableStatementImpl copiedVariable;
	private ComponentsCreator creator = new ComponentsCreator();
	private TestModificationHandler testHandler;
	private TestConflictResolver testResolver;
	private IModificationHandler roundtripHandler;

	@Before
	public void setUp() {
		try {
			setDoOutput(false);
			super.setUp();
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			FileHelper helper = new FileHelper();
			helper.clear(new File(ComponentsCreator.PATH_TO_WORKING_DIR));
			helper.clear(new File(ComponentsCreator.PATH_TO_OUTPUT_DIR));
			helper.copyDir(
					new File(ComponentsCreator.PATH_TO_INPUT_DIR), 
					new File(ComponentsCreator.PATH_TO_WORKING_DIR)
			);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		registerFragments();

		createCompositionProgram1();
		createCompositionProgram2();

		testHandler = new TestModificationHandler();
		testResolver = new TestConflictResolver();
		roundtripHandler = RoundtripModificationHandlerFactory.INSTANCE.createRoundtripModificationHandler(testResolver);
	}
	
	@After
	public void tearDown() {
		assertUnregisterEverything();
	}

	@Test
	public void testNonConflictingChanges() {

		ComposedFragment composedFragment = getComposedFragment(ComponentsCreator.UFI_COMPOSED_1, testHandler, roundtripHandler);

		changeAttribute(composedFragment);
		assertNumberOfChanges(1);
		assertIsChangedOne();
		
		changeAttributeBack(composedFragment);
		assertIsChangedTwo();

		changeAttribute(composedFragment);
		assertIsChangedOne();

		changeAttributeBack(composedFragment);
		assertIsChangedTwo();

		deleteVariable(composedFragment, "newvalue");
		assertIsRemoved();

		testResolver.setDoCopyFragment(false);
		assertTrue("Adding the variable should be successful.", addVariable(composedFragment));
		assertIsAdded();
		deleteVariable(composedFragment, "newvalue");
		assertIsRemoved();

		testResolver.setDoCopyFragment(false);
		addVariable(composedFragment);
		assertIsAdded();
	}

	@Test
	public void testConflictingChange_AddMethod1() {
		ComposedFragment composedFragment = getComposedFragment(ComponentsCreator.UFI_COMPOSED_2);
		testResolver.setSelectedFragmentUFI(URI.createURI(ComponentsCreator.REUSEWARE_UFI_SOURCE_2));
		// propagate to targets of all composition programs
		testResolver.setDoCopyFragment(false);
		addMethod(composedFragment);
		assertMethodIsAdded1();
	}
	
	@Test
	public void testConflictingChange_AddMethod2() {
		ComposedFragment composedFragment = getComposedFragment(ComponentsCreator.UFI_COMPOSED_2);
		testResolver.setSelectedFragmentUFI(URI.createURI(ComponentsCreator.REUSEWARE_UFI_SOURCE_2));
		// propagate to targets of all composition programs
		testResolver.setDoCopyFragment(true);
		testResolver.setNewNameForCopiedFragment(URI.createURI("./work/repository/Source4.java"));
		addMethod(composedFragment);
		assertMethodIsAdded2();
	}

	private void createCompositionProgram1() {
		CompositionProgram compositionProgram = creator.createCompositionProgram1();
		String path = ComponentsCreator.PATH_TO_WORKING_REPOSITORY_DIR + "composition_program1.fc";
		saveAndRegisterCompositionProgram(compositionProgram, path);
	}

	private void createCompositionProgram2() {
		CompositionProgram compositionProgram = creator.createCompositionProgram2();
		String path = ComponentsCreator.PATH_TO_WORKING_REPOSITORY_DIR + "composition_program2.fc";
		saveAndRegisterCompositionProgram(compositionProgram, path);
	}

	private void saveAndRegisterCompositionProgram(CompositionProgram compositionProgram, String path) {
		creator.saveCompositionProgram(compositionProgram, path);
		File file = new File(path);
		try {
			assertRegisterCompositionProgram(file, URI.createFileURI(new File(TEMP_STORE_URI).getCanonicalPath() + "/"));
		} catch (IOException e) {
			fail(e.getMessage());
		}
		try {
			getChangeSet().propagate();
		} catch (CyclicDependencyException e) {
			fail(e.getMessage());
		}
	}

	private void registerFragments() {
		setUpJava();

		try {
			assertRegisterFragmentStore( 
					CompositionTestPlugin.PLUGIN_ID, 
					ComponentsCreator.PATH_TO_WORKING_DIR,
					new String[] {"java"});
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	private void assertNumberOfChanges(int i) {
		assertEquals(i + " changes expected.", i, testHandler.getEvents().size());
	}

	private void assertIsChangedOne() {
		assertFilesAreSame(
				"Source2_changed1.java", 
				ComponentsCreator.JAVA_SOURCE_2, 
				"Source2.java should be changed correctly."
				);
	}

	private void assertIsChangedTwo() {
		assertFilesAreSame(
				"Source2_changed2.java", 
				ComponentsCreator.JAVA_SOURCE_2, 
				"Source2.java should be changed correctly."
				);
	}

	private void assertIsRemoved() {
		assertFilesAreSame(
				"Source2_removed.java", 
				ComponentsCreator.JAVA_SOURCE_2, 
				"Attribute should be deleted"
				);
	}

	private void assertIsAdded() {
		assertFilesAreSame(
				"Source2_added.java", 
				ComponentsCreator.JAVA_SOURCE_2, 
				"Attribute should be added"
				);
	}
	
	private void assertMethodIsAdded1() {
		assertFilesAreSame(
				"Source2_method_added.java", 
				ComponentsCreator.JAVA_SOURCE_2, 
				"Method should be added"
				);
	}
	
	private void assertMethodIsAdded2() {
		assertFilesAreSame(
				"Source4.java", 
				ComponentsCreator.JAVA_SOURCE_4, 
				"Method should be added"
				);
	}
	
	private void assertFilesAreSame(String expectedFile, String actualFile, String message) {
		boolean result = compare(
				ComponentsCreator.PATH_TO_COMPARE_DIR + "/" + expectedFile,
				ComponentsCreator.PATH_TO_WORKING_REPOSITORY_DIR + "/" + actualFile
			);
		assertTrue(message, result);
	}

	private void changeAttribute(Fragment fragment) {
		assertTrue("The attribute should be changed.", changeAttribute("myVariable", "testVariable", fragment));
	}

	private void changeAttributeBack(Fragment fragment) {
		assertTrue("The attribute change should be reverted.", changeAttribute("testVariable", "myVariable", fragment));
	}

	private boolean changeAttribute(String from, String to, Fragment fragment) {
		EList<EObject> compositionContent = fragment.getContents();
		for (EObject contentObject : compositionContent) {
			TreeIterator<EObject> allContents = contentObject.eAllContents();
			Collection<LocalVariable> variables = CsysEObjectUtil.getObjectsByType(allContents, VariablesPackage.eINSTANCE.getLocalVariable());
			for (LocalVariable localVariable : variables) {
				if (localVariable.getName().equals(from)) {
					localVariable.setName(to);
					return true;
				}
			}
		}
		return false;
	}

	private void deleteVariable(Fragment fragment, String variableName) {
		EList<EObject> compositionContent = fragment.getContents();
		for (EObject contentObject : compositionContent) {
			TreeIterator<EObject> allContents = contentObject.eAllContents();
			Collection<LocalVariableStatement> statements = CsysEObjectUtil.getObjectsByType(allContents, StatementsPackage.eINSTANCE.getLocalVariableStatement());
			for (LocalVariableStatement statement : statements) {
				if (statement.getVariable().getName().equals(variableName)) {
					Copier copier = new Copier();
					copiedVariable = (LocalVariableStatementImpl) copier.copy(statement);
					copiedVariable.eAdapters().clear();
					EcoreUtil.remove(statement);
				}
			}
		}
	}

	private boolean addVariable(Fragment fragment) {
		EList<EObject> compositionContent = fragment.getContents();
		for (EObject contentObject : compositionContent) {
			TreeIterator<EObject> allContents = contentObject.eAllContents();
			Collection<LocalVariableStatement> statements = CsysEObjectUtil.getObjectsByType(allContents, StatementsPackage.eINSTANCE.getLocalVariableStatement());
			for (LocalVariableStatement statement : statements) {
				ClassMethod method = (ClassMethod) statement.eContainer();

				if (method.getName().equals("Prototype_Fragment2")) {
					method.getStatements().add(copiedVariable);
					//System.out.println("copy: " + copiedVariable);
					return true;
				}
			}
		}
		return false;
	}

	private void addMethod(Fragment fragment) {
		Method newMethod = MembersFactory.eINSTANCE.createClassMethod();
		newMethod.setName("testAddMethod");
		newMethod.setTypeReference(TypesFactory.eINSTANCE.createVoid());

		EList<EObject> contents = fragment.getContents();
		Collection<org.emftext.language.java.classifiers.Class> clazzes = new LinkedHashSet<org.emftext.language.java.classifiers.Class>();
		for (EObject content : contents) {
			Collection<org.emftext.language.java.classifiers.Class> foundClasses = CsysEObjectUtil.getObjectsByType(content.eAllContents(), ClassifiersPackage.eINSTANCE.getClass_());
			clazzes.addAll(foundClasses);
		}
		for (org.emftext.language.java.classifiers.Class clazz : clazzes) {
			clazz.getMembers().add(newMethod);
			break;
		}
	}

	private boolean compare(String pathToExpectedModel, String pathToActualModel) {
		assertEquals("a\nb", removeWhitespacesAndEmptyLines("a\n\nb"));
		assertEquals("a\nb", removeWhitespacesAndEmptyLines("a\n\n\nb"));
		
		String expected;
		String actual;
		try {
			expected = getContent(pathToExpectedModel);
			actual = getContent(pathToActualModel);
		} catch (IOException e) {
			fail(e.getMessage());
			return false;
		}
		expected = removeWhitespacesAndEmptyLines(expected);
		actual = removeWhitespacesAndEmptyLines(actual);
		expected = trimLines(expected);
		actual = trimLines(actual);
		boolean equal = expected.equals(actual);
		if (!equal) {
			System.out.println("EXPECTED: [" + expected + "]");
			System.out.println("ACTUAL:   [" + actual + "]");
		}
		assertEquals(expected, actual);

		return equal;
	}

	private String getContent(String pathToModel)
			throws FileNotFoundException, IOException {
		FileInputStream inputStream = new FileInputStream(pathToModel);
		String content = CsysStreamUtil.getContent(inputStream);
		inputStream.close();
		return content;
	}

	private String trimLines(String expected) {
		String result = trimLines(expected, "\n");
		result = trimLines(result, "\r");
		result = trimLines(result, "\n\r");
		result = trimLines(result, "\r\n");
		return result;
	}

	private String trimLines(String expected, String lineDelimiter) {
		String[] lines = expected.split(lineDelimiter);
		StringBuffer result = new StringBuffer();
		for (String line : lines) {
			result.append(line.trim() + lineDelimiter);
		}
		return result.toString();
	}

	private String removeWhitespacesAndEmptyLines(String text) {
		String result = text;
		int lengthBefore = result.length();
		while (true) {
			result  = result.replace("\t", "");
			result  = result.replace("\r\n\r\n", "\r\n");
			result  = result.replace("\n\r\n\r", "\n\r");
			result  = result.replace("\r\r", "\r");
			result  = result.replace("\n\n", "\n");
			result  = result.replaceAll("\\A\n", "");
			result  = result.replaceAll("\\A\r", "");
			result  = result.replaceAll(" $", "");
			int lengthAfter = result.length();
			if (lengthAfter == lengthBefore) {
				break;
			}
			lengthBefore = lengthAfter;
		}
		return result;
	}
}
