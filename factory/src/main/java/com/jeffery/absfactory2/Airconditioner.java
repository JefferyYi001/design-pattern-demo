package com.jeffery.absfactory2;

/**
 * @time 2020/12/6 - 9:54
 * @Version 1.0
 * @Author Jeffery Yi
 */

//空调以及型号
public interface Airconditioner {

}
class AirconditionerA implements Airconditioner {
    public AirconditionerA(){
        System.out.println("制造-->AirconditionerA");
    }
}
class AirconditionerB implements Airconditioner {
    public AirconditionerB(){
        System.out.println("制造-->AirconditionerB");
    }
}