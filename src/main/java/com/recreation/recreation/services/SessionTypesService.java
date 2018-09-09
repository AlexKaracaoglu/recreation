/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.dtos.SessionTypeDto;
import com.recreation.recreation.enums.SessionType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SessionTypeService
 * @author Alex Karacaoglu
 */

@Service
public class SessionTypesService {

    public List<SessionTypeDto> getSessionTypes() {
        List<SessionType> sessionTypes = Arrays.asList(SessionType.values());
        return getSessionNames(sessionTypes);
    }

    private List<SessionTypeDto> getSessionNames(List<SessionType> sessionTypes) {
        List<SessionTypeDto> sessionTypeDtos = new ArrayList<>();
        for (SessionType sessionType: sessionTypes) {
            String sessionName = sessionType.getSessionName();
            sessionTypeDtos.add(createNewSessionTypeDto(sessionName));
        }
        return sessionTypeDtos;
    }

    private SessionTypeDto createNewSessionTypeDto(String sessionName) {
        SessionTypeDto sessionTypeDto = new SessionTypeDto();
        sessionTypeDto.setName(sessionName);
        return sessionTypeDto;
    }

}
