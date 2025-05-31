package org.example.vehiclefactory;

import org.example.enums.VehicleBrand;
import org.example.vehicle.Audi;
import org.example.vehicle.Bmw;
import org.example.vehicle.Vehicle;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(VehicleBrand brand){
        switch(brand){
            case AUDI:
                return new Audi();
            case BMW:
                return new Bmw();
            default:
                return null;
        }
    }

}
