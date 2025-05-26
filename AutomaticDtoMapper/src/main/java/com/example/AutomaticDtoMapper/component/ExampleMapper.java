package com.example.AutomaticDtoMapper.component;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.AutomaticDtoMapper.DTOs.ExampleDTO;
import com.example.AutomaticDtoMapper.entity.ExampleEntity;

@Mapper(componentModel = "spring")
public interface ExampleMapper {

	@Mapping(source = "patientName", target = "name")
    @Mapping(source = "patientAge", target = "age")
    @Mapping(source = "patientGender", target = "gender")
    ExampleDTO toDTO(ExampleEntity entity);

    @Mapping(source = "name", target = "patientName")
    @Mapping(source = "age", target = "patientAge")
    @Mapping(source = "gender", target = "patientGender")
    ExampleEntity toEntity(ExampleDTO dto);

    List<ExampleDTO> toDTOs(List<ExampleEntity> entities);
    List<ExampleEntity> toEntities(List<ExampleDTO> dtos);
}
