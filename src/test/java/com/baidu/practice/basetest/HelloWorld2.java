package com.baidu.practice.basetest;

public class HelloWorld2 {
    //如果一个变量，是声明在一个方法上的，就叫做参数
    //参数的作用域即为该方法内的所有代码
    //其他方法不能访问该参数
    //类里面也不能访问该参数

    public void method1(int i) { //参数i的作用域即方法method1
        System.out.println(i);
    }

    public void method2() {

        System.out.println(); //method2 不能访问参数i
    }

    //int j = i;  //类里面也不能访问参数i

    public static void main(String[] args) {
        HelloWorld2 t = new HelloWorld2();
        t.method1(1);
    }
}
