package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-01-06-[下午 5:40]-周五
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

//    @RequestMapping("/testRequestMapping")
    @RequestMapping(
            value = {"/testRequestMapping", "/test"}
    )
    public String success() {
        return "success";
    }


}
