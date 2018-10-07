package com.study.controller;

import com.study.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : ChinaLHR
 * @Date : Create in 16:36 2018/10/5
 * @Email : 13435500980@163.com
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserService userService;

    private static final String SUCCESS = "Success";

    @GetMapping("/async")
    public String asyncTest() {
        userService.runAsync();
        return SUCCESS;
    }

    @GetMapping("/cache")
    public String cacheTest() {
        userService.runCache("Demo");
        return SUCCESS;
    }

}
