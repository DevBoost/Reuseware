compositionlanguage org.reuseware.lib.systems.class.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.class.class
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass uml::Model 
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$ 
location = $outFolder$ {

	fragment role Class {
		uml::Actor {
			fragment = $'Class:'.concat(ufi.trimExtension().segment(-1))$
			ufi = $Sequence{'org','reuseware','lib','systems','class','lib','Class.'.concat(format)}$
			port Name {
				$'name'$ = $ufi.trimExtension().segment(-1)$
				$'namespace'$ = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2)$
			}
		}
	}	
	association Contribution {
		uml::Actor {
			fragment = $'Class:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
}