package com.news.gymnast.requests;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BookingRequest {

    private Long id;

    private BigDecimal value;

    private Date dateCreated;

    private boolean active;

    private boolean paid;

    private Long classes;

    private String reference;
}
