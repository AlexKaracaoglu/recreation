/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.repositories;

import com.recreation.recreation.entities.Registration;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * RegistrationRepository
 * @author Alex Karacaoglu
 */

@Repository
@Transactional
public interface RegistrationRepository extends PagingAndSortingRepository<Registration, Long> {

    Registration findByEagleIdAndSessionId(String eagleId, Long sessionId);

    @Modifying
    @Query("update Registration r set r.deleted = :deleted where r.sessionId = :sessionId")
    void cancelSession(@Param("deleted") Boolean deleted, @Param("sessionId") Long sessionId);

}
