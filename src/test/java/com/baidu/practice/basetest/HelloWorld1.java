package com.baidu.practice.basetest;

public class HelloWorld1 {
    //变量处于不同的位置，有不同的名称 ，分别是：字段，属性，参数，局部变量。不同名称的变量，其作用域是不一样的
    //当一个变量被声明在类下面,变量就叫做字段 或者属性、成员变量、Field
    int i = 1;
    int j = i;  //其他的属性可以访问i

    public void method1() {
        System.out.println(i); //方法1里可以访问i
    }

    public void method2() {
        System.out.println(i); //方法2里可以访问i
    }

    public static void main(String[] args) {
        HelloWorld1 r = new HelloWorld1();
        r.method1();
        r.method2();
    }

}
