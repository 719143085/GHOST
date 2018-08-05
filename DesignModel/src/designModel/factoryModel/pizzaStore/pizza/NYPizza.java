package designModel.factoryModel.pizzaStore.pizza;

import designModel.factoryModel.pizzaStore.method.OrderPizza;

public class NYPizza extends OrderPizza {
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
