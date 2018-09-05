/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.enums;

/**
 * SessionType Enum
 * @author Alex Karacaoglu
 */

public enum SessionType {
    // There will be more to be added later on
    SPIN ("Spin"),
    ZUMBA ("Zumba"),
    BOOTCAMP ("Bootcamp");

    private final String sessionName;

    SessionType(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionName() {
        return sessionName;
    }
}
