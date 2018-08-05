package designModel.factoryModel.pizzaStore.absFactory;

import designModel.factoryModel.pizzaStore.pizza.CheesePizza;
import designModel.factoryModel.pizzaStore.pizza.GreekPizza;
import designModel.factoryModel.pizzaStore.pizza.PaperPizza;
import designModel.factoryModel.pizzaStore.pizza.Pizza;

public class ChineseFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("paper".equals(orderType)){
            pizza = new PaperPizza();
        }else if("greek".equals(orderType)){
            pizza = new GreekPizza();
        }else if("cheese".equals(orderType)){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
