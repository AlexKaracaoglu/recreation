/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RegisterController
 * @author Alex Karacaoglu
 */

@Controller
public class RegisterController {

    //Example url: http://localhost:8080/register?sessionId=2&eagleId=4&name=test&phone=123-456-7890&email=email
    @RequestMapping(value = "/register")
    public ResponseEntity register(@RequestParam Long sessionId,
                                   @RequestParam String eagleId,
                                   @RequestParam String name,
                                   @RequestParam String phone,
                                   @RequestParam String email) {
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
