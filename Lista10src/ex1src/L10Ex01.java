package l10ex01;
import java.util.*;
/**
 *
 * @author Guilherme
 */
public class L10Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String,Integer> m = new HashMap<>();
        
        String frase = teclado.nextLine().toLowerCase();
        String vet[] = frase.split(" ");
        
        for (int i=0; i<vet.length; i++){
            if (m.get(vet[i]) != null)
                m.put(vet[i], m.get(vet[i])+1);
            else m.put(vet[i], 1);
        }
        
        for (int i=0; i<vet.length; i++){
            
        }
        
        for (String palavra : m.keySet()){
            System.out.println(m.get(palavra) + " ocorrências da palavra " + palavra);
        }
    }
    
}
