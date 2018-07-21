package com.baidu.practice.basetest;

import org.testng.annotations.Test;

import java.util.Random;

public class ArrayCopyTest {

    @Test
    public void combine1() {
        int number1 = 0;
        int number2 = 0;
        do {
            number1 = (int) (Math.random() * 10);
            number2 = (int) (Math.random() * 10);
        } while ((number1 < 5 || number1 > 10) && (number2 < 5 || number2 > 10));
        int[] arr1 = new int[number1];
        int[] arr2 = new int[number2];
        int[] arr3 = new int[number1 + number2];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        for (int i = 0; i < arr3.length; i++) System.out.print(arr3[i] + " ");

    }


    @Test
    public void copy() {

        //复制数组
        //把一个数组的值，复制到另一个数组中
        //System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的起始位置
        //length: 复制的长度
        //      首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组,,,,,,向数组填充随机数的办法，
        //      然后准备第三个数组，第三个数组的长度是前两个的和
        //      通过System.arraycopy 把前两个数组合并到第三个数组中
        int[] a = new int[new Random().nextInt(6) + 5];
        int[] b = new int[(int) (Math.random() * 6 + 5)];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        System.out.println("数组a的长度：" + a.length);
        int j = 0;
        for (int i : a) {
            System.out.print("数组a[" + j + "]:" + i + "\t");
            j++;
        }
        System.out.println("\n数组b的长度：" + b.length);
        int k = 0;
        for (int i : b) {
            System.out.print("数组b[" + k + "]:" + i + "\t");
            k++;
        }
        int[] c = new int[a.length + b.length];

        int index = a.length;
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, index, b.length);
        int z = 0;
        System.out.println("\n数组c的长度：" + c.length);
        for (int i : c) {
            System.out.print("数组c[" + z + "]:" + i + "\t");
            z++;
        }
    }

    public static void main(String[] args) {
        ArrayCopyTest a = new ArrayCopyTest();
        a.combine1();
        System.out.println();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
        a.copy();
    }
}