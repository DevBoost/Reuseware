<?xml version="1.0" encoding="UTF-8"?>
<de.hpi.sam.storyDiagramEcore:ActivityDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:de.hpi.sam.storyDiagramEcore="http://de/hpi/sam/storyDiagramEcore.ecore" xmlns:de.hpi.sam.storyDiagramEcore.expressions="http://de/hpi/sam/storyDiagramEcore/expressions.ecore" xmlns:de.hpi.sam.storyDiagramEcore.nodes="http://de/hpi/sam/storyDiagramEcore/nodes.ecore" xmlns:de.hpi.sam.storyDiagramEcore.sdm="http://de/hpi/sam/storyDiagramEcore/sdm.ecore" xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore">
  <activities name="CreateLargeTank">
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="TEMPLATE">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name=">>tankContainer" matchType="THIS_OBJECT" outgoingStoryLinks="//@activities.0/@nodes.0/@storyPatternLinks.0" bindingType="BOUND">
        <classifier xsi:type="ecore:EClass" href="../models/carExample.ecore#//Car"/>
      </storyPatternObjects>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="fuelTank" modifier="CREATE" incomingStoryLinks="//@activities.0/@nodes.0/@storyPatternLinks.0">
        <classifier xsi:type="ecore:EClass" href="../models/carExample.ecore#//FuelTank"/>
        <attributeAssignments>
          <eStructuralFeature xsi:type="ecore:EAttribute" href="../models/carExample.ecore#//FuelTank/capacity"/>
          <assignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" expressionString="60.0" expressionLanguage="OCL"/>
        </attributeAssignments>
        <attributeAssignments>
          <eStructuralFeature xsi:type="ecore:EAttribute" href="../models/carExample.ecore#//FuelTank/level"/>
          <assignmentExpression xsi:type="de.hpi.sam.storyDiagramEcore.expressions:StringExpression" expressionString="60.0" expressionLanguage="OCL"/>
        </attributeAssignments>
      </storyPatternObjects>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" modifier="CREATE" source="//@activities.0/@nodes.0/@storyPatternObjects.0" target="//@activities.0/@nodes.0/@storyPatternObjects.1">
        <eStructuralFeature xsi:type="ecore:EReference" href="../models/carExample.ecore#//Car/fuelTank"/>
      </storyPatternLinks>
    </nodes>
    <specification href="../models/carExample.ecore#//Car/createCarParts"/>
  </activities>
</de.hpi.sam.storyDiagramEcore:ActivityDiagram>
