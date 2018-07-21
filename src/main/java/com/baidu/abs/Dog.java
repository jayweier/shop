package com.baidu.abs;

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

    // 实现抽象类里的抽象方法
    @Override
    public void speak() {
        System.out.println("旺旺********");
    }

    // 成员内部类
    public class A {
        private int a;

        public A(int a) {
            this.a = a;
            // 等价的
            System.out.println(hairLength);
            System.out.println(Dog.this.hairLength);
        }
    }

    // 静态内部类
    // 和外面的Dog一点关系都没有
    static class B {
        private int b;

        public B(int b) {
            this.b = b;
//            System.out.println(hairLength);
        }
    }


    public static void main(String[] args) {
        Animal dog = new Dog("金毛", "跑", 100);// 向上转型
        // 编译时类型，运行时类型，多态
        dog.doAction();
        // dog.speak();

        Dog a = (Dog) dog;// 向下转型，强制类型转换
        a.doAction();
        a.speak();

//        Animal animal = new Animal("aa", "bb");


        // 先new外面的class才能new里面的class
        Dog.A dogA = a.new A(22);

        Dog.B dobB = new Dog.B(11);


        // 匿名内部类
        Animal animal = new Animal("aa", "bb") {
            @Override
            public void speak() {

            }
        };
    }

}
