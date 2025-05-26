package com.example.DTOmapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTOmapper.DTOs.ExampleDTO;
import com.example.DTOmapper.service.ExampleService;

@RestController
@RequestMapping("/api")
public class ExampleController {
	
	@Autowired
	private ExampleService exampleService;
	
	@GetMapping("/{id}")
	public ResponseEntity<ExampleDTO> getPatient(@PathVariable Long id){
		ExampleDTO dto = exampleService.getExampleById(id);
        return ResponseEntity.ok(dto);
	}
	
	@PostMapping
    public ResponseEntity<ExampleDTO> createPatient(@RequestBody ExampleDTO dto) {
        ExampleDTO created = exampleService.createExample(dto);
        return ResponseEntity.ok(created);
    }

}
