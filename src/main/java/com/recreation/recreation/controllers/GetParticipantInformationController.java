/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.ParticipantInformationDto;
import com.recreation.recreation.services.GetParticipantInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * GetParticipantController
 * @author Alex Karacaoglu
 */

@Controller
public class GetParticipantInformationController {

    @Autowired
    GetParticipantInformationService participantInformationService;

    // Example url: http://localhost:8080/participant-info?eagleId=3
    @RequestMapping(value = "/participant-info", method = RequestMethod.GET)
    public ResponseEntity<ParticipantInformationDto> getParticipantInfo(@RequestParam String eagleId) {
        ParticipantInformationDto participant = participantInformationService.getParticipant(eagleId);
        return ResponseEntity.ok(participant);
    }
}
