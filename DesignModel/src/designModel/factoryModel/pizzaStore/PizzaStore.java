package designModel.factoryModel.pizzaStore;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        orderPizza = new OrderPizza(simplePizzaFactory);
        orderPizza.setFactory(simplePizzaFactory);
    }
}
