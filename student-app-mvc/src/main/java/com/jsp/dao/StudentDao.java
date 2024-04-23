package com.jsp.dao;

import java.util.List;

import com.jsp.entity.Student;

public interface StudentDao {
	public Student saveStudent(Student student);
	public Student findStudentById(int id);
	public List<Student> findAllStudent();
	public Student updateStudent(Student student);
	public void deleteStudent(Student student);
}
