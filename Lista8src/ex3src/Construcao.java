/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l08ex02;

/**
 *
 * @author Guilherme
 */
public abstract class Construcao implements CarbonFootprint{
    private int nPessoas;
    private boolean usaEnergiaRenovavel;
    private int nLampadas;
    private boolean usaArCondicionado;
    
    @Override
    public float getCarbonFootprint(){
        if (!isUsaEnergiaRenovavel()){
            return (float)((getnLampadas()+getnPessoas())*0.7);
        }else {
            System.out.println("Essa construcao usa energia renovavel");
            return 0;
        }
    }

    /**
     * @return the nPessoas
     */
    public int getnPessoas() {
        return nPessoas;
    }

    /**
     * @param nPessoas the nPessoas to set
     */
    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    /**
     * @return the usaEnergiaRenovavel
     */
    public boolean isUsaEnergiaRenovavel() {
        return usaEnergiaRenovavel;
    }

    /**
     * @param usaEnergiaRenovavel the usaEnergiaRenovavel to set
     */
    public void setUsaEnergiaRenovavel(boolean usaEnergiaRenovavel) {
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
    }

    /**
     * @return the nLampadas
     */
    public int getnLampadas() {
        return nLampadas;
    }

    /**
     * @param nLampadas the nLampadas to set
     */
    public void setnLampadas(int nLampadas) {
        this.nLampadas = nLampadas;
    }
}
