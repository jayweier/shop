package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 06.28 08:04
 */
public class StringTest {

    public static void main(String[] args) {
        String str0 = "dwj";// 常量池中找“dwj”，找不到再new一个新的，并把这个新的放入常量池，String str=new String("dwj");
        System.out.println(str0);
        System.out.println("str0的长度：" + str0.length());

        // String的实现原理是char数组
        char[] charsArray = {'d', 'w', 'j'};
        System.out.println("charsArray的长度：" + charsArray.length);
        String str1 = new String(charsArray);//创建一个对象
        System.out.println(str1);

        // 字符串的查找
        System.out.println("w的位置：" + str0.indexOf("w"));
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == 'w') {
                System.out.println("w的位置：" + i);
                break;
            }
        }

        // 指定索引位置的字符
        System.out.println("索引为1的字符串：" + str0.charAt(1));
        System.out.println("索引为1的字符串：" + charsArray[1]);

        // 获取子字符串
        System.out.println("获取子字符串索引1开始到最后" + str0.substring(1));
        System.out.println("获取子字符串索引1开始到2不包含" + str0.substring(1, 2));

        // 去除前后空格
        String str2 = "  d w j  ";
        System.out.println(str2);
        System.out.println(str2.trim());

        // 字符串替换
        System.out.println("字符串替换:" + str0.replace('w', 'a'));
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == 'w') {
                charsArray[i] = 'a';
            }
        }
        System.out.println("字符串替换" + charsArray);

        // 字符串开始与结束
        System.out.println("字符串开始与结束:" + str0.startsWith("d"));

        // 判断字符串是否相等
        System.out.println("********************************************************");
        System.out.println(str0 == "dwj");//==比较引用类型的地址，比较变量所对应的内存中所存储的数值是否相等

        String str3 = new String("dwj");
        System.out.println(str0 == str3);
        System.out.println(str0.equals(str3));
        System.out.println(str0.equalsIgnoreCase("DWJ"));// 忽略大小写的比较
        System.out.println(str0.compareTo("ewj"));// 按每个字符比较
        System.out.println("********************************************************");
        // 字符串大小写转换
        System.out.println("所有字符串转换为大写：" + str0.toUpperCase());

        // 字符串分隔
        String str4 = "d w j";
        String[] splits = str4.split(" ");
        System.out.println(splits[0]);
        System.out.println(splits[1]);
        System.out.println(splits[2]);

        // 正则表达式
        String str5 = "dwj1";
        System.out.println("正则表达式:" +str5.matches("\\w\\w\\w\\d"));
        System.out.println("正则表达式:" + str5.matches("dwj\\d"));
        System.out.println("正则表达式:" + str5.matches("\\w*\\d"));
        System.out.println("正则表达式:" + str5.matches("\\w*[0-9]"));
        System.out.println("正则表达式:" + str5.matches("\\w{0,3}[0-9]"));


        // 转义字符的意义
        System.out.print("aaa\n");// \n 和 \\n的区别
        System.out.print("sss");

    }

}
