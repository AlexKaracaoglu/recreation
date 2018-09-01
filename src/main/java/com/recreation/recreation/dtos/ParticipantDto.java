/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.dtos;

/**
 * Participant Entity
 * @author Alex Karacaoglu
 */

public class ParticipantDto {

    private String name;

    private String email;

    private String eagleId;

    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEagleId() {
        return eagleId;
    }

    public void setEagleId(String eagleId) {
        this.eagleId = eagleId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
