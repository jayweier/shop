package com.baidu.practice.formattest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
        System.out.println("请输入地名:");
    String localName=s.nextLine();
        System.out.println("请输入公司类型:");
    String companyLeixing=s.nextLine();
        System.out.println("请输入公司名称:");
    String compnyName=s.nextLine();
        System.out.println("请输入老板名称:");
    String bossName=s.nextLine();
        System.out.println("请输入金额:");
    String money=s.nextLine();
        System.out.println("请输入产品:");
    String product=s.nextLine();
        System.out.println("请输入价格计量单位:");
    String priceCount=s.nextLine();
    String sentenceFormat="%s 最大%s %s倒闭了，王八蛋老板 %s 吃喝嫖赌，欠下了%s个亿%n"
            + "带着他的小姨子跑了!我们没有办法，拿着 %s抵工资!原价都是一 %s多，两%s多，三%s多的%s现在全部只卖二十块，统统只要二十块!%n%s王八蛋，"
            + "你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱! ";

        System.out.printf(sentenceFormat,localName,companyLeixing,compnyName,bossName,money,product,
    priceCount,priceCount,priceCount,product,bossName);


}
}
