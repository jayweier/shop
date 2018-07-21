package com.baidu.practice.iotest;

public class Hero {//类： 英雄(Hero),类，代表英雄这样一种事物
    //所有这些英雄的共同状态： 名字, 血量，护甲，移动速度（属性）
    public String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度



    public Hero() {//默认构造器，如果不指定

    }
//一个英雄可以做很多事情，比如超神，超鬼，坑队友
//能做什么在类里面就叫做方法

    void hehe() {//方法
        System.out.println(name + "\t" + hp + "\t" + armor + "\t" + moveSpeed);

    }

    //获取护甲值,这个方法是用来获取一个英雄有多少护甲的，返回类型是float
    float getArmor() {
        return armor;
    }

    //比如队友残血正在逃跑，你过去把路给别人挡住了，导致他被杀掉。 这就是坑队友,每个英雄。。。。都可以坑
    //所以为Hero这个类，设计一个方法: keng
    //坑队友,,有的方法不需要返回值，这个时候就把返回类型设置为void,表示该方法不返回任何值
    //比如方法 "坑队友"
    void keng() {
        System.out.println("坑队友！");
    }

    //方法是一个类的动作行为，所以一般都是以动词开头的，比如 keng ...
    //如果有多个单词，后面的每个单词的第一个字母使用大写
    //比如 addSpeed

    //英雄在一些特定情况下，可以增加移动速度
    //这样我们就通过addSpeed这个方法增加移动速度
    //增加移动速度
    void addSpeed(int speed) { //int speed 叫做方法的参数
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;


    }

    public static void main(String[] args) {
        AP apHero = new APHero();
    }


    public float getHp() {
        return hp;
    }
}
