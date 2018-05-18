package designModel.trimmerModel.coffeeBar.decorator;

import designModel.trimmerModel.coffeeBar.Drink;

/**
 * 巧克力
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(3);
    }
}
