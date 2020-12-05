package com.jeffery.simplefactory;

/**
 * @time 2020/12/5 - 15:10
 * @Version 1.0
 * @Author Jeffery Yi
 */
public class Factory {
    public BMW createBMW(int type) {
        switch (type) {

            case 320:
                return new BMW320();

            case 523:
                return new BMW523();

            default:
                break;
        }
        return null;
    }
}

