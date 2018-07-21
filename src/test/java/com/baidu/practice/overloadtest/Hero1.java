package com.baidu.practice.overloadtest;

public class Hero1 {
    //如果不使用多态，
    //假设英雄要使用血瓶和魔瓶，就需要为Hero设计两个方法
    //useLifePotion
    //useMagicPotion
    //
    //
    //除了血瓶和魔瓶还有很多种物品，那么就需要设计很多很多个方法，比如
    //usePurityPotion 净化药水
    //useGuard 守卫
    //useInvisiblePotion 使用隐形药水
    //等等等等

    public String name;
    protected float hp;

    public void useLifePotion(LifePotion lp){
        lp.effect();
    }
    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }

    public static void main(String[] args) {

        Hero1 garen =  new Hero1();
        garen.name = "盖伦";

        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();

        garen.useLifePotion(lp);
        garen.useMagicPotion(mp);

    }

}
