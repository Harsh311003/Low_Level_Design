package org.example.vehiclefactory;

import org.example.enums.VehicleBrand;
import org.example.vehicle.Swift;
import org.example.vehicle.Tata;
import org.example.vehicle.Vehicle;

public class OrdinaryFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleBrand brand){
        return switch (brand) {
            case SWIFT -> new Swift();
            case TATA -> new Tata();
            default -> null;
        };
    }
}
