/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.ParticipantsDto;
import com.recreation.recreation.services.GetParticipantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

/**
 * GetParticipantsController
 * @author Alex Karacaoglu
 */

@Controller
public class GetParticipantsController {

    @Autowired
    GetParticipantsService getParticipantsService;

    // Example url: http://localhost:8080/get-participants?sessionId=3
    @RequestMapping(value = "/get-participants", method = RequestMethod.GET)
    public ResponseEntity<List<ParticipantsDto>> register(@RequestParam Long sessionId) {
        List<ParticipantsDto> participants = getParticipantsService.getParticipants(sessionId);
        return ResponseEntity.ok(participants);
    }
}
