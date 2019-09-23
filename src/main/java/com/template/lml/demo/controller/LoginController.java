package com.template.lml.demo.controller;

import com.template.lml.demo.domain.Result;
import com.template.lml.demo.domain.User;
import com.template.lml.demo.service.UserService;
import com.template.lml.demo.utils.JwtUtil;
import com.template.lml.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.template.lml.demo.config.ResultEnum.*;

/**
 * @ClassName LoginController
 * @Description
 * @Author lml
 * @Date2019/9/20 20:02
 * @Version V1.0
 **/

@RestController
public class LoginController implements Login{

    @Autowired
    UserService userService;

    @RequestMapping("/loginCheck")
    public Result loginCheck(User user) throws JSONException {
        Result result = userService.findByAccount(user.getAccount().toString());
        if (((List)result.getData()).size()==0){
            return ResultUtil.error(ERROR_ACCESS_FAILED,"账号不存在");
        }else if(((User)((List)result.getData()).get(0)).getPassword()==user.getPassword()){
            return ResultUtil.error(ERROR_ACCESS_FAILED,"密码错误");
        }
        return ResultUtil.success(JwtUtil.generateToken(user.getAccount().toString()).toString());
    }
}
