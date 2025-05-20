package com.news.gymnast.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MembershipRequest {

    private Long id;

    private String name;

    private String code;

    private BigDecimal value;

    private boolean renew;

    private boolean active;

    private Long classId;

}
