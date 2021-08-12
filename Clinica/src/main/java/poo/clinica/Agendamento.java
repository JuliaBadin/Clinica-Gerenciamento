package poo.clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Agendamento {
    public Double horario;
    public static Cliente cliente;
    public static Adm atendente;
    public static Procedimento procedimento;
    
    public static Scanner leitor = new Scanner(System.in);

    public static ArrayList<Agendamento> horarios = new ArrayList<>();
        
    public static void main(String[] args) {
        Adm.cadastrar();
        Cliente.cadastrar();
        Procedimento.criar();
        criar();
        listar();
        editar();
        listar();
        System.out.println(Adm.getListaHorarios());
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

        System.out.println("Nome do cliente:" + cliente.nome); 
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
        agendamento.setAtentende(Adm.listaAdm.get(nAdm-1).getNome());

        System.out.println("\nHorarios Disponiveis:");
        System.out.println(Adm.getListaHorarios());
        System.out.println("\nDigite o horário que deseja no formato hh.mm:");
        Double horaEscolhida = leitor.nextDouble();
        agendamento.setHorario(horaEscolhida);
        for (Horario horario : Adm.listaAdm.get(nAdm-1).getListaHorarios()){
            if(horaEscolhida.equals(horario.horario)){
                //Adm.listaHorarios.disponivel = false;
                if(procedimento.duracao <= 30){
                    horario.disponivel = false;
                } else if(procedimento.duracao <= 60){
                    horario.disponivel = false; 
                    horario.disponivel = false; //+1
                } else if(procedimento.duracao <= 90){
                    horario.disponivel = false; 
                    horario.disponivel = false; //+1
                    horario.disponivel = false; //+2
                } else if(procedimento.duracao <= 120){
                    horario.disponivel = false; 
                    horario.disponivel = false; //+1
                    horario.disponivel = false; //+2
                    horario.disponivel = false; //+3
                } else if(procedimento.duracao <= 150){
                    horario.disponivel = false; 
                    horario.disponivel = false; //+1
                    horario.disponivel = false; //+2
                    horario.disponivel = false; //+3
                    horario.disponivel = false; //+4
                } else if(procedimento.duracao <= 180){
                    horario.disponivel = false; 
                    horario.disponivel = false; //+1
                    horario.disponivel = false; //+2
                    horario.disponivel = false; //+3
                    horario.disponivel = false; //+4
                    horario.disponivel = false; //+5
                }
            }
        }
        
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
        Double horaEscolhida = leitor.nextDouble();
        agendamento.setHorario(horaEscolhida);
        
        for (Horario horario : agendamento.atendente.getListaHorarios()){
            if(horaEscolhida.equals(horario.horario)){
                horario.disponivel = true;
            }
        }

    }
    
    public static void deletar(){
        /*if (usuario logado é o mesmo do agendamento){
            listar();
            System.out.println("\n Digite o ID do agendamento que deseja excluir:");
            Integer id = leitor.nextInt();
            Agendamento agendamento = horarios.get(id-1); 
            agendamento.atendente.disponivel = true;
            cliente = null;
        }*/
        
    }
    
    public Double getHorario() {
        return horario;
    }

    public String getCliente() {
       return Cliente.nome;
    }
    

    public String getProcedimento() {
        return procedimento.nome;
    }
    
    public String getAtendente() {
        return atendente.nome;
    }
    
    public void setCliente(String cliente) {
        Cliente.nome = cliente;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento.nome = procedimento; //diz que this.procedimento é nulo
    }
    
    public void setHorario(Double horario) {
        this.horario = horario;
    } 

    public void setAtentende(String atendente) {
        this.atendente.nome = atendente;
    }
}