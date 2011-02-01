compositionlanguage org.reuseware.test.basic.rexclBasics.composition_language
implements org.reuseware.lib.systems.default
epackages <http://www.eclipse.org/emf/2002/Ecore>
rootclass EPackage if $name = 'cp'$
ucpi = $ufi.trimExtension().appendExtension('ucl')$
location = $'../out'$
{
	fragment role Default {
		EClass {
			fragment = $name.concat('_CORE')$
			ufi = $ufi.trim(1).append(name).appendExtension('ecore')$
			target ufi = $ufi.trim(1).append('result').appendExtension('ecore')$
		}
	}
	
	fragment role Default {
		EOperation {
			fragment = $name$
			ufi = $ufi.trim(1).append(name).appendExtension('ecore')$	
		}
	}

	association Contribution {
		EClass {
			foreach $eOperations$
				fragment = $name$
				port = $'C'$
			-->
			fragment = $name.concat('_CORE')$
			port = $'P'$
		}
	}
}