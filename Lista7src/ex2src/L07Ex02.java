/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l07ex02;

/**
 *
 * @author Guilherme
 */
public class L07Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Par par1 = new Par(5, 2.5);
        Par par2 = new Par("nome",'c');
        
        System.out.println(par1.getE1().getClass().getSimpleName() + " / " + par1.getE2().getClass().getSimpleName());
        System.out.println(par2.getE1().getClass().getSimpleName() + " / " + par2.getE2().getClass().getSimpleName());
        
    }
    
}
