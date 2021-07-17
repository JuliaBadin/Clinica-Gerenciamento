package poo.clinica;
import java.util.Scanner;
import java.util.ArrayList;

public class Adm {

	public String nomeUsuario;
	public String senha;
	public String nome;
	public String email;
	public String telefone;
	
        public static ArrayList<Adm> listaAdm = new ArrayList<>(); //acho que não vai ser necessário um array pq a intenção é ter só 1 adm
        
	public static void main(String[] args) {
		
            Adm administrador = new Adm();
            Scanner leitor = new Scanner(System.in);

            System.out.println("Nome de Usuário: ");
            administrador.setNomeUsuario(leitor.nextLine());
            System.out.println("Senha: ");
            administrador.setSenha(leitor.nextLine());
            System.out.println("Nome Completo: ");
            administrador.setNome(leitor.nextLine());
            System.out.println("Email: ");
            administrador.setEmail(leitor.nextLine());
            System.out.println("Telefone: ");
            administrador.setTelefone(leitor.nextLine());

            leitor.close();

            listaAdm.add(administrador);
            
            System.out.println("Nome completo: " + listaAdm.get(0).getNome());
            System.out.println("Nome de usuário: " + listaAdm.get(0).getNomeUsuario());
            System.out.println("Senha: " + listaAdm.get(0).getSenha());
            System.out.println("Email: " + listaAdm.get(0).getEmail());
            System.out.println("Telefone: " + listaAdm.get(0).getTelefone());
	} //end main

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}