/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.dtos.SessionIdentifierDto;
import com.recreation.recreation.entities.Session;
import com.recreation.recreation.exceptions.SessionNotFoundException;
import com.recreation.recreation.repositories.RegistrationRepository;
import com.recreation.recreation.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * CancelSessionService
 * @author Alex Karacaoglu
 */

@Service
public class CancelSessionService {

    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    RegistrationRepository registrationRepository;

    public void cancelSession(SessionIdentifierDto sessionIdentifierDto) {
        deleteSession(sessionIdentifierDto.getSessionId());
        deleteRegistrations(sessionIdentifierDto.getSessionId());
    }

    private void deleteRegistrations(Long sessionId) {
        registrationRepository.cancelSession(Boolean.TRUE, sessionId);
    }

    private void deleteSession(Long sessionId) {
        Optional<Session> session = sessionRepository.findById(sessionId);
        if (session.isPresent()) {
            Session sessionToDelete = session.get();
            sessionToDelete.setDeleted(Boolean.TRUE);
            sessionRepository.save(sessionToDelete);
        }
        else {
            throw new SessionNotFoundException();
        }
    }
}
