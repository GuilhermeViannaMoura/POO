/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura_geometrica;
import java.lang.Math. *;

/**
 *
 * @author Aluno
 */
public class Circulo extends FiguraGeometrica {
    private double raio;
    
    @Override
    public double calcArea(){
        return (Math.PI*raio*raio)/2;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
