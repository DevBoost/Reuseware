compositionlanguage org.reuseware.application.uml2java.compositionSystem.uml.UML2Java_UML
implements          org.reuseware.application.uml2java.compositionSystem.UML2Java
epackages <http://www.eclipse.org/uml2/3.0.0/UML> 
rootclass uml::Model 
ucpi = $ufi.trimExtension().appendExtension('ucl')$ 
location = $'out'$ {
    
	fragment role Class {
		uml::Class {
			fragment = $self.name$
			ufi = $Sequence{'org','reuseware','application','uml2java','compositionSystem','java','Class.reusejava'}$
			target ufi = $ufi.trim(1).append(self.name.concat('.java'))$
			port Name {
				$'name'$ = $self.name$ 
				$'package'$ = $self._package.name$
			}
		}
	}
	
	fragment role Operation {
		uml::Operation {
			fragment  = $self.name$
			ufi  = $Sequence{'org','reuseware','application','uml2java','compositionSystem','java','Operation.reusejava'}$
			port Name {
				$'name'$ = $self.name$
			} 
		}
	}
	
	fragment role StatementUnit {
		uml::Operation {
			fragment  = $self.name.concat('IMPL')$
			ufi  = $ufi.trimExtension().append(self.class.name).append(self.name).appendExtension('reusejava')$
		}
	}

	association ExtendClass {
		uml::Operation {
			fragment  = $self.name$
			-->
			fragment  = $self.class.name$
		}
	}
	
	association ExtendOperation {
		uml::Operation {
			fragment  = $self.name.concat('IMPL')$
			-->
			fragment  = $self.name$
		}
	}
	
	association Type {
		uml::Operation if $not self.type.oclIsUndefined()$ {
			fragment  = $self.type.name$
			-->
			fragment  = $self.name$
		}
	}
}