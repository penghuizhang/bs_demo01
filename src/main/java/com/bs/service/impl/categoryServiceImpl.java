package com.bs.service.impl;

import com.bs.mapper.categoryCourseMapper;

import com.bs.model.Courses;
import com.bs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bs.utils.constData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylin on 2018/2/26.
 */
@Service(value = "categoryService")
public class categoryServiceImpl implements CategoryService {

    @Autowired
    private categoryCourseMapper categoryCoursecategoryMapper;

    @Override
    public String findCategoryNameById(int id) throws Exception {
        return categoryCoursecategoryMapper.findCategoryNameById(id);
    }

    @Override
    public List<Courses> findCourseListById(int id) throws Exception {

        List<Courses> categoryCourses = categoryCoursecategoryMapper.findCourseListById(id);
        List<Courses> categoryCourseslist = new ArrayList<>();
        for(Courses category:categoryCourses){
//            http://kylin5221.free.ngrok.cc
             category.setImage( constData.serverResourseUrl+category.getImage());
            categoryCourseslist.add(category);
            System.out.println(categoryCourseslist);
        }

        return categoryCourseslist;
    }

    @Override
    public List findCourseListName() throws Exception {
        return categoryCoursecategoryMapper.findCourseListName();
    }
}
