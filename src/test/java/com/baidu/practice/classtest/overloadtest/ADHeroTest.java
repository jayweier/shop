package com.baidu.practice.classtest.overloadtest;

import com.baidu.practice.iotest.Hero;

public class ADHeroTest {
    private String name;
    //设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
    //对Support的heal方法进行重载
    //heal()
    //heal(Hero h) //为指定的英雄加血
    //heal(Hero h, int hp) //为指定的英雄加了hp的血

    public void heal(){
        System.out.println(name+"给其他英雄加了一次血");
    }
    public void heal(Hero h){
        System.out.println(name+"给"+h.name+"加了一次血");
    }
    public void heal(Hero h,int hp) {
        System.out.println(name+"给"+h.name+"加了"+hp+"血");
    }
    public static void main(String[] args) {
        ADHeroTest s=new ADHeroTest();
        s.name="奶妈";
        Hero h=new Hero();
        h.name="诸葛亮";
        s.heal();
        s.heal(h);
        s.heal(h, 200);
    }
}
