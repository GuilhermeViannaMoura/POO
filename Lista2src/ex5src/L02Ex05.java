public class L02Ex05 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.ligaDesilga();
        tv.mudaCanal(22);
        tv.proxCanal();
        tv.proxCanal();
        tv.antCanal();
        tv.silencia();
        
        System.out.println(tv.condicao+"\n"+tv.canal+"\n"+tv.volume+"\n"+tv.modo);
    }
}
