package com.baidu.reflection;

import com.baidu.annotation.AnnoTest;

@AnnoTest
public class Student {

    @AnnoTest(value = "xiao bao bei")
    private String name = "jie";

    @AnnoTest
    private String getName() {
        return name;
    }

    private String getFullName(String a) {
        return a + name;
    }

    private String getFullName(String a, String b) {
        return a + b + name;
    }

    // String... b等价于String[]
    public void mutipleParam(String a, String... b) {
        String str = a;
        for (String s : b) {
            str += s;
        }
        System.out.println(str);
    }
}
