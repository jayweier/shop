package com.baidu.practice.pactest;

public class Number {
    //Number类
    //数字封装类有
    //Byte,Short,Integer,Long,Float,Double
    //这些类都是抽象类Number的子类
    //
    public static void main(String[] args) {
        int i = 5;

        //基本类型转换成封装类型
        Integer it = new Integer(i);

        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Integer);

        //封装类型转换成基本类型
        int i2 = it.intValue();

        //自动转换就叫装箱
        Integer it2 = i;

        //自动转换就叫拆箱
        int i3 = it;//不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱

        //int的最大值，最小值
        //int的最大值
        System.out.println(Integer.MAX_VALUE);//2147483647
        //int的最小值
        System.out.println(Integer.MIN_VALUE);//-2147483648
    }
}
