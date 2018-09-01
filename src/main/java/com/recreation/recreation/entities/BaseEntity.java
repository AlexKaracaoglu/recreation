/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.entities;

import org.hibernate.annotations.Type;
import javax.persistence.*;

/**
 * Base Entity
 * @author Alex Karacaoglu
 */

@MappedSuperclass
public class BaseEntity {

    @Column(name="DELETED")
    @Type(type="yes_no")
    private Boolean deleted;

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
