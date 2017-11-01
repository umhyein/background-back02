package com.background.common.controller;

import com.background.common.service.UserService;
import com.background.domain.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by umhyein on 2017. 10. 31..
 */

@RestController
public class CommonController {

    @Inject
    private UserService userService;

    @GetMapping("api/user")
    public Object all(){
        return userService.allUser();
    }
}
