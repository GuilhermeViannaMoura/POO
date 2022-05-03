/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    public void addContato(Contato c){
        contatos.add(c);
    }
    public void imprimeContatos(){
        for (int i=0; i<contatos.size(); i++){
            if (contatos.get(i).getClass()==PessoaFisica.class){
                System.out.println((PessoaFisica)contatos.get(i));
            }else{
                System.out.println((PessoaJuridica)contatos.get(i));
            }
            System.out.println("--------------------");
        }
    }
    public void buscaContato(String id){
        for (int i=0; i<contatos.size(); i++){
            if (contatos.get(i).getClass()==PessoaFisica.class){
                if (((PessoaFisica)contatos.get(i)).getCpf() == id){
                    System.out.println("Resultado da busca: ");
                    System.out.println((PessoaFisica)contatos.get(i)+"\n");
                    return;
                }
            }else{
                if (((PessoaJuridica)contatos.get(i)).getCnpj() == id){
                    System.out.println("Resultado da busca: ");
                    System.out.println((PessoaJuridica)contatos.get(i)+"\n");
                    return;
                }
            }
        }
        System.out.println("Contato não encontrado.");
    }
}
