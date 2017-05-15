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
public class HelloWorldImpl1 implements HelloWorld {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloWorldImpl1.class);
    private String helloStr;

    public HelloWorldImpl1() {
    }

    public HelloWorldImpl1(String helloStr) {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS");
        logger.info("类初始化时间：" + myFmt.format(System.currentTimeMillis()));
        this.helloStr = helloStr;
    }

    public void init() {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS");
        logger.info("init时间：" + myFmt.format(System.currentTimeMillis()));
    }

    public void destroy() {
        SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS");
        logger.info("destroy时间：" + myFmt.format(System.currentTimeMillis()));
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
