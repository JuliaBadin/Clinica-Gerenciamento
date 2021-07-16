package POO_Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Procedimentos{

	public String nome;
	public String descricao;
	public Integer duracao;
	public Float valor;
	
	public static Scanner leitor = new Scanner(System.in);
	public static ArrayList<Procedimentos> listaProcedimentos = new ArrayList<Procedimentos>();//lista de clientes(objetos)

	public static void main(String[] args) {
		
		Procedimentos.cadastrarProcedimento();
		 for (Procedimentos p : listaProcedimentos) {
		  		p.getDados(); 
		      }
		// vai ter mais de 1 procedimento, então é o mesmo esquema de clientes
		
	} //endermain
	
	public static Procedimentos cadastrarProcedimento() {

		System.out.println("Informações sobre o procedimento:");
		
			Procedimentos procedimento = new Procedimentos();
			System.out.println("Nome do Procedimento:");
			procedimento.nome = leitor.nextLine();
			
			//add o cliente no arraylist
			listaProcedimentos.add(procedimento);
		leitor.close();
	return procedimento;
}
	
	public void setNomeProcedimento(String nome) {
		this.nome = nome;
	}
	
	public void setDescricaoProcedimento(String descricao) {
		this.descricao = descricao;
	}
	
	public void setNomeProcedimento(Integer duracao) {
		this.duracao = duracao;
	}
	
	public void setNomeProcedimento(Float valor) {
		this.valor = valor;
	}
	
	public void getDados() {
		System.out.println("Nome do procedimento:"+nome);
	}
}
