/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l04ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author Aluno
 */
public class Agenda {
    ArrayList<Compromisso> agenda = new ArrayList<Compromisso>();
    
    public void imprimeCompromissosDia(String dia, String modo, String idioma) throws ParseException{
        //SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd");
        //Date date = dt.parse(dia);
        //SimpleDateFormat dt1 = new SimpleDateFormat("EEE, MMM d, yyyy");
        
        SimpleDateFormat dt;
        Date date;
        SimpleDateFormat dt1;
        if (idioma.equals("ptbr")){
            dt = new SimpleDateFormat("yyyy-mm-dd");
            dt1 = new SimpleDateFormat("EEE, MMM d, yyyy");
            date = dt.parse(dia);
        }else if(idioma.equals("eng")){
            dt = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
            dt1 = new SimpleDateFormat("EEE, MMM d, yyyy", Locale.ENGLISH);
            date = dt.parse(dia);
        }else {
            System.out.println("Idioma inválido.");
            return;
        }
        
        System.out.println("-------------------");
        System.out.println("Compromissos de :"+ dia);
        System.out.println();
        for (int i=0; i<agenda.size();i++){
            if (dia.equals(agenda.get(i).getData())){
                System.out.print(agenda.get(i).getTitulo()+ ", ");
                if (modo.equals("num")){
                    System.out.println(dt.format(date));
                }else if (modo.equals("esc")){
                    System.out.println(dt1.format(date));
                }else System.out.println("Formato inválido.");
            }
        }
    }
    public void addCompromisso(Compromisso c){
        agenda.add(c);
    }
}
