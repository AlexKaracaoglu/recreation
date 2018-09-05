/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.dtos.CreateSessionDto;
import com.recreation.recreation.entities.Session;
import com.recreation.recreation.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CreateSessionService
 * @author Alex Karacaoglu
 */

@Service
public class CreateSessionService {

    @Autowired
    SessionRepository sessionRepository;

    public void createSession(CreateSessionDto createSessionDto) {
        Session session = new Session();
        session.setSpotsLeft(createSessionDto.getTotalSpots());
        session.setTotalSpots(createSessionDto.getTotalSpots());
        session.setTeacher(createSessionDto.getTeacher());
        session.setName(createSessionDto.getSessionName());
        session.setDeleted(Boolean.FALSE);
        sessionRepository.save(session);
    }

}
