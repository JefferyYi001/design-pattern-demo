package com.jeffery.singleton8;

/**
 * 懒汉式（双重检查，线程安全）
 * 推荐在开发中使用这种
 *
 * @time 2020/12/3 - 8:01
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode = " + instance1.hashCode());
        System.out.println("instance2.hashCode = " + instance2.hashCode());
    }
}

enum Singleton {
    INSTANCE;
}
