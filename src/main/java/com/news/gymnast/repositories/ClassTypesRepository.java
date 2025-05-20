package com.news.gymnast.repositories;

import com.news.gymnast.models.ClassTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTypesRepository extends JpaRepository<ClassTypes, Long> {
}
