compositionlanguage org.reuseware.lib.systems.participation.cl.ucinv(format,outFolder)
implements org.reuseware.lib.systems.participation.participation
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$
location = $outFolder$ {

	fragment role Participant {
		CounterActor { 	//to add counter actors
			fragment = $'Participant:'.concat(name).concat('_').concat(ufi.trimExtension().segment(-1))$
			ufi = $Sequence{'org','reuseware','lib','systems','participation','lib','Participant.'.concat(format)}$
			port Name {
				$'name'$ = $name$
			}
		}
	}

	association Participation {
		CounterActor {
			fragment = $'Participant:'.concat(name).concat('_').concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'UseCase:'.concat(ufi.trimExtension().segment(-1))$
		}
	}
}