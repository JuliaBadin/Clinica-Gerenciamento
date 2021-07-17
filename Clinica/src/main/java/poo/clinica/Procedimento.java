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

        Procedimento.cadastrar();
        Procedimento.cadastrar();

        for (int i = 0; i < listaProcedimentos.size(); i++){
            if (i == 0){
                System.out.println("\n------- LISTA DE PROCEDIMENTOS -------\n");
            }
            System.out.println("Nome: " + listaProcedimentos.get(i).getNome());
            System.out.println("Descrição: " + listaProcedimentos.get(i).getDescricao());
            System.out.println("Duração: " + listaProcedimentos.get(i).getDuracao());
            System.out.println("Valor: R$" + listaProcedimentos.get(i).getValor());

            if (i != listaProcedimentos.size()-1){
                System.out.println("\n****************************************\n");
            }
        }

    } //endermain

    public static Procedimento cadastrar() {

        System.out.println("Informações sobre o procedimento:");

            Procedimento procedimento = new Procedimento();
            
            System.out.println("Nome:"); //não ta lendo no 2º cadastrar
            procedimento.setNome(leitor.nextLine());
            
            System.out.println("Descrição:");
            procedimento.setDescricao(leitor.nextLine());
            
            System.out.println("Duração:");
            procedimento.setDuracao(leitor.nextInt());
            
            System.out.println("Valor: -no formato XX,xx-");
            procedimento.setValor(leitor.nextDouble());

            listaProcedimentos.add(procedimento);
                
    return procedimento;
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