/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.adapters;

import com.recreation.recreation.dtos.ParticipantInformationDto;
import com.recreation.recreation.entities.Participant;

/**
 * ParticipantInformationDtoAdapter
 * @author Alex Karacaoglu
 */

public class ParticipantInformationDtoAdapter {

    public static ParticipantInformationDto convert(Participant participant) {
        ParticipantInformationDto participantInformationDto = new ParticipantInformationDto();
        participantInformationDto.setEagleId(participant.getEagleId());
        participantInformationDto.setPhoneNumber(participant.getPhoneNumber());
        participantInformationDto.setEmail(participant.getEmail());
        participantInformationDto.setName(participant.getName());
        return participantInformationDto;
    }

}
