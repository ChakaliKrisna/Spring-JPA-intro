package datajpa.datajpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import datajpa.datajpa.dao.StudentDaoImp;
import datajpa.datajpa.entity.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

       
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        Student_DAOs studentDao = context.getBean(Student_DAOs.class);

//       jfwidfsLVHergjfk;ernm.
        Student krishna = new Student();
        krishna.setName("Krishna");
        krishna.setPhone("7780351721");
        krishna.setAddress("Hyderabad");

      
//        studentDao.saveStudent(krishna);
  

     
        context.close();
    }
}
