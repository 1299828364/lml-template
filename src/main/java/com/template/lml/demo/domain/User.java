package com.template.lml.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description
 * @Author lml
 * @Date2019/8/19 10:24
 * @Version V1.0
 **/
@Data
public class User extends Domain {
    private String userId;
    private Long account;
    private String password;
    private String userName;
    private int state;
    private Date createDate;

}
