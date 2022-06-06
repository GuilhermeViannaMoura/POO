package l10ex02;

import java.util.*;

/**
 *
 * @author Guilherme
 */
public class L10Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("str1");
        al.add("str2");
        al.add("str3");
        al.add("str4");
        al.add("str5");       
        System.out.println("ArrayList: " + al);
        
        Set<String> hs = new HashSet<>(al);
        System.out.println("HashSet: " + hs);
        
        PriorityQueue<String> pq = new PriorityQueue<>(hs);
        System.out.println("PriorityQueue: " + pq);
        
        ArrayDeque<String> ad = new ArrayDeque<>(pq);
        System.out.println("ArrayDeque: " + ad);
        
        TreeSet<String> ts = new TreeSet<>(ad);
        System.out.println("TreeSet: " + ts);
        
        /*
            As strings são exibidas em diferentes ordens dependendo da Collection usada pois
            diferentes Collections possuem diferentes formas de ordenar seus elementos
            (classificada ou ordenada), inclusive não os ordenando.
        */
    }
    
}
