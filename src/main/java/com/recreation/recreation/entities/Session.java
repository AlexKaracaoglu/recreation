/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Session Entity
 * @author Alex Karacaoglu
 */

@Entity
@Table(name = "SESSION", schema = "TESTDB")
public class Session extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="TEACHER")
    private String teacher;

    @Column(name="TOTAL_SPOTS")
    private Integer totalSpots;

    @Column(name="SPOTS_LEFT")
    private Integer spotsLeft;

    @Column(name="DATE")
    private Date date;

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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getTotalSpots() {
        return totalSpots;
    }

    public void setTotalSpots(Integer totalSpots) {
        this.totalSpots = totalSpots;
    }

    public Integer getSpotsLeft() {
        return spotsLeft;
    }

    public void setSpotsLeft(Integer spotsLeft) {
        this.spotsLeft = spotsLeft;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
