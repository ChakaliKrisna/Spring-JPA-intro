//package datajpa.datajpa.dao;
//
//import org.springframework.stereotype.Repository;
//
//import datajpa.datajpa.entity.Student;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
//@Repository
//public class StudentDaoImp{
//	
//	
//	public StudentDaoImp() {
//		System.out.println("studentdaoimp");
//	}
//
//	@PersistenceContext(unitName="mysql")
//	EntityManager entitymanager;
//	
//
//	@Transactional
//	public void saveStudent(Student student2) {
//		// TODO Auto-generated method stub
//		entitymanager.persist(student2);
////		entitymanager.Persist()
//		System.out.println("inserted");
//		
//		
//		
//	}
//
//}
