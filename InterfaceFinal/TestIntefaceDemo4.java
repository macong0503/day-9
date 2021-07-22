package com.hqyj.mc.InterfaceFinal;
import static com.hqyj.mc.InterfaceFinal.IntefaceDemo4.NAME;
public class TestIntefaceDemo4 {
    public static void main(String[] args) {
        //通过接口名访问
        System.out.println(NAME);
        //通过实现类对象访问
        IntefaceDemo4Impl i = new IntefaceDemo4Impl();
        System.out.println(NAME);

        //直接访问
        System.out.println(NAME);
    }
}
