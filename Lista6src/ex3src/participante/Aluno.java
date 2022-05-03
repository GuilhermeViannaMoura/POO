/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participante;

/**
 *
 * @author Guilherme
 */
public class Aluno extends Participante{
    private String curso;
    
    public Aluno(int matricula, String nome, String email, String curso){
        super.matricula = matricula;
        super.nome = nome;
        super.email = email;
        this.curso = curso;
    }
}
