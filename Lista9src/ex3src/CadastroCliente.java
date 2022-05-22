/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09ex03;

/**
 *
 * @author Guilherme
 */
public class CadastroCliente {
    private Cliente[] clientes = new Cliente[10];
    private int index = 0;
    
    public void inserir(Cliente novoCliente){
        if (index >= 9){
            throw new RepositorioException("Numero maximo de clientes ja foi atingido.");
        }
        for (Cliente e : clientes){
            if(e.getCpf() == novoCliente.getCpf()){
                throw new ClienteJaExistenteException("Esse cliente ja foi cadastrado antes.");
            }
        }
        clientes[index] = novoCliente;
        index += 1;
    }
    public Cliente buscar(Cliente c){
        for (Cliente e : clientes){
            if (e.getCpf() == c.getCpf()){
                return e;
            }
        }
        throw new ClienteInexistenteException("Cadastro nao encontrado.");
    }
}
