package com.baidu.practice.basetest;

import java.util.Scanner;

public class ScannerTest {
    //使用Scanner读取整数
    void integer() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数：" + a);
        int b = s.nextInt();
        System.out.println("第二个整数：" + b);
    }

    //使用Scanner读取浮点数
    void float1() {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        System.out.println("读取的浮点数的值是：" + a);
    }

    //使用Scanner读取字符串
    void string1() {
        Scanner b = new Scanner(System.in);
        String a = b.nextLine();
        System.out.println("读取的字符串是：" + a);

        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("读取的整数是" + i);
        String rn = s.nextLine();//如果在通过nextInt()读取了整数后，再接着读取字符串，读出来的是回车换行:"\r\n",
        // 因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".
        String c = s.nextLine();//应该连续执行两次nextLine()，第一次是取走回车换行，第二次才是读取真正的字符串
        System.out.println("读取的字符串是：" + c);
    }

    public static void main(String[] args) {
        ScannerTest a = new ScannerTest();
        a.integer();
        a.float1();
        a.string1();

    }
}
