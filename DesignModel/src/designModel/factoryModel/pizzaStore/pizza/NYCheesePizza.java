package designModel.factoryModel.pizzaStore.pizza;

public class NYCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("NYCheesePizza");
        System.out.println(name + "正在准备");
    }
}
