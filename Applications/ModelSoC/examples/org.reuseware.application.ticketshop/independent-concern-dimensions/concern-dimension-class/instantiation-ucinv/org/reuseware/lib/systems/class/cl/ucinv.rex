compositionlanguage org.reuseware.lib.systems.class.cl.ucinv(format,outFolder)
implements org.reuseware.lib.systems.class.class
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$
location = $outFolder$ {

	//COUNTER ACTORS
	fragment role Class {
		CounterActor {
			fragment = $'Class:'.concat(name)$
			ufi = $Sequence{'org','reuseware','lib','systems','class','lib','Class.'.concat(format)}$
			port Name {
				$'name'$ = $name$
				$'namespace'$ = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(1)$
			}
		}
	}	
	association Contribution {
		CounterActor {
			fragment = $'Class:'.concat(name)$
			-->
			fragment = $'CLASS_CORE'$
		}
	}
}  
