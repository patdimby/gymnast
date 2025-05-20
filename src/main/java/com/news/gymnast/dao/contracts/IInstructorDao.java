package com.news.gymnast.dao.contracts;

import com.news.gymnast.models.Instructor;

import java.util.List;

public interface IInstructorDao {

    List<Instructor> allInstructorsOrderByClassesCount();

    List<Instructor> allInstructorsWithClasses();

    void save(Instructor instructor);

}
