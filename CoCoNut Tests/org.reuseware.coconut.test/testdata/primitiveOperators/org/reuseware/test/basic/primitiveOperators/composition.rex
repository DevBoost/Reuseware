componentmodel org.reuseware.test.basic.primitiveOperators.composition
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage {
	
	fragment role Default {
		port type Contrib {
			EPackage.eClassifiers is prototype if $name = 'Prototypes'$ {
				port = $'Contrib'$
			}
		}
		port type Rec {
			EClassifier  is hook if $name = 'prepend'$ {
				mode = $name$
				port = $'Rec'$
			}
			EClassifier is hook if $name = 'append'$ {
				mode = $name$
				port = $'Rec'$
			}
			EClassifier is hook if $name = 'extend'$ {
				mode = $name$
				port = $'Rec'$
			}			
			EClassifier is hook if $name = 'bind'$ {
				mode = $name$
				port = $'Rec'$
			}
		}
	}

}