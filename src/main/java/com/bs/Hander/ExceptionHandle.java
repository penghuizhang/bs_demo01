package com.bs.Hander;

import com.bs.exception.customException;
import com.bs.model.Result;
import com.bs.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;



/**
 * Created by kylin on 2018/2/25.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    public Result handle(Exception e){
        if (e instanceof customException){
            customException ex = (customException) e;
            return ResultUtil.error(ex.getCode(), ex.getMessage());
        }else{
            logger.error("【系统异常】{}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }


}
