package org.example;

import org.example.enums.FactoryType;
import org.example.enums.VehicleBrand;
import org.example.factoryproducer.Factory;
import org.example.vehicle.Vehicle;
import org.example.vehiclefactory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Factory factoryObj = new Factory();
        VehicleFactory vehicleFactory = factoryObj.getFactory(FactoryType.LUXURY);
        Vehicle vehicleObj = vehicleFactory.getVehicle(VehicleBrand.AUDI);
        vehicleObj.average();
    }
}