/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhengxuetao.springmvc.hbn;

import com.zhengxuetao.springmvc.Users;

/**
 *
 * @author ThinkPad
 */
public interface UserService {

    public String getUserNameById(int id);

    public void saveUser(Users user);

}
