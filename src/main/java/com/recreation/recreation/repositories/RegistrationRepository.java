/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.repositories;

import com.recreation.recreation.entities.Registration;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * RegistrationRepository
 * @author Alex Karacaoglu
 */

@Repository
public interface RegistrationRepository extends PagingAndSortingRepository<Registration, Long> {

    Registration findByEagleIdAndSessionId(String eagleId, Long sessionId);

}
