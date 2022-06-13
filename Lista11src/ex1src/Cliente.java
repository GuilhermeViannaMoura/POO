/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09ex03;

/**
 *
 * @author Guilherme
 */
public class Cliente {
    private String nome;
    private int cpf;
    private String endereco;
    
    public Cliente(String nome, int cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) { //|| !(nome.getClass().getSimpleName()).equals("String")
        if (nome.isBlank()){
            throw new DadoInvalidoException("Entrada de nome invalida.");
        }
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        if (cpf < 0){
            throw new DadoInvalidoException("Entrada de cpf invalida.");
        }
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        if (nome.isBlank()){
            throw new DadoInvalidoException("Entrada de endereco invalida.");
        }
        this.endereco = endereco;
    }
    
    
}
