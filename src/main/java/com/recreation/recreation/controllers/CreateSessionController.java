/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.CreateSessionDto;
import com.recreation.recreation.services.CreateSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * CreateSessionController
 * @author Alex Karacaoglu
 */

@Controller
public class CreateSessionController {

    @Autowired
    CreateSessionService createSessionService;

    @RequestMapping(value = "/create-session", method = RequestMethod.POST)
    public ResponseEntity createSession(@RequestBody CreateSessionDto createSessionDto) {
        createSessionService.createSession(createSessionDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
