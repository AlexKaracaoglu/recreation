/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.adapters.SessionTypeAdapter;
import com.recreation.recreation.dtos.SessionTypeDto;
import com.recreation.recreation.entities.SessionType;
import com.recreation.recreation.repositories.SessionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * SessionTypeService
 * @author Alex Karacaoglu
 */

@Service
public class SessionTypesService {

    @Autowired
    SessionTypeRepository sessionTypeRepository;

    public List<SessionTypeDto> getSessionTypes() {
        List<SessionTypeDto> sessionTypeDtos = new ArrayList<>();
        List<SessionType> sessionTypes = sessionTypeRepository.findByDeleted(Boolean.FALSE);
        for (SessionType sessionType: sessionTypes) {
            sessionTypeDtos.add(SessionTypeAdapter.convert(sessionType));
        }
        return sessionTypeDtos;
    }

}
