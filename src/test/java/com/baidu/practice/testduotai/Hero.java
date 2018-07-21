package com.baidu.practice.testduotai;

public class Hero {


    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public void kill(Mortal m) {
        m.die();
    }

    public static void main(String[] args) {
        Hero h = new Hero();

    }
}
