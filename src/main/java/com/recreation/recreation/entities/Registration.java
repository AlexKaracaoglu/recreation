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
@Table(name = "REGISTRATION", schema = "TESTDB")
public class Registration extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="SESSION_ID")
    private Long sessionId;

    @Column(name="EAGLE_ID")
    private String eagleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public String getEagleId() {
        return eagleId;
    }

    public void setEagleId(String eagleId) {
        this.eagleId = eagleId;
    }
}
