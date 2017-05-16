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
public class HelloAspect {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HelloAspect.class);
    SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS");

    public void beforeAspect() {
        logger.info("beforeAspect：" + myFmt.format(System.currentTimeMillis()));
    }

    public void afterAspect() {
        logger.info("afterAspect：" + myFmt.format(System.currentTimeMillis()));
    }
}
