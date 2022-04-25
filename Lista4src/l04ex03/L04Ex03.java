package l04ex03;

import java.text.ParseException;

/**
 *
 * @author Aluno
 */
public class L04Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        String date_s = "2011-01-18";
        String date2_s = "2021-05-19";
        
        Compromisso c1 = new Compromisso("compromisso A",date_s);
        Compromisso c2 = new Compromisso("compromisso B",date_s);
        Compromisso c3 = new Compromisso("compromisso C",date2_s);
        
        Agenda agenda = new Agenda();
        agenda.addCompromisso(c1);
        agenda.addCompromisso(c2);
        agenda.addCompromisso(c3);
        agenda.imprimeCompromissosDia(date2_s,"num","ptbr"); // data numerica em portugues
        agenda.imprimeCompromissosDia(date_s,"esc","eng"); // data escrita em ingles
        agenda.imprimeCompromissosDia(date_s,"esc","ptbr"); // data escrita em portugues
        
    }
}
