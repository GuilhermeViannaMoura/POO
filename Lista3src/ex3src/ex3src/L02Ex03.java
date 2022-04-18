public class L02Ex03 {
    public static void main(String[] args) {
        Porta porta = new Porta();
        
        porta.estaAberta();
        porta.setEstado(true);
        porta.estaAberta();
        
        porta.setCor("azul");
        porta.setAltura(10);
        porta.setLargura(5);
        
    }
    
}
