package withStrategyPattern.strategy;

public class SportsDriveStrategy implements  DriveStrategy{
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
