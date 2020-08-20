package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {
    //根据ID获取用户
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    /*
    *   telphone:用户注册手机
    *   encriptPassword:用户加密后的密码
    * */
    UserModel validateLogin(String telphone,String encriptPassword) throws BusinessException;
}
