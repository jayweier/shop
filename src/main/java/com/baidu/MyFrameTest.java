package com.baidu;


import javax.swing.*;
import java.awt.*;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.07 09:42
 */
public class MyFrameTest {

    public static void main(String[] args) {
        // 窗体
        JFrame a = new JFrame("邸伟杰的窗体标题");

        // 窗体里的容器
        Container container = a.getContentPane();

        // 标签
        JLabel b = new JLabel("这是一个JFrame船体");
        b.setHorizontalAlignment(SwingConstants.CENTER);

        // 把标签加入容器中
        container.add(b);

        container.setBackground(Color.GRAY);
        a.setVisible(true);
        a.setSize(200, 150);
        a.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }
}
