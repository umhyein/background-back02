package com.background.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umhyein on 2017. 10. 30..
 */
@RestController
public class AuthController {

    @GetMapping("api/test")
    public Object test(){
        return "connect";
    }
}
