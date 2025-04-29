package com.news.gymnast.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.util.Date;

import com.news.gymnast.dtos.ActivityDto;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Activities")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    @NotNull
    private Date date;

    @Column(name = "steps")
    @NotNull
    private int steps;

    @Column(name = "distance")
    @NotNull
    private double distance;

    @Column(name = "burned")
    @NotNull
    private int caloriesBurned;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the steps
     */
    public int getSteps() {
        return steps;
    }

    /**
     * @param steps the steps to set
     */
    public void setSteps(int steps) {
        this.steps = steps;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public ActivityDto toDto() {
    	ActivityDto dto = new ActivityDto();
    	dto.setId(id);
        dto.setDate(date);
        dto.setSteps(steps);
        dto.setDistance(distance);
    	return dto;
    }
}