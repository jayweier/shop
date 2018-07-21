package com.baidu.practice.basetest;

public class HelloWorld4 {
    //作用域
    //属性的作用域在方法中，参数的作用域也在方法中，如果属性和参数命名相同了的话？ 那么到底取哪个值？
    int i = 1; //属性名是i

    public void method1(int i) { //参数也是i
        System.out.println(i);
    }//当程序运行到这里时i结果是1但不会输出，因为还没有main方法

    public static void main(String[] args) {//运行main方法内的语句
        new HelloWorld4().method1(5);//定义一个这个类method1的值为5
        //运行到这里是，程序会查询整个类的method1并且值定义为5
    }   //然后运行输出i的结果
}
