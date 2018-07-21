package com.baidu.spring;

import org.springframework.stereotype.Component;

@Component
public class UserSpring1 {

    public String name;
    public String passWord;
    public int age;

    public void print(){
        System.out.println("UserSpring1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
