package dao.revisao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import com.sun.org.apache.xpath.internal.objects.XBoolean;
import org.*;
import com.mysql.jdbc.Driver;

public class BancoDados {


    public String Login;
    public String MotDePasse;
    private boolean Logged = false;

    public void StartBdd() throws SQLException, ClassNotFoundException {

        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName); // here is the ClassNotFoundException

        String serverName = "localhost:3306";
        String mydatabase = "root";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

    }

    public void rollback(Connection connection) throws SQLException {
        connection.rollback();
    }

    public void close(Connection connection) throws SQLException {
        connection.close();
    }
}