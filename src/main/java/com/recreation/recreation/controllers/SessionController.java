/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.controllers;

import com.recreation.recreation.entities.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SessionController
 * @author Alex Karacaoglu
 */

@Controller
public class SessionController {

    @RequestMapping(value = "/get-sessions", method = RequestMethod.GET)
    public ResponseEntity<Session> getSessions() {
        Session session = new Session();
        return ResponseEntity.ok(session);
    }
}
