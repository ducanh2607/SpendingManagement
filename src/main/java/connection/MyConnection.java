package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
    private static String jdbcURL="jdbc:mysql//localhost:3306/spendingManagement?useSSL=false";
    private static String username = "root";
    private static String password = "0964613519aA";
    private static Connection connection;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

}
