package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 06.29 08:35
 */
public class Test {

    public static void main(String[] args) {
        User a = new User("aaa", "0423", 24);
        User b = new User("aaa", "0423", 24);


        System.out.println(a);// 等于a.toString()

        System.out.println(a == b);
        System.out.println(a.equals(b));


        System.out.println("变量测试：");
        System.out.println("改变前a.age：" + a.age);// 改变前
        System.out.println("改变前b.age：" + b.age);
        System.out.println("改变前a.getCompany：" + a.getCompany());// User.company
        System.out.println("改变前b.getCompany：" + b.getCompany());// User.company
        a.age = 18;
        User.company = "baidu";
        System.out.println("改变后a：" + a.age);// 改变后
        System.out.println("改变后b：" + b.age);
        System.out.println("改变后a.getCompany：" + a.getCompany());// User.company
        System.out.println("改变后b.getCompany：" + b.getCompany());// User.company
    }

}
