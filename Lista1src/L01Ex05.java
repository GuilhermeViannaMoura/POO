package l01ex05;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class L01Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, fat=1;
        N = teclado.nextInt();
        
        if (N>0){
            for (int i=N; i>0; i--){
                fat = fat * i;
            }
            System.out.println(fat);
        }else{
            System.out.println("Nao foi possivel calcular.");
        }
    }
    
}
