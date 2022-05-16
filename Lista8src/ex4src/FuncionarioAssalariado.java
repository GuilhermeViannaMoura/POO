/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l08ex04;

/**
 *
 * @author Guilherme
 */
public class FuncionarioAssalariado extends Funcionario implements Assalariado{
    private float salario;
    private float pagamento;
    
    @Override
    public float getSalario() {
        return salario;
    }
    
    @Override
    public void calcPagamento(){
        pagamento = getSalario();
    }
}
