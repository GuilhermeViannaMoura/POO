/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l08ex04;

/**
 *
 * @author Guilherme
 */
public class FuncionarioHoraExtra extends Funcionario implements Assalariado{
    private float salarioBase;
    private float pagamento;
    private float horasExtra;

    @Override
    public float getSalario() {
        return salarioBase*super.getnHoras();
    }
    
    @Override
    public void calcPagamento(){
        pagamento = getSalario()+(salarioBase*horasExtra);
    }
}
