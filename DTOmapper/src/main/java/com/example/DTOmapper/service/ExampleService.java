package com.example.DTOmapper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTOmapper.DTOs.ExampleDTO;
import com.example.DTOmapper.component.ExampleMapper;
import com.example.DTOmapper.entity.ExampleEntity;

import com.example.DTOmapper.repository.ExampleRepository;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    @Autowired
    private ExampleMapper exampleMapper;

    public ExampleDTO getExampleById(Long id) {
        ExampleEntity entity = exampleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Example not found"));

        return exampleMapper.toDTO(entity);
    }

    public ExampleDTO createExample(ExampleDTO dto) {
        ExampleEntity entity = exampleMapper.toEntity(dto);
        ExampleEntity saved = exampleRepository.save(entity);
        return exampleMapper.toDTO(saved);
    }
}

