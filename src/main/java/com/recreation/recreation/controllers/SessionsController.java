/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.SessionInformationDto;
import com.recreation.recreation.services.SessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * SessionsController
 * @author Alex Karacaoglu
 */

@Controller
public class SessionsController {

    @Autowired
    SessionsService sessionsService;

    @RequestMapping(value = "/get-sessions", method = RequestMethod.GET)
    public ResponseEntity<List<SessionInformationDto>> getSessions(@RequestParam String sessionType) {
        List<SessionInformationDto> sessions = sessionsService.getSessions(sessionType);
        return ResponseEntity.ok(sessions);
    }
}
