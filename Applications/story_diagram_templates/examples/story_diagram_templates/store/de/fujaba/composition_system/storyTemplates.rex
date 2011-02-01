componentmodel de.fujaba.composition_system.storyTemplate
implements org.reuseware.lib.systems.default
apply de.fujaba.**
epackages <http://de/hpi/sam/storyDiagramEcore.ecore>
          <http://de/hpi/sam/storyDiagramEcore/sdm.ecore> 
          <http://de/hpi/sam/storyDiagramEcore/nodes.ecore>
          <http://de/hpi/sam/storyDiagramEcore/expressions.ecore>
rootclass ActivityDiagram {

	fragment role Default {
		//the template
		port Contrib {
 			storyDiagramEcore::sdm::StoryPatternObject is slot if $name.startsWith('>>')$ {
 				port expr = $'TEMPLATE'$
 				point expr = $name.substring(3, name.length())$
 			}
 			storyDiagramEcore::nodes::StoryActionNode.storyPatternObjects is prototype if $name = 'TEMPLATE'$ {
 				port expr = $name$
 				point expr = $'_OBJECTS_'$
 			}
 			storyDiagramEcore::nodes::StoryActionNode.storyPatternLinks is prototype if $name = 'TEMPLATE'$ {
 				port expr = $name$
 				point expr = $'_LINKS_'$
 			}
		} 
		//the caller
		port Rec {
 			storyDiagramEcore::sdm::StoryPatternObject is anchor if $name.startsWith('<<')$ {
 				port expr = $eContainer().oclAsType(NamedElement).name.substring(1,eContainer().oclAsType(NamedElement).name.indexOf('instantiates'))$
 				point expr = $name.substring(3, name.length())$
 			}
  			storyDiagramEcore::nodes::StoryActionNode.storyPatternObjects is hook if $name.contains('instantiates')$ {
    			port expr =  $name.substring(1,name.indexOf('instantiates'))$
    			point expr = $'_OBJECTS_'$
    		}
  			storyDiagramEcore::nodes::StoryActionNode.storyPatternLinks is hook if $name.contains('instantiates')$ {
    			port expr =  $name.substring(1,name.indexOf('instantiates'))$
    			point expr = $'_LINKS_'$
    		}
    	}
    	port Config {
    		NamedElement.name is value hook if $name.startsWith('<+')$ {
    			port expr = $'stringParameters'$
    			point expr = $name$
    		}
    		storyDiagramEcore::expressions::StringExpression.expressionString is value hook if $expressionString.startsWith('<+')$ {
    			port expr = $'stringParameters'$
    			point expr = $expressionString$
    		}
    	}
    }
	
}