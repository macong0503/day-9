package com.hqyj.mc.InterfaceMoreIpml;

public interface A {
    public abstract void methodA();
    public abstract void methodB();
    public abstract void methodC();
    public default void Default(){
        System.out.println("这是接口A中的默认方法");
    }
    public default void Default1(){
        System.out.println("这是ClazzC类中的默认方法");
    }
}
