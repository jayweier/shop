package com.baidu;

import java.text.DecimalFormat;
import java.util.logging.SimpleFormatter;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.04 07:54
 */
public class FormaterTest {

    public static void main(String[] args) {
        DecimalFormat f =new DecimalFormat();
        f.applyPattern("#.###%");
        System.out.println(f.format(0.5));
    }

}
