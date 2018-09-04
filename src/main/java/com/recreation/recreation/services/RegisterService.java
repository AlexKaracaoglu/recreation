package com.recreation.recreation.services;

import com.recreation.recreation.adapters.ParticipantAdapter;
import com.recreation.recreation.adapters.RegistrationAdapter;
import com.recreation.recreation.dtos.RegisterDto;
import com.recreation.recreation.entities.Participant;
import com.recreation.recreation.entities.Registration;
import com.recreation.recreation.entities.Session;
import com.recreation.recreation.exceptions.SessionNotFoundException;
import com.recreation.recreation.repositories.ParticipantRepository;
import com.recreation.recreation.repositories.RegistrationRepository;
import com.recreation.recreation.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterService {

    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    RegistrationRepository registrationRepository;

    @Autowired
    SessionRepository sessionRepository;

    public void register(RegisterDto registerDto) {
        updateOrCreateParticipant(registerDto);
        createRegistration(registerDto.getEagleId(), registerDto.getSessionId());
        updateSession(registerDto.getSessionId());
    }

    private void updateSession(Long sessionId) {
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
        session.setSpotsLeft(session.getSpotsLeft() - 1);
        sessionRepository.save(session);
    }

    private void createRegistration(String eagleId, Long sessionId) {
        Registration registration = RegistrationAdapter.convert(eagleId, sessionId);
        registrationRepository.save(registration);
    }

    private void updateOrCreateParticipant(RegisterDto registerDto) {
        Participant participant = participantRepository.findByEagleId(registerDto.getEagleId());
        if (participant == null) {
            Participant newParticipant = ParticipantAdapter.convert(registerDto);
            participantRepository.save(newParticipant);
        }
        else {
            participant = ParticipantAdapter.updateParticipantInformation(registerDto, participant.getId());
            participantRepository.save(participant);
        }

    }
}
