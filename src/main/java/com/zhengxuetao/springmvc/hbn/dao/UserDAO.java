/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc.hbn.dao;

import com.zhengxuetao.springmvc.Users;

/**
 *
 * @author ThinkPad
 */
public interface UserDAO {

    public String getUserNameById(int id);

    public void updateUser();

    public void deleteUser();

    public void saveUser(Users user);

}
