package POO_Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Relatorios {

	public String nomeCliente;
//	public Cliente cliente;
	public String conteudo;
	public String dataConsulta;
	public Integer id=0;
	
	public static Scanner leitor = new Scanner(System.in);
	public static ArrayList<Relatorios> listaRelatorios = new ArrayList<Relatorios>();
	
	public static void main(String[] args) {

		// o id é com auto incremento
		Relatorios.criarRelatorio();
		Relatorios.criarRelatorio();
		 for (Relatorios r : listaRelatorios) {
		  		r.getRelatorio(); 
		      }
		 //nota: trocar os for por toString
		
	} 
	//fazer id 
	
	public static Relatorios criarRelatorio() {
		Relatorios relatorio = new Relatorios(); 
		System.out.println("Nome do cliente:");
		relatorio.setNomeCliente(leitor.nextLine()); 
		System.out.println("Relatório:");
		relatorio.setConteudo(leitor.nextLine());
		System.out.println("Data do procedimento:");
		relatorio.setDataConsulta(leitor.nextLine());
//		relatorio.id++;
		listaRelatorios.add(relatorio);
		return relatorio;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
//	public void setId(Integer id) {
//		this.id = id;
//	}
	
	
	public void getRelatorio() {
		System.out.println("Relatório n°"+id);
		System.out.println("Nome do cliente:"+nomeCliente);
		System.out.println(conteudo);
		System.out.println("Data do procedimento:"+dataConsulta);
	}
}
