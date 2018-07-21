package com.baidu.practice.basetest;

public class HelloWorld3 {
    //声明在方法内的变量，叫做局部变量
    //其作用域在声明开始的位置，到其所处于的块结束位置
    public void method1() {
        int i  = 5;  //其作用范围是从声明的这一行，到其所处于的块结束15行位置
        System.out.println(i);
        {            //子块
            System.out.println(i); //可以访问i
            int j = 6;
            System.out.println(j); //可以访问j
        }
        //System.out.println(j); //不能访问j,因为其作用域到上一行就结束了
    }

    public static void main(String[] args) {
        HelloWorld3 y=new HelloWorld3();
        y.method1();
    }
}
