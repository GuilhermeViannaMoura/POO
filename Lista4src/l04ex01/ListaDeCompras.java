package l04ex01;

import java.util.*;


/**
 *
 * @author Guilherme
 */
public class ListaDeCompras {
    private List<String> lista = new ArrayList<String>();
    private Scanner teclado = new Scanner(System.in);
    private String produto;
    
    public void leLista(){
        int cont=0;
        while (cont<3){
            produto = teclado.next();
            if(lista.contains(produto)){
                cont--;
            }else lista.add(produto);
            cont++;
        }
    }
    
    public void imprimirListaDeCompras(){
        Collections.sort(lista);
        System.out.println("Lista de Compras: "+lista);
    }
}
