package com.example.DTOmapper.component;

import org.springframework.stereotype.Component;

import com.example.DTOmapper.DTOs.ExampleDTO;
import com.example.DTOmapper.entity.ExampleEntity;

@Component
public class ExampleMapper {
	public ExampleDTO toDTO(ExampleEntity entity) {
		ExampleDTO dto = new ExampleDTO();
        dto.setName(entity.getPatientName());
        dto.setAge(entity.getPatientAge());
        dto.setGender(entity.getPatientGender());
        return dto;
    }

	public ExampleEntity toEntity(ExampleDTO dto) {
		ExampleEntity entity = new ExampleEntity();
		entity.setPatientName(dto.getName());
		entity.setPatientAge(dto.getAge());
		entity.setPatientGender(dto.getGender());
		// You can also set defaults or skip fields if needed
		return entity;
	}
}
