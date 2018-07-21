package com.baidu.practice.classtest.constructtest;

public class ConstrueHeroTest1 {
    //如果提供了一个有参的构造方法
    //一旦提供了一个有参的构造方法
    //同时又没有显式的提供一个无参的构造方法
    //那么默认的无参的构造方法，就“木有了“

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //有参的构造方法
    //默认的无参的构造方法就失效了
    public ConstrueHeroTest1(String heroname){
        name = heroname;
    }

    public ConstrueHeroTest1() {

    }

    public static void main(String[] args) {
        ConstrueHeroTest1 garen =  new ConstrueHeroTest1("盖伦");

        ConstrueHeroTest1 teemo =  new ConstrueHeroTest1(); //无参的构造方法“木有了”
    }
}
