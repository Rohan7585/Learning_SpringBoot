package com.example.AutomaticDtoMapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AutomaticDtoMapper.DTOs.ExampleDTO;
import com.example.AutomaticDtoMapper.component.ExampleMapper;
import com.example.AutomaticDtoMapper.entity.ExampleEntity;
import com.example.AutomaticDtoMapper.repository.ExampleRepository;

@Service
public class ExampleService {
	@Autowired
    private ExampleRepository exampleRepository;

	private final ExampleMapper exampleMapper;

    @Autowired
    public ExampleService(ExampleMapper exampleMapper) {
        this.exampleMapper = exampleMapper;
    }

    public ExampleDTO getExampleById(Long id) {
    	ExampleEntity entity = exampleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Patient not found"));

    	return exampleMapper.toDTO(entity);
    }

	public ExampleDTO createExample(ExampleDTO dto) {
		ExampleEntity entity = exampleMapper.toEntity(dto);
		ExampleEntity saved = exampleRepository.save(entity);
	    return exampleMapper.toDTO(saved);
	}
}

