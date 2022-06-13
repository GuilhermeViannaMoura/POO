/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09ex03;

/**
 *
 * @author Guilherme
 */
public class CadastroCliente extends ClienteArquivo{
    private Cliente[] clientes = new Cliente[10];
    private int index = 0;
    
    @Override
    public void inserir(Cliente novoCliente){
        if (index >= 9){
            throw new RepositorioException("Numero maximo de clientes ja foi atingido.");
        }
        for (Cliente e : clientes){
            if(e.getCpf() == novoCliente.getCpf()){
                throw new ClienteJaExistenteException("Esse cliente ja foi cadastrado antes.");
            }
        }
        super.inserir(novoCliente);
        clientes[index] = novoCliente;
        index += 1;
        System.out.println("Cliente cadastrado com sucesso!");
    }
    public Cliente buscar(Cliente c){
        c = super.buscaPorCPF(c.getCpf());
        if (c == null){
            throw new ClienteInexistenteException("Cadastro nao encontrado.");
        }else return c;
    }
    @Override
    public void listar(){
        super.listar();
    }
    @Override
    public void excluir(int cpf){
        super.excluir(cpf);
    }
}
