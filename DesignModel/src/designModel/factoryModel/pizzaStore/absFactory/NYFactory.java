package designModel.factoryModel.pizzaStore.absFactory;

import designModel.factoryModel.pizzaStore.pizza.NYCheesePizza;
import designModel.factoryModel.pizzaStore.pizza.NYGreekPizza;
import designModel.factoryModel.pizzaStore.pizza.NYPaperPizza;
import designModel.factoryModel.pizzaStore.pizza.Pizza;

public class NYFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("paper".equals(orderType)){
            pizza = new NYPaperPizza();
        }else if("greek".equals(orderType)){
            pizza = new NYGreekPizza();
        }else if("cheese".equals(orderType)){
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}
