package poo.clinica;
import java.util.Scanner;
import java.util.ArrayList;

public class Adm extends Horario{

	String nomeUsuario;
	private String senha;
	public String nome;
	String email;
	String telefone;
        
        static ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();
        static ArrayList<Adm> listaAdm = new ArrayList<>();
        
        static Scanner leitor = new Scanner(System.in);
        
	public static void main(String[] args) {
            cadastrar();
            editar();
            deletar();

	} //end main


    public static void listar(){
        for (int i = 0; i < listaAdm.size(); i++){
            if (i == 0){
                System.out.println("\n------- LISTA DE ADMINISTRADORES -------\n");
            }
            System.out.println("Adm nº: " + (i+1));
            System.out.println("Nome completo: " + listaAdm.get(i).getNome());
            System.out.println("Nome de usuário: " + listaAdm.get(i).getNomeUsuario());
            System.out.println("Senha: " + listaAdm.get(i).getSenha());
            System.out.println("Email: " + listaAdm.get(i).getEmail());
            System.out.println("Telefone: " + listaAdm.get(i).getTelefone());

            if (i != listaAdm.size()-1){
                System.out.println("\n****************************************\n");
            }
        }
    }
    
    public static void cadastrar(){
        Adm administrador = new Adm();
        
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
                
        listaAdm.add(administrador);
    }
    
    public static void deletar(){
    listar(); 
    System.out.println("\n Digite o ID do administrador que deseja deletar:");
        
    Integer id = leitor.nextInt();
    listaAdm.remove(id-1);
}
    
    public static void editar() {        
        Adm adm = listaAdm.get(0); //aqui tem que definir o id pelo login
            
        System.out.println("\nNome de usuário atual: " + adm.getNomeUsuario());
        System.out.println("Novo nome de usuário:");
        adm.setNomeUsuario(leitor.nextLine());

        System.out.println("\nSenha atual: " + adm.getSenha());
        System.out.println("Nova senha:");
        adm.setSenha(leitor.nextLine());

        System.out.println("\nEmail atual: " + adm.getEmail());
        System.out.println("Novo email:");
        adm.setEmail(leitor.nextLine());

        System.out.println("\nTelefone atual: " + adm.getTelefone());
        System.out.println("Novo telefone:");
        adm.setTelefone(leitor.nextLine());
    }
    
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