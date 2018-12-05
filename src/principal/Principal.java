package principal;
import entidades.Pessoa;
import entidades.Pessoa2;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Edson", 321557663, "Rua das Tulipas, 300","edsonzinhopedrada@gmail.com"); 
		Pessoa2 p2 = new Pessoa2();
		System.out.println("Informações Pessoa 1: ");
		System.out.println("Nome = " + p1.nome);
		System.out.println("CPF = " + p1.cpf);
		System.out.println("Endereço = " + p1.endereco);
		System.out.println("Email = " + p1.email);
		p2.setNome("Nicholas");
		p2.setCPF(155200470);
		p2.setEndereco("Rua Einstein, 1337");
		p2.setEmail("meuemailimaginario@outlook.com");
		System.out.println("Informações Pessoa 2:");
		System.out.println("Nome = " + p2.getNome());
		System.out.println("CPF = " + p2.getCPF());
		System.out.println("Endereco = " + p2.getEndereco());
		System.out.println("Email = " + p2.getEmail());
		
		System.out.println(p1.toString());
	}

}
