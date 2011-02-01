
VariationPoint = type:AbstractFragmentType?, name:AbstractVariationPointName;

Composer; 

Slot;
Slot ==> VariationPoint;

Location = path:S;

AbstractVariationPointName = VariationPointName;
VariationPointName         = name:S;

AbstractFragmentType      = FragmentType | FragmentTypeSlot;
FragmentType              = type:S;
FragmentTypeSlot;
FragmentTypeSlot         ==> Slot;
