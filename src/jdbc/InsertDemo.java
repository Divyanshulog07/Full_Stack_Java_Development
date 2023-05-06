package jdbc;

import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {

        try {

            Statement statement = Conn.getConn().createStatement();

            String inert = "insert into employee(id,Name,Adress,Roll_no) values(5,'Aayush','Nanded')";
            String update = "update employee set adress='Sangali' where id = 5";
//            String delete = "delete from employee where id= 5";
            int i = statement.executeUpdate(update);

            System.out.println("record deleted successfully " + i);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}