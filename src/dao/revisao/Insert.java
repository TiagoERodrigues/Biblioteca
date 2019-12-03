package dao.revisao;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Insert<nomeTabela> {

    Statement statement;


    public int insertProduto() throws SQLException {

        statement.executeUpdate("INSERT INTO Produto(id, nome, custo, autor, genero) values ();");
        return 1;
    }
}
