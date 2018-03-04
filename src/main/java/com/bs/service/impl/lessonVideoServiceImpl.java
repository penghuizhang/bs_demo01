package com.bs.service.impl;

import com.bs.mapper.pojo.course_video_mapper;
import com.bs.model.CoursesVideo;
import com.bs.model.pojo.Lesson_video_pojo;
import com.bs.service.lessonVideoService;
import com.bs.utils.constData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylin on 2018/3/2.
 */
@Service(value = "lessonVideoService")
public class lessonVideoServiceImpl implements lessonVideoService {

    @Autowired
    private Lesson_video_pojo lesson_video_pojo;

    @Autowired
    private course_video_mapper courseVideoMapper;

    @Autowired
    private CoursesVideo coursesVideo;


    /**
     * 通过id进行联合查询该课程章节和视频信息
     * @param id
     * @return  视频和章节的包装对象
     */
    @Override
    public List<Lesson_video_pojo> findCourseListById(Integer id) throws Exception {
        List<Lesson_video_pojo> lesson_video_pojos =  courseVideoMapper.findCourseListById(id);
        System.out.println(lesson_video_pojos);


        List<Lesson_video_pojo> coursesVideos = new ArrayList<>();
        List<CoursesVideo> coursesVideos1 = new ArrayList<>();
        Lesson_video_pojo lesson_video_pojo = new Lesson_video_pojo();
        for (Lesson_video_pojo pojo:lesson_video_pojos){
            //将路径进行拼接
            for (CoursesVideo video:pojo.getCoursesVideo()){
                String xx = constData.serverResourseUrl+video.getVideo_url();
                video.setVideo_url(xx);
                //将获得的路径进行拼接放到创建的list集合中
                coursesVideos1.add(video);
                System.out.println(video.getVideo_url());
                lesson_video_pojo.setCoursesVideo(coursesVideos1);
            }
            coursesVideos.add(lesson_video_pojo);
            System.out.println(coursesVideos.toString());
        }

        return lesson_video_pojos;
    }
}
