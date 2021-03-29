

#import "SWGOrderManagedObjectBuilder.h"

/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

@implementation SWGOrderManagedObjectBuilder

-(instancetype)init {
    self = [super init];
    if (self != nil) {
    }
    return self;
}

-(SWGOrderManagedObject*)createNewSWGOrderManagedObjectInContext:(NSManagedObjectContext*)context {
    SWGOrderManagedObject *managedObject = [NSEntityDescription insertNewObjectForEntityForName:NSStringFromClass([SWGOrderManagedObject class]) inManagedObjectContext:context];
    return managedObject;
}

-(SWGOrderManagedObject*)SWGOrderManagedObjectFromSWGOrder:(SWGOrder*)object context:(NSManagedObjectContext*)context {
    SWGOrderManagedObject* newSWGOrder = [self createNewSWGOrderManagedObjectInContext:context];
    [self updateSWGOrderManagedObject:newSWGOrder withSWGOrder:object];
    return newSWGOrder;
}

-(void)updateSWGOrderManagedObject:(SWGOrderManagedObject*)managedObject withSWGOrder:(SWGOrder*)object {
    if(!managedObject || !object) {
        return;
    }
    NSManagedObjectContext* context = managedObject.managedObjectContext;
    managedObject._id = [object._id copy];
    managedObject.petId = [object.petId copy];
    managedObject.quantity = [object.quantity copy];
    managedObject.shipDate = [object.shipDate copy];
    managedObject.status = [object.status copy];
    managedObject.complete = [object.complete copy];

}

-(SWGOrder*)SWGOrderFromSWGOrderManagedObject:(SWGOrderManagedObject*)obj {
    if(!obj) {
        return nil;
    }
    SWGOrder* newSWGOrder = [[SWGOrder alloc] init];
    [self updateSWGOrder:newSWGOrder withSWGOrderManagedObject:obj];
    return newSWGOrder;
}

-(void)updateSWGOrder:(SWGOrder*)newSWGOrder withSWGOrderManagedObject:(SWGOrderManagedObject*)obj {
    newSWGOrder._id = [obj._id copy];
    newSWGOrder.petId = [obj.petId copy];
    newSWGOrder.quantity = [obj.quantity copy];
    newSWGOrder.shipDate = [obj.shipDate copy];
    newSWGOrder.status = [obj.status copy];
    newSWGOrder.complete = [obj.complete copy];
}

@end
