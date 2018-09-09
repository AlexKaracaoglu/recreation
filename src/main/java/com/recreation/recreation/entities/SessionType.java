/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.entities;

import javax.persistence.*;

/**
 * SessionType Entity
 * @author Alex Karacaoglu
 */

@Entity
@Table(name = "SESSION_TYPE", schema = "TESTDB")
public class SessionType extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
