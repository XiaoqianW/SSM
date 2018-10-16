package com.train.service;

import java.util.List;

import com.train.beans.Student;

public interface StudentService {
	
	int addStudent(Student student);
	List<Student> findStudent();
}
