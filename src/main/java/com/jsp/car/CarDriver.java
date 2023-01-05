package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car c=new Car();
		c.setId(2);
		c.setName("Scorpio");
		c.setBrand("Mahindra");
		
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
		System.out.println("All good");

	}

}
