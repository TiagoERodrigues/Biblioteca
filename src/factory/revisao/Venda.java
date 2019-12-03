package factory.revisao;
import java.util.*;

public class Venda{

	private int id;
	private Cliente cliente;
	private Map<String, Item> item;
	
	public Venda(int id, Cliente cliente, Map<String, Item> item) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.item = item;
	}
	
	public void inserirItem(String codigo, Item item){
		
		
		
	}
	
	public void removerItem(String codigo){
		
		
		
	}
	
	public float totalVendas() {
		return 0;
	}
	
	public String cupomVenda() {
		return null;
		
	}
	
}
