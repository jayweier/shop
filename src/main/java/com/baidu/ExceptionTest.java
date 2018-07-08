package com.baidu;

/**
 * @author jielavender
 * @version 1.0
 * @since 2018 07.06 08:16
 */
public class ExceptionTest {

    // Trowable下面有两个继承Exception，Error（系统内部错误，比较严重）
    public static void main(String[] args) {

        // 责任链模式
        try {
            int result = 3 / 0;
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(IllegalArgumentException.class.getName());
        } catch (ArithmeticException e) {
            System.out.println(ArithmeticException.class.getName());
        } catch (Exception e) {
            System.out.println(Exception.class.getName());
        }

        System.out.println("dwj");

        try {
            throw new NullPointerException();
        } catch (IllegalArgumentException e) {
            System.out.println(IllegalArgumentException.class.getName());
        } catch (ArithmeticException e) {
            System.out.println(ArithmeticException.class.getName());
        } catch (Exception e) {
            System.out.println(Exception.class.getName());
        }


    }
}
