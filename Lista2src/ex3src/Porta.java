public class Porta {
    boolean estado = false;
    String cor;
    int altura;
    int largura;
    
    void estaAberta(){
        if(estado){
            System.out.println("A porta esta aberta!");
        }else{
            System.out.println("A porta esta fechada!");
        }
    }
}
