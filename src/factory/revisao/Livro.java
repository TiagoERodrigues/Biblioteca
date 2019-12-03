package factory.revisao;

public final class Livro extends Produto implements Item{
	
	private String autor;

	public Livro() {
		super();
		
	}

	public Livro(String nome, float custo, String autor) {
		super(nome, custo);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "livro [autor=" + autor + "]";
	}

	@Override
	public float valorFinal() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
