package com.baidu;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.09 07:35
 */
public class CollectionTest {

    public static void main(String[] args) {
        // 有序，底层的实现原理是数组，基层了Collection接口
        ArrayList<String> list = new ArrayList<>();

        list.add("dwj0");
        list.add("dwj1");
        list.add("dwj2");

        // 遍历
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("元素的获取："+list.get(1));

        System.out.println("----------------------------------------------------------");

        // 无序不重复集合，底层实现原理是HaspMap，基层Collection接口
        HashSet<String> set=new HashSet<>();
        set.add("dwj0");
        set.add("dwj0");
        set.add("dwj0");
        set.add("dwj1");
        set.add("dwj2");
        set.add("dwj3");
        set.add("dwj4");
        set.add("dwj5");
        set.add("dwj6");
        set.add("dwj7");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
