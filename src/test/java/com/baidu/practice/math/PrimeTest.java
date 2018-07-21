package com.baidu.practice.math;

public class PrimeTest {
    public static void main(String[] args) {
        int num = 10000000;
        int count = 0;
        // 所谓质数就只能被1和它本身整除的数.所有大于10的质数中,个位数为1,3,7,9.
        // 另外,如果一个非质数是N,那么这个数从2到根号N之间的数,一定有能除尽的数.
        //因为1不是质数,所以从2开始
        a:
        for (int i = 2; i < num; i++) {
            // 选出大于10的,个位数是1,3,5,7,9的数,只有这些数才有可能是质数
            if (i > 10 && (i % 10 == 1 || i % 10 == 3 || i % 10 == 7 || i % 10 == 9)) {
                // 如果有能除尽的数就继续循环a;否者这个数就是质数,count++
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        continue a;
                    }
                }
                count++;
                System.out.println("第" + count + "个素数");
            } else if (i <= 10) {
                // 计算1到10之间的质数
                for (int j = 2; j < i; j++) {
                    if (i >= 3 && i % j == 0) {
                        continue a;
                    }
                }
                count++;
                System.out.println("第" + count + "个素数");
            }
        }
        System.out.println("10000000以内的质数有:" + count + "个");
    }
}
