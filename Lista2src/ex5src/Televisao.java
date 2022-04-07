public class Televisao {
    String condicao= "desligado";
    int volume=5;
    int canal=0;
    String modo= "com som";
    
    void mudaCanal(int c){
        canal = c;
    }  
    void proxCanal(){
        canal++;
    }
    void antCanal(){
        canal--;
    }
    void ligaDesilga(){
        if (condicao == "ligado"){
            condicao = "desligado";
        }else condicao = "ligado";
    }
    void silencia(){
        if (modo == "com som"){
            modo = "silenciado";
        }else modo = "com som";
    }
}
