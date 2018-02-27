package com.bs.exception;

import com.bs.enums.ResultEnum;

/**
 * Created by kylin on 2018/2/25.
 */
public class customException extends RuntimeException {

    private Integer code;

    public customException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
