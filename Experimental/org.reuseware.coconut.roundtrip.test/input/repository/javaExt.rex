componentmodel repository.javaExt
implements     repository.javaExt
apply repository.**
epackages    <http://www.emftext.org/java> <http://www.emftext.org/java/members>
rootclass    java::containers::CompilationUnit
{
	fragment role ReuseableMethod {
		port Methods {
  			members::Method is prototype if $name.substring(1,10)='Prototype_'$ {
    			port expr = $name$
    		}
    	}
    }
    
    fragment role StatementVP {
		port VP {
  			members::Method is hook if $name.substring(1,5)='Hook_'$ {
    			port expr = $name$ 
    		}
    	}
	}
}
