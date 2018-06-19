package com.bs.service.impl;
import com.bs.mapper.commonMapper;

import com.bs.model.FormId;
import com.bs.service.commonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kylin on 2018/6/17.
 */
@Service(value = "commonService")
public class commonServiceImpl implements commonService {
    @Autowired
    private commonMapper commonMapper;

    @Override
    public int insertFormId(String formId) throws Exception {
        return commonMapper.insertFormId(formId);
    }

    @Override
    public FormId findFormId() throws Exception {
        return commonMapper.findFormId();
    }
}
