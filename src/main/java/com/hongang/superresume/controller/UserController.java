package com.hongang.superresume.controller;

import com.hongang.superresume.common.Result;
import com.hongang.superresume.common.vo.LoginUserVo;
import com.hongang.superresume.service.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
@ApiSort(1)
@Api(value = "user", tags = "用户信息", description = "用户接口相关")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @ApiOperation(value = "用户新增接口",position = 1)
    @PostMapping(value = "/userAdd")
    public Result userAdd(@Valid @RequestBody LoginUserVo userVo) {
        return userService.userAdd(userVo);
    }

    @ApiOperation(value = "用户登录接口",position = 2)
    @PostMapping(value = "/userLogin")
    public Result userLogin(@Valid @RequestBody LoginUserVo userVo) {
        return userService.userLogin(userVo);
    }

}
