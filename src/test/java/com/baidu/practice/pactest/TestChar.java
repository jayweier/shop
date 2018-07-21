package com.baidu.practice.pactest;

import org.testng.annotations.Test;

import java.util.Scanner;

public class TestChar {
    @Test
    public void A(){
        // //保存一个字符的时候使用char
        char c1 = 'a';
        char c2 = '1';//字符1,而非数字1
        char c3 = '中';//汉字字符
        // char c4 = 'ab'; //只能放一个字符

    }
  @Test
  public void B(){
        //char对应的封装类是Character
        //装箱拆箱概念，参考 拆箱装箱
        char c1 = 'a';
        Character c = c1; //自动装箱
        c1 = c;//自动拆箱
    }
    @Test
    public void C(){
        System.out.println(Character.isLetter('a'));//判断是否为字母
        System.out.println(Character.isDigit('a')); //判断是否为数字
        System.out.println(Character.isWhitespace(' ')); //是否是空白
        System.out.println(Character.isUpperCase('a')); //是否是大写
        System.out.println(Character.isLowerCase('a')); //是否是小写

        System.out.println(Character.toUpperCase('a')); //转换为大写
        System.out.println(Character.toLowerCase('A')); //转换为小写

        //String a = 'a'; //不能够直接把一个字符转换成字符串
        String a2 = Character.toString('a'); //转换为字符串
    }
    @Test
    public void D(){
        //常见转义
        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");

        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");

        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");

        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");

        System.out.println("单引号 \\'");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");
    }
    @Test
    public void E(){
        System.out.println("请输入你想输入的字符串:");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        //把字符串转变为字符数组
        char[] c = a.toCharArray();
        //打印字符数组
        System.out.println("字符数组：");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]);
        }
        //遍历字符数组
        System.out.println("筛选后的数组:");
        for(int i=0;i<c.length;i++){
            if(Character.isDigit(c[i])||Character.isUpperCase(c[i])){
                System.out.print(c[i]);
            }
        }
    }
    public static void main(String[] args) {


    }
}
