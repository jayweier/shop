package com.baidu.practice.classtest.constructtest;

import com.baidu.practice.iotest.Hero;

public class ConstrueHeroTest {
    //通过一个类创建一个对象，这个过程叫做实例化
    //实例化是通过调用构造方法(又叫做构造器)实现的

    //什么是构造方法
    //方法名和类名一样（包括大小写）
    //没有返回类型
    //实例化一个对象的时候，必然调用构造方法
    String name;

    float hp;

    float armor;

    int moveSpeed;

    // 方法名和类名一样（包括大小写）
    // 没有返回类型
    public ConstrueHeroTest() {//构造方法
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }


    //这个无参的构造方法，如果不写，
    //就会默认提供一个无参的构造方法
    //  public ConstrueHeroTest(){
    //      System.out.println("调用Hero的构造方法");
    //  }
    public static void main(String[] args) {
        //实例化一个对象的时候，必然调用构造方法
        Hero h = new Hero();
    }
}
