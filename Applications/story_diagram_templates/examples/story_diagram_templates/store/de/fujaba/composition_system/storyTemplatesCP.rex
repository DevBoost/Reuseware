compositionlanguage de.fujaba.composition_system.storyTemplateCP
implements org.reuseware.lib.systems.default
apply de.fujaba.models.**
epackages <http://de/hpi/sam/storyDiagramEcore.ecore>
          <http://de/hpi/sam/storyDiagramEcore/sdm.ecore> 
          <http://de/hpi/sam/storyDiagramEcore/nodes.ecore>
rootclass ActivityDiagram
ucpi expr $ufi.trimExtension().appendExtension('fc')$
{

//  TODO introduce composition language concepts into story diargams to allow inline template expansion
	
//	fragment role Default {
//		//the template
// 		storyDiagramEcore::nodes::StoryActionNode if $name.contains('instantiates')$ {
// 				fragment expr = $name.substring(1,name.indexOf('instantiates'))$
// 				ufi expr =  $name.substring(name.indexOf('instantiates') + 'instantiates'.length() + 1, name.length()).trim()$
// 		}
// 	}

//	fragment role Default {
//		//the caller
// 		ActivityDiagram {
// 			fragment expr = $'caller'$
// 			ufi expr = $ufi$
// 			target ufi expr = $ufi.trim(2).append('composed').append(ufi.segment(-1))$
// 		}
// 	}

//	association Contribution {
//		storyDiagramEcore::nodes::StoryActionNode if $name.contains('instantiates')$ {
//			fragment expr = $name.substring(1,name.indexOf('instantiates'))$
//			port expr = $'TEMPLATE'$
//			-->
//			fragment expr = $'caller'$
//			port expr = $name.substring(1,name.indexOf('instantiates'))$
//		}
//	}

}