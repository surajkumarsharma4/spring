package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.entity.Student;
import com.jsp.error.StudentException;

@Component
public class StudentService {
	@Autowired
	private StudentDao dao;
	
	public Student saveStudent(Student student) {
		try {
		return dao.saveStudent(student);
		}catch (Exception e) {
			// TODO: handle exception
//			throw new StudentException("error");
			return null;			
		}
	}
	public List<Student> findAllStudent() {
		try {
			return dao.findAllStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
