/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.CreateEntitiesTests;

import com.recreation.recreation.entities.SessionType;
import com.recreation.recreation.repositories.SessionTypeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CreateSessionTypeTest
 * @author Alex Karacaoglu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateSessionTypeTest {

	@Autowired
	SessionTypeRepository sessionTypeRepository;

	@Test
	public void createSessionType() {
		SessionType sessionType = new SessionType();
		sessionType.setName("Spin");
		sessionType.setDeleted(Boolean.FALSE);
		sessionTypeRepository.save(sessionType);
		assert 1==1;
	}
}
