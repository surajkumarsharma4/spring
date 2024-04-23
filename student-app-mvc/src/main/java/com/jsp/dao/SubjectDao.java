package com.jsp.dao;

import java.util.List;

import com.jsp.entity.Student;
import com.jsp.entity.Subject;

public interface SubjectDao {
	public Subject saveSubject(Subject subject);
	public Subject findSubjectById(int id);
	public List<Subject> findAllSubject();
	public Subject updateSubject(Subject subject);
	public void deleteSubject(Subject subject);
}
