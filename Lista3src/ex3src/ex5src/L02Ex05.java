public class L02Ex05 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.ligaDesilga();
        tv.mudaCanal(22);
        tv.proxCanal();
        tv.proxCanal();
        tv.antCanal();
        tv.silencia();
        
        System.out.println(tv.getCondicao()+"\n"+tv.getCanal()+"\n"+tv.getVolume()+"\n"+tv.getModo());
    }
}
