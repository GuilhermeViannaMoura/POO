package l09ex02;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;
    
    public ContaCorrente(float limite, float saldo){
        this.limite = limite;
        this.saldo = saldo;
    }
    
    public void sacar(float valor){
        if (valor <= 0 || valor > saldo){
            throw new IllegalArgumentException("Valor de saque invalido!!!");
        }
        saldo -= valor;
    }
    public void depositar(float valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de deposito invalido!!!");
        }
        saldo += valor;
    }
    public void setValorLimite(float valorLimite) {
        if (valorLimite < 0){
            throw new IllegalArgumentException("Valor para novo limite invalido!!!");
        }
        this.valorLimite = valorLimite;
    }
    
}
