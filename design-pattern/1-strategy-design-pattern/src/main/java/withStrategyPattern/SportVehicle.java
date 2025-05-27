package withStrategyPattern;

import withStrategyPattern.strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle{
    SportVehicle(){
        super(new SportsDriveStrategy());
    }
}
