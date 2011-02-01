compositionlanguage org.reuseware.lib.systems.typebinding.cl.odt(format,outFolder)
implements org.reuseware.lib.systems.typebinding.typebinding
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass odfoffice::DocumentRoot
ucpi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main.ucl')$ 
location =  $outFolder$ {

	//Bind Actor Classes
	association Binding {
		odftext::SpanType if $styleName = 'Actor'$ {
			fragment = $'Class:'.concat(mixed->at(1).getValue().oclAsType(String))$
			-->
			fragment = $'Participant:'.concat(mixed->at(1).getValue().oclAsType(String)).concat('_').concat(ufi.trimExtension().segment(-1))$
		}
	}
} 