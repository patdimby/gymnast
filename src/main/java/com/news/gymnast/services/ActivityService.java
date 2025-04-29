package com.news.gymnast.services;

import com.news.gymnast.dtos.ActivityDto;
import com.news.gymnast.models.Activity;
import com.news.gymnast.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public ActivityDto postActivity(ActivityDto dto) {
        if (dto == null) return null;
        Activity activity = new Activity();
        activity.setId(dto.getId());
        activity.setDate(dto.getDate());        
        activity.setSteps(dto.getSteps());
        activity.setDistance(dto.getDistance());
        return activityRepository.save(activity).toDto();
    }

    public List<ActivityDto> getActivities(){

    }

}
