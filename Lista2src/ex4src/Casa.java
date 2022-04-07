public class Casa {
    String cor;
    Porta[] portas = new Porta[3];
    int qntPortasAbertas=0;
    int nPortas=0;
    
    void addPorta(boolean est){
        Porta porta = new Porta();
        porta.estado = est;
        portas[nPortas] = porta;
        nPortas++;
    }
    void quantasPortasEstaoAbertas(){
        for (int i=0; i<3; i++){
            if (portas[i].estado){
                qntPortasAbertas++;
            }
        }
        System.out.println("Tem " + qntPortasAbertas + " portas abertas na casa.");
    }
}
