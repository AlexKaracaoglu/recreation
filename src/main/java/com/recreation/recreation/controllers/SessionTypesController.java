/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.SessionTypeDto;
import com.recreation.recreation.services.SessionTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * SessionTypesController
 * @author Alex Karacaoglu
 */

@Controller
public class SessionTypesController {

    @Autowired
    SessionTypesService sessionTypesService;

    // Example url: http://localhost:8080/session-types
    @RequestMapping(value = "/session-types", method = RequestMethod.GET)
    public ResponseEntity<List<SessionTypeDto>> sessionTypes() {
        List<SessionTypeDto> sessionTypes = sessionTypesService.getSessionTypes();
        return ResponseEntity.ok(sessionTypes);
    }
}
