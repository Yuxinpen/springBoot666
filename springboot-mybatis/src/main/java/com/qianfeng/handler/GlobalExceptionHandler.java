package com.qianfeng.handler;

import com.qianfeng.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handlerException(Exception exception){
        exception.printStackTrace();
        //TODD 把异常信息记录到日志中
        return new ResultBean("404","您的操作有误，请稍后再试");
    }
}
