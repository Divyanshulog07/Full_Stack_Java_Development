package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc1Demo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Full_Stack_Java", "root", "Divyanshu07@");

            Statement statement = connection.createStatement();

            String str = "select * from employee";

            ResultSet rs = statement.executeQuery(str);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
