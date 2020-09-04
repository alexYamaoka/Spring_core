package com.example.bean_life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans6.xml");
        StudentDAO studentDAO = applicationContext.getBean("studentDAO", StudentDAO.class);
        studentDAO.selectAllRows();

        //((ClassPathXmlApplicationContext)applicationContext).close();
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();



        Hello hello = applicationContext.getBean("hello", Hello.class);

        // registerShutdownHook and close do the same thing
        // close - once you close the container, need to open it again
        // registerShutdownHook - executes once the main thread/main method ends. Where it is placed does not matter.
    }
}
