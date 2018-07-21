package com.baidu.practice.basetest;

import org.testng.annotations.Test;

public class BaseTypeTest {

    @Test
    public void intTest() {
        //八种基本类型分别是：
        //整型 （4种）
        //字符型 （1种）
        //浮点型 （2种）
        //布尔型（1种）
        byte b = 10;//1个字节，8位
        short s = 100;//2个字节,16
        int i = 200;//4个字节,32
        long l = 3000000000000000000L;//8个字节，64.....以L结尾的字面值表示long型
        float f = 123.45f;// 以F结尾的字面值表示float类型
        double d = 123.45;// 默认就是double类型
        double d1 = 1.2345E2;// 科学计数法表示double
        char c = '邸';
        String str = "邸伟杰";//String类型其实并不是基本类型，但是它是如此广泛的被使用，常常被误以为是一种基本类型。String类型是Immutable的，一旦创建就不能够被改变
        System.out.println(str);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);

        //当以l或者L结尾的时候，一个整数字面值是long类型，否则就是int类型。 建议使用大写的L而非小写的l，因为容易和1混淆。
        //byte,short,int和long的值都可以通过int类型的字面值来创建。整数的字面值可以用如下四种进制来表示：
        //十进制: 基 10, 包含从0-9的数字，平常用的就是这种
        //十六进制: 基 16, 包含从0-9的数字，和从A-F的字母。
        //八进制: 基 8, 包含从0-7的数字
        //二进制: 基 2, 包含0和1。
        int decVal = 26; //默认就是int型
        int hexVal = 0x1a; //16进制
        int oxVal = 032; //8进制
        int binVal = 0b11010; //2进制
        System.out.println(oxVal);
    }

    @Test
    public void charTest() {
        char c1 = '中';//2个字节，16位
        //char 只能存放一个字符，超过一个字符就会产生编译错误
        // char c2 = '中国'; //报错
        //char c3 = 'ab'; //报错


        //字符的字面值放在单引号中
        //字符串的字面值放在双引号中
        //需要注意的是，\表示转义，比如需要表示制表符，回车换行，双引号等就需要用 \t \r \n \" 的方式进行
        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
        System.out.println(tab);
        System.out.println(carriageReturn);
        System.out.println(newLine);
        System.out.println(doubleQuote);
        System.out.println(singleQuote);
        System.out.println(backslash);
    }

    @Test
    public void floatTest() {
        //该行会出现编译错误，因为54.321是double型的
        // float f1= 54.321;//默认为double型
        float f2 = 54.321f;
    }


    @Test
    public void boolTest() {
        //布尔型，一个字节，一位,,,用于表示真假
        boolean b1 = true;
        boolean b2 = false;

        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
        //boolean b3 = 1;
        System.out.println(b1);
    }


    @Test
    public void castTest() {
        System.out.println("################类型转换#####################");
        //类型转换
        //不同类型之间的数据可以互相转换，但是要满足一定的规则
        //精度高的数据类型就像容量大的杯子，可以放更大的数据
        //精度低的数据类型就像容量小的杯子，只能放更小的数据
        //小杯子往大杯子里倒东西，大杯子怎么都放得下
        //大杯子往小杯子里倒东西，有的时候放的下，有的时候就会有溢出
        //需要注意的一点是,虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        char c3 = 'A';
        short s3 = 80;

        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        c3 = (char) s3;
        System.out.println(c3);
        // s3= c3; //直接进行转换，会出现编译错误

        //低精度向高精度转换
        long l3 = 50;
        int i3 = 50;
        //int比较小，要放进比较大的long,随便怎么样，都放的进去
        l3 = i3;//低精度向高精度转换 是可以正常转换的
        //换句话说，int比较小，要放进比较大的long,随便怎么样，都放的进去
        System.out.println(l3);

        //强制类型转换
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        byte p = 5;
        int p1 = 10;
        int p2 = 300;
        p = (byte) p1;
        //因为p1的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
        System.out.println(p);

        //因为p2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //p2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        p = (byte) p2;
        System.out.println(p);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(p2));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        short a4 = 1;
        short b4 = 2;
        int c4 = a4 + b4;//！！！！注意byte和short类型编译时会转换成int
        System.out.println(c4);

        System.out.println("￥￥￥￥￥￥￥￥￥￥￥￥￥￥变量命名￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥");
        //变量命名只能使用字母 数字 $ _
        //变量第一个字符 只能使用 字母 $ _
        //变量第一个字符 不能使用数字
        //注：_ 是下划线，不是-减号或者—— 破折号

        int a = 5;
        int a_12 = 5;
        int $a43 = 5;
        int a44 = 5;

        //第一个是数字，是不行的
        //int 34a= 5;报错
    }
}
