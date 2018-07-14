package com.baidu.reflection;

import com.baidu.annotation.AnnoTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student student = new Student();

        // 等价
        student.mutipleParam("aaa", "bbb", "ccc", "ddd");
        student.mutipleParam("aaa", new String[]{"bbb", "ccc", "ddd"});

        Class<Student> clazz = Student.class;

        // getField()只能获取public的属性，getDeclaredField()可以获取任意属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        Object a = nameField.get(student);
        System.out.println(a);

        if (nameField.isAnnotationPresent(AnnoTest.class)) {
            AnnoTest anno = nameField.getDeclaredAnnotation(AnnoTest.class);
            System.out.println(anno.value());
        }

        Method nameMethod = clazz.getDeclaredMethod("getName");
        nameMethod.setAccessible(true);
        Object b = nameMethod.invoke(student);
        System.out.println(b);

        Method nameFullMethod = clazz.getDeclaredMethod("getFullName", String.class);
        nameFullMethod.setAccessible(true);
        Object c = nameFullMethod.invoke(student, "di ");
        System.out.println(c);
    }
}
