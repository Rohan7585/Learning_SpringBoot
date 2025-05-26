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
    private ExampleRepository ExampleRepository;

    @Autowired
    private ExampleMapper ExampleMapper;

    public ExampleDTO getExampleById(Long id) {
        ExampleEntity entity = ExampleRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Example not found"));

        return ExampleMapper.toDTO(entity);
    }

    public ExampleDTO createExample(ExampleDTO dto) {
        ExampleEntity entity = ExampleMapper.toEntity(dto);
        ExampleEntity saved = ExampleRepository.save(entity);
        return ExampleMapper.toDTO(saved);
    }
}

