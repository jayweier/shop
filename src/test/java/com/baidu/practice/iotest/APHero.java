package com.baidu.practice.iotest;

public class APHero extends Hero implements AP{
    //设计一类英雄，只能使用魔法攻击，这类英雄在LOL中被叫做AP
    //类：APHero
    //继承了Hero 类，所以继承了name,hp,armor等属性
    //同时，实现了AP这个接口，就必须提供AP接口中声明的方法magicAttack()
    //实现在语法上使用关键字 implements
    //
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }


}
