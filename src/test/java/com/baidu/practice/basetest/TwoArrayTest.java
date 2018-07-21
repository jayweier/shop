package com.baidu.practice.basetest;

import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoArrayTest {
    //这是一个一维数组, 里面的每一个元素，都是一个基本类型int
//int a[] =new int[]{1,2,3,4,5};
//
//这是一个二维数组，里面的每一个元素，都是一个一维数组
//所以二维数组又叫数组的数组
//int b[][] = new int[][]{
//   {1,2,3},
//   {4,5,6},
//   {7,8,9}
//};
    @Test
    public void initialization() {
        //初始化二维数组，
        int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        b[0] = new int[3]; //必须事先分配长度，才可以访问
        b[0][2] = 5;

        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1, 2, 4},
                {4, 5},
                {6, 7, 8, 9}
        };
    }

    @Test
    public void initialization1() {
        //定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
        //找出这个二维数组里，最大的那个值，并打印出其二维坐标
        //
        //0-100的 随机整数的获取办法有多种，下面是参考办法之一:
        //(int) (Math.random() * 100)
        //Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。

        //创建数组
        int[][] a = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
//找出最大值
        int max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
//找到最大值的坐标
        System.out.println(max + "最大值");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == max) {
                    System.out.println("最大值的坐标是：(" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }


    //Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。
    @Test
    private void arrayscopy() {
        //数组复制
        //与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
        //不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange 只需要源数组就就可以了，通过返回值，
        //copyOfRange 只需要源数组就就可以了，通过返回值， 就能够得到目标数组了。
        //除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。
        int a[] = new int[]{18, 62, 68, 82, 65, 9};

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a, 0, 3);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    //如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
    //但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
    @Test
    private void arrayprint() {//转换为字符串
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        String content = Arrays.toString(a);
        System.out.println(content);
    }

    //排序
    //Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能
    @Test
    private void arraysort() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
    }

    //搜索
    //查询元素出现的位置
    //需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
    //如果数组中有多个相同的元素，查找结果是不确定的
    @Test
    private void arraysearch() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:" + Arrays.binarySearch(a, 62));
    }

    @Test
    private void arraycompare() {
        //判断是否相同
        //比较两个数组的内容是否一样
        //第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        int b[] = new int[]{18, 62, 68, 82, 65, 8};

        System.out.println(Arrays.equals(a, b));
    }

    @Test
    private void arrayfill() {
        int a[] = new int[10];

        Arrays.fill(a, 5);

        System.out.println(Arrays.toString(a));

    }


    public static void main(String[] args) {
        //练习-二维数组排序
        //首先定义一个5X8的二维数组，然后使用随机数填充满。
        //借助Arrays的方法对二维数组进行排序。
        //参考思路：//先把二维数组使用System.arraycopy进行数组复制到一个一维数组//然后使用sort进行排序//最后再复制回到二维数组。
        //关于随机数
        //0-100的 随机整数的获取办法有多种，下面是参考办法之一:
        //(int) (Math.random() * 100)
        //Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。

        int[][] dest = new int[5][8];
        int length = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                dest[i][j] = (int) (Math.random() * 100);
                length++;
            }
        }
        int index = 0;
        int[] a = new int[length];
        for (int i = 0; i < 5; i++) {
            System.arraycopy(dest[i], 0, a, index, dest[i].length);
            index += 8;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int n = 0;
        int k = 8;
        for (int i = 0; i < 5; i++) {
            dest[i] = Arrays.copyOfRange(a, n, k);
            n += 8;
            k += 8;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(dest[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
