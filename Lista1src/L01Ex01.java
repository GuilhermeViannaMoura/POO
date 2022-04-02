package l01ex01;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class L01Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n=0, a, q=0;
        n = teclado.nextInt();
        for (int i=0; i<n; i++){
            a = teclado.nextInt();
            if(a<0){
                q += 1;
            }
        }
        System.out.println("Quantidade de numeros negativos: " + q);
    }
    
}
