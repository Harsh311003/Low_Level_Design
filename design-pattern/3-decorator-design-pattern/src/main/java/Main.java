import baseClass.BasePizza;
import decoratorClass.ExtraCheese;
import decoratorClass.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese();
        System.out.println("cost is: " + pizza1.cost());

        BasePizza pizza2 = new Mushroom();
        System.out.println("cost is: " + pizza2.cost() );


    }
}
