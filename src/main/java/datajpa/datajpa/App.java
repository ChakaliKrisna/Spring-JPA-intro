package datajpa.datajpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import datajpa.datajpa.dao.StudentDaoImp;
import datajpa.datajpa.dao.Student_DAOs;
import datajpa.datajpa.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student krishna=new Student();
        krishna.setAddress("hyd");
        krishna.setId(185);
        krishna.setName("arav");
        krishna.setPhone("7780351756");
        
//        Student_DAOs studentdao=new StudentDaoImp();
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        container.register()
        Student_DAOs studentdao =context.getBean("student_DAOs",Student_DAOs.class);
       
        studentdao.save(krishna);
        
//        studentdao.saveStudent(krishna);
        
        	
    }
}
