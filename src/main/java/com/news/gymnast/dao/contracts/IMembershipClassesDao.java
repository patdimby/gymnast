package com.news.gymnast.dao.contracts;

import com.news.gymnast.models.Membership;
import com.news.gymnast.requests.MembershipClassesResponse;

import java.util.List;

public interface IMembershipClassesDao {
    List<MembershipClassesResponse> returnAll(List<Membership> memberships);

    MembershipClassesResponse getById(int id);
}
