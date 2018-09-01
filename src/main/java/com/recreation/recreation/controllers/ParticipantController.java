/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.ParticipantDto;
import com.recreation.recreation.entities.Participant;
import com.recreation.recreation.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RegisterController
 * @author Alex Karacaoglu
 */

@Controller
public class ParticipantController {

    @Autowired
    ParticipantRepository participantRepository;

    // Example url: http://localhost:8080/participant
    // Example body:
    // {
    //	"name": "test name",
    //	"email": "test email",
    //	"phoneNumber": "test phone",
    //	"eagleId": "test eagle id"
    // }

   @RequestMapping(value = "/participant", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody ParticipantDto participantDto) {
        Participant p = new Participant();
        p.setPhoneNumber(participantDto.getPhoneNumber());
        p.setEagleId(participantDto.getEagleId());
        p.setEmail(participantDto.getEmail());
        p.setName(participantDto.getName());
        participantRepository.save(p);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    // update session, make participant if not exists, add entry into registration
}
