package com.jeffery.absfactory2;

/**
 * @time 2020/12/6 - 9:53
 * @Version 1.0
 * @Author Jeffery Yi
 */

//发动机以及型号
public interface Engine {

}
class EngineA implements Engine {
    public EngineA(){
        System.out.println("制造-->EngineA");
    }
}
class EngineB implements Engine {
    public EngineB(){
        System.out.println("制造-->EngineB");
    }
}
