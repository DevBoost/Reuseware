componentmodel org.reuseware.application.reuseuml.compositionSystem.ReuseUMLActivity 
implements org.reuseware.application.reuseuml.compositionSystem.ReuseUMLActivity
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass uml::Model {

	fragment role ActivityCore {
		port type ContentsHook {
  			uml::Activity.node is hook {}
    		uml::Activity.edge is hook {}
		}
		port type ExportedAction {
			uml::ActivityNode is anchor if $not self.getAppliedStereotype('ReuseUMLActivity::Anchor').oclIsUndefined()$ {
     			port  = $self.getValue(self.getAppliedStereotype('ReuseUMLActivity::Anchor'),'portName')$ 
     			point = $self.getValue(self.getAppliedStereotype('ReuseUMLActivity::Anchor'),'pointName')$ 
  			}
		}
	}
	
	fragment role ActivityAspect {
		port type Contents {
  			uml::Activity.node is prototype {}
  			uml::Activity.edge is prototype {}
		}
		port type ExportedAction {
			uml::ActivityNode is slot if $not self.getAppliedStereotype('ReuseUMLActivity::Slot').oclIsUndefined()$ {
    			port  = $self.getValue(self.getAppliedStereotype('ReuseUMLActivity::Slot'),'portName')$
    			point = $self.getValue(self.getAppliedStereotype('ReuseUMLActivity::Slot'),'pointName')$
			}
		}
	}	
}