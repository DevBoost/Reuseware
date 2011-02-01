compositionlanguage ClassWeaving.simpleweave.ClassWeaving_SimpleWeave
implements          ClassWeaving.ClassWeaving
epackages           <http://www.emftext.org/language/simpleweave>
rootclass           simpleweave::WModel
ucpi = $ufi.trimExtension().appendExtension('ucl')$ 
location = $'out'$ {

  fragment role Core  {
    simpleweave::WModel {
      fragment   = $'CORE'$
      ufi        = $self.coreID.replaceAll('_TYPE_',type).split('/')$
      target ufi = $ufi.trimExtension().appendExtension(type)$
    }
  }
  
  fragment role Advice {
    simpleweave::Aspect {
      fragment  = $name$
      ufi       = $self.aspectID.replaceAll('_TYPE_',wmodel.type).split('/')$
    }
  }
	
  association Weave {
    simpleweave::Weaving {
      fragment = $self.aspect.name$
      port     = $self.adviceContentID$
      -->
      fragment = $'CORE'$
      port     = $self.joinPointID$			
    }
  }
}