package com.ha.reporsitory.inter;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ha.entity.Doctor;

public class Docterimpl  implements DoctorInter{

	@Override
	public void addDoctor(Doctor doctor) {
		EntityManagerFactory emf1=Persistence.createEntityManagerFactory("capgemini");
		EntityManager  em1=emf1.createEntityManager();
		 EntityTransaction  et2=em1.getTransaction();
		 em1.persist(doctor);
		
	}

	@Override
	public String viewPatientMedicalHistory(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor findDocterbyId(int id) {
		EntityManagerFactory emf1=Persistence.createEntityManagerFactory("capgemini");

		EntityManager  em1=emf1.createEntityManager();
		 EntityTransaction  et2=em1.getTransaction();

		 
		  Query query = em1.createNativeQuery("select * from docter where id =" + id);
		 			List resultList2 = query.getResultList();

System.out.println(resultList2.get(0));
		
		
		return null;
	}

	@Override
	public void addPrescriptions(int id, String prescription) {
		// TODO Auto-generated method stub
		
	}

}
