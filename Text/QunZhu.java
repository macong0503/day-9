package com.hqyj.mc.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QunZhu extends User{
    public QunZhu() {
    }

    public QunZhu(String name, double money) {
        super(name, money);
    }

    //发红包
    public ArrayList<Double> sendMoney(double money,int count) {

        //创建一个数组
        ArrayList<Double> list = new ArrayList<>();
        //判断钱是否够
        double qunzhumoney = getMoney();
        if (qunzhumoney < money){
            System.out.println("余额不足");
        }
        //钱够的话
        super.setMoney(qunzhumoney - money);
        //获取钱
        double everymoney = money / count;
        double leftmoney = money - everymoney * count;
        for (int i = 0; i < count-1; i++) {
            list.add(everymoney);
        }
        list.add(everymoney+leftmoney);
        return list;
    }
}
