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
    
    public static <T extends FiguraGeometrica> double somaAreas(T array[]){
        double area = 0;
        for (T elemento: array){
            area += elemento.calcArea();
        }
        return area;
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
