package factory.revisao;

public class Servico extends Produto implements Item{
	
	private String descricao;
	private float custoServico;
	
	
	public Servico() {
		super();
	}
	
	public Servico(String nome, float custo, String descricao, float custoServico) {
		super(nome, custo);
		this.descricao = descricao;
		this.custoServico = custoServico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getCustoServico() {
		return custoServico;
	}
	public void setCustoServico(float custoServico) {
		this.custoServico = custoServico;
	}

	@Override
	public float valorFinal() {
		// TODO Auto-generated method stub
		return 0;
	}


}
