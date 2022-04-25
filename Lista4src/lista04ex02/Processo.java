package lista04ex02;

import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Processo {
    private Fatura fatura;
    private ArrayList<Boleto> boletos;
    
    
    public void processaBoleto(ArrayList<Pagamento> pagamentos){
        int somaBoletos = 0;
        //ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
        
        for (Boleto v : boletos){
            somaBoletos += v.getValor();
        }
        
        for (Boleto b : boletos){
            Pagamento pagamento = new Pagamento(b.getValor(),b.getData(),"BOLETO");
            pagamentos.add(pagamento);
        }
        
        if (fatura.getValorTotal()<=somaBoletos){
            fatura.setMarcacao("PAGO");
        }else fatura.setMarcacao("NAO PAGO");
        //return pagamentos;
    }

    
    public Processo(Fatura fatura, ArrayList<Boleto> boletos){
        this.fatura = fatura;
        this.boletos = boletos;
    }
    
    /**
     * @return the fatura
     */
    public Fatura getFatura() {
        return fatura;
    }

    /**
     * @param fatura the fatura to set
     */
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    /**
     * @return the boletos
     */
    public ArrayList<Boleto> getBoletos() {
        return boletos;
    }

    /**
     * @param boletos the boletos to set
     */
    public void setBoletos(ArrayList<Boleto> boletos) {
        this.boletos = boletos;
    }
}