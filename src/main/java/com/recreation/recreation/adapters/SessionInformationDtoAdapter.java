/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.adapters;

import com.recreation.recreation.dtos.SessionInformationDto;
import com.recreation.recreation.entities.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * SessionInformationDtoAdapter
 * @author Alex Karacaoglu
 */

public class SessionInformationDtoAdapter {

    public static List<SessionInformationDto> convert(List<Session> sessions) {
        List<SessionInformationDto> sessionInformationDtos = new ArrayList<>();
        for (Session session: sessions) {
            sessionInformationDtos.add(convert(session));
        }
        return sessionInformationDtos;
    }

    public static SessionInformationDto convert(Session session) {
        SessionInformationDto sessionInformationDto = new SessionInformationDto();
        sessionInformationDto.setSessionType(session.getName());
        sessionInformationDto.setSpotsLeft(Integer.toString(session.getSpotsLeft()));
        sessionInformationDto.setTeacher(session.getTeacher());
        return sessionInformationDto;
    }

}
