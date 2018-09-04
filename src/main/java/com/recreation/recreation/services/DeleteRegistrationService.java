/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.dtos.DeleteRegistrationDto;
import com.recreation.recreation.entities.Registration;
import com.recreation.recreation.entities.Session;
import com.recreation.recreation.exceptions.RegistrationNotFoundException;
import com.recreation.recreation.exceptions.SessionNotFoundException;
import com.recreation.recreation.repositories.RegistrationRepository;
import com.recreation.recreation.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * DeleteRegistrationService
 * @author Alex Karacaoglu
 */

@Service
public class DeleteRegistrationService {

    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    RegistrationRepository registrationRepository;

    public void deleteRegistration(DeleteRegistrationDto deleteRegistrationDto) {
        deleteRegistrationInformation(deleteRegistrationDto);
        updateSessionSpotsLeft(deleteRegistrationDto.getSessionId());
    }

    private void updateSessionSpotsLeft(Long sessionId) {
        Optional<Session> session = sessionRepository.findById(sessionId);
        if (session.isPresent()) {
            Session existentSession = session.get();
            updateSpotsLeft(existentSession);
        }
        else {
            throw new SessionNotFoundException();
        }
    }

    private void updateSpotsLeft(Session session) {
        session.setSpotsLeft(session.getSpotsLeft() + 1);
        sessionRepository.save(session);
    }

    private void deleteRegistrationInformation(DeleteRegistrationDto deleteRegistrationDto) {
        Registration registration = registrationRepository.findByEagleIdAndSessionId(deleteRegistrationDto.getEagleId(), deleteRegistrationDto.getSessionId());
        if (registration == null) {
            throw new RegistrationNotFoundException();
        }
        else {
            registration.setDeleted(Boolean.TRUE);
            registrationRepository.save(registration);
        }
    }

}
