package com.template.lml.demo.repository;

import com.template.lml.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserRepositroy
 * @Description
 * @Author lml
 * @Date2019/8/19 11:06
 * @Version V1.0
 **/

@Repository
public interface UserRepository {
    /**
     * 获取所有的User
     * @return
     */
    List<User> findAll();


    /**
     * 通过account来获取User
     * @param account
     * @return
     */
    List<User> findByAccount(Long account);

    /**
     * 通过id来获取User
     * @param userId
     * @return
     */
    List<User> findById(Long userId);
}
