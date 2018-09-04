/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.entities.Participant;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ParticipantController
 * @author Alex Karacaoglu
 */

@Controller
public class ParticipantController {

    // Example url: http://localhost:8080/get-participants?sessionId=2
    @RequestMapping(value = "/get-participants", method = RequestMethod.GET)
    public ResponseEntity<Participant> register(@RequestParam Long sessionId) {
        Participant participant = new Participant();
        return ResponseEntity.ok(participant);
    }
}
