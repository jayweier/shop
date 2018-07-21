package com.baidu.practice.transitiontest;


import org.testng.annotations.Test;

public class Hero {
    //明确引用类型与对象类型的概念
    //通常情况下，引用类型和对象类型是一样的

    //引用类型和对象类型不一致的情况下的转换
    //子类转父类(向上转型)

    //所谓的转型，是指当引用类型和对象类型不一致的时候，才需要进行类型转换
    //类型转换有时候会成功，有时候会失败(参考基本类型的类型转换)
    //
    public String name;
    protected float hp;

    @Test
    public void A() {
        Hero h = new Hero();

        ADHero ad = new ADHero();

        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以

        //h = ad;
    }

    @Test
    public void B() {
        Hero h = new Hero();
        ADHero ad = new ADHero();


        // h = ad;//把ad当做Hero使用，一定可以//转换之后，h引用指向一个ad对象
        //ad = (ADHero) h;//h引用有可能指向一个ad对象，也有可能指向一个support对象
        //所以把h引用转换成AD类型的时候，就有可能成功，有可能失败
        //因此要进行强制转换，换句话说转换后果自负
        //到底能不能转换成功，要看引用h到底指向的是哪种对象
        //在这个例子里，h指向的是一个ad对象，所以转换成ADHero类型，是可以的

        //h = s;//把一个support对象当做Hero使用，一定可以
        //转换之后，h引用指向一个support对象
        //ad = (ADHero)h;//这个时候，h指向的是一个support对象，所以转换成ADHero类型，会失败。
        //失败的表现形式是抛出异常 ClassCastException 类型转换异常
    }




    public static void main(String[] args) {


    }
}
