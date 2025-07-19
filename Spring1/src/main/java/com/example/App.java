package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Ans1");
        Student s = new Student();
        s.ShowAddress();

        System.out.println("Ans2");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student2 s2 =  context.getBean(Student2.class);
        s2.showAddress();

        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student3 s3 = context2.getBean(Student3.class);
        System.out.println("Ans3");
        s3.showAddress();


        System.out.println("Ans4");
        Student4 s4 =  context.getBean(Student4.class);
        System.out.println("Bean property " + s4.getAddress().getCity());

        System.out.println("Ans5");

        TransPortService t1 = context.getBean(TransPortService.class);
        t1.travel();
        System.out.println("Ans6");
        TransPortService2 t2 = context.getBean(TransPortService2.class);
        t2.travel();


    }
}
