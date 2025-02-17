package com.arquitecturajava.webspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arquitecturajava.webspring.models.Persona;

@SpringBootTest
class WebspringApplicationTests {

	@Autowired
	PersonaRepository repository;

	@Test
	void addPersonaRepositoryTest() {
		Persona p = new Persona("Pepe");
		repository.addPersona(p);
		assertEquals(4, repository.getPersonas().size());
	}

	@Test
	void contextLoads() {
	}

}
