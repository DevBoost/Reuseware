compositionlanguage org.reuseware.lib.systems.participation.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model 
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$ 
location = $outFolder$ {

	fragment role Participant {
		Actor { 	//to add counter actors
			fragment = $'Participant:'.concat(ufi.trimExtension().segment(-1)).concat('_').concat(ufi.segment(-2))$
			ufi = $Sequence{'org','reuseware','lib','systems','participation','lib','Participant.'.concat(format)}$
			port Name {
				$'name'$ = $ufi.trimExtension().segment(-1)$
			}
		}
	}

	association Participation {
		Actor {
			fragment = $'Participant:'.concat(ufi.trimExtension().segment(-1)).concat('_').concat(ufi.segment(-2))$
			-->
			fragment = $'UseCase:'.concat(ufi.segment(-2))$
		}
	}
} 