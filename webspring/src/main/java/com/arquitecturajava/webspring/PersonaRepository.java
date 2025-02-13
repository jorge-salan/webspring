package com.arquitecturajava.webspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arquitecturajava.webspring.models.Persona;

@Component
public class PersonaRepository {

	private List<Persona> personas = new ArrayList<Persona>();
	
	public PersonaRepository() {
		personas.add(new Persona("Juan"));
		personas.add(new Persona("Pedro"));
		personas.add(new Persona("Luis"));
	}
	
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
	
	public List<Persona> getPersonas() {
        return personas;
    }
	
}
