package com.baidu;

import java.sql.*;

public class JDBCTest {

    public void insert() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";//加载驱动类
        String url = "jdbc:mysql://localhost:3306/tmall_ssm";//数据看服务器的ip地址 数据库服务端口号 数据库实例
        String username = "root";
        String password = "111111";

        Class.forName(driver); //classLoader,加载对应驱动
        Connection conn  = DriverManager.getConnection(url, username, password);//建立连接

        String sql = "insert into user (id, name, password) values(?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 3);
            ps.setString(2, "jie");
            ps.setString(3, "123");
            int result = ps.executeUpdate();
        } finally {
            // 释放资源
            if (ps != null) {
                ps.close();
            }

            if (conn != null) {
                conn.close();
            }
        }
    }

    public void delete() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/tmall_ssm";
        String username = "root";
        String password = "111111";

        Class.forName(driver); //classLoader,加载对应驱动
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "delete from user where name = ?";//占位符
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, "jie");
            int result = ps.executeUpdate();
            System.out.println("影响了几行：" + result);
        } finally {
            // 释放资源
            if (ps != null) {
                ps.close();
            }

            if (conn != null) {
                conn.close();
            }
        }
    }

    public void udpate() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/tmall_ssm";
        String username = "root";
        String password = "111111";

        Class.forName(driver); //classLoader,加载对应驱动
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "update user set name = ? where name = ?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, "sun");
            ps.setString(2, "jie");
            int result = ps.executeUpdate();
            System.out.println("影响了几行：" + result);
        } finally {
            // 释放资源
            if (ps != null) {
                ps.close();
            }

            if (conn != null) {
                conn.close();
            }
        }
    }

    public void select() throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/tmall_ssm";
        String username = "root";
        String password = "111111";

        Class.forName(driver); //classLoader,加载对应驱动
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "select * from user";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {// 遍历行
                for (int i = 1; i <= col; i++) {// 遍历列
                    System.out.print(rs.getString(i) + "  ");
                }
                System.out.println("");
            }
        } finally {
            // 释放资源
            if (ps != null) {
                ps.close();
            }

            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        JDBCTest a=new JDBCTest();
        JDBCTest b=new JDBCTest();
        a.insert();
        b.delete();
    }

}
