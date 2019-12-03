package principal.revisao;

import dao.revisao.BancoDados;
import dao.revisao.VendaDAO;

import java.sql.SQLException;


public class Main {

	public static VendaDAO vendaDAO;

	public static void main(String[] args) {

        BancoDados bancoDados = new BancoDados();

        try {
            bancoDados.StartBdd();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
