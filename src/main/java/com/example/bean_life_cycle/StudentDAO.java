package com.example.bean_life_cycle;

import java.sql.*;

public class StudentDAO
{
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/?useTimezone=true&serverTimezone=UTC";
    private String username = "root";
    private String password = "password";

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
