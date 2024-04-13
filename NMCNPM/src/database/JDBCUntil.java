package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class JDBCUntil {
    public static Connection getConnection() {
        Connection c = null;

        try {
            // Load the SQL Server driver (not needed to register explicitly)
		// Tai SQL Sever de ket noi
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Connection parameters
<<<<<<< HEAD
            String url = "jdbc:sqlserver://DESKTOP-KT3KI6S:1433;encrypt=true;databaseName=Quanlychungcu;trustServerCertificate = true";
=======
		//DESKTOP-KT3KI6S:1433 ten may tinh local ket noi, trong SQL sever tao 1 database la NMCNPM
            String url = "jdbc:sqlserver://DESKTOP-KT3KI6S:1433;encrypt=true;databaseName=NMCNPM;trustServerCertificate = true";
>>>>>>> ea393dd13a27c5f1dcf5e83273bff637a480abf5
            String userName = "sa";
            String password = "admin";

            c = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
    public static void main(String[] args) {
    	Connection connection = JDBCUntil.getConnection();
		System.out.println(connection);
	}
}
