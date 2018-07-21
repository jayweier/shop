package com.baidu.practice.stringtest;

import org.testng.annotations.Test;

public class TestNumber {
    //数字转字符串
    //方法1： 使用String类的静态方法valueOf
    //方法2： 先把基本类型装箱为对象，然后调用对象的toString
    @Test
    public void str1(){
        int i = 5;

        //方法1
        String str = String.valueOf(i);
        System.out.println(str);

        //方法2
        Integer it = i;
        String str2 = it.toString();
        System.out.println(str2);
    }
    @Test
    public void str2(){
        //字符串转数字
        //调用Integer的静态方法parseInt
        String str = "88888888";

        int i= Integer.parseInt(str);

        System.out.println(i);
    }
    public static void main(String[] args) {
        //把浮点数 3.14 转换为 字符串 "3.14"
        //再把字符串 “3.14” 转换为 浮点数 3.14
        float f=3.14f;
        //方法1 使用Stirng类的静态方法valueof
        String oneStr=String.valueOf(f);
        //方法2 先把基本类型封装成对象 再调用对象的toString方法
        Float f1=f;
        String twoStr=f1.toString();
        System.out.println(twoStr);

        String threeStr="3.14";
        float f2=Float.parseFloat(threeStr);
        System.out.println(f2);

        //如果字符串是 3.1a4，转换为浮点数会得到什么？
        String strf3 = "3.1a4";
        //编译时候报错
        float f3 = Float.parseFloat(strf3);
        System.out.println(f3);



    }
}
