package com.bs.mapper;

import com.bs.model.FormId;

/**
 * Created by kylin on 2018/6/17.
 */
public interface commonMapper {

    int insertFormId(String formId) throws  Exception;

    FormId findFormId() throws Exception;
}
