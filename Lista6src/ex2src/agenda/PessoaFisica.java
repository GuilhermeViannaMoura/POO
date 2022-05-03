/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Aluno
 */
public class PessoaFisica extends Contato {
    private String nome;
    private String cpf;
    private String dataAnv;
    
    @Override
    public String toString(){
        String s = "Nome: "+ nome + "\nCPF: " + cpf;
        return s;
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
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataAnv
     */
    public String getDataAnv() {
        return dataAnv;
    }

    /**
     * @param dataAnv the dataAnv to set
     */
    public void setDataAnv(String dataAnv) {
        this.dataAnv = dataAnv;
    }
}
