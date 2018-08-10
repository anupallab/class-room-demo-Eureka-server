package com.example.demo.classroomdemoEurekaserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.classroomdemoEurekaserver.entity.Student;

@Repository
public interface ClassRoomDemoRepository extends JpaRepository<Student, Integer>{

	@Query("from Student where roll=?1")
	Student getStudentByRoll(Integer roll);
}
