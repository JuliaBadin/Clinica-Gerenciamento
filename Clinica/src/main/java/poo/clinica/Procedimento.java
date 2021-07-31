package poo.clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Procedimento{

    public String nome;
    public String descricao;
    public Integer duracao;
    public Double valor;

    public static ArrayList<Procedimento> listaProcedimentos = new ArrayList<>();

    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        
    } //endermain

    public static void criar() {
        System.out.println("Informações sobre o procedimento:");

            Procedimento procedimento = new Procedimento();
            
            System.out.println("Nome:");
            procedimento.setNome(leitor.nextLine());
            
            System.out.println("Descrição:");
            procedimento.setDescricao(leitor.nextLine());
            
            System.out.println("Duração:");
            procedimento.setDuracao(leitor.nextInt());
            
            System.out.println("Valor: -no formato XX,xx-");
            procedimento.setValor(leitor.nextDouble());
            
            listaProcedimentos.add(procedimento);                
    }
    
    public static void editar() {
        listar();
        
        System.out.println("\n\n Digite o ID do procedimento que deseja editar:\n");

        Integer id = leitor.nextInt();
        
        Procedimento procedimento = listaProcedimentos.get(id);
            
            System.out.println("Novo nome:");
            procedimento.setNome(leitor.nextLine());
            
            System.out.println("Nova descrição:");
            procedimento.setDescricao(leitor.nextLine());
            
            System.out.println("Nova duração:");
            procedimento.setDuracao(leitor.nextInt());
            
            System.out.println("Novo valor: -no formato XX,xx-");
            procedimento.setValor(leitor.nextDouble());
    }
    
    public static void listar(){
        for (int i = 0; i < listaProcedimentos.size(); i++){
            if (i == 0){
                System.out.println("\n------- LISTA DE PROCEDIMENTOS -------\n");
            }
            System.out.println("ID: " + (i+1));
            System.out.println("Nome: " + listaProcedimentos.get(i).getNome());
            System.out.println("Descrição: " + listaProcedimentos.get(i).getDescricao());
            System.out.println("Duração: " + listaProcedimentos.get(i).getDuracao());
            System.out.println("Valor: R$" + listaProcedimentos.get(i).getValor());

            if (i != listaProcedimentos.size()-1){
                System.out.println("\n****************************************\n");
            }
        }
    }

    public void setNome(String nome) {
            this.nome = nome;
    }
    public void setDescricao(String descricao) {
            this.descricao = descricao;
    }
    public void setDuracao(Integer duracao) {
            this.duracao = duracao;
    }
    public void setValor(Double valor) {
            this.valor = valor;
    }

    
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public Integer getDuracao() {
        return duracao;
    }
    public Double getValor() {
        return valor;
    }
}