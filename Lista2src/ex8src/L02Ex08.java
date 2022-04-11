public class JavaApplication1 {

    public static void main(String[] args) {
        Celular cel = new Celular();
        
        cel.bateria.nivelCarga = 90;
        cel.printCargaAtual();
        cel.enviaMsg();
        cel.printCargaAtual();
        
        cel.chamada();
        
        cel.printCargaAtual();
    }
    
}
