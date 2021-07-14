package POO_Project;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Cliente {

	public String cidade;
	public String nome;
	public String sobrenome;
	public String telefone;
	public String dataNascimento;
	public String sexoBiologico;
	public String rg;
	public String cpf;
	public String remedios;
	public String nomeUsuario;
	public String senha;
	public Integer id;
	
	public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();//lista de clientes(objetos)
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//acho que tem que inserir os dados por um for pra ter um contador e não
		//sobrepor em outros clientes
		 
		Cliente.cadastrarCliente();
		System.out.println(listaClientes.size());
		
		  //printando os dados
		  	  for (Cliente c : listaClientes) {
		  		c.getDados(); 
		      }

	}//enderman 
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setdataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setSexo(String sexoBiologico) {
		this.sexoBiologico = sexoBiologico;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setRemedios(String remedios) {
		this.remedios = remedios;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void getDados() {
		System.out.println("Dados do Cliente: ");
		System.out.println("Nome: "+nome+" "+sobrenome);
//		System.out.println("RG: "+rg);
//		System.out.println("CPF: "+cpf);
//		System.out.println("Data de nascimento: "+dataNascimento);
//		System.out.println("Sexo biológico: "+sexoBiologico);
//		System.out.println("Cidade: "+cidade);
//		System.out.println("Telefone: "+telefone);
//		System.out.println("Remédios: "+remedios);
//		System.out.println("Nome de usuário: "+nomeUsuario);
	}
	
	public static Cliente cadastrarCliente() {

			System.out.println("Cadastro de Clientes da Clinica");
			
				Cliente client = new Cliente();
				System.out.println("Nome do cliente:");
//				String nome = leitor.nextLine();
				client.setNome(leitor.nextLine());
				
				System.out.println("Sobrenome:");
//				String sobrenome = leitor.nextLine();
				client.setSobrenome(leitor.nextLine());
				
//				System.out.println("Data de nascimento:");
//				String dataNascimento = leitor.nextLine();
//				client.setdataNascimento(dataNascimento);
//				
//				System.out.println("RG:");
//				String rg = leitor.nextLine();
//				client.setRg(rg);
//				
//				System.out.println("CPF:");
//				String cpf = leitor.nextLine();
//				client.setCpf(cpf);
//				
//				System.out.println("Telefone:");
//				String telefone = leitor.nextLine();
//				client.setTelefone(telefone);
//				
//				System.out.println("Sexo biológico:");
//				String sexo = leitor.nextLine();
//				client.setSexo(sexo);
//				
//				System.out.println("Cidade:");
//				String cidade = leitor.nextLine();
//				client.setCidade(cidade);
//				
//				System.out.println("Remédios usados com frequência:");
//				String remedio = leitor.nextLine();
//				client.setRemedios(remedio);
//				
//				System.out.println("Nome de usuário:");
//				String nomeUsuario = leitor.nextLine();
//				client.setNomeUsuario(nomeUsuario);
				 
				//add o cliente no arraylist
				listaClientes.add(client);
			leitor.close();
		return client;
  }
	
}

