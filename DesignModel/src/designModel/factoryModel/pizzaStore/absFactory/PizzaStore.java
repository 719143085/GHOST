package designModel.factoryModel.pizzaStore.absFactory;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza  = new OrderPizza(new NYFactory());
    }
}
