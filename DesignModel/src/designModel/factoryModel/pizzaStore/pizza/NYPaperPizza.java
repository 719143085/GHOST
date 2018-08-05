package designModel.factoryModel.pizzaStore.pizza;

public class NYPaperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("NYPaperPizza");
        System.out.println(name + "正在准备");
    }
}
