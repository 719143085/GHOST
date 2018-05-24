package designModel.singletonModel;

public class Singleton {
    /**
     * 有些对象我们只需要一个：线程池、缓存、硬件设备等
     * 如果多个实例会造成冲突、结果不一致性等问题
     * 1、单例模式的意义
     *      确保一个类最多有一个实例，并提供一个全局访问点
     * 2、单例模式优化
     *      1）多线程问题
     *      2）
     */
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
