/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura_geometrica;

/**
 *
 * @author Guilherme
 */
public class Retangulo extends FormaGeometrica{
    
    public void calcularArea(float lado1, float lado2){
        super.setArea(lado1*lado2);
    }
    public void calcularPerimetro(float lado1, float lado2){
        super.setPerimetro((lado1+lado2)*2);
    }
}
