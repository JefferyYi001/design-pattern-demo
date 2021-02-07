package com.jeffery.absfactory2;

/**
 * @time 2020/12/6 - 9:56
 * @Version 1.0
 * @Author Jeffery Yi
 */

//创建工厂的接口
public interface AbstractFactory {
    //制造发动机
    public Engine createEngine();
    //制造空调
    public Airconditioner createAircondition();
}


//为宝马320系列生产配件
class FactoryBMW320 implements AbstractFactory{

    @Override
    public Engine createEngine() {
        return new EngineA();
    }
    @Override
    public Airconditioner createAircondition() {
        return new AirconditionerA();
    }
}
//宝马523系列
class FactoryBMW523 implements AbstractFactory {

    @Override
    public Engine createEngine() {
        return new EngineB();
    }
    @Override
    public Airconditioner createAircondition() {
        return new AirconditionerB();
    }


}
