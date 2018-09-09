/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.adapters;

import com.recreation.recreation.dtos.SessionTypeDto;
import com.recreation.recreation.entities.SessionType;

/**
 * SessionTypeAdapter
 * @author Alex Karacaoglu
 */

public class SessionTypeAdapter {

    public static SessionTypeDto convert(SessionType sessionType) {
        SessionTypeDto sessionTypeDto = new SessionTypeDto();
        sessionTypeDto.setName(sessionType.getName());
        return sessionTypeDto;
    }

}
