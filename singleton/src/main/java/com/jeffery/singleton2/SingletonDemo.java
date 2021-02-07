package com.jeffery.singleton2;

/**
 * 饿汉式 (静态代码块)
 * @time 2020/12/2 - 23:02
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}
class Singleton {
    // 1. 私有化构造器
    private Singleton(){
    }
    // 2. 类的内部创建对象实例
    private static Singleton singleton;

    // 3. 在静态代码块中初始化对象实例
    static {
        singleton = new Singleton();
    }
    // 4. 对外提供静态方法返回实例
    public static Singleton getInstance() {
        return singleton;
    }
}
