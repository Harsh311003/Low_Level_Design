package withStrategyPattern;

import withStrategyPattern.strategy.DriveStrategy;
import withStrategyPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
