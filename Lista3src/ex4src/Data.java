package l03ex04;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String strmes;
    
    public Data(int dia,int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(int dia, String strmes, int ano){
        this.dia = dia;
        this.strmes = strmes;
        this.ano = ano;
    }
    public Data(int dia, int ano){
        this.dia = dia;
        this.ano = ano;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @return the strmes
     */
    public String getStrmes() {
        return strmes;
    }
    
    
}
