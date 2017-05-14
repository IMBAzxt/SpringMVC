/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author zhengxt
 */
public class HelloWorldTest {

    public HelloWorldTest() {
    }

    /**
     * Test of sayHello method, of class HelloWorld.
     */
    @Test
    public void testSayHello() {
        ApplicationContext contex = new ClassPathXmlApplicationContext("spring.xml");
        HelloWorld instance = contex.getBean("hello", HelloWorld.class);
        instance.sayHello();
    }

}
