package com.jeffery.bridge;

/**
 * @time 2020/12/29 - 23:52
 * @Version 1.0
 * @Author Jeffery Yi
 */
public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
