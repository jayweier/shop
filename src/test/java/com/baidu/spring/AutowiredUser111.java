package com.baidu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "aaa")
public class AutowiredUser111 {

    @Autowired
    public UserSpring0 userSpring0;

    @Autowired
    public UserSpring1 userSpring1;

    public void print() {
        userSpring0.print();
        userSpring1.print();
    }

}
