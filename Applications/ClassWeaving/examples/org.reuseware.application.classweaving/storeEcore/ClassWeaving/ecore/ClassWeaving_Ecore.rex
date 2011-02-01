componentmodel ClassWeaving.ecore.ClassWeaving_Ecore 
implements  ClassWeaving.ClassWeaving
epackages <http://www.eclipse.org/emf/2002/Ecore> 
rootclass EPackage {

	fragment role Core if $not name.startsWith('advice')$ {
		port type JoinPoint {
  			EClass.eOperations is hook {
    			port = $name$ 
    		}
  			EClass.eStructuralFeatures is hook {
    			port = $name$
    		}
  			EClass is anchor {
    			port = $name$
  			}
    	}
    }
    
	fragment role Advice if $name.startsWith('advice')$ {
		port type AdviceContent {
  			EClass.eOperations is prototype {
    			port = $name$ 
    		}
  			EClass.eStructuralFeatures is prototype {
    			port = $name$ 
    		}
  			EClass is slot {
    			port = $name$
  			}
    	}
    }
}