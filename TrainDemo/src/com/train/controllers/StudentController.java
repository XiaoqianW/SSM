package com.train.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.train.beans.Student;
import com.train.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public ModelAndView addStudent(Student student){
		ModelAndView mv = new ModelAndView();
		
		int result = studentService.addStudent(student);
		if (result > 0){
			mv.setViewName("success!");
		}else{
			mv.setViewName("fail");
		}
		return mv;
	}
	
	@RequestMapping("liststudent.do")
	@ResponseBody
	public List<Student> queryStudent(){
		List<Student> students = studentService.findStudent();
		if (students != null && students.size() <1){
			students = new ArrayList<Student>();
		}
		return students;
	}
}
