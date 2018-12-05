package entidades;

public class Pessoa {
	public String nome;
	public long cpf;
	public String endereco;
	public String email;
	
	public Pessoa(String nome, long cpf, String end, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = end;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Dados do Objeto Pessoa: Nome = " + nome + ", Endereco = " + endereco + ", Email = " + email;
	}
	
}
