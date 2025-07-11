package com.emkay;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        String dbConn = "jdbc:sqlserver://localhost:1433;databaseName=infertility_system;integratedSecurity=true;";
        String user = "sa";
        String password = "12345";
        try {
            connection = DriverManager.getConnection(dbConn, user, password);
            String sql = "SELECT * FROM Users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password1 = resultSet.getString("password");
                String fullName = resultSet.getString("full_name");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phone_number");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}