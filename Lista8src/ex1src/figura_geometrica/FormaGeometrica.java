/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura_geometrica;

/**
 *
 * @author Guilherme
 */
public abstract class FormaGeometrica {
    private float area;
    private float perimetro;

    /**
     * @return the area
     */
    public float getArea() {
        return area;
    }

    /**
     * @return the perimetro
     */
    public float getPerimetro() {
        return perimetro;
    }

    /**
     * @param area the area to set
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
