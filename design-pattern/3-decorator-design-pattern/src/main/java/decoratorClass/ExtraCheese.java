package decoratorClass;

import baseClass.BasePizza;
import baseClass.FarmHousePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza = new FarmHousePizza();
    @Override
    public int cost(){
        return basePizza.cost() + 50;
    }
}
