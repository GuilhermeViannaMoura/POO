/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrorecebimentos;

/**
 *
 * @author Guilherme
 */
public class Servico implements Recebivel{
    private String descricao;
    private int horas;
    private double precoHora;
    
    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }
    
    @Override
    public String toString(){
        return ("Descricao: "+descricao+"\n"+
                "Horas: "+horas+"\n"+
                "Preco da hora: "+precoHora
                );
    }
    
    @Override
    public double totalizarReceita() {
        return horas*precoHora;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the precoHora
     */
    public double getPrecoHora() {
        return precoHora;
    }

    /**
     * @param precoHora the precoHora to set
     */
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    
}
