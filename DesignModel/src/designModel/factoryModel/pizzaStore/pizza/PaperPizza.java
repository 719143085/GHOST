package designModel.factoryModel.pizzaStore.pizza;

public class PaperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("PaperPizza");
        System.out.println(name + "正在准备");
    }
}
