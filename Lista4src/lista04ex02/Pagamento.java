package lista04ex02;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Pagamento {
    private int valorPago;
    private String data;
    private String tipo;

    
    public Pagamento(int valorPago, String data, String tipo){
        this.valorPago = valorPago;
        this.data = data;
        this.tipo = tipo;
    }
    
    /**
     * @return the valorPago
     */
    public int getValorPago() {
        return valorPago;
    }

    /**
     * @param valorPago the valorPago to set
     */
    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
