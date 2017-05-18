/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc.hbn.dao;

import com.zhengxuetao.springmvc.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ThinkPad
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 获取和当前线程绑定的session
     *
     * @return
     */
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void updateUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUserNameById(int id) {
        String hql = "SELECT a.username FROM Users a WHERE a.id = ?";
        Query query = getSession().createQuery(hql).setInteger(0, id);
        return String.valueOf(query.uniqueResult());
    }

    @Override
    public void saveUser(Users user) {
        getSession().save(user);
    }

}
