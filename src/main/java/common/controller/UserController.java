package common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umhyein on 2017. 10. 12..
 */
@RestController
public class UserController {

    @GetMapping("test")
    public String test(){
        return "push test";
    }

}
