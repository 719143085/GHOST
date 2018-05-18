package designModel.trimmerModel.coffeeBar;

import designModel.trimmerModel.coffeeBar.coffee.Decaf;
import designModel.trimmerModel.coffeeBar.coffee.LongBlack;
import designModel.trimmerModel.coffeeBar.decorator.Chocolate;
import designModel.trimmerModel.coffeeBar.decorator.Milk;

/**
 * 1、装饰者模式就像打包一个快递
 *      1）主体：陶瓷、塑料
 *      2）包装：报纸填充、塑料泡沫、纸板、木板
 *  2、Component
 *  3、ConcreteComponent和Decorator
 *  4、装饰者模式：动态的将新功能附加到对象上，在对象功能扩展方面，它比继承更具有弹性
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink;
        drink = new Decaf();
        System.out.println("Description====" + drink.getDescription());
        System.out.println("Price====" + drink.getPrice());
        System.out.println("****************");
        drink = new LongBlack();
        drink = new Milk(drink);
        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        System.out.println("Description====" + drink.getDescription());
        System.out.println("Price====" + drink.getPrice());

    }
}
