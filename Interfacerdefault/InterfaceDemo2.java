package com.hqyj.mc.Interfacerdefault;

public interface InterfaceDemo2 {
    //默认方法  作用：实现接口升级，针对某些用户的需求，不影响其他用户
    //实现类没有重写默认方法，访问接口中的
    //重写了方法 访问实现类的
    public default void a(){
        System.out.println("这是接口中的默认方法");
    }
}
