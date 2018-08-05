package designModel.factoryModel.pizzaStore.method;

import designModel.factoryModel.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法模式：
 *      定义了一个创建对象的抽象方法，由子类决定要实例化的类；
 *      工厂方法模式将对象的实例化推迟到了子类
 */
public abstract  class OrderPizza {

    public OrderPizza() {
    Pizza pizza = null;
    String orderType;
    do {
        orderType = getType();
        pizza = createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }while (true);
    }

    public abstract Pizza createPizza(String orderType);
    private String getType() {
        String str = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input pizza type:");
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
