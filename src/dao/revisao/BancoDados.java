package dao.revisao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class BancoDados {


    public String Login;
    public String MotDePasse;
    private boolean Logged = false;

    public Connection StartBdd() throws SQLException, ClassNotFoundException {

        try {
            Class.forName("org.gjt.mm.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Mercearia?useTimezone=true&serverTimezone=UTC", "root", "");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}