package com.baidu.practice.basetest;

import java.util.Random;

//数组是一个固定长度的，包含了相同类型数据的 容器
public class Arrayen {
    //首先创建一个长度是5的数组
    //然后给数组的每一位赋予随机整数
    //通过for循环，遍历数组，找出最小的一个值出来

    //Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可
    void math1() {
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);

        System.out.println("数组中的各个随机数是:");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        System.out.println("本练习的目的是，找出最小的一个值: ");
    }

    //复制数组
    //把一个数组的值，复制到另一个数组中
    //System.arraycopy(src, srcPos, dest, destPos, length)
    //src: 源数组
    //srcPos: 从源数组复制数据的起始位置
    //dest: 目标数组
    //destPos: 复制到目标数组的起始位置
    //length: 复制的长度

    //遍历
    void look() {
        int values[] = new int[]{18, 62, 68, 82, 65, 9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }

        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }
    }

    //填充
    private void padd() {
        int[] arr = new int[5];
        int max = 0;
        //随机填充0-100范围内
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        for (int i : arr) {
            System.out.println("填充:" + " == " + i);
        }
    }

    //fore取最大值
    private void run() {
        int[] arr = new int[5];
        int max = 0;
        for (int i : arr) {
            max = i > max ? i : max;
        }

        System.out.println(max);
    }

    //声明数组
    //int[] a; 声明了一个数组变量。
    //[]表示该变量是一个数组
    //int 表示数组里的每一个元素都是一个整数
    //a 是变量名
    //但是，仅仅是这一句声明，不会创建数组
    public static void main(String[] args) {
        Arrayen r = new Arrayen();
        r.math1();
        r.look();
        r.padd();
        r.run();

        //声明一个引用
        int[] a;//声明数组
        //创建数组的时候，要指明数组的长度。
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];//让a这个引用，指向数组

        int[] b = new int[5]; //声明的同时，指向一个数组


        int[] c;
        c = new int[5];

        c[0] = 1;  //下标0，代表数组里的第一个数
        c[1] = 2;
        c[2] = 3;
        c[3] = 4;
        c[4] = 5;

        //.length属性用于访问一个数组的长度
        //数组访问下标范围是0到长度-1
        //一旦超过这个范围,就会产生数组下标越界异常
        System.out.println(c.length); //打印数组的长度
        c[4] = 100; //下标4，实质上是“第5个”，既最后一个
        c[5] = 101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
    }
}
