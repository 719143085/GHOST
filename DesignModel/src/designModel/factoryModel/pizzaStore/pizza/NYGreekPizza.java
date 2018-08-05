package designModel.factoryModel.pizzaStore.pizza;

public class NYGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("NYGreekPizza");
        System.out.println(name + "正在准备");
    }
}
