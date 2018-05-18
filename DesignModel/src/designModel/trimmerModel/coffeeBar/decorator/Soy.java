package designModel.trimmerModel.coffeeBar.decorator;

import designModel.trimmerModel.coffeeBar.Drink;

/**
 * 大豆
 */
public class Soy extends  Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDescription("Soy");
        setPrice(5);
    }
}
