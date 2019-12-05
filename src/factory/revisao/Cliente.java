package factory.revisao;

import java.util.Objects;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String data_nasc;

	public Cliente(String nome, String cpf, String dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData_nasc() {
		return data_nasc;
	}

	public void setDataNasc(String dataNasc) {
		this.data_nasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", dataNasc='" + data_nasc + '\'' +
				'}';
	}
}
