package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-01-06-[下午 5:07]-周五
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        System.out.println("修改了");
        return "index";
    }
}
