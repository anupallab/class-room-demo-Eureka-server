package com.example.demo.classroomdemoEurekaserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classroomdemoEurekaserver.entity.Student;
import com.example.demo.classroomdemoEurekaserver.service.ClassRoomDemoService;

@RestController
public class ClassRoomDemoController {
	
	@Autowired
	private ClassRoomDemoService classRoomSvc;

	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return classRoomSvc.getAllStudents();
	}
	
	@GetMapping("/student/{roll}")
	public Student getStudentByRoll(@PathVariable("roll") Integer rollNum){
		return classRoomSvc.getStudentByRoll(rollNum);
	}
	
	@PostMapping("/student")
	public Student craeteStudent(@RequestBody Student stu) {
		return classRoomSvc.createStudent(stu);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student stu) {
		return classRoomSvc.updateStudent(stu);
	}
}
