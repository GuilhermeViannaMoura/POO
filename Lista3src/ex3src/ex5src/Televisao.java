public class Televisao {
    private String condicao= "desligado";
    private int volume=5;
    private int canal=0;
    private String modo= "com som";
    
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
        if (getCondicao() == "ligado"){
            condicao = "desligado";
        }else condicao = "ligado";
    }
    void silencia(){
        if (getModo() == "com som"){
            modo = "silenciado";
        }else modo = "com som";
    }

    /**
     * @return the condicao
     */
    public String getCondicao() {
        return condicao;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    /**
     * @return the modo
     */
    public String getModo() {
        return modo;
    }
    
    
}
