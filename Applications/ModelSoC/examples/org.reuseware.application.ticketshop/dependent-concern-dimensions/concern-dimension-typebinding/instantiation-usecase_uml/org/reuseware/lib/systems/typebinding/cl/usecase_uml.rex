compositionlanguage org.reuseware.lib.systems.typebinding.cl.usecase_uml(format,outFolder)
implements org.reuseware.lib.systems.typebinding.typebinding
epackages <http://www.eclipse.org/uml2/3.0.0/UML>
rootclass Model
ucpi = $ufi.replace('fragments','integrated').replace('usecase.uml',format).trim(2).append('Main.ucl')$
location =  $outFolder$ {

	//Bind Counter Classes
	association Binding {
		Actor {
			fragment = $'Class:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'Participant:'.concat(ufi.trimExtension().segment(-1)).concat('_').concat(ufi.segment(-2))$
		}
	}

	//Bind Data Classes
	association Binding {
		Comment {
			fragment = $'Class:'.concat(_body.split(' ')->at(1))$
			-->
			fragment = $'Value:'.concat(_body.split(' ')->at(1)).concat('_').concat(_body.split(' ')->at(2))$
		}
	}
} 