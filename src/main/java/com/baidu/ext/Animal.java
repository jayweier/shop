package com.baidu.ext;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.05 07:59
 */
public class Animal {

    public String name;
    public String action;

    public Animal(String name, String action) {
        this.name = name;
        this.action = action;
    }

    public void doAction() {
        System.out.println(name + ":" + action);
    }

}
