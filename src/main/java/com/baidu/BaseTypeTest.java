package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.01 08:22
 */
public class BaseTypeTest {

    public static void main(String[] args) {
        // ****************整数型**********************
        byte a = (byte) 250;// 1个字节：-128 ~ 127
        System.out.println(a);

        short b = 1;// 2个字节
        System.out.println(b);

        int c = 1;// 4个字节，大约21亿
        System.out.println(c);

        long d = 1;// 8个字节
        System.out.println(d);

        // ****************浮点型**********************
        float e = 18.22F;// 4个字节，默认double，科学计数法，1位符号，7位代表小数点前面的数，其余的位数表示小数点后面的数字
        System.out.println(e);

        double f = 1.00;// 8个字节
        System.out.println(f);

        // ****************bool型**********************
        boolean g = true;//1个字节
        System.out.println(g);

        // ****************字符型**********************
        char h = '1';// 2个字节
        System.out.println(h);

        a = (byte) c;// 4个字节转一个字节，因为会有精度丢失，所以需要强制类型转换
        c = a;// 1个字节转4个字节，因为不会精度丢失，所以不需要强制类型转换
    }

}
