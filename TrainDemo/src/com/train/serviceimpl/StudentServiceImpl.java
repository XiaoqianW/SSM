package com.train.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.beans.Student;
import com.train.dao.StudentDao;
import com.train.service.StudentService;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao stuDao;
	
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return stuDao.insertStudent(student);
	}

	@Override
	public List<Student> findStudent() {
		// TODO Auto-generated method stub
		return stuDao.selectAllStudent();
	}

}
