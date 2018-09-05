/*
 * Property of 2150 Room 201
 * 2018
 */

package com.recreation.recreation.CreateEntitiesTests;

import com.recreation.recreation.entities.Registration;
import com.recreation.recreation.repositories.RegistrationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CreateRegistrationTest
 * @author Alex Karacaoglu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateRegistrationTest {

	@Autowired
	RegistrationRepository registrationRepository;

	@Test
	public void createRegistration() {
		Registration registration = new Registration();
		registration.setEagleId("55");
		registration.setSessionId(2L);
		registration.setDeleted(Boolean.FALSE);
		registrationRepository.save(registration);
		assert 1==1;
	}
}
