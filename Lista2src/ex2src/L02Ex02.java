public class L02Ex02 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Joao";
        pessoa.idade = 15;
        
        pessoa.aniversario();
        pessoa.aniversario();
        pessoa.aniversario();
        
        System.out.println(pessoa.nome + " - " + pessoa.idade);
    }
    
}
