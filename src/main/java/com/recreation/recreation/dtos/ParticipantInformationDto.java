/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.dtos;

/**
 * ParticipantInformationDto
 * @author Alex Karacaoglu
 */

public class ParticipantInformationDto {

    private String name;

    private String eagleId;

    private String email;

    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEagleId() {
        return eagleId;
    }

    public void setEagleId(String eagleId) {
        this.eagleId = eagleId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
