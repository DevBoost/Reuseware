componentmodel org.reuseware.test.basic.rexclBasics.component_model
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage 
{
	fragment role Default {
		port type Rec {
			EPackage.eClassifiers is hook {
				port = $'P'$
			}
		}
		port type Contrib {
			EClass is prototype {
				port = $'C'$
			}
		}
	}	


}