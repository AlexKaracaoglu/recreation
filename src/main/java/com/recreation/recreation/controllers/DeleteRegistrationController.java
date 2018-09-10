/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.DeleteRegistrationDto;
import com.recreation.recreation.services.DeleteRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * DeleteRegistrationController
 * @author Alex Karacaoglu
 */

@Controller
public class DeleteRegistrationController {

    // Request url: http://localhost:8080/delete-registration
    // Request Body example:
    //    {
    //      "sessionId": 5,
    //      "eagleId": "eagleId"
    //    }

    // On this branch, we will work with the delete-registration service

    @Autowired
    DeleteRegistrationService deleteRegistrationService;

    @RequestMapping(value = "/delete-registration", method = RequestMethod.POST)
    public ResponseEntity deleteRegistration(@RequestBody DeleteRegistrationDto deleteRegistrationDto) {
        this.deleteRegistrationService.deleteRegistration(deleteRegistrationDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
