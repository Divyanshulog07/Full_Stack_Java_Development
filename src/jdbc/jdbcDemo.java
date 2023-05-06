package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Full_Stack_Java", "root", "Divyanshu07@");

            Statement statement = connection.createStatement();

            String insert = "insert into employee(id, Name, Adress, Roll_no) values(5, 'Aayush', 'Nanded', 6045)";

            int i = statement.executeUpdate(insert);

            System.out.println("record inserted successfully"+ i);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
