/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l05ex03;

import participante.Participante;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Palestra {
    private String titulo;
    private String nomePalestrante;
    private String local;
    private String data;
    private String horario;
    private String prazoDuracao;
    private int maxInscritos;
    //private Participante inscritos[] = new Participante[maxInscritos];
    private ArrayList<Participante> inscritos = new ArrayList<Participante>();
    private int nInscritos = 0;
    
    public Palestra(String titulo,String nomePalestrante,String local,String data,String horario,String prazoDuracao,int maxInscritos){
        this.titulo = titulo;
        this.nomePalestrante = nomePalestrante;
        this.local = local;
        this.data = data;
        this.horario = horario;
        this.prazoDuracao = prazoDuracao;
        this.maxInscritos = maxInscritos;
    }
    
    public void addParticipante(Participante p){
        if (nInscritos<maxInscritos){
            inscritos.add(p);
            nInscritos++;
        }else {
            System.out.println(titulo + " está sem vagas restando.");
        }
    }
    
    public void consultaVagas(){
        System.out.println("Vagas restantes em "+titulo+": "+(maxInscritos-nInscritos));
    }
    
    public void imprimeDados(){
        System.out.println("\n---"+titulo+"---\n\n"
                +"Palestrante: "+ nomePalestrante+"\n"
                +"Local: "+ local+"\n"
                +"Data: "+ data+"\n"
                +"Horario: "+ horario+"\n"
                +"Duração: "+ prazoDuracao+"\n"
                );
        System.out.println("Participantes de "+titulo);
        for (int i=0;i<inscritos.size();i++){
            System.out.println(inscritos.get(i).getNome());
        }
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the nomePalestrante
     */
    public String getNomePalestrante() {
        return nomePalestrante;
    }

    /**
     * @param nomePalestrante the nomePalestrante to set
     */
    public void setNomePalestrante(String nomePalestrante) {
        this.nomePalestrante = nomePalestrante;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
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
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the prazoDuracao
     */
    public String getPrazoDuracao() {
        return prazoDuracao;
    }

    /**
     * @param prazoDuracao the prazoDuracao to set
     */
    public void setPrazoDuracao(String prazoDuracao) {
        this.prazoDuracao = prazoDuracao;
    }

    /**
     * @return the maxInscritos
     */
    public int getMaxInscritos() {
        return maxInscritos;
    }

    /**
     * @param maxInscritos the maxInscritos to set
     */
    public void setMaxInscritos(int maxInscritos) {
        this.maxInscritos = maxInscritos;
    }
}