/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.adapters;

import com.recreation.recreation.entities.Registration;

import java.util.ArrayList;
import java.util.List;

/**
 * RegistrationAdapter
 * @author Alex Karacaoglu
 */

public class RegistrationAdapter {

    public static Registration convert(String eagleId, Long sessionId) {
        Registration registration = new Registration();
        registration.setEagleId(eagleId);
        registration.setSessionId(sessionId);
        registration.setDeleted(Boolean.FALSE);
        return registration;
    }

    public static List<String> convert(List<Registration> registrations) {
        List<String> ids = new ArrayList<>();
        for (Registration registration: registrations) {
            ids.add(registration.getEagleId());
        }
        return ids;
    }
}
