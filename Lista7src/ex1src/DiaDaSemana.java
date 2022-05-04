/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l07ex01;

/**
 *
 * @author Guilherme
 */
public class DiaDaSemana {
    private DiasDaSemana status;
    public enum DiasDaSemana{
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO;
        }
    
    public boolean ehDiaUtil(){
        if (this.getStatus() == DiasDaSemana.SABADO || this.getStatus() == DiasDaSemana.DOMINGO){
            return false;
        }else return true;
    }

    /**
     * @return the status
     */
    public DiasDaSemana getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(DiasDaSemana status) {
        this.status = status;
    }
}
