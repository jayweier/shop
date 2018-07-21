package com.baidu.practice.pactest;

import org.testng.annotations.Test;

import java.util.Arrays;

public class OprTest {
    @Test
    public void todaxie(){
        //给出一句英文句子： "let there be light"
        //得到一个新的字符串，每个单词的首字母都转换为大写
        String str = "let there be light";
        String str1 [] = str.split(" ");
        String str2;
        str2 = "";
        for(int i=0;i<str1.length;i++){

            str2 =str2+" " + str1[i].substring(0, 1).toUpperCase() + str1[i].substring(1);
        }
        System.out.println(str2.trim());
    }
    @Test
    public void ying(){
        //英文绕口令
        //peter piper picked a peck of pickled peppers
        //统计这段绕口令有多少个以p开头的单词
        String s = "peter piper picked a peck of pickled peppers";
        String[] a = s.split(" ");
        int count = 0;

        for (String sub : a)
            System.out.print(sub + " ");
        for (int i = 0; i < a.length; i++) {

            if ('p' == a[i].charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
    }
    @Test
    public void  string(){
        //把 lengendary 最后一个字母变大写
        String string = "lengendary";
        char [] a =string.toCharArray();
        char [] y = string.toUpperCase().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (i==(a.length-1)) {
                a[i]=y[i];
            }
        }
        for(char c :a)
            System.out.print(c);
    }

}
