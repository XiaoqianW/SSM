package com.train.dao;

import java.util.List;

import com.train.beans.Student;

public interface StudentDao {
	
	int insertStudent(Student student);
	List<Student> selectAllStudent();
	
}
