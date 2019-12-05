package factory.revisao;


public abstract class Produto {

	private String nome;
	private float custo;
	private int lote;
	private int quantidade;
	TipoProduto tipoProduto;

	public Produto(String nome, float custo, int lote, int quantidade) {
		this.nome = nome;
		this.custo = custo;
		this.lote = lote;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}


	@Override
	public String toString() {
		return "Produto{" +
				"nome='" + nome + '\'' +
				", custo=" + custo +
				", lote=" + lote +
				", quantidade=" + quantidade +
				", tipoProduto=" + tipoProduto +
				'}';
	}
}
