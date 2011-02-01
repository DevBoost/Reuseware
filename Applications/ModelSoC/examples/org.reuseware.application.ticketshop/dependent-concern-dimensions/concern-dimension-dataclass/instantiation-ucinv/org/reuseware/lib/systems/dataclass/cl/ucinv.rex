compositionlanguage org.reuseware.lib.systems.dataclass.cl.ucinv(format,outFolder)
implements org.reuseware.lib.systems.dataclass.dataclass
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$
location = $outFolder$ {

	//VALUES
	fragment role Class {
		Value {
			fragment = $'Class:'.concat(type)$
			ufi = $Sequence{'org','reuseware','lib','systems','dataclass','lib','EntityClass.'.concat(format)}$
			port Name {
				$'name'$ = $type$
				$'namespace'$ = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(1)$
			}
		}
	}	
	association Contribution {
		Value {
			fragment = $'Class:'.concat(type)$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
}  
