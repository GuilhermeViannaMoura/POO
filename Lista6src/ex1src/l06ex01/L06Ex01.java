/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l06ex01;

import figura_geometrica.*;

/**
 *
 * @author Aluno
 */
public class L06Ex01 {

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
    }
    
}
