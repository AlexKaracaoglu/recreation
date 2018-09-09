/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.SessionTypeDto;
import com.recreation.recreation.entities.SessionType;
import com.recreation.recreation.repositories.SessionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * CreateSessionTypeController
 * @author Alex Karacaoglu
 */

@Controller
public class CreateSessionTypeController {

    @Autowired
    SessionTypeRepository sessionTypeRepository;

    @RequestMapping(value = "/create-session-type", method = RequestMethod.POST)
    public ResponseEntity createSessionType(@RequestBody SessionTypeDto sessionTypeDto) {
        SessionType sessionType = new SessionType();
        sessionType.setName(sessionTypeDto.getName());
        sessionType.setDeleted(Boolean.FALSE);
        sessionTypeRepository.save(sessionType);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
