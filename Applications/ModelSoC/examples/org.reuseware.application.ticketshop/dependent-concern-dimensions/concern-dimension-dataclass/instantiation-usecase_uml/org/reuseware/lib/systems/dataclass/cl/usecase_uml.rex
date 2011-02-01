compositionlanguage org.reuseware.lib.systems.dataclass.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.dataclass.dataclass
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass uml::Model 
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$ 
location = $outFolder$ {

	fragment role Class {
		uml::Comment {
			fragment = $'Class:'.concat(_body.split(' ')->at(1))$
			ufi = $Sequence{'org','reuseware','lib','systems','dataclass','lib','EntityClass.'.concat(format)}$
			port Name {
				$'name'$ = $_body.split(' ')->at(1)$
				$'namespace'$ = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2)$
			}
		}
	}	
	association Contribution {
		uml::Comment {
			fragment = $'Class:'.concat(_body.split(' ')->at(1))$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
}