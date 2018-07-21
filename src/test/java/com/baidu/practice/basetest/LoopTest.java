package com.baidu.practice.basetest;

import java.util.Scanner;

public class LoopTest {
    //
    void if1() {
        boolean b = true;
        //如果成立就打印yes
        if (b) {
            System.out.println("yes");
        }
    }

    void elseif1() {
        //如果只使用 if,会执行4次判断
        int i = 2;
        if (i == 1)
            System.out.println(1);
        if (i == 2)
            System.out.println(2);
        if (i == 3)
            System.out.println(3);
        if (i == 4)
            System.out.println(4);

        //如果使用else if, 一旦在27行，判断成立， 接下来几行的判断就不会执行了，节约了运算资源
        if (i == 1)
            System.out.println(1);
        else if (i == 2)
            System.out.println(2);
        else if (i == 3)
            System.out.println(3);
        else if (i == 4)
            System.out.println(4);
    }

    void swich1() {
        //如果使用if else
        int day = 5;
        if (day == 1)
            System.out.println("星期一");

        else if (day == 2)
            System.out.println("星期二");
        else if (day == 3)
            System.out.println("星期三");
        else if (day == 4)
            System.out.println("星期四");
        else if (day == 5)
            System.out.println("星期五");
        else if (day == 6)
            System.out.println("星期六");
        else if (day == 7)
            System.out.println("星期天");
        else
            System.out.println("这个是什么鬼？");

        //如果使用switch
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }
    }

    public void month() {
        System.out.println("请输入月份");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        String b = "不知道是什么季节";
        switch (a) {
            case 1:
            case 2:
            case 3:
                b = "温和的春季";
                break;
            case 4:
            case 5:
            case 6:
                b = "炎热的夏季";
                break;
            case 7:
            case 8:
            case 9:
                b = "凉爽的秋季";
                break;
            case 10:
            case 11:
            case 12:
                b = "寒冷的冬季";
                break;
            default:
                b = "系统以及崩溃啦！";

        }
        System.out.println(b);
    }

    void while1() {
        //只要while中的表达式成立，就会不断地循环执行
        //打印0到4
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    void dowhile1() {
        //条件为true时 重复执行，至少会执行一次
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    //通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
    void jiecheng() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int math = scan.nextInt();
        int num = math;
        int i = 1;
        while (i <= math - 1) {
            num = num * (math - i);
            i += 1;
        }
        System.out.println(num);
    }

    void for1() {
        //for循环，和while一样，只是表达方式不一样
        //使用while打印0到4
        int i = 0;
        while (i < 5) {
            System.out.println("while循环输出的" + i);
            i++;
        }

        //使用for打印0到4
        for (int j = 0; j < 5; j++) {
            System.out.println("for  循环输出的" + j);
        }
    }

    //天朝有一个乞丐姓洪，去天桥要钱
//第一天要了1块钱
//第二天要了2块钱
//第三天要了4块钱
//第四天要了8块钱
//以此类推
//
//问题： 洪乞丐干10天，收入是多少？
    void money1() {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("请输入第几天:");
        int n = inScanner.nextInt();
        int money = 1;
        if (n == 1) {
            money = 1;
            System.out.println(money);
        } else if (n > 1) {
            while (n - 1 > 0) {
                money *= 2;
                n--;
            }
            System.out.println(money);
        }
    }

    void continue1() {
        //继续下一次循环
        //打印单数
        for (int j = 0; j < 10; j++) {
            if (0 == j % 2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环

            System.out.println(j);
        }
    }

    //打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
    void continue2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

    //breake,直接结束当前for循环
    void breake1() {
        //打印单数
        for (int j = 0; j < 10; j++) {
            if (0 == j % 2)
                break; //如果是双数，直接结束循环

            System.out.println(j);
        }
    }

    //以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
    void breake2() {
        double p = 100000;
        double sum = 0;
        for (int i = 0; i <= 40; i++) {
            sum = (sum + p) * 1.2;
            if (sum > 1000000) {
                System.out.println("至少" + i + "年才能达到" + sum + "元");
                break;
            }
        }
    }
//i是从0开始计数,当总收入超过一百万时,此时输出的i比总收入快达到一百万时多加了1,所以从0开始,输出的是多少年就是多少年

    public static void main(String[] args) {
        LoopTest r = new LoopTest();
        r.if1();
        r.elseif1();
        r.swich1();
        new LoopTest().month();
        r.dowhile1();
        r.for1();
        r.jiecheng();
        r.money1();
        r.while1();
        r.breake1();
        r.breake2();
        r.continue1();
        r.continue2();

        // if后面有一个分号; 而分号也是一个完整的表达式
        //如果b为true，会执行这个分号，然后打印yes
        //如果b为false，不会执行这个分号，然后打印yes
        //这样，看上去无论如何都会打印yes
        boolean b = false;

        if (b) ;
        System.out.println("yes");

        //计算瑞年
        Scanner s = new Scanner(System.in);
        System.out.println("输入一个年份（YYYY）：");
        int f = s.nextInt();
        if (f % 4 == 0 && f % 100 != 0 | f % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("不是闰年");
        }
        s.close();


    }
}
