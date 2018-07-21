package com.baidu.practice.basetest;

public class FinalTest {
    //final 修饰一个变量，有很多种说法，比如不能改变等等
    //准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会
    public void method1(final int j) {
        //执行完上面的后要执行main方法，main方法下面有一个赋值
        // j = 5;//下面的main方法中有赋值了，这个属于final重复赋值，是不允许的
        System.out.println(j);
    }

    public static void main(String[] args) {
        new FinalTest().method1(10);
    }
}
