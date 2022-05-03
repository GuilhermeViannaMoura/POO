/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participante;

/**
 *
 * @author Guilherme
 */
public class Professor extends Participante{
    private String departamento;
    
    public Professor(int matricula, String nome, String email, String departamento){
        super.matricula = matricula;
        super.nome = nome;
        super.email = email;
        this.departamento = departamento;
    }
}
