package entidades;

public class Pessoa2 {
	private String nome;
	private long cpf;
	private String endereco;
	private String email;
	
	public Pessoa2(){
		
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public long getCPF(){
		return cpf;
	}
	public void setCPF(long cpf){
		this.cpf = cpf;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public void setEndereco(String end){
		this.endereco = end;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
}
