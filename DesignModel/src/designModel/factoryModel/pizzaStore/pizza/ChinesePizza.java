package designModel.factoryModel.pizzaStore.pizza;


import designModel.factoryModel.pizzaStore.method.OrderPizza;

public class ChinesePizza extends OrderPizza {

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
