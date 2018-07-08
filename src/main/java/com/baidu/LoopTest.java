package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 06.28 07:34
 */
public class LoopTest {

    public void whileTest() {
        int i = 1;
        int sum = 0;
        while (i <= 5) {

            sum += i;
            i++;
//            if (i == 4) {
//                break;
//            }

        }
        System.out.println("sum=" + sum);
    }

    public void doWhileTest() {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 5);
        System.out.println("sum=" + sum);
    }

    public void forTest() {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
//            if (i == 4) {
//                continue;
//            }
            sum += i;
        }
        System.out.println("sum=" + sum);
    }

    public void duplicateForTest() {
        for (int i = 1; i < 10; i++) {   //建立for循环
            for (int a = 1; a <= i; a++) {  //再执行里面循环，符合条件输出，循环到a>i，时跳出
                System.out.print(a + "*" + i + "=" + a * i + "\t");  //符合上一循环时输出
            }
            System.out.println();  //当a>i时，跳出执行这输出
        }
    }

    public static void main(String[] args) {
        LoopTest loop = new LoopTest();
        loop.whileTest();
        loop.doWhileTest();
        loop.forTest();
    }

}
