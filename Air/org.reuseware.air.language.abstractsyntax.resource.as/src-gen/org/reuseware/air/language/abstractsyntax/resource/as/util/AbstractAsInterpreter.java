/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.reuseware.air.language.abstractsyntax.resource.as.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractAsInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.reuseware.air.language.abstractsyntax.ExternalReference) {
			result = interprete_org_reuseware_air_language_abstractsyntax_ExternalReference((org.reuseware.air.language.abstractsyntax.ExternalReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.InternalReference) {
			result = interprete_org_reuseware_air_language_abstractsyntax_InternalReference((org.reuseware.air.language.abstractsyntax.InternalReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.Containment) {
			result = interprete_org_reuseware_air_language_abstractsyntax_Containment((org.reuseware.air.language.abstractsyntax.Containment) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.Attribute) {
			result = interprete_org_reuseware_air_language_abstractsyntax_Attribute((org.reuseware.air.language.abstractsyntax.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.NodeFeature) {
			result = interprete_org_reuseware_air_language_abstractsyntax_NodeFeature((org.reuseware.air.language.abstractsyntax.NodeFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.QUESTIONMARK) {
			result = interprete_org_reuseware_air_language_abstractsyntax_QUESTIONMARK((org.reuseware.air.language.abstractsyntax.QUESTIONMARK) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.STAR) {
			result = interprete_org_reuseware_air_language_abstractsyntax_STAR((org.reuseware.air.language.abstractsyntax.STAR) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.PLUS) {
			result = interprete_org_reuseware_air_language_abstractsyntax_PLUS((org.reuseware.air.language.abstractsyntax.PLUS) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.Cardinality) {
			result = interprete_org_reuseware_air_language_abstractsyntax_Cardinality((org.reuseware.air.language.abstractsyntax.Cardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition) {
			result = interprete_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition((org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition) {
			result = interprete_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition((org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.Definition) {
			result = interprete_org_reuseware_air_language_abstractsyntax_Definition((org.reuseware.air.language.abstractsyntax.Definition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.ASStatement) {
			result = interprete_org_reuseware_air_language_abstractsyntax_ASStatement((org.reuseware.air.language.abstractsyntax.ASStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.ASProgram) {
			result = interprete_org_reuseware_air_language_abstractsyntax_ASProgram((org.reuseware.air.language.abstractsyntax.ASProgram) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.ASUnit) {
			result = interprete_org_reuseware_air_language_abstractsyntax_ASUnit((org.reuseware.air.language.abstractsyntax.ASUnit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.Import) {
			result = interprete_org_reuseware_air_language_abstractsyntax_Import((org.reuseware.air.language.abstractsyntax.Import) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.reuseware.air.language.abstractsyntax.AbstractSyntax) {
			result = interprete_org_reuseware_air_language_abstractsyntax_AbstractSyntax((org.reuseware.air.language.abstractsyntax.AbstractSyntax) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_AbstractSyntax(org.reuseware.air.language.abstractsyntax.AbstractSyntax object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_Import(org.reuseware.air.language.abstractsyntax.Import object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_ASUnit(org.reuseware.air.language.abstractsyntax.ASUnit object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_ASProgram(org.reuseware.air.language.abstractsyntax.ASProgram object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_ASStatement(org.reuseware.air.language.abstractsyntax.ASStatement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_Definition(org.reuseware.air.language.abstractsyntax.Definition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_ConcreteNodeDefinition(org.reuseware.air.language.abstractsyntax.ConcreteNodeDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_InterfaceNodeDefinition(org.reuseware.air.language.abstractsyntax.InterfaceNodeDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_Cardinality(org.reuseware.air.language.abstractsyntax.Cardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_PLUS(org.reuseware.air.language.abstractsyntax.PLUS object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_STAR(org.reuseware.air.language.abstractsyntax.STAR object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_QUESTIONMARK(org.reuseware.air.language.abstractsyntax.QUESTIONMARK object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_NodeFeature(org.reuseware.air.language.abstractsyntax.NodeFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_Attribute(org.reuseware.air.language.abstractsyntax.Attribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_Containment(org.reuseware.air.language.abstractsyntax.Containment object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_InternalReference(org.reuseware.air.language.abstractsyntax.InternalReference object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_reuseware_air_language_abstractsyntax_ExternalReference(org.reuseware.air.language.abstractsyntax.ExternalReference object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
