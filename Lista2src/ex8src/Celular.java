public class Celular {
    Bateria bateria;
    boolean estaEmChamada=false;
    
    void enviaMsg(){
        bateria.nivelCarga -= 1;
    }
    
    void chamada(){
        
        try{
            Thread.sleep(5*1000);// aguarda 5 segundos
        }catch(InterruptedException e){}
        
        bateria.nivelCarga -= 1;
        
        estaEmChamada = true;
    }
    
    void encerraChamada(){
        estaEmChamada = false;
    }
    
    void printCargaAtual(){
        System.out.println("Nivel de carga: " + bateria.nivelCarga);
    }
}
