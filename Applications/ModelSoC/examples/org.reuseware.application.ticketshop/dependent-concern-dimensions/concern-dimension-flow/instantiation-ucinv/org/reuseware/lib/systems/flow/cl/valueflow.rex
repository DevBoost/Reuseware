compositionlanguage org.reuseware.lib.systems.flow.cl.valueflow(format,outFolder)
implements org.reuseware.lib.systems.flow.flow
epackages <http://www.emftext.org/language/valueflow>
rootclass Model
ucpi = $ufi.replace('fragments','integrated').replace('valueflow',format).trim(2).append('Main.ucl')$
location = $outFolder$ {
    //1 = Give; 2 = Take
	association Flow1To1 {
		GiveState if $nextState.oclIsTypeOf(GiveState)$ {
			fragment = $'Value:'.concat(name)$
			-->
			fragment = $'Value:'.concat(nextState.name)$
		}
	} 	
	association Flow1To2 {
		GiveState if $nextState.oclIsTypeOf(TakeState)$ {
			fragment = $'Value:'.concat(name)$
			-->
			fragment = $'Value:'.concat(nextState.name)$
		}
	} 
	association Flow2To1 {
		TakeState if $nextState.oclIsTypeOf(GiveState)$ {
			fragment = $'Value:'.concat(name)$
			-->
			fragment = $'Value:'.concat(nextState.name)$
		}
	} 
	association Flow2To2 {
		TakeState if $nextState.oclIsTypeOf(TakeState)$ {
			fragment = $'Value:'.concat(name)$
			-->
			fragment = $'Value:'.concat(nextState.name)$
		}
	} 
} 