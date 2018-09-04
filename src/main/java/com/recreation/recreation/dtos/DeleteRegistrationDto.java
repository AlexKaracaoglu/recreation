/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.dtos;

/**
 * DeleteRegistrationDto
 * @author Alex Karacaoglu
 */

public class DeleteRegistrationDto {

    private Long sessionId;

    private String eagleId;

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getEagleId() {
        return eagleId;
    }

    public void setEagleId(String eagleId) {
        this.eagleId = eagleId;
    }
}
