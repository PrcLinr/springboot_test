package com.example.st.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.st.entity.User;

/**
 * @author Lin
 */
public interface UserService extends IService<User> {

    /**
     * 获取用户列表
     *
     * @return
     */
   User getUserList(Integer id);
}
