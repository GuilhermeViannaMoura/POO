public class Pessoa {
    private String nome;
    private int idade;
    
    void aniversario(){
        setIdade(getIdade() + 1);
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
