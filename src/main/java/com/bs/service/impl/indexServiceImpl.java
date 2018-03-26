package com.bs.service.impl;

import com.bs.mapper.CoursesMapper;
import com.bs.model.Courses;
import com.bs.service.indexService;
import com.bs.utils.constData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylin on 2018/3/26.
 */

@Service(value = "indexService")
public class indexServiceImpl implements indexService {

    @Autowired
    private CoursesMapper coursesMapper;

    @Override
    public List<Courses> FindCourseImageToLunbo() throws Exception {
        List<Courses> list = new ArrayList<Courses>();
        List<Courses> coursesList = coursesMapper.FindCourseImageToLunbo();
        System.out.println("111111111111111111111"+coursesList.toString());
        for(Courses course:coursesList){

            String xx = constData.serverResourseUrl+course.getImage();
            course.setImage(xx);
            list.add(course);
        }

        return list;
    }

    @Override
    public List<Courses> FindCourseByOrderTime() throws Exception {

        List<Courses> list = new ArrayList<Courses>();
        List<Courses> coursesList = coursesMapper.FindCourseByOrderTime();
        for(Courses course:coursesList){
            String xx = constData.serverResourseUrl+course.getImage();
            course.setImage(xx);
            String degree = course.getDegree();
            if (degree.equals("ci")){
                course.setDegree("初级");
            }else if (degree.equals("zj")){
                course.setDegree("中级");
            }else{
                course.setDegree("高级");
            }
            String details = course.getDetails();
            if (details.length() > 25 ){
                course.setDetails(details.substring(0,25));
            }
            list.add(course);
        }
        return list;
    }

    @Override
    public List<Courses> FindCourseByHot() throws Exception {
        List<Courses> list = new ArrayList<Courses>();
        List<Courses> coursesList = coursesMapper.FindCourseByHot();
        System.out.println("111111111111111111111"+coursesList.toString());
        for(Courses course:coursesList){
            String xx = constData.serverResourseUrl+course.getImage();
            course.setImage(xx);
            list.add(course);
        }

        return list;
    }


}
