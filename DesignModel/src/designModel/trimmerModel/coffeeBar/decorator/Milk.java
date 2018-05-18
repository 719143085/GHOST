package designModel.trimmerModel.coffeeBar.decorator;

import designModel.trimmerModel.coffeeBar.Drink;

/**
 * 牛奶
 */
public class Milk extends  Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescription("Milk");
        setPrice(4);
    }
}
