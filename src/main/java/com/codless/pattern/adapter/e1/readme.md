#Pattern Adapter

The pattern help when need to use different objects in one routine.

These objects can to be:
-	Library
-	API
-	Frameworks  

**Scnario**

The system has an interface for organization all devices, but now we have that include new external object.

**Object External**

The object external is `Mobile`, he totally out of standard. 

**How to solve?**

-	Create class `MobileAdpter` with a construct getting a `Mobile`
- 	`MobileAdpter` should implements the `Device`

**Execute**

- 	Class `AppBefore` Basically show how was before the new needs
- 	Class `AppAfter` Basically show how implementations an Adapter   