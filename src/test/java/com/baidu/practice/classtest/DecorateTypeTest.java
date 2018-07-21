package com.baidu.practice.classtest;

public class DecorateTypeTest {
    //成员变量有四种修饰符
    //private 私有的
    //package/friendly/default 不写
    //protected 受保护的
    //public 公共的


    //使用private修饰属性 "私有的"
    //自身：是可以访问的
    //同包子类：不能继承
    //不同包子类：不能继承
    //同包类：不能访问
    //其他包类：不能访问

    //属性id是private的，只有DecorateTypeTest自己可以访问
    //子类不能继承
    //其他类也不能访问
    private int id;


    // public的属性 name
    // 自己可以访问

    // 同包子类可以继承
    // 不同包子类可以继承

    // 同包类可以访问
    // 不同包类可以访问
    public String name;


    // protected饰符的属性 hp
    // 自己可以访问

    // 同包子类可以继承
    // 不同包子类可以继承

    // 同包类可以访问
    // 不同包类不能访问
    protected float hp;

    float armor;

    int moveSpeed;

   // public DecorateTypeTest(int id) {
     //   this.id = id;
    //}


    public static void main(String[] args) {
        //那么什么情况该用什么修饰符呢？
        //1. 属性通常使用private封装起来
        //2. 方法一般使用public用于被调用
        //3. 会被子类继承的方法，通常使用protected
        //4. package用的不多，一般新手会用package,因为还不知道有修饰符这个东西
        //
        //再就是作用范围最小原则
        //简单说，能用private就用private，不行就放大一级，用package,再不行就用protected，
        // 最后用public。 这样就能把数据尽量的封装起来，没有必要露出来的，就不用露出来了
    }
}
