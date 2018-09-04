package com.recreation.recreation.adapters;

import com.recreation.recreation.dtos.RegisterDto;
import com.recreation.recreation.entities.Participant;

public class ParticipantAdapter {

    public static Participant convert(RegisterDto registerDto) {
        Participant participant = new Participant();
        participant.setName(registerDto.getName());
        participant.setEmail(registerDto.getEmail());
        participant.setEagleId(registerDto.getEagleId());
        participant.setPhoneNumber(registerDto.getPhoneNumber());
        participant.setDeleted(Boolean.FALSE);
        return participant;
    }

    public static Participant updateParticipantInformation(RegisterDto registerDto, Long participantId) {
        Participant updatedParticipant = new Participant();
        updatedParticipant.setId(participantId);
        updatedParticipant.setName(registerDto.getName());
        updatedParticipant.setEmail(registerDto.getEmail());
        updatedParticipant.setEagleId(registerDto.getEagleId());
        updatedParticipant.setPhoneNumber(registerDto.getPhoneNumber());
        updatedParticipant.setDeleted(Boolean.FALSE);
        return updatedParticipant;

    }
}
