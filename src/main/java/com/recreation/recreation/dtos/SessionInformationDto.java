/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.dtos;

/**
 * SessionInformationDto
 * @author Alex Karacaoglu
 */

public class SessionInformationDto {

    private String sessionType;

    private String teacher;

    private String spotsLeft;

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSpotsLeft() {
        return spotsLeft;
    }

    public void setSpotsLeft(String spotsLeft) {
        this.spotsLeft = spotsLeft;
    }
}
