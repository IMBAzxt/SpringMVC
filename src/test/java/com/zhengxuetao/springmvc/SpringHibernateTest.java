/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc;

import com.zhengxuetao.springmvc.hbn.UserService;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
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
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.hbn.xml");
            DataSource datasource = context.getBean(DataSource.class);
            System.out.println(datasource.getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQuery() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.hbn.xml");
        UserService userService = context.getBean("userService", UserService.class);
        Users user = new Users();
        user.setUsername("张三");
        user.setPassword("111");
        user.setPasswordSalt("222");
        userService.saveUser(user);
        assertEquals(userService.getUserNameById(1), "张三");
    }
}
