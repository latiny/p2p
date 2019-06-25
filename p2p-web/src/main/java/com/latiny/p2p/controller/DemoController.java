package com.latiny.p2p.controller;

import com.latiny.p2p.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujinwei
 * @version 1.0
 * @description: Controller Demo
 * @date 2019/6/24 21:42
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        int a = 1;
        return demoService.test();
    }
}
