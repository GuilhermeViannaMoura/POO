/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l06ex02;
import agenda.*;

/**
 *
 * @author Aluno
 */
public class L06Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setRazaoSocial("rz1");
        pj1.setCnpj("cnpj1");
        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.setRazaoSocial("rz2");
        pj2.setCnpj("cnpj2");
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("nome1");
        pf1.setCpf("cpf1");
        PessoaFisica pf2 = new PessoaFisica();
        pf2.setNome("nome2");
        pf2.setCpf("cpf2");
        
        Agenda agenda = new Agenda();
        agenda.addContato(pj1);
        agenda.addContato(pj2);
        agenda.addContato(pf1);
        agenda.addContato(pf2);
        
        agenda.imprimeContatos();
        agenda.buscaContato("cnpj2");
        
    }
    
}
