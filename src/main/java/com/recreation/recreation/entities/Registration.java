/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.entities;

import javax.persistence.*;

/**
 * Registration Entity
 * @author Alex Karacaoglu
 */

@Entity
@Table(name = "PARTICIPANT", schema = "TESTDB")
public class Registration {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    //maybe have a reference to a sessionId -> Session and eagleId -> Participant

}
