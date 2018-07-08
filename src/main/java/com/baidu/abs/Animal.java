package com.baidu.abs;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.05 07:59
 */

// 一个类只能extend一个类，但是可以implements多个接口
public abstract class Animal implements IAction {

    public String name;
    public String action;

    public Animal(String name, String action) {
        this.name = name;
        this.action = action;
    }


    // 抽象方法
    public abstract void speak();

    @Override
    public void doAction() {
        System.out.println(name + ":" + action);
    }

}
