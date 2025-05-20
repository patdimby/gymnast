package com.news.gymnast.services;

import com.news.gymnast.dao.implementations.MembershipClassesDao;
import com.news.gymnast.models.Membership;
import com.news.gymnast.repositories.MembershipRepository;
import com.news.gymnast.requests.MembershipClassesResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipClassesService {

    private MembershipClassesDao dao;
    private MembershipRepository membershipRepository;

    public MembershipClassesService(
            MembershipClassesDao dao,
            MembershipRepository membershipRepository
    ) {
        this.dao = dao;
        this.membershipRepository = membershipRepository;
    }

    public List<MembershipClassesResponse> returnAllMembershipClasses(){

        List<Membership> memberships = membershipRepository.findAll();

        return dao.returnAll(memberships);
    }

    public void checkingData(){
        dao.checkingData();
    }

    public MembershipClassesResponse getMembershipWithClassesById(int id){
        return dao.getById(id);
    }



}
