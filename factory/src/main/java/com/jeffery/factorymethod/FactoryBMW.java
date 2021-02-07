package com.jeffery.factorymethod;

/**
 * @time 2020/12/5 - 23:30
 * @Version 1.0
 * @Author Jeffery Yi
 */
interface FactoryBMW {
    BMW createBMW();
}

class FactoryBMW320 implements FactoryBMW {

    @Override
    public BMW320 createBMW() {
        return new BMW320();
    }
}

class FactoryBMW523 implements FactoryBMW {
    @Override
    public BMW523 createBMW() {
        return new BMW523();
    }
}
