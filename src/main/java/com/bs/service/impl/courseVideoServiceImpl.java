package com.bs.service.impl;

import com.bs.mapper.CoursesVideoMapper;
import com.bs.model.CoursesVideo;
import com.bs.service.courseVideoService;
import com.bs.utils.constData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kylin on 2018/3/4.
 */
@Service(value = "courseVideoService")
public class courseVideoServiceImpl implements courseVideoService {

    @Autowired
    private CoursesVideoMapper coursesVideoMapper;

    @Override
    public CoursesVideo FindUrlByLessonInAndId(Integer lesson_id, Integer id) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("lesson_id",lesson_id);
        map.put("id",id);
        CoursesVideo coursesVideo = coursesVideoMapper.FindUrlByLessonInAndId(map);
        coursesVideo.setVideo_url(constData.serverResourseUrl+coursesVideo.getVideo_url());
        return coursesVideo;
    }
}
