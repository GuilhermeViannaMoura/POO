package l01ex02;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class L01Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int R, S, T;
        R = teclado.nextInt();
        S = teclado.nextInt();
        T = teclado.nextInt();
        
        if (R>S){
            if (R>T){
                System.out.println("Maior: " + R);
            }else{
                System.out.println("Maior: " + T);
            }
        }else{
            if (S<T){
                System.out.println("Maior: " + T);
            }else{
                System.out.println("Maior: " + S);
            }
        }
    }
    
}
