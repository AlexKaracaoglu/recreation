/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.CancelSessionDto;
import com.recreation.recreation.services.CancelSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * CancelSessionController
 * @author Alex Karacaoglu
 */

@Controller
public class CancelSessionController {

    // Request url: http://localhost:8080/cancel-session
    // Request Body example:
    //    {
    //      "sessionId": 5,
    //    }

    @Autowired
    CancelSessionService cancelSessionService;

    @RequestMapping(value = "/cancel-session", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody CancelSessionDto cancelSessionDto) {
        this.cancelSessionService.cancelSession(cancelSessionDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
