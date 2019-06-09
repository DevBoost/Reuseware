![Reuseware](CoCoNut/org.reuseware.coconut.doc/html/figures/ReusewareLogo.png)

Reuseware is a software composition framework founded on the concepts of Invasive Software Composition (ISC) for developing new software modularization techniques and integrating them into software languages. 

## Installation

* Download Eclipse and install the following:
  * Eclipse Plug-in Development Environment (PDE)
  * Eclipse Modeling Framework (EMF)
  * Graphical Modeling Framework (GMF)
  * EMFText - [emftext.org](https://www.emftext.org)
* Download [Reuseware 1.0.1 (final release)](reuseware-1.0.1.v201207310007.zip) and extract all plugins into Eclipse's *plugin* folder.

## Examples

[https://github.com/DevBoost/Reuseware/tree/master/Applications](https://github.com/DevBoost/Reuseware/tree/master/Applications)

## Overview

The user interface of Reuseware is integrated into the Eclipse platform
and works together with modeling editors available in your Eclipse
installation. Reuseware provides the following three major features:
*Fragment Stores*, the *Fragment Repository View* and the *Composition
Program Editor*.

### Fragment Stores

Fragment stores are folders in you workspace that contain fragments. You
can mark any folder in any kind of project as a fragment store, by
selecting the folder, and pressing the *Activate Fragment Store* Button
in the tool bar

Fragments that are registered in a store are available for reuse in
composition programs. Each fragment has a *Unique Fragment Identifier
(UFI)*. This is defined by a base UFI and the position of the fragment
in the store. You can define the base UFI when activating a store.

Fragment stores can also contain composition system definitions (\*.rex
files) that define how the composition interfaces of fragments are
derived. How those are defined is not covered in this guide. Look at the
[Example Applications](https://github.com/DevBoost/Reuseware/tree/master/Applications)
for ready made composition systems (rex files) you can use.

### Fragment Repository View

The fragment repository view lets you inspect which fragments are
available in your system. Open the vie in Eclipse through *Window \>
Show Views \> Other... \> Reuseware \> Fragment Repository*.

From the view you can:
1) directly open a fragment by double-clicking it
2) select fragments you want to reuse in a composition program by
pressing th **+** button.

### Composition Program Editor

To create a new composition program select *New \> Others... \>
Reuseware \> Composition Program*. The composition program will open in
a graphical editor. A composition program consists of the following
concepts.

*Note 1: you can open fragments directly from a composition program by
double-click.*

*Note 2: yellow and red elements in a composition program indicate
warnings and errors. Double-click such an element to get a more detailed
message.*

#### Fragment References

Create a reference to a fragment you like to reuse by selecting it in
the Fragment Repository View and pressing the **+** button when the
editor is opened. The fragment reference is displayed as a box with
circles attached. The circles (called Ports) represent the fragment's
composition interface.

At least one of the fragment references has to be set as target. This
means that the composition will extend this fragment with others. In the
properties of a target fragment, one can define the UFI of the result
(targetUFI). A fragment can be set as target in the properties or by
right-clicking and selecting *Set as Target*. Target fragments are
displayed in gray

#### Composition Links

Use composition links to connect Ports (the circles at the fragment
references) to describe compositions. Only ports of matching type can be
linked. If the composition link turns red, the linking is not possible;
if it turns black, everything is fine. Some links turn into arrows
describing a direction of composition. This gain depends on the type of
ports you are linking. The direction indicates that one fragment is
extended with another. The details about his are out of scope of this
guide. Stick to the following rules-of-thumb:

-   A fragment that was marked as target (gray) should only have
    incoming links.
-   If you define multiple composition links between two fragments, all
    directed links should point into the same direction.

#### Composition Steps

Every composition links needs to participate (through an Participation)
on a composition step. Only links that belong to a step are executed in
the composition. Through steps, the composition can be fine tuned. For
the start, group all links that define a composition between two
fragments into one step.

## Publications

Jendrik Johannes<br/>
**Component-Based Model-Driven Software Development**<br/>
*PhD thesis*, TU Dresden, 2008<br/>
[[Original digital publication on www.qucosa.de (PDF)](http://www.qucosa.de/api/qucosa%3A25468/attachment/ATT-0/)]

Jendrik Johannes and Uwe Aßmann<br/>
**Concern-based (de)composition of Model-Driven Software Development Processes**<br/>
*In Proc. of ACM/IEEE 13th International Conference on Model Driven Engineering Languages and Systems (MoDELS’10)*, volume 6395 of LNCS. Springer, 2010<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2010_MoDELS_ModelSoC.pdf)]
[[Original publication at SpringerLink](http://www.springerlink.com/content/5112337574401773/)]

Jendrik Johannes and Miguel A. Fernández<br/>
**Adding Abstraction and Reuse to a Network Modelling Tool using the Reuseware Composition Framework**<br/>
*In Proc. of 6th European Conference on Modelling Foundations and Applications (ECMFA’10)*, volume 6138 of LNCS. Springer, 2010<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2010_ECMFA_ReusewareCIM.pdf)]
[[Original publication at SpringerLink](http://www.springerlink.com/content/a270k03507875501/)]

Matthias Schmidt, Jan Polowinski, Jendrik Johannes, and Miguel A. Fernández<br/>
**An Integrated Facet-based Library for Arbitrary Software Components**<br/>
*In Proc. of 6th European Conference on Modelling Foundations and Applications (ECMFA’10)*, volume 6138 of LNCS. Springer, 2010<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2010_ECMFA_FacetLibrary.pdf)]
[[Original publication at SpringerLink](http://www.springerlink.com/content/738x62488515u184/)]

Florian Heidenreich, Jakob Henriksson, Jendrik Johannes, and Steffen Zschaler<br/>
**On Language-Independent Model Modularisation**<br/>
*In Transactions on Aspect-Oriented Software Development VI*, volume 5560 of LNCS. Springer, 2009<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2009_TAOSD_Reuseware.pdf)]
[[Original publication at SpringerLink](http://www.springerlink.com/content/l6308t601757158n/)]

Jendrik Johannes, Steffen Zschaler, Miguel A. Fernández, Antonio Castillo, Dimitrios S. Kolovos, and Richard F. Paige<br/>
**Abstracting Complex Languages through Transformation and Composition**<br/>
*In Proc. of ACM/IEEE 12th International Conference on Model Driven Engineering Languages and Systems (MoDELS’09)*, volume 5795 of LNCS. Springer, 2009<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2009_MoDELS_AbstractDSMLs.pdf)]
[[Original publication at SpringerLink](http://www.springerlink.com/content/4620251410774k8j/)]

Jendrik Johannes, Roland Samlaus, and Mirko Seifert<br/>
**Round-trip Support for Invasive Software Composition Systems**<br/>
*In Proc. of 8th International Conference on Software Composition (SC’09)*, volume 5634 of LNCS. Springer, 2009<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2009_SC_ISCRoundTrip.pdf)]
[[Original publication at SpringerLink](http://www.springerlink.com/content/g1q4k596hpu8245p/)]

Jendrik Johannes<br/>
**Developing a Model Composition Framework with Fujaba – An Experience Report**<br/>
*In Proc. of 7th International Fujaba Days*, 2009<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2009_FujabaDays_Reuseware.pdf)]
[[Workshop proceedings (technical report from TU Eindhoven - PDF)](http://www.fujaba.de/fileadmin/Informatik/Fujaba/Resources/Publications/Fujaba_Days/FDays2009-Proceedings.pdf)]

Jendrik Johannes and Karsten Gaul<br/>
**Towards a Generic Layout Composition Framework for Domain Specific Models**<br/>
*In Proc. of 9th Workshop on Domain-Speciﬁc Modeling (DSM’09) at OOPSLA*, 2009<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2009_DSM_LaCoMe.pdf)]
[[Workshop proceedings (on www.dsmforum.org)](http://www.dsmforum.org/events/DSM09/)]

Jendrik Johannes<br/>
**Controlling Model-Driven Software Development through Composition Systems**<br/>
*In Proc. of 7th Nordic Workshop on Model Driven Software Engineering (NW-MODE’09)*, 2009<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2009_NW-MODE_Reuseware.pdf)]

Jakob Henriksson, Florian Heidenreich, Jendrik Johannes, Steffen Zschaler, and Uwe Aßmann<br/>
**Extending Grammars and Metamodels for Reuse – The Reuseware Approach**<br/>
*In Special Issue on Language Engineering, volume 2(3) of IET Software*, IET, 2008<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2008_IET_Reuseware.pdf)]
[[Original publication at IEEE Xplore Digital Library](http://ieeexplore.ieee.org/xpls/abs_all.jsp?arnumber=4543984)]

Jakob Henriksson<br/>
**A Lightweight Framework for Universal Fragment Composition - with an application in the Semantic Web**<br/>
*PhD thesis*, TU Dresden, 2008<br/>
[[Original digital publication on www.qucosa.de (PDF)](http://www.qucosa.de/fileadmin/data/qucosa/documents/1951/1231251831567-1176.pdf)]

Florian Heidenreich, Jendrik Johannes, Steffen Zschaler, and Uwe Aßmann<br/>
**A Close Look at Composition Languages**<br/>
*In Proc. of 2nd Workshop on Assessment of Contemporary Modularization Techniques (ACoM’08) at OOPSLA*, 2008.<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2008_ACoM_CompositionLanguages.pdf)]

Jendrik Johannes<br/>
**Letting EMF Tools Talk to Fujaba through Adapters**<br/>
*In Proc. of 6th International Fujaba Days*, 2008<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2008_FujabaDays_FujabaEMFAdapters.pdf)]

Jakob Henriksson, Jendrik Johannes, Stffen Zschaler, and Uwe Aßmann<br/>
**Reuseware - Adding Modularity to Your Language of Choice**
*In Proc. of TOOLS EUROPE 2007: Object, Models, Components and Patterns*, volume vol. 6, no. 9 of Journal of Object Technology. ETH Swiss Federal Institute of Technology, 2007<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2007_TOOLS_Reuseware.pdf)]
[[Original publication in the Journal of Object Technology](http://www.jot.fm/issues/issue_2007_10/paper7/)]

Florian Heidenreich, Jendrik Johannes, and Steffen Zschaler<br/>
**Aspect-Orientation for Your Language of Choice**<br/>
*In Proc. of 11th International Workshop on Aspect-Oriented Modeling (AOM@MoDELS’07)*, 2007<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2007_AOM_Reuseware.pdf)]

Jendrik Johannes<br/>
**Source Code Composition with the Reuseware Composition Framework**<br/>
*In Proc. of 7th IEEE International Working Conference on Source Code Analysis and Manipulation (SCAM’07)*, 2007<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2007_SCAM_ReusewareDemo.pdf)]

Jakob Henriksson, Florian Heidenreich, Jendrik Johannes, Steffen Zschaler, and Uwe Aßmann<br/>
**How dark should a component black-box be? The Reuseware Answer**<br/>
*In Proc. of 12th International Workshop on Component-Oriented Programming (WCOP’07)*, 2007<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2007_WCOP_Reuseware.pdf)]

Michael Pradel, Jakob Henriksson, Uwe Aßmann<br/>
**A Good Role Model for Ontologies: Collaborations**<br/>
*International Workshop on Semantic-Based Software Development (SBSD '07)* at OOPSLA, 2007<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2007_SBSD_OntologyRoles.pdf)]

Jendrik Johannes and Tobias Haupt<br/>
**Harmless Metamodel Extensions with Triple Graph Grammars**<br/>
*In Proc. of 5th International Fujaba Days*, 2007<br/>
[[Authors' version (PDF)](CoCoNut/org.reuseware.coconut/publications/2007_FujabaDays_MetamodelExtensionTGG.pdf)]
[[Workshop proceedings (University of Kassel - PDF)](http://www.fujaba.de/fileadmin/Informatik/Fujaba/Resources/Publications/Fujaba_Days/FD07Proceedings.pdf)]
