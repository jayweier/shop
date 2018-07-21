package com.baidu.practice.basetest;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        //如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
        int a = 5;
        long b = 6;
        int c = (int) (a+b); //a+b的运算结果是long型，所以要进行强制转换
        long d = a+b;
        System.out.println(c);
        System.out.println(d);


        //如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
        byte e = 1;
        byte f= 2;
        byte g = (byte) (e+f); //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
        int h = e+f;
        System.out.println(g);
        System.out.println(h);

        //% 取余数，又叫取模
        int i = 5;
        int j = 2;
        System.out.println(i%j); //输出为1

        //i++; 先取值，再运算
        //++i; 先运算，再取值
        int k = 5;
        System.out.println(k++); //输出5
        System.out.println(k);   //输出6

        int n = 5;
        System.out.println(++n); //输出6
        System.out.println(n);   //输出6

        Scanner s=new Scanner(System.in);
        float Height =s.nextFloat();
        System.out.println("请输入身高（m）"+Height);
        float Weight =s.nextFloat();
        System.out.println("请输入体重（kg）"+Weight);
        float BMI = Height/(Weight*Weight);
        System.out.print("当前的BMI为" +BMI);
        if(BMI<18.5){
            System.out.print("您的体重过轻");
        }   else if (18.5<=BMI&&BMI<24){
            System.out.print("您的体重属于正常");
        }   else if (24<=BMI&&BMI<27){
            System.out.print("您的体重过重");
        }   else if (27<=BMI&&BMI<30){
            System.out.print("您的体重轻属于度肥胖");
        }   else if (30<=BMI&&BMI<35){
            System.out.print("您的体重属于中度肥胖");
        }   else{
            System.out.print("您中度肥胖");
        }
    }

}
