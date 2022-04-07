public class L02Ex08 {
    public static void main(String[] args) {
        Celular cel = new Celular();
        int cont=0;
        
        cel.bateria.nivelCarga = 90;
        cel.printCargaAtual();
        cel.enviaMsg();
        cel.printCargaAtual();
        
        while (cel.estaEmChamada){
            cel.chamada();
            cont++;
            if (cont>3) cel.encerraChamada(); // 15 segundos de chamada
        }
        
        cel.printCargaAtual();
    }
    
}
