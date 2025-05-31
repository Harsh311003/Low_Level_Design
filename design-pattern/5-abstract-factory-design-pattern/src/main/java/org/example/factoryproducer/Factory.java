package org.example.factoryproducer;

import org.example.enums.FactoryType;
import org.example.vehiclefactory.LuxuryFactory;
import org.example.vehiclefactory.OrdinaryFactory;
import org.example.vehiclefactory.VehicleFactory;

public class Factory {
    public VehicleFactory getFactory(FactoryType type){
        return switch(type){
            case LUXURY ->  new LuxuryFactory();
            case ORDINARY ->  new OrdinaryFactory();
            default ->  null;
        };
    }
}
