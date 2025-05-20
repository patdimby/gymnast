package com.news.gymnast.repositories;

import com.news.gymnast.models.Timeslots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeslotsRepository extends JpaRepository<Timeslots, Long> {
}
