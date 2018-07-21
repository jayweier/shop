package com.baidu.practice.classtest.constructtest;

public class ConstrueOverloadTest {
    //构造方法的重载

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public ConstrueOverloadTest(String heroname){
        name = heroname;
    }

    //带两个参数的构造方法
    public ConstrueOverloadTest(String heroname,float herohp){
        name = heroname;
        hp = herohp;
    }

    public static void main(String[] args) {
        ConstrueOverloadTest garen =  new ConstrueOverloadTest("盖伦");
        ConstrueOverloadTest teemo =  new ConstrueOverloadTest("提莫",383);
    }
}
