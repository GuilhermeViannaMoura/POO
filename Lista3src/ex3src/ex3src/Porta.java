public class Porta {
    private boolean estado = false;
    private String cor;
    private int altura;
    private int largura;
    
    void estaAberta(){
        if(estado){
            System.out.println("A porta esta aberta!");
        }else{
            System.out.println("A porta esta fechada!");
        }
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    
    
}
