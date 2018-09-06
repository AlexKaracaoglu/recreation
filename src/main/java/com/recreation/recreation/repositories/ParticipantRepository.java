/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.repositories;

import com.recreation.recreation.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


/**
 * ParticipantRepository
 * @author Alex Karacaoglu
 */

@Repository
public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

    Participant findByEagleId(String eagleId);

    List<Participant> findByEagleIdInAndDeleted(List<String> eagleIds, Boolean deleted);
}
