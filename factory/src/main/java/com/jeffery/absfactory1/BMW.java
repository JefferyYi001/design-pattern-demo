package com.jeffery.absfactory1;

/**
 * @time 2020/12/5 - 23:19
 * @Version 1.0
 * @Author Jeffery Yi
 */
abstract class BMW {
    public BMW(){

    }
}

class BMW320 extends BMW {
    public BMW320() {
        System.out.println("制造-->BMW320");
    }
}

class BMW523 extends BMW {
    public BMW523(){
        System.out.println("制造-->BMW523");
    }
}
