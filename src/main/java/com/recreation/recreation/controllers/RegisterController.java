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
 * RegisterController
 * @author Alex Karacaoglu
 */

@Controller
public class RegisterController {

    //Example url: http://localhost:8080/register?sessionId=2&eagleId=4&name=test&phone=123-456-7890&email=email
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ResponseEntity<Participant> register(@RequestParam Long sessionId,
                                   @RequestParam String eagleId,
                                   @RequestParam String name,
                                   @RequestParam String phone,
                                   @RequestParam String email) {
        Participant p = new Participant();
        p.setPhoneNumber(phone);
        p.setEagleId(eagleId);
        p.setEmail(email);
        p.setName(name);
        return ResponseEntity.ok(p);
    }

    // update session, make participant if not exists, add entry into registration
}
