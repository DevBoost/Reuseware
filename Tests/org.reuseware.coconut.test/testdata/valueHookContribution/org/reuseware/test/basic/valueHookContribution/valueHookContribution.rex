componentmodel org.reuseware.test.basic.valueHookContribution.valueHookContribution
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage {
	
	fragment role Default {
		port type Config {
			EPackage.name is value hook {
				port = $'value_hook'$
			}
		}
		port type Config {
			EPackage is value prototype {
				port = $'value_prototype'$
				value = $name$
			}
		}
	}

}