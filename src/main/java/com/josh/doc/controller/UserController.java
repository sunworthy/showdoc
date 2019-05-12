package com.josh.doc.controller;

import com.josh.doc.common.resp.Result;
import com.josh.doc.entity.User;
import com.josh.doc.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/user")
@ResponseBody
public class UserController extends BaseController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/info")
    public Result info(Integer uid){
        if(StringUtils.isEmpty(uid)){
            return Result.failed("uid can not be empty");
        }
        User user = userService.selectByPrimaryKey(uid);
        return Result.success(user);
    }

    @PostMapping
    public Result login(String username, String password){
        User user = userService.selectByNamePwd(username, password);
        if(Objects.isNull(user)){
            return Result.failed("invalid name or password");
        }else {
            return Result.success(user);
        }
    }
}
