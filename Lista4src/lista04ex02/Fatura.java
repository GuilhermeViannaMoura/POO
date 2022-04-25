/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista04ex02;

/**
 *
 * @author Guilherme
 */
public class Fatura {
    private String data;
    private int valorTotal;
    private String nomeDoCliente;
    private String marcacao;
    
    public Fatura(String data, int valorTotal){
        this.data = data;
        this.valorTotal = valorTotal;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the valorTotal
     */
    public int getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the nomeDoCliente
     */
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    /**
     * @param nomeDoCliente the nomeDoCliente to set
     */
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    /**
     * @return the marcacao
     */
    public String getMarcacao() {
        return marcacao;
    }

    /**
     * @param marcacao the marcacao to set
     */
    public void setMarcacao(String marcacao) {
        this.marcacao = marcacao;
    }
}
