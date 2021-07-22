package com.hqyj.mc.Text;

import java.util.ArrayList;
import java.util.Random;

public class QunYuan extends User {
    public QunYuan() {
    }

    public QunYuan(String name, double money) {
        super(name, money);
    }

    //取红包
    public void open(ArrayList<Double> list){
        //随机取
        int random = new Random().nextInt(list.size());
        //通过random取到钱
        double money = list.remove(random);
        //加上钱 获取之前的钱
        double beformoney = getMoney();

        setMoney(beformoney + money);

    }
}
