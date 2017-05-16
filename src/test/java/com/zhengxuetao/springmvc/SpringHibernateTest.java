/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ThinkPad
 */
public class SpringHibernateTest {

    private final ApplicationContext context;
    {
        context = new ClassPathXmlApplicationContext("classpath:spring.hbn.xml");
    }
    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


     @Test
    public void testDataSource() throws SQLException {
        DataSource datasource = context.getBean(DataSource.class);
        System.out.println(datasource.getConnection());
    }
}
