package com.ha.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ha.entity.Doctor;
import com.ha.reporsitory.inter.DocterDao;
import com.ha.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]) {
//		 EntityManagerFactory emf1=Persistence.createEntityManagerFactory("capgemini");
//	   // System.out.println("------------Inserting---------");
//	EntityManager  em1=emf1.createEntityManager();
//	 EntityTransaction  et2=em1.getTransaction();
//	 et2.begin();
//	    Patient doc = new Patient ("ravi","75","dpddcc","888df","dfe","d88ff");
//	  em1.persist(doc);
//	 et2.commit();
//	    em1.close();
//	    EntityManager  em2=emf1.createEntityManager();
//	    EntityTransaction  et3=em2.getTransaction();
//	    et3.begin();
	   Doctor uu = new Doctor ("a777","surgeon","89996558877","pp88k@gmail.com");
//	  em2.persist(uu);
//	    et3.commit();
//	       em2.close();
//	       
	       DocterDao dao = new DocterDao();
	       dao.addDoctor(uu);
		}
	
}
