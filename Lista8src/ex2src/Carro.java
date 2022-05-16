/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l08ex02;

/**
 *
 * @author Guilherme
 */
public class Carro implements CarbonFootprint{
    private String combustivel;
    private float tamanhoTanque;// em litro
    private float cilindrada;
    
    @Override
    public float getCarbonFootprint(){
        if (getCombustivel() == "Gasolina"){
            return (float)(getTamanhoTanque()*2.3);
        }else if(getCombustivel() == "Diesel"){
            return (float)(getTamanhoTanque()*2.7);
        }else {
            System.out.println("Nao foi possivel calcular.");
            return 0;
        }
        
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the tamanhoTanque
     */
    public float getTamanhoTanque() {
        return tamanhoTanque;
    }

    /**
     * @param tamanhoTanque the tamanhoTanque to set
     */
    public void setTamanhoTanque(float tamanhoTanque) {
        this.tamanhoTanque = tamanhoTanque;
    }
}
