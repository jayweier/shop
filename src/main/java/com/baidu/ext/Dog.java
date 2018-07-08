package com.baidu.ext;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.05 08:02
 */
public class Dog extends Animal {

    private int hairLength;

    public Dog(String name, String action) {
        super(name, action);
    }

    public Dog(String name, String action, int hairLength) {
        super(name, action);
        this.hairLength = hairLength;
    }

    @Override
    public void doAction() {
        super.doAction();
        System.out.println(super.name + ":" + "毛的长度" + this.hairLength + "," + super.action);
    }

    public void speak() {
        System.out.println("旺旺********");
    }

    // 方法重载
    public void speak(String word) {
        System.out.println("旺旺:" + word);
    }

    public static void main(String[] args) {
        Animal dog = new Dog("金毛", "跑", 100);// 向上转型
        // 编译时类型，运行时类型，多态
        dog.doAction();
        // dog.speak();

        Dog a = (Dog) dog;// 向下转型，强制类型转换
        a.doAction();
        a.speak();
        a.speak("主人你好");


        Animal c = new Cat("美短猫", "猫步走");
        if (c instanceof Dog) {
            Dog d = (Dog) c;
        }
    }

}
