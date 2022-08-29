package com.example.st.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.st.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Lin
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取用户列表
     * @return
     */
    @Select("select * from tb_user where user_id = #{id}")
    User getUserList(Integer id);

}
