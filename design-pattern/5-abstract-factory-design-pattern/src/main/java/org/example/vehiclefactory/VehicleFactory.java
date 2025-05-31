package org.example.vehiclefactory;

import org.example.enums.VehicleBrand;
import org.example.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(VehicleBrand brand);

}
