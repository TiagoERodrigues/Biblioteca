package factory.revisao;
import factory.revisao.Genero;

public class Cd extends Produto implements Item{

	 Genero genero;

	public Cd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cd(String nome, float custo, Genero genero) {
		super(nome, custo);
		this.genero = genero;
		 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
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
		Cd other = (Cd) obj;
		if (genero != other.genero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cd [genero=" + genero + "]";
	}

	@Override
	public float valorFinal() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	
}
