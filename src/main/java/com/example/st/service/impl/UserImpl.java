package com.example.st.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.st.entity.User;
import com.example.st.mapper.UserMapper;
import com.example.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    public UserMapper userMapper;


    @Override
    public User getUserList(Integer id) {
//        List<User> userList = userMapper.getUserList(id);
//        Map<String,Object> dataMap = new HashMap<>();
//        if(userList.size() != 0){
//            for (User user:userList) {
//                dataMap.put("id",user.getUserId());
//                dataMap.put("username",user.getUserName());
//                dataMap.put("password",user.getUserPassword());
//                dataMap.put("status",user.getUserStatus());
//            }
//        }
        return userMapper.getUserList(id);
    }
}
