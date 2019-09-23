package com.template.lml.demo.controller;

import com.github.pagehelper.PageHelper;
import com.template.lml.demo.domain.Result;
import com.template.lml.demo.domain.YamlEntity;
import com.template.lml.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description
 * @Author lml
 * @Date2019/8/20 10:59
 * @Version V1.0
 **/
@RestController
public class UserController implements ApiController{
    @Autowired
    UserService userService;

    /**
     * 配置类
     */
    @Autowired
    YamlEntity yamlEntity;

    /**
     *
     * @param page
     * @param account
     * @param userId
     * @return
     */
    @GetMapping(value = "/Users")
    public Result getUsers(String page,String account,String userId){
        //pageHelper分页
        PageHelper.startPage(1,yamlEntity.getPageSize());
        return userService.findAll();
    }

    /**
     *
     * @param account
     * @return
     */
    @GetMapping(value = "/Users/account/{account}")
    public Result getUsersByAccount(@PathVariable String account){
        return userService.findByAccount(account);
    }

    /**
     *
     * @param userId
     * @return
     */
    @GetMapping(value = "/Users/{userId}")
    public Result getUsersByUserId(@PathVariable String userId){
        return userService.findByAccount(userId);
    }


}
