package com.news.gymnast.repositories;

import com.news.gymnast.models.Classes;
import com.news.gymnast.models.CompositeKeyMembership;
import com.news.gymnast.models.Membership;
import com.news.gymnast.models.MembershipClasses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipClassesRepository extends JpaRepository<MembershipClasses, Long> {

    MembershipClasses findById(CompositeKeyMembership key);
    void deleteById(CompositeKeyMembership key);
    void deleteByMembership(Membership membership);

    void deleteByClasses(Classes classes);
}
