package com.hqyj.mc.InterfaceImport;

public class Test {
    public static void main(String[] args) {

        AImpl01 a = new AImpl01();
        AImpl02 b = new AImpl02();
        //使用父类引用来接收子类对象，传递的是哪个对象，就调用那个对象对应类中的方法
        /*
        * 1、发生继承或者实现
        *2、方法重写
        * 3、父类引用指向子类对象(向上转型 ---> 自动类型转换)
        *      格式：父类类型  变量名 = new 子类名();
        * */
        a.a(new int[]{1,2,3});
        b.a(new int[]{4,5,6});
        System.out.println("-------");
        a.b(a);
        System.out.println("-------");
        b.b(b);
        System.out.println("-------");
    }
}
