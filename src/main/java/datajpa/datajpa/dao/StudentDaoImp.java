package datajpa.datajpa.dao;

import org.springframework.stereotype.Repository;

import datajpa.datajpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImp{
	
	
	public StudentDaoImp() {
		System.out.println("studentdaoimp");
	}

	@PersistenceContext(unitName="mysql")
	EntityManager entitymanager;
	

	@Transactional
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		entitymanager.merge(student);
//		entitymanager.Persist()
		System.out.println("inserted");
		
		
		
	}

}
