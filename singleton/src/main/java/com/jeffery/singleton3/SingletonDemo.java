package com.jeffery.singleton3;

/**
 * 懒汉式（线程不安全）
 *
 * @time 2020/12/3 - 8:01
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
    private Singleton() {
    }

    // 2. 类的内部创建对象实例
    private static Singleton singleton;

    // 3. 对外提供静态方法返回实例
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
