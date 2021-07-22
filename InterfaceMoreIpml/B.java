package com.hqyj.mc.InterfaceMoreIpml;

public interface B {
    public abstract void methodA();
    public abstract void methodB();
    public abstract void methodD();
    public default void Default(){
        System.out.println("这是接口A中的默认方法");
    }
}
