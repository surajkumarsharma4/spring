package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.SubjectDao;
import com.jsp.entity.Subject;
@Component
public class SubjectService {
	@Autowired
	private SubjectDao dao;
	
	public Subject saveSubject(Subject subject) {
		try {
			return dao.saveSubject(subject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			return null;
		}
	}
}
