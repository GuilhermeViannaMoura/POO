public class Celular {
    Bateria bateria = new Bateria();
    private boolean estaEmChamada=false;
    
    
    void enviaMsg(){
        bateria.setNivelCarga(bateria.getNivelCarga() - 1);
    }
    
    void chamada(){
        estaEmChamada = true;
        int cont=0;
        long startTime = System.currentTimeMillis();
        while (estaEmChamada){
            if ((System.currentTimeMillis()>=startTime+(cont*5000))){
                bateria.setNivelCarga(bateria.getNivelCarga() - 1);
                cont++;
            }
            if ((System.currentTimeMillis()-startTime)>=15000) encerraChamada(); // 15 segundos de chamada
        }
    }
    
    void encerraChamada(){
        estaEmChamada = false;
    }
    
    void printCargaAtual(){
        System.out.println("Nivel de carga: " + bateria.getNivelCarga());
    }
}
