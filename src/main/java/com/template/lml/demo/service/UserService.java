package com.template.lml.demo.service;

import com.template.lml.demo.domain.Result;
import com.template.lml.demo.domain.User;

import java.util.List;

/**
 * @ClassName UserService
 * @Description
 * @Author lml
 * @Date2019/8/19 11:47
 * @Version V1.0
 **/
public interface UserService {
    /**
     *
     * @return
     */
    Result<List<User>> findAll();

    /**
     *
     * @param account
     * @return
     */
    Result<List<User>> findByAccount(String account);

    /**
     *
     * @param userId
     * @return
     */
    Result<List<User>> findById(String userId);


}
