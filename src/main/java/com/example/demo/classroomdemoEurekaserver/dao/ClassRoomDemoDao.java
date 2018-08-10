package com.example.demo.classroomdemoEurekaserver.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.classroomdemoEurekaserver.entity.Student;
import com.example.demo.classroomdemoEurekaserver.repository.ClassRoomDemoRepository;

@Repository
public class ClassRoomDemoDao {

	@Autowired
	private ClassRoomDemoRepository classRoomRepo;
	
	public List<Student> getAllStudents(){
		return classRoomRepo.findAll();
	}
	
	public Student createStudent(Student stu) {
		return classRoomRepo.save(stu);
	}
	
	public Student updateStudent(Student stu) {
		return classRoomRepo.save(stu);
	}

	public Student getStudentByRoll(Integer rollNum) {		
		return classRoomRepo.getStudentByRoll(rollNum);
	}
}
