package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

   /**
       *功能描述:所有的界面都放置在了WEB-INF下的jsp目录下，说明所有的jsp都要依赖controller的跳转
       * @author zhufy
       * @date 2020/11/27
       * @param
       * @return
       */

@Controller //控制器注解
@RequestMapping("/user")  //请求前缀
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok"; //返回到ok标识的页面
    }

    /**
     * doGet
     */
    @RequestMapping(value = "/doGet/{userid}",method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
        System.out.println("doGet.........."+userid);
        return "ok";
    }
    /**
     * doPost
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doGet(Users users){
        System.out.println("doPost..........");
        System.out.println(users);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doPost.........."+userid);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut..........");
        return "ok";
    }

}
