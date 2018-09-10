/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.services;

import com.recreation.recreation.adapters.ParticipantAdapter;
import com.recreation.recreation.dtos.ParticipantInformationDto;
import com.recreation.recreation.entities.Participant;
import com.recreation.recreation.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UpdateParticipantInformationService
 * @author Alex Karacaoglu
 */

@Service
public class UpdateParticipantInformationService {

    @Autowired
    ParticipantRepository participantRepository;

    public void updateParticipantInfo(ParticipantInformationDto participantInformationDto) {
        Participant participant = participantRepository.findByEagleIdAndDeleted(
                participantInformationDto.getEagleId(), Boolean.FALSE);
        participant = ParticipantAdapter.update(participant, participantInformationDto);
        participantRepository.save(participant);
    }

}
