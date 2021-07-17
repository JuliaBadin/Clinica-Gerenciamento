package poo.clinica;

public class Gerente {

	public String nomeUsuario;
	public String senha;
	public String nome;
	public String email;
	
	public static void main(String[] args) {

		// a ideia é ter 1 gerente só
		
            Gerente gerente = new Gerente();

            gerente.setNomeUsuario("Gerente_Oficial");
            gerente.setSenha("gerente123");
            gerente.setNome("Fulano Gerente");
            gerente.setEmail("gerente@java.com");

            System.out.println("Nome de usuário: " + gerente.getNomeUsuario());
            System.out.println("Senha: " + gerente.getSenha());
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("Email: " + gerente.getEmail());	
	} //end main

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}