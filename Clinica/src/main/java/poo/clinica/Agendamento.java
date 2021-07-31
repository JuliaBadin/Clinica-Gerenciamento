package poo.clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Agendamento {
    public Integer horario; //String temporaria, depois tem que virar int
    public Cliente cliente;
    public String nomeCliente; //temporario
    public Procedimento procedimento;
    public String nomeProcedimento; //temporario
    public Boolean disponivel;
    
    public static Scanner leitor = new Scanner(System.in);

    public static ArrayList<Agendamento> horarios = new ArrayList<>();
    
    //nota: o que tá comentado nos get e set depende de ligar com outras classes
    
    public static void main(String[] args) {
        Procedimento.criar(); //nota 2: tem que criar pra testar os metodos daqui, pq toda vez que roda o codigo os arraylist zeram
        criar();
        listar();
        //deletar(); ainda tem que criar
    } //ENDMAIN

    public static void listar(){
        for (int i = 0; i < horarios.size(); i++){
            if (i == 0){
                System.out.println("\n------- LISTA DE AGENDAMENTOS -------\n");
            }

            System.out.println("Nome do cliente: " + horarios.get(i).getCliente());
            System.out.println("Nome do atendente: " + horarios.get(i).getAtendente());
            System.out.println("Procedimento: " + horarios.get(i).getProcedimento());
            System.out.println("Horário: " + horarios.get(i).getHorario());
            
            if (i != horarios.size()-1){
                System.out.println("\n****************************************\n");
            }
        }
    }
    
    public static void criar() {
        Agendamento agendamento = new Agendamento(); 

        System.out.println("Nome do cliente:"); 
        agendamento.setCliente(Cliente.nome); //tem que puxar pelo nome de usuario/id
        
        System.out.println("\nDigite o número do procedimento que deseja selecionar:");
        Procedimento.listar();
        System.out.println("\nProcedimento:");
        Integer nProced = leitor.nextInt();
        agendamento.setProcedimento(Procedimento.listaProcedimentos.get(nProced-1).getNome());
        
        System.out.println("\nDigite o número do atendente que deseja selecionar:");
        Adm.listar();
        System.out.println("\nAtendente:");
        Integer nAdm = leitor.nextInt();
        agendamento.setAtentende(Adm.listaAdm.get(nProced-1).getNome());

        System.out.println("Horário:");
        agendamento.setHorario(leitor.nextInt());

        agendamento.setDisponivel();
        
        horarios.add(agendamento);        
        Cliente.horario = agendamento;
    }
    
    public static void editar() {
        listar();
        System.out.println("\n Digite o ID do agendamento que deseja editar:");
        Integer id = leitor.nextInt();
        Agendamento agendamento = horarios.get(id-1); 
        
        //acho que não é necessário, mas se precisar de mais métodos ja ta pronto
        /*System.out.println("\nProcedimento atual: " + agendamento.getProcedimento());
        System.out.println("\nDigite o número do procedimento que deseja selecionar:");
        Agendamento.listar();
        System.out.println("\nProcedimento:");
        Integer nProced = leitor.nextInt();
        agendamento.setProcedimento(Procedimento.listaProcedimentos.get(nProced).getNome());*/

        System.out.println("\nHorário atual:" + agendamento.getHorario());
        System.out.println("Novo horário:");
        agendamento.setHorario(leitor.nextInt());

        agendamento.setDisponivel(); //tem que dar um jeito do horario anterior voltar a ficar disponivel
    }
    
    public static void deletar(){
        /*if (usuario logado é o mesmo do agendamento){
            Cliente.horario = null;
            //tem que ver o bagulho do boolean disponivel
        }*/
        
    }
    
    public Integer getHorario() {
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
        //this.cliente.nome = cliente; //pegar pelo login
        this.nomeCliente = cliente;
    }

    public void setProcedimento(String procedimento) {
        //this.procedimento.nome = procedimento;
        this.nomeProcedimento = procedimento;
    }

    public void setDisponivel() {
        this.disponivel = false;
    }
    
    public void setHorario(Integer horario) {
        this.horario = horario;
    } 

    private String getAtendente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setAtentende(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}