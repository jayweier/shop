package com.baidu.practice.overloadtest;

public class Hero2 {
    //类的多态-使用多态
    //如果物品的种类特别多，那么就需要设计很多的方法
    //比如useArmor,useWeapon等等
    //
    //这个时候采用多态来解决这个问题
    //设计一个方法叫做useItem，其参数类型是Item
    //如果是使用血瓶，调用该方法
    //如果是使用魔瓶，还是调用该方法
    //无论英雄要使用什么样的物品，只需要一个方法即可
    //
    public String name;
    protected float hp;

    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {

        Hero2 garen =  new Hero2();
        garen.name = "盖伦";

        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();

        garen.useItem(lp);
        garen.useItem(mp);

    }
}
