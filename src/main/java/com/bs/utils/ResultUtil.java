package com.bs.utils;

import com.bs.model.Result;

/**
 * Created by kylin on 2018/2/25.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
