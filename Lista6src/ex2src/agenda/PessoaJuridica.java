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
public class PessoaJuridica extends Contato{
    private String razaoSocial;
    private String cnpj;
    private String faturamento;
    
    @Override
    public String toString(){
        String s = "Razão Social: " + razaoSocial + "\nCNPJ: " + cnpj;
        return s;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the faturamento
     */
    public String getFaturamento() {
        return faturamento;
    }

    /**
     * @param faturamento the faturamento to set
     */
    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }
}
