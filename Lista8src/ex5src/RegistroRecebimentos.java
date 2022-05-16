/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrorecebimentos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class RegistroRecebimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Recebivel> recebiveis = new ArrayList<Recebivel>();
        // implementar adicionar um recebivel na lista e imprimir a lista
        
        Scanner teclado = new Scanner(System.in);
        boolean control = true;
        int e;
        int r;
        int c;
        
        String arg1;
        int arg2;
        double arg3;
        
        while (control){
            System.out.println("Deseja criar novo registro(1) ou imprimir registros existentes(2): ");
            e = teclado.nextInt();
            if (e == 1){
                System.out.println("O novo registro eh relativo a um servico(1) ou uma relativo a uma venda(2)?");
                r = teclado.nextInt();
                switch (r) {
                    case 1:
                        {
                            System.out.println("Insira as informacoes do novo registro: ");
                            arg1 = teclado.next();
                            arg2 = teclado.nextInt();
                            arg3 = teclado.nextDouble();
                            Servico servico = new Servico(arg1,arg2,arg3);
                            recebiveis.add(servico);
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Insira as informacoes do novo registro: ");
                            arg1 = teclado.next();
                            arg2 = teclado.nextInt();
                            arg3 = teclado.nextDouble();
                            ItemVenda servico = new ItemVenda(arg1,arg2,arg3);
                            recebiveis.add(servico);
                            break;
                        }
                    default:
                        System.out.println("Tipo de registro invalido.");
                        break;
                }
                
            }else if (e == 2){
                for (Recebivel element : recebiveis){
                    System.out.println(element);
                }
            }else System.out.println("Entrada invalida.");
            System.out.println("Deseja sair? sim(1) nao(2)");
            c = teclado.nextInt();
            if (c==1) control = false;
        }
    }
    
}
