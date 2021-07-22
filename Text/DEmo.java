package com.hqyj.mc.Text;

import java.util.ArrayList;

public class DEmo {
    public static void main(String[] args) {
        QunZhu qunZhu = new QunZhu("小胡",200);
        QunYuan q1 = new QunYuan("小刘",5);
        QunYuan q2 = new QunYuan("小明",5);
        QunYuan q3 = new QunYuan("小红",5);
        //QunYuan q4 = new QunYuan("小王",5);

        qunZhu.show();
        q1.show();
        q2.show();
        q3.show();
        //q4.show();
        System.out.println("---------------");

        ArrayList<Double> openRed = qunZhu.sendMoney(20,3);
            if (openRed.size()==0){
                System.exit(0);

        }
        //拆红包
        q1.open(openRed);
        q2.open(openRed);
        q3.open(openRed);
        //q4.open(openRed);

        //显示现在的钱
        qunZhu.show();
        q1.show();
        q2.show();
        q3.show();
        //q4.show();
    }
}
