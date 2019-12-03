package factory.revisao;

public interface Crud<T> {

	public void inserir(T entidade);
	
	public void remover(int id);
	
	public void alterar(int id, T entidade);
	
	public String listarTodos();
	
}
