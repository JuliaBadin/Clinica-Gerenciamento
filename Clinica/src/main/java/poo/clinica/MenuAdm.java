package poo.clinica;
import java.util.Scanner;

public class MenuAdm{
    public static Scanner leitor = new Scanner(System.in);
    static Integer opcao;
    
//modificar dados
            
    public static void main(String[] args) {
        
        menuAdm();
        
        switch(opcao){
            case 1:
                //logout();
                break;
            case 2:
                Cliente.listar();
                menuAdm();
                break;
            case 3:
                Adm.editar();
                menuAdm();
                break;
            case 4:
                //Agenda.listar();
                menuAdm();
                break;
            case 5:
                //Relatorio.criar();
                menuAdm();
                break;
            case 6:
                //Relatorio.editar();
                menuAdm();
                break;
            
        }
    }
    
    public static void menuAdm(){
        System.out.println("********** MENU **********");
        System.out.println("1- Logout");
        System.out.println("2- Listar clientes"); //OK
        System.out.println("3- Editar infos pessoais"); //OK
        System.out.println("4- Ver agenda");
        System.out.println("5- Criar relatório");
        System.out.println("6- Editar relatório");

        opcao = leitor.nextInt();
    }
            
}