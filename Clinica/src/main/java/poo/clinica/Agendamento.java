package poo.clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Agendamento {
    public String horario; //String temporaria, depois tem que virar int
    public Cliente cliente;
    public String nomeCliente; //temporario
    public Procedimento procedimento;
    public String nomeProcedimento; //temporario
    public Boolean disponivel;
    
    public static Scanner leitor = new Scanner(System.in);

    public static ArrayList<Agendamento> horarios = new ArrayList<>();
    
    //nota: o que tá comentado é pq depende de ligar com outras classes
    
    public static void main(String[] args) {
        Agendamento.criar();
    
        for (int i = 0; i < horarios.size(); i++){
            if (i == 0){
                System.out.println("\n------- LISTA DE AGENDAMENTOS -------\n");
            }

            System.out.println("Nome do Cliente: " + horarios.get(i).getCliente());
            System.out.println("Procedimento: " + horarios.get(i).getProcedimento());
            System.out.println("Horário: " + horarios.get(i).getHorario());
            
            if (i != horarios.size()-1){
                System.out.println("\n****************************************\n");
            }
        }
    }

    public static Agendamento criar() {
        Agendamento agendamento = new Agendamento(); 

        System.out.println("Nome do cliente:");
        agendamento.setCliente(leitor.nextLine()); 

        System.out.println("Procedimento:");
        agendamento.setProcedimento(leitor.nextLine());

        System.out.println("Horário:");
        agendamento.setHorario(leitor.nextLine());

        agendamento.setDisponivel();

        horarios.add(agendamento);
        
        return agendamento;
    }
    
    
    public String getHorario() {
        return horario;
    }

    public String getCliente() {
       return nomeCliente;
       //return cliente.nome;
    }
    
    public Boolean getDisponivel() {
        return disponivel;
    }

    public String getProcedimento() {
        return nomeProcedimento;
        //return procedimento.nome;
    }
    
    
    public void setCliente(String cliente) {
        //this.cliente.nome = cliente;
        this.nomeCliente = cliente;
    }

    public void setProcedimento(String procedimento) {
        //this.procedimento.nome = procedimento;
        this.nomeProcedimento = procedimento;
    }

    public void setDisponivel() {
        this.disponivel = false;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
