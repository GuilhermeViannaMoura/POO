package lista04ex02;
import java.util.ArrayList;

/**
 *
 * @author Guilherme
 */
public class Lista04Ex02 {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("24/04/2022",1500);
        
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        Boleto boleto = new Boleto(500);
        boletos.add(boleto);
        boleto = new Boleto(400);
        boletos.add(boleto);
        boleto = new Boleto(50);
        boletos.add(boleto);
        
        Processo processo = new Processo(fatura,boletos);
        ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
        //pagamentos = processo.processaBoleto();
        processo.processaBoleto(pagamentos);
        
        System.out.println("Fatura de: R$"+fatura.getValorTotal());
        System.out.println("STATUS: "+fatura.getMarcacao());
        for (Pagamento pagamento : pagamentos){
            System.out.println("Pagamento de: R$" + pagamento.getValorPago());
            System.out.println("Tipo de pagamento: " + pagamento.getTipo());
        }
    }
}
