package com.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

/**
 * Spring ORM crud operation !
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Spring ORM crud operation project started..." );

		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao=con.getBean("studentDao",StudentDao.class);

		////Insert record////
		//		        Student student=new Student(5,"Rakshith M","Bangalore");
		//		        int r=studentDao.insert(student);
		//		        System.out.println(r+" record insterted...");


		///update data///
		//		Student student=new Student();
		//		student.setStudentId(3);
		//		student.setStudentName("avanish");
		//		student.setStudentCity("noida");
		//
		//		studentDao.updateStudent(student);
		//		System.out.println(" record updated...");



		///delete data///
		//		      studentDao.deleteStudent(5);
		//		      System.out.println(" record deleted...");




		///get one student data///
		//		        Student s=studentDao.getStudent(2);
		//		        System.out.println(s);


		///get all record ///
		List<Student> students=studentDao.getStudents();
		students.forEach(s->System.out.println(s));
	}
}
