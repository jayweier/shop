package com.baidu.practice.basetest;

import org.testng.annotations.Test;

import java.util.Scanner;

public class LogicalRelationTest {
    //无论长路与&，还是短路与&&,两边的运算单元都是布尔值
    //都为真时，才为真
    //任意为假，就为假
    //区别，长路与& 两侧，都会被运算，，短路与&& 只要第一个是false，第二个就不进行运算了
    @Test
    public void yu() {
        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
//        System.out.println(i++ == 2);
//        System.out.println(++i== 2);
        System.out.println(i == 1 & i++ == 2); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);

        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println(j == 1 && j++ == 2);  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);
    }

    //无论长路或还是短路或,,,两边的运算单元都是布尔值,,,//都为假时，才为假,//任意为真，就为真
    //区别
    //长路或 两侧都会被运算
    //短路或 只要第一个是true的，第二个就不进行运算了
    @Test
    public void huo() {
        //长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println(i == 1 | i++ == 2); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);

        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println((j == 2) || (j++ == 2));  //因为j==2返回true,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);
    }

    //取反!//真变为假//假变为真
    @Test
    public void qufan() {
        boolean b = true;

        System.out.println(b); //输出true
        System.out.println(!b);//输出false

    }

    //异或^
    //不同，返回真
    //相同，返回假
    @Test
    public void yihuo() {
        boolean a = true;
        boolean b = false;

        System.out.println(a ^ b); //不同返回真
        System.out.println(a ^ (!b)); //相同返回假

    }

    public static void main(String[] args) {
        LogicalRelationTest s = new LogicalRelationTest();
        s.yu();
        System.out.println("##########################################");
        s.huo();
        System.out.println("##########################################");
        s.qufan();
        System.out.println("##########################################");
        s.yihuo();

        System.out.println("##########################################");
        int a = 1;
        boolean b = !(a++ == 3) ^ (a++ == 2) && (a++ == 3);
        System.out.println(b);
        System.out.println(a);


        System.out.println("三元操作符");
        //表达式?值1:值2
        //如果表达式为真 返回值1
        //如果表达式为假 返回值2
        int i = 5;
        int j = 6;

        int k = i < j ? 99 : 88;

        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }

        System.out.println(k);


        Scanner q = new Scanner(System.in);
        System.out.println("请输入星期几：");
        int w = q.nextInt();

        int e = 5;
        String d1 = "工作日";
        String d2 = "周末";

        if (w > 0 && w <= 7) {
            String y = w <= e ? d1 : d2;
            System.out.println(y);
        } else {
            System.out.println("输入值不正确");
        }


    }
}
