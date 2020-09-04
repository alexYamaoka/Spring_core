package com.example.bean_life_cycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO
{
    private String driver;
    private String url;
    private String username;
    private String password;

    private Connection connection;



    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    @PostConstruct
    public void init() throws ClassNotFoundException, SQLException
    {
        // load driver
        Class.forName(driver);

        // get a connection
        connection = DriverManager.getConnection(url, username, password);
    }


//    @PostConstruct    // once the object is created and dependencies are injected, execute this method automatically -- also known as init() method
//    public void createStudentDBConnection() throws ClassNotFoundException, SQLException
//    {
//        System.out.println("Creating connection for student DB");
//
//        // load driver
//        Class.forName(driver);
//
//        // get a connection
//        connection = DriverManager.getConnection(url, username, password);
//    }




    @PreDestroy
    public void destroy() throws SQLException
    {
        System.out.println("closing connection");
        connection.close();
    }

//    @PreDestroy             // before this bean is removed from the ioc container, destroy method is called
//    public void closeConnection() throws SQLException
//    {
//        System.out.println("closing connection");
//        connection.close();
//    }





    public void selectAllRows() throws ClassNotFoundException, SQLException
    {
        //createStudentDBConnection();

        // execute query
        Statement statement = connection.createStatement();

        // retrieve results back as resultSet
        ResultSet resultSet = statement.executeQuery("SELECT * FROM studentRecords.studentsList;");

        while (resultSet.next())
        {
            String firstName = resultSet.getString(1);
            String lastName = resultSet.getString(2);
            int studentID = resultSet.getInt(3);

            System.out.println(firstName + " " + lastName + " " + studentID);
        }

        //closeConnection();
    }

    public void deleteStudentRecord(int id) throws ClassNotFoundException, SQLException
    {
        //createStudentDBConnection();

        // execute query
        Statement statement = connection.createStatement();

        statement.executeUpdate("DELETE FROM studentRecords.studentsList WHERE id = " + id);

        System.out.println("Record deleted with id: " + id);

        //closeConnection();
    }
}
