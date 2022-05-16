/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l08ex02;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class L08Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Construcao c1 = new Construcao();
        c1.setUsaEnergiaRenovavel(true);
        c1.setnLampadas(80);
        c1.setnPessoas(30);
        Construcao c2 = new Construcao();
        c2.setUsaEnergiaRenovavel(false);
        c2.setnLampadas(40);
        c2.setnPessoas(15);
        
        Carro carro1 = new Carro();
        carro1.setCombustivel("Gasolina");
        carro1.setTamanhoTanque(300);
        Carro carro2 = new Carro();
        carro2.setCombustivel("Diesel");
        carro2.setTamanhoTanque(200);
        
        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta();
        
        ArrayList<CarbonFootprint> array = new ArrayList<CarbonFootprint>();
        array.add(c1);
        array.add(c2);
        array.add(carro1);
        array.add(carro2);
        array.add(b1);
        array.add(b2);
        
        for (CarbonFootprint element : array){
            if (element.getClass().getSimpleName().equals("Construcao")){
                System.out.println("Numero de lampadas na construcao: "+((Construcao)(element)).getnLampadas());
                System.out.println("Numero de pessoas na construcao: "+((Construcao)(element)).getnPessoas());
            }else if(element.getClass().getSimpleName().equals("Carro")){
                System.out.println("Tipo de combustivel do carro: "+((Carro)(element)).getCombustivel());
                System.out.println("Tamanho do tanque do carro: "+((Carro)(element)).getTamanhoTanque());
            }else if(element.getClass().getSimpleName().equals("Bicicleta")){
                System.out.println("Bicicleta nao emite co2.");
            }
            System.out.println("Pegada de carbono em kg: "+element.getCarbonFootprint());
            System.out.println("-----------------------------------");
        }
    }
    
}
