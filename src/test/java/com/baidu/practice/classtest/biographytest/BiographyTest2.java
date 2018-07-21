package com.baidu.practice.classtest.biographytest;

public class BiographyTest2 {
    //在方法中，使参数引用指向一个新的对象
    //
    //外面的引用是指向原来的对象？还是新的对象？
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public BiographyTest2() {

    }

    public BiographyTest2(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(BiographyTest2 h) {
        h = new BiographyTest2("提莫", 383);
    }

    public static void main(String[] args) {
        BiographyTest2 teemo = new BiographyTest2("提莫", 383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        System.out.println(teemo.hp); //输出多少？ 怎么理解？
        teemo.revive(teemo);
        System.out.println(teemo.hp); //输出多少？ 怎么理解？
        //-17,,,revice虽然生成了新的对象，但是teemo还是原来的对象的引用

    }


}
