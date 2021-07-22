package com.hqyj.mc.InterfaceImport;

public class AImpl02 implements A{
    @Override
    public void a(int[] arr) {
        System.out.println("这是02中的a方法");
    }

    @Override
    public void b(A a) {
        a.c();
        System.out.println("这是02中的b方法");
    }

    public void c(){
        System.out.println("这是02中的c方法");
    }
}
