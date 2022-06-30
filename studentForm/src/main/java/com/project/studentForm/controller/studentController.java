package com.project.studentForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.studentForm.model.Student;
import com.project.studentForm.repository.StudentRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RequestMapping("studentform")
public class studentController {
	@Autowired
	private StudentRepository studentRepository;
	@PostMapping("/save")
	public void savePerson(@RequestBody Student s) {
		studentRepository.save(s);
	}
}
