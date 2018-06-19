package com.bs.mapper;

import com.bs.model.Artical;

import java.util.List;

public interface ArticalMapper {
    /**
     * 查询手记列表，查询出5条
     */
    List<Artical> findShoujiList() throws Exception;

    /**
     * 翻页到底部，增加数据
     * @param id 当前页面显示条目
     */
    List<Artical> addArticalListNum(Integer id) throws Exception;

    /**
     * 统计数据库中文章共有多少条
     */
    Integer articalCount() throws Exception;

    /**
     * 查看手记的详细内容
     * @param id 查看手记的编号
     */
    Artical getArticalDetail(Integer id) throws Exception;

    /***
     * 添加阅读人数
     * @param id
     * @return
     * @throws Exception
     */
    Integer addReadNum(Integer id) throws Exception;
}