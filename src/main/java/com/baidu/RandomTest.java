package com.baidu;

import java.util.Random;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.04 08:09
 */
public class RandomTest {

    public static void main(String[] args) {
        // java编译器默认使用当前系统时间作为随机数的种子，因为每时每刻时间不同，所以随机数不同
        // 但是运行的速度太快也会产生相同的随机数
        Random random =new Random(100);
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
    }
}
