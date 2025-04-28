package org.example;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtil implements Serializable {

    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER = "postgres";
    public static final String PASSWORD = "123";


  public static Connection getConnection() throws SQLException {


    return DriverManager.getConnection(URL, USER, PASSWORD);
  }



}