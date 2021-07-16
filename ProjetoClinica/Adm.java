package POO_Project;
import java.util.Scanner;

public class Adm {

	public String nomeUsuario;
	public String senha;
	public String nome;
	public String email;
	public String telefone;
	
	public static void main(String[] args) {
		
		// a ideia é ter 1 adm só
		
		Adm administrador = new Adm();
		Scanner sc = new Scanner(System.in);
		
		administrador.nomeUsuario = sc.nextLine();
		administrador.senha = sc.nextLine();
		administrador.nome = sc.nextLine();
		administrador.email = sc.nextLine();
		administrador.telefone = sc.nextLine();
		
		sc.close();
		
		System.out.println("Nome completo: " + administrador.nome);
		System.out.println("Nome de usuário: " + administrador.nomeUsuario);
		System.out.println("Senha: " + administrador.senha);
		System.out.println("Email: " + administrador.email);
		System.out.println("Telefone: " + administrador.telefone);
		
	}

}
