package l09ex03;

import java.util.Scanner;

/**
 *
 * @author guivm
 */
public class TelaCliente {
    CadastroCliente cc = new CadastroCliente();
    public void criaMenu(){
        System.out.println("1 - Cadastrar novo cliente");
        System.out.println("2 - Buscar cliente pelo nome");
        System.out.println("3 - Buscar cliente pelo cpf");
        System.out.println("4 - Excluir cliente");
        System.out.println("5 - Listar clientes");
        Scanner teclado = new Scanner(System.in);
        int resp = teclado.nextInt();
        
        if (resp == 1){
            System.out.println("Insira os dados do cliente:");
            System.out.println("Nome:");
            String nome = teclado.nextLine();
            System.out.println("CPF:");
            int cpf = teclado.nextInt();
            System.out.println("Endereço:");
            String endereco = teclado.nextLine();
            Cliente cliente = new Cliente(nome,cpf,endereco);
            cc.inserir(cliente);
        }else if(resp == 2){
            System.out.println("Nome:");
            String nome = teclado.nextLine();
            Cliente cliente = cc.buscaPorNome(nome);
            System.out.println("Resultado da busca:");
            System.out.println("Nome: "+ cliente.getNome());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Endereco: "+ cliente.getEndereco());
        }else if(resp == 3){
            // IMPLEMENTAR METODO DE EXCLUIR
            System.out.println("CPF:");
            int cpf = teclado.nextInt();
            Cliente cliente = cc.buscaPorCPF(cpf);
            System.out.println("Resultado da busca:");
            System.out.println("Nome: "+ cliente.getNome());
            System.out.println("CPF: "+ cliente.getCpf());
            System.out.println("Endereco: "+ cliente.getEndereco());
        }else if(resp == 4){
            System.out.println("Falha ao excluir cadastro");
        }else if(resp == 5){
            cc.listar();
        }
    }
}
