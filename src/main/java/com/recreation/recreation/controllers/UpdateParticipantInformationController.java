/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.ParticipantInformationDto;
import com.recreation.recreation.services.UpdateParticipantInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * UpdateParticipantInformationController
 * @author Alex Karacaoglu
 */

@Controller
public class UpdateParticipantInformationController {

    @Autowired
    UpdateParticipantInformationService participantInformationService;

    // Example url: http://localhost:8080/update-participant-info
    @RequestMapping(value = "/update-participant-info", method = RequestMethod.POST)
    public ResponseEntity updateParticipantInfo(@RequestBody ParticipantInformationDto participantInformationDto) {
        participantInformationService.updateParticipantInfo(participantInformationDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
