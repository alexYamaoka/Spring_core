package com.example.bean_life_cycle;

import java.sql.*;

public class StudentDAO
{
    private String driver;
    private String url;
    private String username;
    private String password;


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

    public void selectAllRows() throws ClassNotFoundException, SQLException
    {
        // load driver
        Class.forName(driver);

        // get a connection
        Connection connection = DriverManager.getConnection(url, username, password);

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

        connection.close();
    }

    public void deleteStudentRecord(int id) throws ClassNotFoundException, SQLException
    {
        // load driver
        Class.forName(driver);

        // get a connection
        Connection connection = DriverManager.getConnection(url, username, password);

        // execute query
        Statement statement = connection.createStatement();

        statement.executeUpdate("DELETE FROM studentRecords.studentsList WHERE id = " + id);

        System.out.println("Record deleted with id: " + id);

        connection.close();
    }

}
