package com.bs.service.impl;

import com.bs.mapper.CoursesVideoMapper;
import com.bs.model.CoursesVideo;
import com.bs.service.courseVideoService;
import com.bs.utils.constData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * Created by kylin on 2018/3/4.
 */
@Service(value = "courseVideoService")
public class courseVideoServiceImpl implements courseVideoService {

    @Autowired
    private CoursesVideoMapper coursesVideoMapper;

    @Override
    public CoursesVideo selectByPrimaryKey(Integer id) {
       CoursesVideo coursesVideo = coursesVideoMapper.selectByPrimaryKey(id);
       coursesVideo.setVideo_url(constData.serverResourseUrl+coursesVideo.getVideo_url());
        return coursesVideo;
    }
}
