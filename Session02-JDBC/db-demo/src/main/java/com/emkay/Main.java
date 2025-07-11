package com.emkay;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        try {

            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=HSF302;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String pass = "123456";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, user, pass);

            String qurey = "SELECT * FROM Subject";
            PreparedStatement statement = conn.prepareStatement(qurey);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String code = resultSet.getString("Code");
                String name = resultSet.getString("Name");
                int credit = resultSet.getInt("Credits");
                int hours = resultSet.getInt("StudyHours");

                System.out.printf("| %10s | %-40s | %2d | %4d |\n", code, name, credit, hours);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}