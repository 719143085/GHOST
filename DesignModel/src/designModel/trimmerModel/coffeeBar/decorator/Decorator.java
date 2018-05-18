package designModel.trimmerModel.coffeeBar.decorator;

import designModel.trimmerModel.coffeeBar.Drink;

/**
 * 装饰者
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-" + super.getPrice() + "&&" + drink.getDescription();
    }
}
