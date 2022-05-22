package l09ex01;

/**
 *
 * @author Guilherme
 */
public class L09Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
           Devemos realizar um throw new IllegalArgumentException para evitar
           que um argumento que pode causar algum tipo de erro no programa seja
           passado para uma certa funcao.
        */
        /*
           NumberFormatException ocorre quando uma tentativa de converter
           uma String em um tipo numerico falha porque a String nao
           estava no formato certo para que houvesse uma conversao.
           Vale pontuar que esse tipo de excessao esta incluido em
           IllegalArgumentException, logo nao faz sentido tratar ambas
           em um mesmo try/catch.
        */
        try{
            criaTesteExcessao1(5);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            String s = "teste";
            int n = Integer.parseInt(s);
            System.out.println(n);
        }catch(NumberFormatException ex){
            System.out.println("String não pode ser convertida para tipo numerico");
        }
        
        
        
        
        
    }
    public static TesteExc1 criaTesteExcessao1(int x){
        if (x < 10){
            throw new IllegalArgumentException("O argumento deve ser maior que 10!!!");
        }
        return new TesteExc1(x);
    }
}
