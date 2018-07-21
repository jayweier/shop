package com.baidu.practice.basetest;

import java.util.Scanner;

public class RelationOperation {
    //> 大于
    //>= 大于或等于
    //< 小于
    //<= 小于或等于
    //== 是否相等
    //!= 是否不等
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;

        System.out.println(a>b);  //返回 false
        System.out.println(a>=c);  //返回 true

        System.out.println(a==b); //返回false
        System.out.println(a!=b);//返回true


        Scanner s=new Scanner(System.in);
        System.out.println("第一个整数");
        int g= s.nextInt();
        System.out.println("第二个整数");
        int h= s.nextInt();
        System.out.println(g>h);
        System.out.println(g>=h);
        System.out.println(g<h);
        System.out.println(g<=h);
        System.out.println(g==h);
        System.out.println(g!=h);
    }
}
