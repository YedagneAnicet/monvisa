package com.eburtis.monvisa.Controller;

import com.eburtis.monvisa.Application.UserVo;
import com.eburtis.monvisa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("create")
    public UserVo create(@RequestBody UserVo userVo){
        return userService.create(userVo);
    }
}
