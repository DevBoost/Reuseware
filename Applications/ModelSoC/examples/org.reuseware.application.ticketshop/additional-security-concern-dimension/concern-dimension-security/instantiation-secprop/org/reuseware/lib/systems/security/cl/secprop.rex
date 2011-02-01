compositionlanguage org.reuseware.lib.systems.security.cl.secprop(format,outFolder)
implements org.reuseware.lib.systems.security.security
epackages <http://www.emftext.org/language/SecProp>
rootclass SecPropModel
ucpi = $ufi.replace('fragments','integrated').replace('secprop',format).trim(2).append('Main.ucl')$
location = $outFolder$
{ 
	fragment role SecurityInformation {
		Data {
			fragment = $'SecurityInformation:'.concat(ufi.trimExtension().segment(-1))$
			ufi = $ufi.replace('secprop',format).trimExtension().appendExtension(format)$
		}
	}

	association Secure {
		Data {
			fragment = $'SecurityInformation:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'Value:'.concat(ufi.trimExtension().segment(-1))$
		}
	}

	association Contributution {
		Data {
			fragment = $'SecurityInformation:'.concat(ufi.trimExtension().segment(-1))$
			-->
			fragment = $'UseCase:'.concat(ufi.segment(-2))$
		}
	}
} 