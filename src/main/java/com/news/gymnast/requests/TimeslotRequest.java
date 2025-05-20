package com.news.gymnast.requests;

import lombok.Data;

@Data
public class TimeslotRequest {

    private Long id;

    private int startHour;

    private int endHour;

    private int startMinutes;

    private int endMinutes;

    private boolean open;

    private Long classes;

}
