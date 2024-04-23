package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.entity.Subject;
@Component
public class StubjectDaoImplementation implements SubjectDao{
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	public Subject saveSubject(Subject subject) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(subject);
		entityTransaction.commit();
		return subject;
	}
	public Subject findSubjectById(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		return entityManager.find(Subject.class, id);
	}
	public List<Subject> findAllSubject() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		return entityManager.createQuery("select u from subject u").getResultList();
	}
	public Subject updateSubject(Subject subject) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(subject);
		entityTransaction.commit();
		return subject;
	}
	public void deleteSubject(Subject subject) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(subject);
		entityTransaction.commit();	
	}


	
}
