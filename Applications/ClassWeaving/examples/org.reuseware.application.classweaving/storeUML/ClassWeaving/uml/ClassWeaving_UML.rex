componentmodel ClassWeaving.uml.ClassWeaving_UML 
implements     ClassWeaving.ClassWeaving
epackages      <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass      uml::Model {

	fragment role Core if $not self.name.startsWith('advice')$ {
		port type JoinPoint {
  			uml::Class.ownedOperation is hook {
    			port = $self.name$ 
    		}
  			uml::Class.ownedAttribute is hook {
    			port = $self.name$ 
    		}
    		uml::Package.packagedElement is hook if $self.oclIsTypeOf(uml::Package)$ {
 				foreach $self.packagedElement->select(c | c.oclIsTypeOf(uml::Class))$
 					port = $self.name$ 
 			}
  			uml::Class is anchor {
    			port = $self.name$
  			}
    	}
    }
    
	fragment role Advice if $self.name.startsWith('advice')$ {
		port type AdviceContent {
  			uml::Operation is prototype if $self.owner.oclIsTypeOf(uml::Class)$ {
    			port = $self.owner.oclAsType(uml::Class).name$ 
    		}
  			uml::Property is prototype if $self.owner.oclIsTypeOf(uml::Class)$ {
    			port = $self.owner.oclAsType(uml::Class).name$ 
    		}
  			uml::Class is slot {
    			port = $self.name$
  			}
  			uml::Association is prototype {
				port = $self.ownedEnd->at(1).type.name$
			}
    	}
    }
}