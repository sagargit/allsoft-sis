package com.asn.sis.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {

    boolean flag = false;
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public ConnectionFactory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/student?user=root&password=");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    
}
