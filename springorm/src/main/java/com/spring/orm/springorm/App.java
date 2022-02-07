package com.spring.orm.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("springorm/src/main/java/com/spring/orm/springoem/config.xml"); 
      StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
      Student student = new Student(2535,"Rahul Desai","Kalol");
      int r=studentDao.insert(student);
      System.out.println("done" + r);
    }
}
