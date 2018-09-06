/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.adapters.ParticipantsDtoAdapter;
import com.recreation.recreation.adapters.RegistrationAdapter;
import com.recreation.recreation.dtos.ParticipantsDto;
import com.recreation.recreation.entities.Participant;
import com.recreation.recreation.entities.Registration;
import com.recreation.recreation.repositories.ParticipantRepository;
import com.recreation.recreation.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * GetParticipantsService
 * @author Alex Karacaoglu
 */

@Service
public class GetParticipantsService {

    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    RegistrationRepository registrationRepository;

    public List<ParticipantsDto> getParticipants(Long sessionId) {
        List<String> eagleIds = getListOfRegisteredEagleIds(sessionId);
        List<Participant> participants = participantRepository.findByEagleIdInAndDeleted(eagleIds, Boolean.FALSE);
        return ParticipantsDtoAdapter.convert(participants);
    }

    private List<String> getListOfRegisteredEagleIds(Long sessionId) {
        List<Registration> registrations = registrationRepository.findBySessionIdAndDeleted(sessionId, Boolean.FALSE);
        return RegistrationAdapter.convert(registrations);
    }
}
