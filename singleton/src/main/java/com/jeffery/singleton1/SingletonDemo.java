package com.jeffery.singleton1;

/**
 * 饿汉式 (静态常量)
 * @author jeffery.yi
 * @since 12-02-2020
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
    private static final Singleton singleton = new Singleton();
    // 3. 对外提供静态方法返回实例
    public static Singleton getInstance() {
        return singleton;
    }
}