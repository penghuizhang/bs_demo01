package com.bs.service;

import com.bs.model.Artical;

import java.util.List;

/**
 * Created by kylin on 2018/5/9.
 */
public interface articalService {

    List<Artical> findShoujiList() throws Exception;

    List<Artical> addArticalListNum(Integer id) throws Exception;

    Integer articalCount() throws Exception;

    Artical getArticalDetail(Integer id) throws Exception;

    Integer addReadNum(Integer id) throws Exception;
}
