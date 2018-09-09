/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.repositories;

import com.recreation.recreation.entities.SessionType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * SessionTypeRepository
 * @author Alex Karacaoglu
 */

@Repository
public interface SessionTypeRepository extends PagingAndSortingRepository<SessionType, Long> {

}
