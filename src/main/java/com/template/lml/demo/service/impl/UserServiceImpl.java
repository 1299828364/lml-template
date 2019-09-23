package com.template.lml.demo.service.impl;

import com.template.lml.demo.domain.Result;
import com.template.lml.demo.domain.User;
import com.template.lml.demo.utils.ResultUtil;
import com.template.lml.demo.repository.UserRepository;
import com.template.lml.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author lml
 * @Date2019/8/19 11:47
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepositroy;

    @Override
    public Result<List<User>> findAll() {
        return ResultUtil.success(userRepositroy.findAll());
    }

    @Override
    public Result<List<User>> findByAccount(String account) {
        return ResultUtil.success(userRepositroy.findByAccount(Long.valueOf(account)));
    }

    @Override
    public Result<List<User>> findById(String userId) {
        return null;
    }
}
