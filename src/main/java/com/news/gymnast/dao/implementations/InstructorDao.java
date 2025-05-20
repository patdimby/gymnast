package com.news.gymnast.dao.implementations;

import com.news.gymnast.dao.contracts.IInstructorDao;
import com.news.gymnast.models.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public class InstructorDao implements IInstructorDao {

    private EntityManager entityManager;

    @Autowired
    public InstructorDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        this.entityManager.persist(instructor);
    }

    @Override
    public List<Instructor> allInstructorsOrderByClassesCount() {

        TypedQuery<Instructor> query = entityManager.createQuery("SELECT i FROM Classes c JOIN c.instructor i GROUP BY i", Instructor.class);

        List<Instructor> list = query.getResultList();

        Comparator<Instructor> classesSizeComparator = (a, b) -> b.getClasses().size() - a.getClasses().size();

        Collections.sort(list, classesSizeComparator);

        return list;
    }

    @Override
    public List<Instructor> allInstructorsWithClasses() {

        TypedQuery<Instructor> query = entityManager.createQuery("SELECT i FROM Classes c JOIN c.instructor i GROUP BY i", Instructor.class);

        List<Instructor> list = query.getResultList();

        return list;
    }


}
