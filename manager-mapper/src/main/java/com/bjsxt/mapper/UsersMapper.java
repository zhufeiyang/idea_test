package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: zhufy
 * @Date: 2019/3/18
 * @Description: com.bjsxt.mapper
 * @version: 1.0
 */
public interface UsersMapper {
    //根据UsersMapper的id去添加方法
    void insertUser(Users users);
    List<Users> selectUserAll();
}
