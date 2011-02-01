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
package org.reuseware.coconut.description.classify.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.reuseware.coconut.description.DateFacet;
import org.reuseware.coconut.description.DescriptionFactory;
import org.reuseware.coconut.description.Facet;
import org.reuseware.coconut.description.FacetDefinition;
import org.reuseware.coconut.description.FacetType;
import org.reuseware.coconut.description.FacetValue;
import org.reuseware.coconut.description.FragmentDescription;
import org.reuseware.coconut.description.ListFacet;
import org.reuseware.coconut.description.Property;
import org.reuseware.coconut.description.RangeFacet;
import org.reuseware.coconut.description.TreeFacet;
import org.reuseware.coconut.description.classify.FacetManager;
import org.reuseware.coconut.description.classify.UtilityProvider;
import org.reuseware.coconut.repository.resource.ReuseResources;

public class TestDataFactory {

	public static void saveDescription() {
		List<FacetType> types = new ArrayList<FacetType>(1);
		types.add(getHierachyFacet());

		FacetDefinition facDef = buildFdef(types);
		System.out.println(facDef);

		// ReuseResources.INSTANCE.getStoreURIMap().put(URI.createURI("platform:/resource/TestProject/facet"),
		// ReuseResources.REUSEWARE_BASE_URI);

		ResourceSet rs = ReuseResources.INSTANCE.getResourceSet();
		URI uri = URI
				.createURI("platform:/resource/DiplomProjekt/store1/models1/baum.fdef");
		Resource res = rs.createResource(uri);
		try {
			res.unload();
			res.getContents().add(facDef);
			res.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(ReuseResources.INSTANCE.register(uri));

		return;

		// FragmentDescription fdesc = buildFdesc();
		// uri = URI
		// .createURI("platform:/resource/TestProject/facet/_facet/EmptyCore.fdesc");
		// res = rs.createResource(uri);
		// try {
		// res.unload();
		// res.getContents().add(fdesc);
		// res.save(null);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}

	@SuppressWarnings("unused")
	static private FragmentDescription buildFdesc() {
		FragmentDescription fdesc = DescriptionFactory.eINSTANCE
				.createFragmentDescription();

		Property name = DescriptionFactory.eINSTANCE.createProperty();
		name.setName("Name");
		name.setValue("CIM Core Model");

		Property author = DescriptionFactory.eINSTANCE.createProperty();
		author.setName("Author");
		author.setValue("Matthias Schmidt");

		Property hint = DescriptionFactory.eINSTANCE.createProperty();
		hint.setName("Hint");
		hint
				.setValue("Das ist der Kern des eigentlichen CIM Models und sollte gut aufbewart werden");

		Property version = DescriptionFactory.eINSTANCE.createProperty();
		version.setName("Version");
		version.setValue("1.0.2");

		fdesc.getProperties().add(name);
		fdesc.getProperties().add(author);
		fdesc.getProperties().add(hint);
		fdesc.getProperties().add(version);

		Facet facet1 = DescriptionFactory.eINSTANCE.createFacet();
		List<String> id = new ArrayList<String>();
		String[] asd = { "_facet", "personen.fdef", "Beruf" };
		for (String string : asd) {
			id.add(string);
		}

		facet1.getTypeID().addAll(id);

		String value = "Architekt";
		facet1.getValueNames().add(value);

		fdesc.getFacets().add(facet1);

		return fdesc;
	}

	static private FacetDefinition buildFdef(List<FacetType> types) {

		// FacetType job = getJobFacet();

		// ****************************************************************************************

		// FacetType hobby = getHobbyFacet();

		// ****************************************************************************************

		FacetDefinition facetDef = DescriptionFactory.eINSTANCE
				.createFacetDefinition();
		facetDef.getFacetTypes().addAll(types);

		// facetDef.getID().add(job.toString());
		// facetDef.getID().add(hobby.toString());

		return facetDef;
	}

	public static FacetType getHobbyFacet() {
		FacetType hobby = DescriptionFactory.eINSTANCE.createListFacet();
		hobby.setName("Freizeitbeschäftigung");
		hobby.setMultiValue(false);
		hobby
				.setDescription("Was die Leute so in ihrer Freizeit am liebsten machen.");

		FacetValue games = DescriptionFactory.eINSTANCE.createFacetValue();
		games.setName("Spiele spielen");

		FacetValue climbing = DescriptionFactory.eINSTANCE.createFacetValue();
		climbing.setName("Klettern gehen");

		FacetValue photo = DescriptionFactory.eINSTANCE.createFacetValue();
		photo.setName("Fotos knipsen");

		hobby.getValues().add(games);
		hobby.getValues().add(climbing);
		hobby.getValues().add(photo);

		return hobby;
	}

	public static FacetType getJobFacet() {
		FacetType job = DescriptionFactory.eINSTANCE.createListFacet();
		job.setName("Beruf");
		job.setMultiValue(false);
		job.setDescription("Bezeichnet was eine Person so macht.");

		FacetValue computerScientist = DescriptionFactory.eINSTANCE
				.createFacetValue();
		computerScientist.setName("Informatiker");
		computerScientist
				.setDescription("Die Leute, die viel mit dem Rechner machen.");

		FacetValue architect = DescriptionFactory.eINSTANCE.createFacetValue();
		architect.setName("Architekt");

		FacetValue engineer = DescriptionFactory.eINSTANCE.createFacetValue();
		engineer.setName("Maschbauer");

		job.getValues().add(computerScientist);
		job.getValues().add(architect);
		job.getValues().add(engineer);

		return job;
	}

	public static FacetType getHierachyFacet() {
		FacetType hierachy = DescriptionFactory.eINSTANCE.createTreeFacet();
		hierachy.setName("Rangordnung");
		hierachy.setMultiValue(false);
		hierachy.setDescription("Ein Baum von Werten!");

		FacetValue boss = DescriptionFactory.eINSTANCE.createFacetValue();
		boss.setName("Der Chef");
		FacetValue manager = DescriptionFactory.eINSTANCE.createFacetValue();
		manager.setName("Der Manager");
		boss.getChildren().add(manager);

		FacetValue employee = DescriptionFactory.eINSTANCE.createFacetValue();
		employee.setName("Arbeiter");

		hierachy.getValues().add(boss);
		hierachy.getValues().add(employee);

		return hierachy;
	}

	public static ListFacet buildListType(String name, String description,
			List<String[]> values) {
		ListFacet type = DescriptionFactory.eINSTANCE.createListFacet();
		type.setName(name);
		type.setDescription(description);

		FacetValue facetValue = null;
		for (String[] value : values) {
			facetValue = DescriptionFactory.eINSTANCE.createFacetValue();
			facetValue.setName(value[0]);
			facetValue.setDescription(value[1]);
			type.getValues().add(facetValue);
		}

		return type;
	}

	private static TreeFacet buildTreeType(String name, String description,
			List<String[]> values) {
		TreeFacet type = DescriptionFactory.eINSTANCE.createTreeFacet();
		type.setName(name);
		type.setDescription(description);

		FacetValue facetValue = null;
		for (String[] value : values) {
			facetValue = DescriptionFactory.eINSTANCE.createFacetValue();
			facetValue.setName(value[0]);
			facetValue.setDescription(value[1]);
			type.getValues().add(facetValue);
		}

		return type;
	}

	private static RangeFacet buildRangeType(String name, String description,
			List<String[]> values) {
		RangeFacet type = DescriptionFactory.eINSTANCE.createRangeFacet();
		type.setName(name);
		type.setDescription(description);

		FacetValue facetValue = null;
		for (String[] value : values) {
			facetValue = DescriptionFactory.eINSTANCE.createFacetValue();
			facetValue.setName(value[0]);
			facetValue.setDescription(value[1]);
			type.getValues().add(facetValue);
		}

		return type;
	}

	private static DateFacet buildDateType(String name, String description,
			List<String[]> values) {
		DateFacet type = DescriptionFactory.eINSTANCE.createDateFacet();
		type.setName(name);
		type.setDescription(description);

		FacetValue facetValue = null;
		for (String[] value : values) {
			facetValue = DescriptionFactory.eINSTANCE.createFacetValue();
			facetValue.setName(value[0]);
			facetValue.setDescription(value[1]);
			type.getValues().add(facetValue);
		}

		return type;
	}

	public static String[] buildValue(String name, String description) {
		String[] back = { name, description };
		return back;
	}

	public static FragmentDescription buildDescription(
			List<String[]> properties, List<Facet> facets) {
		FragmentDescription fDesc = DescriptionFactory.eINSTANCE
				.createFragmentDescription();

		Property property;
		for (String[] prop : properties) {
			property = DescriptionFactory.eINSTANCE.createProperty();
			property.setName(prop[0]);
			property.setValue(prop[1]);
			fDesc.getProperties().add(property);
		}

		fDesc.getFacets().addAll(facets);

		return fDesc;
	}

	public static Facet buildFacet(FacetType type, List<FacetValue> values) {
		Facet back = DescriptionFactory.eINSTANCE.createFacet();

		back.setType(type);
		back.getValues().addAll(values);

		return back;
	}

	// **********************************************************************************************
	// CIM specific facets

	public static void createCIMFacetDefinition() {
		List<FacetType> types = new ArrayList<FacetType>(6);
		FacetType type = null;
		List<String[]> values = new ArrayList<String[]>();

		// Protocol facet
		values.clear();
		values.add(buildValue("IP", "Internet Protocol"));
		values.add(buildValue("DHCP", "Dynamic Host Configuration Protocol"));
		values.add(buildValue("TCP", "Transmission Control Protocol"));
		values.add(buildValue("IPX", "Internetwork Packet Exchange"));
		values.add(buildValue("MPLS", "Multiprotocol Label Switching"));
		values.add(buildValue("Telnet", ""));
		values.add(buildValue("SSH", "Secure Shell"));
		type = buildListType("Protocol", "This describes which protocol is "
				+ "used to communicate.", values);
		type.setMultiValue(true);
		types.add(type);

		// Connection facet
		values.clear();
		values.add(buildValue("Ethernet",
				"Just connected via ordanary ethernet cable."));
		values.add(buildValue("Wifi", "This is a wirless connection"));
		type = buildListType("Connection",
				"This describs which sort of connection was used.", values);
		type.setMultiValue(true);
		types.add(type);

		// Device facet
		values.clear();
		values.add(buildValue("Hub", "Simply network note."));
		values.add(buildValue("Router",
				"Network note and gateway to the internet."));
		values.add(buildValue("Home Device",
				"Combination of router and a number of services."));
		values.add(buildValue("Modem",
				"Device to go online via a telefon line."));
		values.add(buildValue("Port", "A place to plug something in."));
		type = buildListType("Device",
				"Which sort of physical devices where used?", values);
		type.setMultiValue(true);
		types.add(type);

		// CIM_Schema facet
		values.clear();
		values.add(buildValue("CIM_Application", ""));
		values.add(buildValue("CIM_Core", ""));
		values.add(buildValue("CIM_Database", ""));
		values.add(buildValue("CIM_Device", ""));
		values.add(buildValue("CIM_Event", ""));
		values.add(buildValue("CIM_Interop", ""));
		values.add(buildValue("CIM_Metrics", ""));
		values.add(buildValue("CIM_Physical", ""));
		values.add(buildValue("CIM_Policy", ""));
		values.add(buildValue("CIM_Security", ""));
		values.add(buildValue("CIM_System", ""));
		values.add(buildValue("CIM_User", ""));
		type = buildListType(
				"CIM_Schema V2.21.0",
				"CIM is composed of a Specification and a Schema. \n"
						+ "The Schema provides the actual model descriptions, \n"
						+ "while the Specification defines the details \n"
						+ "for integration with other management models.",
				values);
		type.setMultiValue(true);
		types.add(type);

		// Structure facet
		values.clear();
		values.add(buildValue("SingleConcept",
				"Fragment has a very simple structure."));
		values.add(buildValue("MultiConcept",
				"Fragemten has a quit complex inner structure."));
		type = buildListType("Structure",
				"Describes briefly the inner structure of the given concept.",
				values);
		type.setMultiValue(false);
		types.add(type);

		// ElementType facet
		values.clear();
		values.add(buildValue("Logical", "Just a virtual concept."));
		values.add(buildValue("Physical", "This concept does exist."));
		type = buildListType("ElementType",
				"Describes whether the concept exists "
						+ "in the physical world or not.", values);
		type.setMultiValue(false);
		types.add(type);

		// save
		URI uri = URI
				.createURI("platform:/resource/Project/cimStore1/level1/CIMfacets.fdef");
		// .createURI("platform:/resource/DiplomProjekt/store1/models1/CIMfacets.fdef");
		FacetDefinition fDef = buildFdef(types);
		UtilityProvider.save(fDef, uri);
	}

	// **********************************************************************************************
	// general component facets

	public static void createComponentFacetDefinition() {
		List<FacetType> types = new ArrayList<FacetType>(6);
		FacetType type = null;
		List<String[]> values = new ArrayList<String[]>();

		// Meta Language facet
		values.clear();
		values.add(buildValue("C#", ""));
		values.add(buildValue("C++", ""));
		values.add(buildValue("CIM", ""));
		values.add(buildValue("Java", ""));
		values.add(buildValue("Python", ""));
		values.add(buildValue("UML", ""));
		type = buildListType("Meta Language",
				"Gives the language the component is written in.", values);
		type.setMultiValue(false);
		types.add(type);

		// Author facet
		values.clear();
		values.add(buildValue("Telefonica", ""));
		values.add(buildValue("Schmidt", ""));
		values.add(buildValue("ST Group", ""));
		values.add(buildValue("Müller", ""));
		type = buildTreeType("Author",
				"The person or company who created the component.", values);
		type.setMultiValue(true);
		types.add(type);

		// Version facet
		values.clear();
		values.add(buildValue("0.5", ""));
		values.add(buildValue("1.0", ""));
		values.add(buildValue("1.5", ""));
		values.add(buildValue("1.91", ""));
		type = buildListType("Version",
				"The version / release the component was published under.",
				values);
		type.setMultiValue(false);
		types.add(type);

		// Dedicated Composition System facet
		values.clear();
		values.add(buildValue("CIM - Level1", ""));
		values.add(buildValue("CIM - Level2", ""));
		values.add(buildValue("CIM - Level3", ""));
		type = buildListType("Dedicated Composition System", "...", values);
		type.setMultiValue(false);
		types.add(type);

		// Composition Role facet
		values.clear();
		values.add(buildValue("CIM - Port", ""));
		values.add(buildValue("CIM - Hub", ""));
		values.add(buildValue("CIM - DHCPClient", ""));
		type = buildListType("Composition Role", "...", values);
		type.setMultiValue(false);
		types.add(type);

		// System Layer facet
		values.clear();
		values.add(buildValue("GUI", ""));
		values.add(buildValue("Core", ""));
		values.add(buildValue("Data", ""));
		values.add(buildValue("Transport", ""));
		type = buildTreeType("System Layer", "...", values);
		type.setMultiValue(true);
		types.add(type);

		// License facet
		values.clear();
		values.add(buildValue("GNU", ""));
		values.add(buildValue("GPL", ""));
		values.add(buildValue("Mozilla", ""));
		type = buildListType("License", "...", values);
		type.setMultiValue(false);
		types.add(type);

		// Role Model facet
		values.clear();
		values.add(buildValue("Client", ""));
		values.add(buildValue("Server", ""));
		values.add(buildValue("Consumer", ""));
		values.add(buildValue("Producer", ""));
		values.add(buildValue("GOF Roles...", ""));
		type = buildListType("Role Model", "...", values);
		type.setMultiValue(true);
		types.add(type);

		// Last Edited facet
		values.clear();
		values.add(buildValue("09:15 06/4/2009", ""));
		values.add(buildValue("13:23 13/5/2009", ""));
		values.add(buildValue("15:06 14/5/2009", ""));
		values.add(buildValue("20:15 14/5/2009", ""));
		type = buildDateType("Last Edited", "...", values);
		type.setMultiValue(false);
		types.add(type);

		// Maturity facet
		values.clear();
		values.add(buildValue("pre alpha", ""));
		values.add(buildValue("alpha", ""));
		values.add(buildValue("beta", ""));
		values.add(buildValue("pre released", ""));
		values.add(buildValue("released", ""));
		values.add(buildValue("testing", ""));
		values.add(buildValue("stable", ""));
		type = buildTreeType("Maturity", "...", values);
		type.setMultiValue(false);
		types.add(type);

		// Component Taxonomy facet
		values.clear();
		values.add(buildValue("active documents", ""));
		values.add(buildValue("aspect oriented", ""));
		values.add(buildValue("architecture based", ""));
		values.add(buildValue("graph based", ""));
		values.add(buildValue("module oriented", ""));
		values.add(buildValue("object oriented", ""));
		values.add(buildValue("hyperspace oriented", ""));
		type = buildTreeType("Component Taxonomy",
				"Gives a classification for software components.", values);
		type.setMultiValue(true);
		types.add(type);

		// Price facet
		values.clear();
		values.add(buildValue("100$", ""));
		values.add(buildValue("150$", ""));
		values.add(buildValue("300$", ""));
		values.add(buildValue("500$", ""));
		values.add(buildValue("750$", ""));
		values.add(buildValue("1000$", ""));
		type = buildRangeType("Price",
				"Tells you how much the component should cost.", values);
		type.setMultiValue(false);
		types.add(type);

		// save
		URI uri = URI
				.createURI("platform:/resource/FacetRepository/component_store/general/component_facets.fdef");
		FacetDefinition fDef = buildFdef(types);
		UtilityProvider.save(fDef, uri);
	}

	// **********************************************************************************************
	// direct derivable facets

	public static void createDirectDerivableFacets() {
		ListFacet lFacet = DescriptionFactory.eINSTANCE.createListFacet();
		FacetType metaLanguage = FacetManager.buildDirectDerivableType(
						lFacet.eClass(),
						"Meta Language",
						"This is the language the fragment was implemented in.",
						"Extrahiere die Metasprache aus dem Fragment.");

		List<FacetType> types = Collections.singletonList(metaLanguage);

		// save
		URI uri = URI
				.createURI("platform:/resource/"
						+ "library_facets/experimental_store/direct_deriveable/direct_facets.fdef");
		FacetDefinition fDef = buildFdef(types);
		UtilityProvider.save(fDef, uri);
	}
}
