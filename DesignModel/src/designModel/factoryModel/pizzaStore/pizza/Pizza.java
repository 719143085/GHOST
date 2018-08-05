package designModel.factoryModel.pizzaStore.pizza;

public abstract class Pizza {

    protected String name;

    /**
     * 披萨准备阶段
     * tips：因为每一种不同披萨的准备的材料都是不同的，所以用抽象方法
     */
    public abstract void prepare();

    /**
     * 披萨烘培
     */
    public void bake() {
        System.out.println(name + "正在烘培");
    }

    /**
     * 披萨切割
     */
    public void cut() {
        System.out.println(name + "正在切割");
    }

    /**
     * 披萨包装
     */
    public void box() {
        System.out.println(name + "正在包装");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
