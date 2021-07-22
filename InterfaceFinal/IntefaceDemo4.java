package com.hqyj.mc.InterfaceFinal;

public interface IntefaceDemo4 {
//在接口中定义“变量”必须赋值，且修饰符必须是public static final
//final修饰的变量就是一个常量，不可被修改，在静态方法中可以直接访问
         /* 接口中定义的“变量":
            1、必须是public static final修饰的，不写默认有
            2、必须在定义的时候赋值
            3、赋值之后不可以在被修改赋值
            4、对于一个定义的常量，常量名一般大写
          */
    public static final String NAME = "老胡";
    static final int age = 60;
    final int a = 1;
    int b = 2;
}
