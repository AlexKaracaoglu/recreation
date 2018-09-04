/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.CreateEntitiesTests;

import com.recreation.recreation.entities.Participant;
import com.recreation.recreation.repositories.ParticipantRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * CreateParticipantTest
 * @author Alex Karacaoglu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateParticipantTest {

	@Autowired
	ParticipantRepository participantRepository;

	@Test
	public void createParticipant() {
		Participant participant = new Participant();
		participant.setName("name");
		participant.setEmail("email");
		participant.setEagleId("eagle id");
		participant.setPhoneNumber("phone");
		participant.setDeleted(Boolean.FALSE);
		participantRepository.save(participant);

		assert 1==1;
	}
}
