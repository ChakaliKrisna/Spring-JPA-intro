package datajpa.datajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import datajpa.datajpa.entity.Student;

public interface Student_DAOs extends JpaRepository<Student, Integer>{
//	public void saveStudent(Student student);

}
