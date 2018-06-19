package com.bs.service;

import com.bs.model.FormId;

/**
 * Created by kylin on 2018/6/17.
 */
public interface commonService {

    /**
     * formid
     */

    int insertFormId(String formd) throws  Exception;

    FormId findFormId() throws Exception;

}
