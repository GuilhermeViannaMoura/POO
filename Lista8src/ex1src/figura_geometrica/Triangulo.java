/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura_geometrica;

/**
 *
 * @author Guilherme
 */
public class Triangulo extends FormaGeometrica{
    
    public void calcularArea(float base, float altura){
        super.setArea(base*altura);
    }
    public void calcularPerimetro(float lado1, float lado2, float lado3){
        super.setPerimetro(lado1+lado2+lado3);
    }
}
