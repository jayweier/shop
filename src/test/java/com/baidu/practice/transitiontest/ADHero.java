package com.baidu.practice.transitiontest;

import com.baidu.practice.iotest.AD;
import com.baidu.practice.iotest.Hero;

public class ADHero extends Hero implements AD {
    //设计一类英雄，能够使用物理攻击
    //设计一类英雄，能够使用物理攻击，这类英雄在LOL中被叫做AD
    //类：ADHero
    //继承了Hero 类，所以继承了name,hp,armor等属性
    //实现某个接口，就相当于承诺了某种约定
    //
    //所以，实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack()
    //实现在语法上使用关键字 implements
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }


}
