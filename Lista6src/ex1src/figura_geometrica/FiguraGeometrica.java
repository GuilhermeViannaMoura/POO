package figura_geometrica;

/**
 *
 * @author Aluno
 */
public class FiguraGeometrica {
    private double altura;
    private double largura;
    
    public double calcArea(){
        return largura*altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }
}
