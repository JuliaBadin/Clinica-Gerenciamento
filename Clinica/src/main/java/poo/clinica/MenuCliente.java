package poo.clinica;
import java.util.Scanner;

public class MenuCliente{
    public static Scanner leitor = new Scanner(System.in);
    static Integer opcao;
            
    public static void main(String[] args) {
        
        menuCliente();
        
        switch(opcao){
            case 1:
                //logout();
                break;
            case 2:
                //Relatorio.listar();
                menuCliente();
                break;
            case 3:
                Cliente.editar();
                menuCliente();
                break;
            case 4:
                Cliente.verHorario();
                menuCliente();
                break;
            case 5:
                Agendamento.criar();
                menuCliente();
                break;
            case 6:
                Agendamento.editar();
                menuCliente();
                break;   
            case 7:
                Agendamento.deletar();
                menuCliente();
                break;   
            case 8:
                Cliente.deletar();
                menuCliente();
                break;
            
        }
    }
    
    public static void menuCliente(){
        System.out.println("********** MENU **********");
        System.out.println("1- Logout");
        System.out.println("2- Listar relatórios");
        System.out.println("3- Editar infos pessoais"); //OK
        System.out.println("4- Ver horários"); //OK
        System.out.println("5- Agendar horário"); // +/- tem que pensar nos arrayslist (nota 2 da classe agendamento)
        System.out.println("6- Remarcar horário");
        System.out.println("7- Desmarcar horário"); //tá incompleto
        System.out.println("8- Deletar cadastro"); //OK mas tem que conferir o login

        opcao = leitor.nextInt();
    }
            
}