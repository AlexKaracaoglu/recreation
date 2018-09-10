/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.adapters.SessionInformationDtoAdapter;
import com.recreation.recreation.dtos.SessionInformationDto;
import com.recreation.recreation.entities.Session;
import com.recreation.recreation.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * SessionsService
 * @author Alex Karacaoglu
 */

@Service
public class SessionsService {

    @Autowired
    SessionRepository sessionRepository;

    public List<SessionInformationDto> getSessions(String sessionType) {
        List<Session> sessions = sessionRepository.findByNameAndDeleted(sessionType, Boolean.FALSE);
        return SessionInformationDtoAdapter.convert(sessions);
    }

}
