package poo.clinica;
import java.util.Scanner;

public class MenuGerente{
    public static Scanner leitor = new Scanner(System.in);
    static Integer opcao;
    
    
    public static void main(String[] args) {
        
        menuGerente();
        
        switch(opcao){
            case 1:
                //logout();
                break;
            case 2:
                Adm.listar();
                Cliente.listar();
                menuGerente();
                break;
            case 3:
                boolean valido = false;
                do{
                    System.out.println("Se quiser deletar um cliente digite C, se quiser deletar um admnistrador digite A");
                    if("C".equals(leitor.nextLine())){
                        Cliente.deletar();
                        valido = true;
                    } else if("A".equals(leitor.nextLine())){
                        Adm.deletar();
                        valido = true;
                    } else {
                        System.out.println("Valor inválido");
                    }
                }while(valido == false);
                
                menuGerente();
                break;
            case 4:
                Adm.cadastrar();
                menuGerente();
                break;
            case 5:
                Procedimento.criar();
                menuGerente();
                break;
            case 6:
                Procedimento.editar();
                menuGerente();
                break;
            
        }
    }
    
    public static void menuGerente(){
        System.out.println("********** MENU **********");
        System.out.println("1- Logout");
        System.out.println("2- Listar usuários"); //OK
        System.out.println("3- Deletar usuário"); //OK mas tem que conferir o login
        System.out.println("4- Cadastrar Administrador"); //OK
        System.out.println("5- Criar procedimento"); //OK
        System.out.println("6- Editar procedimento"); //OK

        opcao = leitor.nextInt();
    }
            
}