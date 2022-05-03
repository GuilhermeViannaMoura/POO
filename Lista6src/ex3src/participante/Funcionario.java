/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participante;

/**
 *
 * @author Guilherme
 */
public class Funcionario extends Participante {
    private String cargo;
    
    public Funcionario(int matricula, String nome, String email, String cargo){
        super.matricula = matricula;
        super.nome = nome;
        super.email = email;
        this.cargo = cargo;
    }
}
