/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.dtos;

/**
 * CreateSessionDto
 * @author Alex Karacaoglu
 */

public class CreateSessionDto {

    private String sessionName;

    private String teacher;

    private Integer totalSpots;

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getTotalSpots() {
        return totalSpots;
    }

    public void setTotalSpots(Integer totalSpots) {
        this.totalSpots = totalSpots;
    }
}
