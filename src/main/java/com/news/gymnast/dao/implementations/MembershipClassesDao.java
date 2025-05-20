package com.news.gymnast.dao.implementations;

import com.news.gymnast.dao.contracts.IMembershipClassesDao;
import com.news.gymnast.models.Classes;
import com.news.gymnast.models.Membership;
import com.news.gymnast.models.MembershipClasses;
import com.news.gymnast.requests.MembershipClassesResponse;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MembershipClassesDao implements IMembershipClassesDao {

    private EntityManager entityManager;

    public MembershipClassesDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<MembershipClassesResponse> returnAll(List<Membership> memberships) {

        List<MembershipClassesResponse> list = new ArrayList<>();

        for (Membership membership : memberships) {
            MembershipClassesResponse res = this.getById(membership.getId());
            if (res == null) {
                continue;
            }
            list.add(res);
        }

        return list;

    }

    @Override
    public MembershipClassesResponse getById(int id) {

        TypedQuery<MembershipClasses> query = entityManager.createQuery(
                "SELECT mc FROM MembershipClasses mc " +
                        "JOIN FETCH mc.membership m " +
                        "JOIN FETCH mc.classes c " +
                        "WHERE mc.id.membershipId = :value",
                MembershipClasses.class
        );

        query.setParameter("value", id);

        List<MembershipClasses> list = query.getResultList();
        if (list.isEmpty()) {
            return null;
        }

        MembershipClassesResponse res = new MembershipClassesResponse();

        Membership firstVal = list.get(0).getMembership();
        res.setId(firstVal.getId());
        res.setName(firstVal.getName());
        res.setCode(firstVal.getCode());
        res.setImage(firstVal.getImage());
        res.setStartDate(firstVal.getStartDate());
        res.setExpireDate(firstVal.getExpireDate());
        res.setValue(firstVal.getValue());
        res.setRenew(firstVal.isRenew());
        res.setActive(firstVal.isActive());

       /* list.forEach((singleClass) -> {
            res.addClass(singleClass.getClasses());
        });*/

        return res;
    }


    @Transactional
    public List checkingData() {

        TypedQuery<Classes> classesQuery = entityManager.createQuery("SELECT c FROM Classes c WHERE c.id = 8 ", Classes.class);
        List<Classes> classes = classesQuery.getResultList();

        TypedQuery<Membership> membershipQuery = entityManager.createQuery("SELECT c FROM Membership c WHERE c.id = 1 ", Membership.class);
        List<Membership> memberships = membershipQuery.getResultList();

        if (!classes.isEmpty() && !memberships.isEmpty()) {

            MembershipClasses newClass = new MembershipClasses(memberships.get(0), classes.get(0));
            entityManager.persist(newClass);

        }

        return null;
    }


}
