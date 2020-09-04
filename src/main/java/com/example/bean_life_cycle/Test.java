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

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
