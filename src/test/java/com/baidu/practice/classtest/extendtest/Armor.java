package com.baidu.practice.classtest.extendtest;

//设计一个类Armor护甲
//继承Item类，并且额外提供一个属性ac: 护甲等级 int类型
//
//实例化出两件护甲
//名称 价格 护甲等级
//布甲 300 15
//锁子甲 500 40
public class Armor extends Item{
    int damage;
    int ac;

    public static void main(String[] args) {
        Armor cloth = new Armor();
        cloth.name="布甲";
        cloth.price=300;
        cloth.ac = 15;
        System.out.println(cloth.name+cloth.price+cloth.ac);

        Armor chainMail = new Armor();
        chainMail.name="锁子甲";
        chainMail.price=500;
        chainMail.ac = 40;

    }
}
