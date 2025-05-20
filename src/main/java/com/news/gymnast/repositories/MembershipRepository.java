package com.news.gymnast.repositories;

import com.news.gymnast.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "membership", path="membership")
public interface MembershipRepository extends JpaRepository<Membership, Long> {
    List<Membership> findAllByOrderByValue();

    List<Membership> findAll();
    List<Membership> findByCode(String code);
    List<Membership> findAllByOrderByValueDesc();



}