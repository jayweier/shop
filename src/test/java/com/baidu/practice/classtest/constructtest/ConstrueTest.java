package com.baidu.practice.classtest.constructtest;

public class ConstrueTest {
    private final String name;
    private String heroName;
    private float hp;
    private float armor;
    private int moveSpeed;

    //为Hero(ConstrueTest)设计4个参数的构造方法
    //这四个参数分别是
    //String heroName
    //float heroHP
    //float heroArmor
    //int heroMoveSpeed
    public ConstrueTest() {
        System.out.println("英雄的名字是" + heroName);
        this.name = heroName;
    }

    public ConstrueTest(String heroName, float heroHP) {
        System.out.println("英雄的名字是" + heroName);
        this.name = heroName;
        System.out.println("英雄的血量是" + heroHP);
        this.hp = heroHP;
    }

    public ConstrueTest(String heroName, float heroHP, float heroArmor, int heroMoveSpeed) {
        System.out.println("英雄的名字是" + heroName);
        this.name = heroName;
        System.out.println("英雄的血量是" + heroHP);
        this.hp = heroHP;
        System.out.println("英雄的护甲是" + heroArmor);
        this.armor = heroArmor;
        System.out.println("英雄的移动速度是：" + heroMoveSpeed);
        this.moveSpeed = heroMoveSpeed;
    }

    public static void main(String[] args) {
        //使用一个引用来指向这个对象
        ConstrueTest bh = new ConstrueTest("二狗", 100, 333, 20);
        String heroName = bh.heroName;



    }
}
