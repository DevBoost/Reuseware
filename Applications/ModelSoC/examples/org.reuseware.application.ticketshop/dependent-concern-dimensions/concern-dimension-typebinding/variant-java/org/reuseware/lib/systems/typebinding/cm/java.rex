componentmodel org.reuseware.lib.systems.typebinding.cm.java
implements org.reuseware.lib.systems.typebinding.typebinding
epackages <http://www.emftext.org/java> 
rootclass java::containers::CompilationUnit
{ 
	fragment role GenericEntity {
		port type TypeParameter {
			java::classifiers::Class is slot if $name = 'TYPE_SLOT'$ {}
		}
	}

	fragment role Type {
		port type Self {
			java::classifiers::Class is anchor {}
		}	
	}
} 