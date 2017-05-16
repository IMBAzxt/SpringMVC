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
public class HelloWorldImpl2 implements HelloWorld {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloWorldImpl2.class);
    private String helloStr;

    public HelloWorldImpl2() {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS");
        logger.info("类初始化时间：" + myFmt.format(System.currentTimeMillis()));
    }

    @Override
    public void sayHello() {
        logger.info(this.helloStr);
    }

    public String getHelloStr() {
        return helloStr;
    }

    public void setHelloStr(String helloStr) {
        this.helloStr = helloStr;
    }

}
