package designModel.factoryModel.pizzaStore;

import designModel.factoryModel.pizzaStore.pizza.CheesePizza;
import designModel.factoryModel.pizzaStore.pizza.GreekPizza;
import designModel.factoryModel.pizzaStore.pizza.PaperPizza;
import designModel.factoryModel.pizzaStore.pizza.Pizza;

/**
 * 简单工厂模式：定义了一个创建对象的类：由这个类来封装实例化对象的行为
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String orderType){
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
