package com.bjsxt.pojo;

/**
 * @Auther: zhufy
 * @Date: 2019/3/18
 * @Description: ocm.bjsxt.pojo
 * @version: 1.0
 */
public class Users {

    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}
