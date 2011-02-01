componentmodel ClassWeaving.java.ClassWeaving_Java 
implements ClassWeaving.ClassWeaving
epackages <http://www.emftext.org/java>
rootclass java::containers::CompilationUnit {

	fragment role Core if $not namespaces->asSequence()->last().startsWith('advice')$ {
		port type JoinPoint {
  			java::classifiers::Class.members is hook {
    			port = $name$ 
    		}
  			java::classifiers::Class is anchor {
    			port = $name$
  			}
    	}
    }
    
	fragment role Advice if $namespaces->asSequence()->last().startsWith('advice')$ {
		port type AdviceContent {
  			java::classifiers::Class.members is prototype {
    			port = $name$ 
    		}
  			java::classifiers::Class is slot {
    			port = $name$
  			}
  			java::members::Member.name is value hook {
  				port = $self.getParentConcreteClassifier().name$
  				point = $'name'$
  				begin idx = $name.length()-1$
  				end idx = $name.length()-1$
  			}
    	}
    }
}