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
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="SESSION_ID")
    private String teacher;

    @Column(name="EAGLE_ID")
    private String eagleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getEagleId() {
        return eagleId;
    }

    public void setEagleId(String eagleId) {
        this.eagleId = eagleId;
    }
}
