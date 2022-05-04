/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l07ex03;

import figura_geometrica.Circulo;
import figura_geometrica.FiguraGeometrica;
import figura_geometrica.Quadrado;
import figura_geometrica.Triangulo;

/**
 *
 * @author Guilherme
 */
public class L07Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setAltura(5);
        q.setLargura(4);
        System.out.println(q.calcArea());
        
        Triangulo t = new Triangulo();
        t.setAltura(5);
        t.setLargura(4);
        System.out.println(t.calcArea());
        
        Circulo c = new Circulo();
        c.setRaio(5);
        System.out.println(c.calcArea());
        
        FiguraGeometrica a[] = {q,t,c};
        System.out.println("Soma das areas: "+FiguraGeometrica.somaAreas(a));
    }
    
}
