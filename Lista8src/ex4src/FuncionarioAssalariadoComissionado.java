/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l08ex04;

/**
 *
 * @author Guilherme
 */
public class FuncionarioAssalariadoComissionado extends Funcionario implements Assalariado,Comissionado{
    private float salarioBase;
    private float totalVendas;
    private float pagamento;
    
    @Override
    public float getSalario() {
        return salarioBase*super.getnHoras();
    }

    @Override
    public float getComissao() {
        return (float)(0.08*totalVendas);
    }
    
    @Override
    public void calcPagamento(){
        pagamento = getComissao()+getSalario();
    }
}
