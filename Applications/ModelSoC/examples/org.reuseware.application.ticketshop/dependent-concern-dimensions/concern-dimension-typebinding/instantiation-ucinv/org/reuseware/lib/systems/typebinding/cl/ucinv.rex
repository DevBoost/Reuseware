compositionlanguage org.reuseware.lib.systems.typebinding.cl.ucinv(format,outFolder)
implements org.reuseware.lib.systems.typebinding.typebinding
epackages <http://www.emftext.org/language/UseCaseInvariant> 
rootclass UseCaseModel
ucpi = $ufi.replace('fragments','integrated').replace('ucinv',format).trim(1).append('Main.ucl')$
location = $outFolder$ {

	//Bind Counter Classes
	association Binding {
		CounterActor {
			fragment = $'Class:'.concat(name)$
			-->
			fragment = $'Participant:'.concat(name).concat('_').concat(ufi.trimExtension().segment(-1))$
		}
	}

	//Bind Data Classes
	association Binding {
		Value {
			fragment = $'Class:'.concat(type)$
			-->
			fragment = $'Value:'.concat(type).concat('_').concat(ID)$
		}
	}
} 