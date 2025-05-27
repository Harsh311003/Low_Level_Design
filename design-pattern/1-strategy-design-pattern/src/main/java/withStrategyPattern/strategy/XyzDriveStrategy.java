package withStrategyPattern.strategy;

public class XyzDriveStrategy implements DriveStrategy{
    public void drive(){
        System.out.println("Xyz Drive Strategy");
    }
}
