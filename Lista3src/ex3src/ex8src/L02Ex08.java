public class L02Ex08 {

    public static void main(String[] args) {
        Celular cel = new Celular();
        
        cel.bateria.setNivelCarga(90);
        cel.printCargaAtual();
        cel.enviaMsg();
        cel.printCargaAtual();
        
        cel.chamada();
        
        cel.printCargaAtual();
    }
    
}
