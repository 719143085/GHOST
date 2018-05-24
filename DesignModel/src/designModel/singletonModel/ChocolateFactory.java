package designModel.singletonModel;

/**
 * 模拟巧克力工厂生产巧克力
 */
public class ChocolateFactory {
    private boolean empty;
    private boolean boiled;

    public ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    /**
     * 第一步：添加巧克力原料
     */
    public void fill() {
        if (empty) {
            empty = false;
            boiled = true;
        }
    }

    /**
     * 第二步：加热煮沸
     */
    public void boil() {
        if ((!empty) && (!boiled)) {
            boiled = true;
        }
    }

    /**
     * 第三步：排出巧克力
     */
    public void drain() {
        if ((!empty) && boiled) {
            empty = true;
        }
    }


}
