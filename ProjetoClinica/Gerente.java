package POO_Project;
public class Gerente {

	public String nomeUsuario;
	public String senha;
	public String nome;
	public String email;
	
	public static void main(String[] args) {

		// a ideia é ter 1 gerente só
		
		Gerente gerente = new Gerente();
		
		gerente.nomeUsuario = "gerente_do_sistema";
		gerente.senha = "gerente123";
		gerente.nome = "Julia";
		gerente.email = "gerente@gmail.com";
		
		System.out.println("Nome de usuário: " + gerente.nomeUsuario);
		System.out.println("Senha: " + gerente.senha);
		System.out.println("Nome: " + gerente.nome);
		System.out.println("Email: " + gerente.email);
		
	}

}
