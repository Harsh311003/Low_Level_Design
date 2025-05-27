package decoratorClass;

import baseClass.BasePizza;
import baseClass.Margherita;

public class Mushroom extends BasePizza {
    BasePizza basePizza = new Margherita();
    @Override
    public int cost(){
        return basePizza.cost() + 60;
    }
}
