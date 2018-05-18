package designModel.trimmerModel.coffeeBar.coffee;

import designModel.trimmerModel.coffeeBar.Drink;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
