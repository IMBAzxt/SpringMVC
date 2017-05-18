/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc.hbn;

import com.zhengxuetao.springmvc.Users;
import com.zhengxuetao.springmvc.hbn.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ThinkPad
 */
@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public String getUserNameById(int id) {
        return userDAO.getUserNameById(id);
    }

    @Override
    public void saveUser(Users user) {
        userDAO.saveUser(user);
    }

}
