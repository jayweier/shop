package com.baidu.practice.pactest;

import java.util.Random;
//冒泡排序
public class Test2 {
    String [] aaa = new String[8];
    int []y = new int [8];
    Random random = new Random();
    public void TextString() {
        char[]a=new char[5];
        for (int i=0; i<aaa.length;i++){
            for(int x=0;x<a.length;x++){
                byte indx = (byte)random.nextInt(3);
                if (indx == 0)
                    a[x] = (char)(byte) (random.nextInt(10)+48);
                else if (indx == 1)
                    a[x] = (char)(byte) (random.nextInt(26)+65);
                else
                    a[x] = (char)(byte) (random.nextInt(26)+97);
            }
            for(int d =0;d<a.length;d++)
                if(Character.isLetter(a[d])) {
                    char b = a[d];
                    int c = (int)b;
                    if (Character.isLowerCase(a[d])) {
                        c-=97;
                        y[i] = c;
                    }else{
                        c-=65;
                        y[i] = c;
                    }
                    break;
                }
            aaa[i] = new String(a);
        }
        System.out.println("排序前");
        for(String c:aaa)
            System.out.print(c+" ");
        System.out.println();
        System.out.println("排序后");
        for(int j=0;j<y.length;j++)
            for(int i = 0; i<y.length-1;i++)
                if (y[i]>y[i+1]) {
                    String ccc;
                    ccc = aaa[i+1];
                    aaa[i+1]=aaa[i];
                    aaa[i] =ccc;
                }
        for(String d:aaa)
            System.out.print(d+" ");
    }
    public static void main(String[] args) {
        Test2  shuZuPaiXu = new Test2();//数字排序
        shuZuPaiXu.TextString();
    }
}
