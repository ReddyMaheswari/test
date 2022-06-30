package com.project.studentForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.studentForm.model.Student;
public interface StudentRepository extends JpaRepository<Student,Long>{

}
