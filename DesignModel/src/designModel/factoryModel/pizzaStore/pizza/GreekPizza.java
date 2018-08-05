package designModel.factoryModel.pizzaStore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println(name + "正在准备");
    }
}
