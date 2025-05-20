package com.news.gymnast.services;

import com.news.gymnast.dao.implementations.InstructorDao;
import com.news.gymnast.models.Instructor;
import com.news.gymnast.repositories.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    private InstructorRepository instructorRepository;
    private InstructorDao dao;


    public InstructorService(InstructorRepository instructorRepository, InstructorDao dao) {
        this.instructorRepository = instructorRepository;
        this.dao = dao;
    }

    public List<Instructor> instructorsWithClassesCountSort(){
        return dao.allInstructorsOrderByClassesCount();
    }

    public List<Instructor> instructorsWithClasses(){
        return dao.allInstructorsWithClasses();
    }

}
