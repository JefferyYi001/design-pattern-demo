package com.jeffery.designpattern.responsechain;

/**
 * @time 2021/2/7 - 17:51
 * @Version 1.0
 * @Author Jeffery Yi
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
