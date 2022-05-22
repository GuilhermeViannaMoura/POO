/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l09ex02;

/**
 *
 * @author Guilherme
 */
public class TesteContaCorrente {
    ContaCorrente cc = new ContaCorrente(1000,3000);
    
    public void trataExcecoes(){
        try{
            cc.sacar(10000);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        try{
            cc.depositar(-10);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        try{
            cc.setValorLimite(-100);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
