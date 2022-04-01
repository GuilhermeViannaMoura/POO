package l01ex07;
import java.util.*;

/**
 *
 * @author Guilherme
 */
public class L01Ex07 {
    public static void main(String[] args) {
        int n=1;
        Scanner teclado = new Scanner(System.in);
        List<Integer> av = new ArrayList<Integer>();
        int P=0, R=0, B=0, O=0;
        while(true){
            n = teclado.nextInt();
            if (n<0 || n>100){
                break;
            }
            av.add(n);
        }
        
        for (int i=0; i<av.size(); i++){
            if (av.get(i)<25){
                P+=1;
            }else if (av.get(i)<50){
                R+=1;
            }else if (av.get(i)<75){
                B+=1;
            }else{
                O+=1;
            }
        }
        
        System.out.println((100*P)/av.size() + "% dos funcionarios avaliaram como pessimo.");
        System.out.println((100*R)/av.size() + "% dos funcionarios avaliaram como ruim.");
        System.out.println((100*B)/av.size() + "% dos funcionarios avaliaram como bom.");
        System.out.println((100*O)/av.size() + "% dos funcionarios avaliaram como otimo.");
    }
}
