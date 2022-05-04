/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l07ex02;

/**
 *
 * @author Guilherme
 */
public class Par<F, S> {
    private F e1;
    private S e2;
    
    public Par(F e1, S e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    /**
     * @return the e1
     */
    public F getE1() {
        return e1;
    }

    /**
     * @param e1 the e1 to set
     */
    public void setE1(F e1) {
        this.e1 = e1;
    }

    /**
     * @return the e2
     */
    public S getE2() {
        return e2;
    }

    /**
     * @param e2 the e2 to set
     */
    public void setE2(S e2) {
        this.e2 = e2;
    }
    
}
