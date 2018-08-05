package designModel.factoryModel.pizzaStore.absFactory;

import designModel.factoryModel.pizzaStore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
