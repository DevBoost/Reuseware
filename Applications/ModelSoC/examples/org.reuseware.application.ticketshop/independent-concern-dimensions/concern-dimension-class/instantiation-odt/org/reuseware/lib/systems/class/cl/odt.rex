compositionlanguage org.reuseware.lib.systems.class.cl.odt(format,outFolder)
implements org.reuseware.lib.systems.class.class
epackages <urn:oasis:names:tc:opendocument:xmlns:office:1.0>
          <urn:oasis:names:tc:opendocument:xmlns:text:1.0>
rootclass office::DocumentRoot
ucpi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main.ucl')$
location = $outFolder$
{
	fragment role Core {
		office::DocumentRoot {
			fragment = $'CLASS_CORE'$
			ufi = $Sequence{'org','reuseware','lib','systems','class','lib','Core.'.concat(format)}$
			target ufi = $ufi.replace('fragments','integrated').replace('odt',format).trim(1).append('Main').appendExtension(format)$
			target location = $outFolder$
		}
	}

	fragment role Class {
		text::SpanType if $styleName = 'Actor'$ {
			fragment = $'Class:'.concat(mixed->at(1).getValue().oclAsType(String))$
			ufi = $Sequence{'org','reuseware','lib','systems','class','lib','Class.'.concat(format)}$
			port Name {
				$'name'$ = $mixed->at(1).getValue()$
				$'namespace'$ = $ufi.replace('fragments','integrated').replace('odt',format).trim(1)$
			}
		}
	}

	association Contribution {
		text::SpanType if $styleName = 'Actor'$ {
			fragment = $'Class:'.concat(mixed->at(1).getValue().oclAsType(String))$
			-->
			fragment = $'CLASS_CORE'$
		}
	}

}