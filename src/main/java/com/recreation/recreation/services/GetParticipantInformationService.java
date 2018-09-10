/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.adapters.ParticipantInformationDtoAdapter;
import com.recreation.recreation.dtos.ParticipantInformationDto;
import com.recreation.recreation.entities.Participant;
import com.recreation.recreation.exceptions.ParticipantInformationNotFoundException;
import com.recreation.recreation.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GetParticipantInformationService
 * @author Alex Karacaoglu
 */

@Service
public class GetParticipantInformationService {

    @Autowired
    ParticipantRepository participantRepository;

    public ParticipantInformationDto getParticipant(String eagleId) {
        Participant participant = participantRepository.findByEagleIdAndDeleted(eagleId, Boolean.FALSE);
        if (participant == null) {
            throw new ParticipantInformationNotFoundException();
        }
        return ParticipantInformationDtoAdapter.convert(participant);
    }

}
