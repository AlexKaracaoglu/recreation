/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.adapters;

import com.recreation.recreation.dtos.ParticipantsDto;
import com.recreation.recreation.entities.Participant;

import java.util.ArrayList;
import java.util.List;

/**
 * ParticipantsDtoAdapter
 * @author Alex Karacaoglu
 */

public class ParticipantsDtoAdapter {

    public static List<ParticipantsDto> convert(List<Participant> participants) {
        List<ParticipantsDto> participantsDtos = new ArrayList<>();
        for (Participant participant: participants) {
            ParticipantsDto participantsDto = new ParticipantsDto();
            participantsDto.setEagleId(participant.getEagleId());
            participantsDto.setName(participant.getName());
            participantsDtos.add(participantsDto);
        }
        return participantsDtos;
    }


}
