/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc;

import java.text.SimpleDateFormat;
import org.slf4j.LoggerFactory;

/**
 *
 * @author zhengxt
 */
public class HelloWorldImpl implements HelloWorld {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloWorldImpl.class);

    public HelloWorldImpl() {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS");
        logger.info("类初始化时间：" + myFmt.format(System.currentTimeMillis()));
    }

    HelloWorld hello2;

    @Override
    public void sayHello() {
        hello2.sayHello();
    }

    public HelloWorld getHello2() {
        return hello2;
    }

    public void setHello2(HelloWorld hello2) {
        this.hello2 = hello2;
    }

}
