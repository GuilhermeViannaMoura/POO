public class Casa {
    private String cor;
    Porta[] portas = new Porta[3];
    private int qntPortasAbertas=0;
    private int nPortas=0;
    
    void addPorta(boolean est){
        Porta porta = new Porta();
        porta.setEstado(est);
        portas[nPortas] = porta;
        nPortas++;
    }
    void quantasPortasEstaoAbertas(){
        for (int i=0; i<3; i++){
            if (portas[i].isEstado()){
                qntPortasAbertas++;
            }
        }
        System.out.println("Tem " + qntPortasAbertas + " portas abertas na casa.");
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
}
