package designModel.factoryModel.pizzaStore;

import designModel.factoryModel.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    SimplePizzaFactory simplePizzaFactory;

    public OrderPizza(SimplePizzaFactory simplePizzaFactory) {
        setFactory(simplePizzaFactory);
    }

    public void setFactory(SimplePizzaFactory simplePizzaFactory) {
        Pizza pizza = null;
        String orderType;
        this.simplePizzaFactory = simplePizzaFactory;
        do {
            orderType = getType();
            pizza = simplePizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

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
