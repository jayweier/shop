package com.baidu.practice.testduotai;

public class APHero extends Hero implements Mortal{
    @Override
    public void die() {

        System.out.println(name+"英雄被杀死");
    }
}
