package withStrategyPattern;

import withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
     Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }
    public void drive(){
         driveObject.drive();
    }
}
