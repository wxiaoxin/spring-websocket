package com.xx.spring.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/11.
 *
 *
 * 首页控制器
 *
 *
 */


@Controller
public class IndexController {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }


}
