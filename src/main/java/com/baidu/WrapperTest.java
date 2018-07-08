package com.baidu;

import java.util.ArrayList;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.04 07:30
 */
public class WrapperTest {

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();

        aList.add("dwj");
        aList.add("sqx");

        for (String str : aList) {
            System.out.println(str);
        }

        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(1);// new Integer(1)，自动装箱
        bList.add(2);
        for (int temp : bList) {// 自动拆箱
            System.out.println(temp);
        }

        // Byte,Short,Integer,Long
        // Character
        // Boolean
        // FLoat,Double

    }

}
