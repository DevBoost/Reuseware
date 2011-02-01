<?xml version="1.0" encoding="UTF-8"?>
<de.hpi.sam.storyDiagramEcore:ActivityDiagram xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:de.hpi.sam.storyDiagramEcore="http://de/hpi/sam/storyDiagramEcore.ecore" xmlns:de.hpi.sam.storyDiagramEcore.nodes="http://de/hpi/sam/storyDiagramEcore/nodes.ecore" xmlns:de.hpi.sam.storyDiagramEcore.sdm="http://de/hpi/sam/storyDiagramEcore/sdm.ecore">
  <activities>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:InitialNode" outgoing="//@activities.0/@edges.1"/>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:StoryActionNode" name="&lt;+name+> instantiates de/fujaba/templates/widgetTemplate.story" incoming="//@activities.0/@edges.1" outgoing="//@activities.0/@edges.0">
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="this" matchType="THIS_OBJECT" outgoingStoryLinks="//@activities.0/@nodes.1/@storyPatternLinks.0"/>
      <storyPatternObjects xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternObject" name="&lt;&lt;container" modifier="CREATE" incomingStoryLinks="//@activities.0/@nodes.1/@storyPatternLinks.0"/>
      <storyPatternLinks xsi:type="de.hpi.sam.storyDiagramEcore.sdm:StoryPatternLink" modifier="CREATE" source="//@activities.0/@nodes.1/@storyPatternObjects.0" target="//@activities.0/@nodes.1/@storyPatternObjects.1"/>
    </nodes>
    <nodes xsi:type="de.hpi.sam.storyDiagramEcore.nodes:ActivityFinalNode" incoming="//@activities.0/@edges.0"/>
    <edges source="//@activities.0/@nodes.1" target="//@activities.0/@nodes.2"/>
    <edges source="//@activities.0/@nodes.0" target="//@activities.0/@nodes.1"/>
  </activities>
</de.hpi.sam.storyDiagramEcore:ActivityDiagram>
