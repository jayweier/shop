package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 06.29 08:32
 */

// 类，默认继承Object,public class User extends Object
public class User {

    // 静态变量，属于类，只有一份数据
    public static String company = "taobao";

    // 静态方法
    public static String whatCompany() {
        return company;
    }

    // 成员变量
    public String name;
    public String passWord;
    public int age;

    public User(String name, String passWord, int age) {
        this.name = name;
        this.passWord = passWord;
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object b) {
        if (this == b)
            return true;

        User user = (User) b;

        if (age != user.age)
            return false;

        if (name != null ? !name.equals(user.name) : user.name != null)
            return false;
        return passWord != null ? passWord.equals(user.passWord) : user.passWord == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    // 会被默认调用


    @Override
    public String toString() {
        int age=100;
        return "User{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + this.age +
                '}';
    }
}
