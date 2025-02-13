package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arquitecturajava.webspring.dtos.PersonaDto;
import com.arquitecturajava.webspring.mappers.PersonaMapper;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	
	@Autowired
	private PersonaService service;
	
	public void addPersona(PersonaDto personaDto) {
		service.addPersona(PersonaMapper.toModel(personaDto));
	}

	@GetMapping
	public List<PersonaDto> getPersonas() {
		return service.getPersonas().stream().map(PersonaMapper::toDto).toList();
	}

}
