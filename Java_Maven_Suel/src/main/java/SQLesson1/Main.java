package SQLesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            String url = "jdbc:mysql://localhost:3306/library?serverTimezone=UTC";
            String user = "root";
            String password = "1234";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("<-----Connected!----->");
        } catch (SQLException e) {
            System.err.println("<----" + e.getMessage() + "---->");
        } finally {
            try{
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("<----" + e.getMessage() + "---->");
            }
        }



    }
}
