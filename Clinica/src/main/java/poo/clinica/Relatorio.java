package poo.clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Relatorio {

    public Cliente cliente;
    public String nomeCliente; //temporario
    public String conteudo;
    public String dataConsulta;
    public Integer id=0; // na próxima etapa botar como auto incremento

    public static Scanner leitor = new Scanner(System.in);
    public static ArrayList<Relatorio> listaRelatorios = new ArrayList<>();

    public static void main(String[] args) {

            Relatorio.criar();
            Relatorio.criar();

        for (int i = 0; i < listaRelatorios.size(); i++){
            if (i == 0){
                System.out.println("\n------- LISTA DE RELATÓRIOS -------\n");
            }
            //System.out.println("Relatório nº: " + listaRelatorios.get(i).getId());
            System.out.println("Relatório nº: " + (i+1));
            System.out.println("Nome do Cliente: " + listaRelatorios.get(i).getNomeCliente());
            System.out.println("Data da Consulta: " + listaRelatorios.get(i).getDataConsulta());
            System.out.println("Conteúdo: " + listaRelatorios.get(i).getConteudo());
            
            if (i != listaRelatorios.size()-1){
                System.out.println("\n****************************************\n");
            }
        }
             //nota: trocar os for por toString

    } 

    public static Relatorio criar() {
        Relatorio relatorio = new Relatorio(); 

        System.out.println("Nome do cliente:");
        relatorio.setNomeCliente(leitor.nextLine()); 

        System.out.println("Conteúdo:");
        relatorio.setConteudo(leitor.nextLine());

        System.out.println("Data do procedimento:");
        relatorio.setDataConsulta(leitor.nextLine());

        //relatorio.id++;

        listaRelatorios.add(relatorio);
        return relatorio;
    }
    

    public void setNomeCliente(String nomeCliente) {
        //this.cliente.nome = nomeCliente;
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
    

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public Integer getId() {
        return id;
    }
}