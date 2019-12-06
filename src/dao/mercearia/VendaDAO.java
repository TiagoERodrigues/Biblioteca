package dao.mercearia;

import factory.mercearia.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendaDAO {

	private Connection connection;

	public VendaDAO() throws SQLException, ClassNotFoundException {

	    this.connection = new BancoDados().StartBdd();
    }

    public void InsertCliente(Cliente cliente)  {

        String sql = "insert into Cliente (id, nome, cpf, data_nasc) values ('1', 'Fernando', '111.222.333-44', '1999-12-12', '1')";

        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);

            // seta os valores
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getData_nasc());
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
