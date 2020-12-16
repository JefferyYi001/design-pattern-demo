package com.jeffery.adapter3;

/**
 * @time 2020/12/16 - 23:40
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
