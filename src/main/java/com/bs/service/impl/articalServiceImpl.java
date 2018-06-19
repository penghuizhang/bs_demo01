package com.bs.service.impl;

import com.bs.mapper.ArticalMapper;
import com.bs.model.Artical;
import com.bs.service.articalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kylin on 2018/5/9.
 */
@Service(value = "articalService")
public class articalServiceImpl implements articalService {
    @Autowired
    private ArticalMapper articalMapper;

    @Override
    public List<Artical> findShoujiList() throws Exception {
        return articalMapper.findShoujiList();
    }

    @Override
    public List<Artical> addArticalListNum(Integer id) throws Exception {
        return articalMapper.addArticalListNum(id);
    }

    @Override
    public Integer articalCount() throws Exception {
        return articalMapper.articalCount();
    }

    @Override
    public Artical getArticalDetail(Integer id) throws Exception {
        return articalMapper.getArticalDetail(id);
    }

    @Override
    public Integer addReadNum(Integer id) throws Exception {
        return articalMapper.addReadNum(id);
    }
}
