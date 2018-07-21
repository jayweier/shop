package com.baidu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


public class SpringTest {

    @Test
    public void testFinalSpring() {
//        UserSpring0 user0 = new UserSpring0();
//        user0.print();
//        UserSpring1 user1 = new UserSpring1();
//        user1.print();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserSpring0 user0 = context.getBean(UserSpring0.class);
        user0.print();

        UserSpring1 user1 = context.getBean(UserSpring1.class);
        user1.print();
    }

    @Test
    public void testAutowiredSpring() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 通过描述类的类来获取实例对象
//        AutowiredUser111 autowiredUser = context.getBean(AutowiredUser111.class);
//
//        autowiredUser.print();

        // 通过bean的名称获取实例对象
        AutowiredUser111 autowiredUser = (AutowiredUser111) context.getBean("aaa");
        autowiredUser.print();
    }

}
