/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.entities;

import javax.persistence.*;

/**
 * Session Entity
 * @author Alex Karacaoglu
 */

@Entity
@Table(name = "PARTICIPANT", schema = "TESTDB")
public class Session {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    // Maybe have: sessionName ('Spin'), Date and time, Teacher name, location, total number of spots, spots remaining
}
