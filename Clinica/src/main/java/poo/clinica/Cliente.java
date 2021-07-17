package poo.clinica;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    public String cidade;
    public String nome;
    public String sobrenome;
    public String telefone;
    public String dataNascimento;
    public String sexoBiologico;
    public String rg;
    public String cpf;
    public String remedios;
    public String nomeUsuario; //único, funcionará como id
    public String senha;
    //não sei se agendamento tem que ser array ou atributo, pq normalmente só marcamos 1 horário por vez
    public static ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

            Cliente.cadastrar();

            for (int i = 0; i < listaClientes.size(); i++){
                
                if (i == 0){
                    System.out.println("\n------- LISTA DE CLIENTES -------\n");
                }
                System.out.println("Cliente nº: " + (i+1));
                System.out.println("Nome completo: " + listaClientes.get(i).getNome() + " " + listaClientes.get(i).getSobrenome());
                System.out.println("Data de Nascimento: " + listaClientes.get(i).getDataNascimento());
                System.out.println("Cidade: " + listaClientes.get(i).getCidade());
                System.out.println("Telefone: " + listaClientes.get(i).getTelefone());
                System.out.println("CPF: " + listaClientes.get(i).getCpf());
                System.out.println("RG: " + listaClientes.get(i).getRg());
                System.out.println("Sexo Biológico: " + listaClientes.get(i).getSexo());
                System.out.println("Remédios que usa com frequência: " + listaClientes.get(i).getRemedios());
                System.out.println("Nome de Usuário: " + listaClientes.get(i).getNomeUsuario());
                System.out.println("Senha: " + listaClientes.get(i).getSenha());
                
                if (i != listaClientes.size()-1){
                    System.out.println("\n****************************************\n");
                }
            }

    }//end main

public static Cliente cadastrar() {
        System.out.println("Cadastro de Clientes da Clinica");

        Cliente client = new Cliente();
        
        System.out.println("Nome do cliente:");
        client.setNome(leitor.nextLine());

        System.out.println("Sobrenome:");
        client.setSobrenome(leitor.nextLine());

        System.out.println("Data de nascimento -no formato xx/xx/xxxx-:");
        client.setdataNascimento(leitor.nextLine());

        System.out.println("RG:");
        client.setRg(leitor.nextLine());

        System.out.println("CPF:");
        client.setCpf(leitor.nextLine());

        System.out.println("Telefone:");
        client.setTelefone(leitor.nextLine());

        System.out.println("Sexo biológico:");
        client.setSexo(leitor.nextLine());

        System.out.println("Cidade:");
        client.setCidade(leitor.nextLine());

        System.out.println("Remédios usados com frequência:");
        client.setRemedios(leitor.nextLine());

        System.out.println("Nome de usuário:");
        client.setNomeUsuario(leitor.nextLine());
        
        System.out.println("Senha:");
        client.setSenha(leitor.nextLine());

        listaClientes.add(client);
        
    return client;
  }


//SETTER
    public void setNome(String nome) {
            this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
    }

    public void setdataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
    }

    public void setRg(String rg) {
            this.rg = rg;
    }

    public void setCpf(String cpf) {
            this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
            this.telefone = telefone;
    }

    public void setSexo(String sexoBiologico) {
            this.sexoBiologico = sexoBiologico;
    }

    public void setCidade(String cidade) {
            this.cidade = cidade;
    }

    public void setRemedios(String remedios) {
            this.remedios = remedios;
    }

    public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
    }

    public void setSenha(String senha) {
            this.senha = senha;
    }
    
    
//GETTER
    public String getCidade() {
        return cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexoBiologico;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRemedios() {
        return remedios;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }
}//end class