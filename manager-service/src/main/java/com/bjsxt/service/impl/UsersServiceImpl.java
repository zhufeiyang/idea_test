package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhufy
 * @Date: 2019/3/18
 * @Description: com.bjsxt.service.impl
 * @version: 1.0
 * 按住接口 然后快捷键alt+enter
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;



    public void addUser(Users users) {

        usersMapper.insertUser(users);
    }

    /*@Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }*/
}
