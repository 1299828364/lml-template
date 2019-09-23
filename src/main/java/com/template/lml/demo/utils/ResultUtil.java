package com.template.lml.demo.utils;


import com.template.lml.demo.config.ResultEnum;
import com.template.lml.demo.domain.Result;

/**
 * @ClassName ResultUtil
 * @Description
 * @Author lml
 * @Date2019/8/19 10:24
 * @Version V1.0
 **/
public class ResultUtil {
    public static Result success(Object object){
        System.out.println(object);
        Result result=new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result success(Object object,String msg){
        Result result=new Result();
        result.setCode(200);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result error(Integer code,String msg,Object object){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result error(ResultEnum resultEnum, Object object){
        return error(resultEnum.getCode(),resultEnum.getMsg(),object);
    }
}
