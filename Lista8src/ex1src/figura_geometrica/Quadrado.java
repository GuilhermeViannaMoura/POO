/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura_geometrica;

/**
 *
 * @author Guilherme
 */
public class Quadrado extends Retangulo{
    
    public void calcularArea(float lado){
        super.setArea(lado*lado);
    }
    public void calcularPerimetro(float lado){
        super.setPerimetro(lado*4);
    }
}
