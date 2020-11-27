package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @Auther: zhufy
 * @Date: 2019/3/18
 * @Description: com.bjsxt.test
 * @version: 1.0
 * IDEA是严格区分大小写的
 * mybatis与spring的整合是在dao中进行配置的
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(30);
        users.setUsername("zhufy");
        this.usersMapper.insertUser(users);
    }

}
