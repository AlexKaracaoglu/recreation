/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.dtos.RegisterDto;
import com.recreation.recreation.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * RegisterController
 * @author Alex Karacaoglu
 */

@Controller
public class RegisterController {

    // Request url: http://localhost:8080/register
    // Request Body example:
    //    {
    //        "sessionId": 5,
    //            "name": "test name",
    //            "email": "test email",
    //            "phoneNumber": "test phone",
    //            "eagleId": "test eagle id"
    //    }

    // On this branch, we will work with the register service

    @Autowired
    RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity register(@RequestBody RegisterDto registerDto) {
        this.registerService.register(registerDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
