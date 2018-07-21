package com.baidu.practice.classtest.thistest;

public class ThisTest2 {
    //如果要在一个构造方法中，调用另一个构造方法，可以使用this()
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public ThisTest2(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public ThisTest2(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public static void main(String[] args) {
        ThisTest2 teemo =  new ThisTest2("提莫",383);

        System.out.println(teemo.name);

    }
}
