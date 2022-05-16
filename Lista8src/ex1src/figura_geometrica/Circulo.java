/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura_geometrica;
import java.lang.Math. *;

/**
 *
 * @author Guilherme
 */
public class Circulo extends FormaGeometrica{
    
    public void calcularArea(float raio){
        super.setArea((float) (raio*raio*Math.PI));
    }
    public void calcularPerimetro(float raio){
        super.setPerimetro((float) (2*Math.PI*raio));
    }
    
}
