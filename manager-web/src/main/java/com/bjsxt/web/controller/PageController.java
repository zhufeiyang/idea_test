package com.bjsxt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: zhufy
 * @Date: 2019/3/18
 * @Description: com.bjsxt.web.controller
 * @version: 1.0
 *
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable  String page){
        return page;
    }
}
