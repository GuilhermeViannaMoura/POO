/*
    ESSE PROJETO ESTA COM ALGUMAS ALTERACOES DA VERSAO ORIGINAL QUE O EXERCICIO PEDE
    AS MUDANCAS FORAM EM RELACAO E HERANÇA E POLIMORFISMO
 */
package l05ex03;

import participante.*;

/**
 *
 * @author Guilherme
 */
public class L05Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cria evento
        Evento.getInstance("01/04/2022", "05/04/2022", "08:00", "16:00");
        
        //Cadastra palestra
        Palestra palestra1 = new Palestra("t1","n1","l1","d1","h1","p1",3);
        Evento.addPalestra(palestra1);
        
        Palestra palestra2 = new Palestra("t2","n2","l2","d2","h2","p2",2);
        Evento.addPalestra(palestra2);
        
        //Cadastra participante
//        Participante participante1 = new Participante(1234,"Joao","joao@gmail.com");
        Aluno participante1 = new Aluno(1234,"Joao","joao@gmail.com","ciencia da computacao");
        palestra1.addParticipante(participante1);
        palestra2.addParticipante(participante1);
        
//        Participante participante2 = new Participante(2234,"Jorge","jorge@gmail.com");
        Professor participante2 = new Professor(2234,"Jorge","jorge@gmail.com","instituto de computacao");
        palestra1.addParticipante(participante2);
        palestra2.addParticipante(participante2);
        
//        Participante participante3 = new Participante(3234,"Mateus","mateus@gmail.com");
        Funcionario participante3 = new Funcionario(3234,"Mateus","mateus@gmail.com","coordenador");
        //palestra1.addParticipante(participante3);
        palestra2.addParticipante(participante3);
        
        palestra1.consultaVagas();
        palestra2.consultaVagas();
        
        Evento.imprimePalestras();
    }
    
}
