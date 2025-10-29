package datajpa.datajpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import datajpa.datajpa.entity.Student;
import jakarta.persistence.EntityManager;

@Repository
public class StudentDaoImp implements Student_DAOs {

	@Autowired
	EntityManager entitymanager;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		
	}

}
