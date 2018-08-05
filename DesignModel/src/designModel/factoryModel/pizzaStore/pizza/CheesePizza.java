package designModel.factoryModel.pizzaStore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("CheesePizza");
        System.out.println(name + "正在准备");
    }
}
