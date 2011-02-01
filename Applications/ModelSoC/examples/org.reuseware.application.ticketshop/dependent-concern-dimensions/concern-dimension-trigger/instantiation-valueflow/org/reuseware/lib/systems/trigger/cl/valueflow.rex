compositionlanguage org.reuseware.lib.systems.trigger.cl.valueflow(format,outFolder)
implements org.reuseware.lib.systems.trigger.trigger
epackages <http://www.emftext.org/language/valueflow> 
rootclass Model
ucpi = $ufi.replace('fragments','integrated').replace('valueflow',format).trim(2).append('Main.ucl')$ 
location = $outFolder$ {

	//Trigger on state without predecessor
	association Contribution {
		GiveState if $previousState.oclIsUndefined()$  {
			fragment = $'Value:'.concat(name)$
			-->
			fragment = $'UseCase:'.concat(ufi.trim(1).segment(-1))$
		}
	}

} 