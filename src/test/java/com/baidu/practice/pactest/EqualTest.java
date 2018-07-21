package com.baidu.practice.pactest;

import org.testng.annotations.Test;

public class EqualTest {
    @Test
    public void A(){
        //str1和str2的内容一定是一样的！
        //但是，并不是同一个字符串对象
        String str1 = "the light";

        String str2 = new String(str1);

        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);
    }
    @Test
    public void B(){
        //str1 = "the light";
        //str3 = "the light";
        //
        //
        //一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
        //所以在第6行会创建了一个新的字符串"the light"
        //但是在第7行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建
        String str1 = "the light";
        String str3 = "the light";
        System.out.println( str1  ==  str3);
    }
    @Test
    public void C(){
        //内容是否相同
        //使用equals进行字符串内容的比较，必须大小写一致
        //equalsIgnoreCase，忽略大小写判断内容是否一致
        String str1 = "the light";

        String str2 = new String(str1);

        String str3 = str1.toUpperCase();

        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);

        System.out.println(str1.equals(str2));//完全一样返回true

        System.out.println(str1.equals(str3));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true

    }
    @Test
    public void D(){
        //是否以子字符串开始或者结束
        //startsWith //以...开始
        //endsWith //以...结束
        String str1 = "the light";

        String start = "the";
        String end = "Ight";

        System.out.println(str1.startsWith(start));//以...开始
        System.out.println(str1.endsWith(end));//以...结束

    }

}
