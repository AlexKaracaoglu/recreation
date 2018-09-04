/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.CreateEntitiesTests;

import com.recreation.recreation.entities.Session;
import com.recreation.recreation.repositories.SessionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CreateParticipantTest
 * @author Alex Karacaoglu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateSessionTest {

	@Autowired
	SessionRepository sessionRepository;

	@Test
	public void createSession() {
		Session session = new Session();
		session.setName("Spin class 2");
		session.setTotalSpots(10);
		session.setSpotsLeft(10);
		session.setTeacher("Spin Teacher 2");
		session.setDeleted(Boolean.FALSE);
		sessionRepository.save(session);

		assert 1==1;
	}
}
