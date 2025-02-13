package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arquitecturajava.webspring.models.Persona;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	public void addPersona(Persona persona) {
		personaRepository.addPersona(persona);
	}

	public List<Persona> getPersonas() {
		return personaRepository.getPersonas();
	}

	
}
