package l01ex08;
import java.util.*;
/**
 *
 * @author Guilherme
 */
public class L01Ex08 {
    public static void main(String[] args) {
        int n, soma=0, somaLinhas=0, somaColunas=0, somaDiagonalP=0, somaDiagonalS=0;
        boolean quadradoMagico = true;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a ordem da matriz: ");
        n = teclado.nextInt();
        int[][] mat = new int[n][n];
        // Leitura da matriz
        System.out.println("Informe os elementos que compoe a matriz: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = teclado.nextInt();
            }
        }
        // Soma de referencia
        for (int i=0; i<n; i++){
            soma+=mat[0][i];
        }
        // Soma das linhas e colunas
        for (int i=0; i<n; i++){
            somaLinhas=0;
            somaColunas=0;
            for (int j=0; j<n; j++){
                somaLinhas+=mat[i][j];
                somaColunas+=mat[j][i];
            }
            if (soma!=somaLinhas || soma!=somaColunas){
                quadradoMagico = false;
                break;
            }
        }
        // Soma diagonal principal
        for (int i=0; i<n; i++){
            somaDiagonalP+=mat[i][i];
        }
        if (soma!=somaDiagonalP){
            quadradoMagico = false;
        }
        // Soma diagonal secundaria
        int linha = 0;
        for (int i=n-1; i>=0; i--){
            somaDiagonalS+=mat[linha][i];
        }
        if (soma!=somaDiagonalP){
            quadradoMagico = false;
        }
        // Resultado
        if (quadradoMagico==true){
            System.out.println("A matriz eh um quadrado magico.");
        }else{
            System.out.println("A matriz nao eh um quadrado magico.");
        }
    }
}