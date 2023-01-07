package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-01-06-[下午 1:38]-周五
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }
}
