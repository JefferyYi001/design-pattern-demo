package com.jeffery.simplefactory;

/**
 * @time 2020/12/5 - 15:08
 * @Version 1.0
 * @Author Jeffery Yi
 */
public abstract class BMW {
    public BMW() {
    }
}

class BMW320 extends BMW {
    public BMW320() {
        System.out.println("制造-->BMW320");
    }
}
class BMW523 extends BMW{
    public BMW523(){
        System.out.println("制造-->BMW523");
    }
}