package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.01 08:20
 */
public class ArrayTest {

    public static void main(String[] args) {

        // 一维数组遍历***********************************************************
        // 一个变量
        int a = 1;

        // 一维数组
        int[] b = new int[3];
        // 遍历
        for (int i = 0; i < b.length; i++) {
            b[i] = i; }

        // foreach遍历，写法简单
        for (int temp : b) {
            System.out.print(temp);
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

        // 一维数组初始化***********************************************************
        int[] c = new int[3];
        // 遍历
        for (int i = 0; i < b.length; i++) {
            c[i] = i;
        }

        c = new int[]{0, 1, 2};

        // 二维数组初始化***********************************************************
        System.out.println();
        System.out.println("二维数组初始化***********************************************************");
        int[][] d = new int[3][4];

        // 遍历赋值
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = j;
            }
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }

        d = new int[][]{
                {0, 1, 2, 3},
                {0, 1, 2, 3},
                {0, 1, 2, 3}
        };

        System.out.println("直接赋值");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }

}
