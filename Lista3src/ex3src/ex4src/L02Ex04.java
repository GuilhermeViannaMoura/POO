public class L02Ex04 {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.setCor("laranja");
        casa.addPorta(true);
        casa.addPorta(true);
        casa.addPorta(false);
        casa.quantasPortasEstaoAbertas();
    }
    
}
