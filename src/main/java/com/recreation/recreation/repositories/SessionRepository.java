/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.repositories;

import com.recreation.recreation.entities.Session;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * SessionRepository
 * @author Alex Karacaoglu
 */

@Repository
public interface SessionRepository extends PagingAndSortingRepository<Session, Long> {

    Optional<Session> findById(Long id);

}
