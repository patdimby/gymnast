package com.news.gymnast.requests;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ClassesRequest {

    private Long id;

    private String code;

    private String name;

    private BigDecimal value;

    private String description;

    private Long instructor;

    private Long location;

    private Long classTypes;

}
