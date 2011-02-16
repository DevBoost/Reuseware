compositionlanguage composition_system.import.java_composition_language
implements composition_system.import
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit if $ufi.segment(-1).endsWith('Skeleton.java')$
ucpi = $ufi.trimExtension().appendExtension('ucl')$ 
location = $'src-composed'$ {

	fragment role ImportingModel {
		java::containers::CompilationUnit {
			fragment = $ufi$
			ufi = $ufi$
			target ufi = $ufi.trim(1).append(ufi.segment(-1).substring(1,ufi.segment(-1).length()-'Skeleton.java'.length())).appendExtension('java')$
			target location = $'src-composed'$
			port ImportStatement {
				$'name'$ = $ufi.segment(-1).substring(1,ufi.segment(-1).length()-'Skeleton.java'.length())$
			}
		}
	}

	fragment role ModelComponent {
		java::statements::JumpLabel {
			fragment = $ufi.trim(1).append('code').append(ufi.segment(-1).substring(1,ufi.segment(-1).length()-'Skeleton.java'.length())).appendExtension('java')$
			ufi = $ufi.trim(1).append('code').append(ufi.segment(-1).substring(1,ufi.segment(-1).length()-'Skeleton.java'.length())).appendExtension('java')$
		}
	}
	
	association Import {
		java::statements::JumpLabel {
			fragment = $ufi.trim(1).append('code').append(ufi.segment(-1).substring(1,ufi.segment(-1).length()-'Skeleton.java'.length())).appendExtension('java')$
			port = $name$
			-->
			fragment = $ufi$
			port = $name$
		}
	}
	
	association Import {
		java::classifiers::Class {
			fragment = $ufi.trim(1).append('code').append(ufi.segment(-1).substring(1,ufi.segment(-1).length()-'Skeleton.java'.length())).appendExtension('java')$
			port = $'Contents'$
			-->
			fragment = $ufi$
			port = $'ImportStatement'$
		}
	}

}