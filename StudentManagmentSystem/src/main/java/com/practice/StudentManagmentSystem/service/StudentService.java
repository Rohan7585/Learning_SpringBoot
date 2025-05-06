package com.practice.StudentManagmentSystem.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.practice.StudentManagmentSystem.model.Student;

@Service
public class StudentService {
List<Student> studentLst = new ArrayList<>();
	
	public void addStudent(Student student) {
		studentLst.add(student);
	}
	
	public List<Student> allStudent(){
		return studentLst;
	}
}
