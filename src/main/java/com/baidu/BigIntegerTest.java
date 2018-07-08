package com.baidu;

import java.math.BigInteger;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.04 08:16
 */
public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger a=new BigInteger("11111111111111111111111111111111111111111111111111111111111");
        System.out.println(a);
        BigInteger b=new BigInteger("11111111111111111111111111111111111111111111111111111111111");
        System.out.println(b);
        System.out.println(a.add(b));

        // BigDecimal
    }
}
