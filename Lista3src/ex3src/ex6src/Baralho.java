public class Baralho {
    Carta[] baralho = new Carta[52];
    
    void criaBaralho(){
        int n=1;
        for (int i=1; i<=52; i++){
            Carta carta = new Carta();
            if (n == 13) n = 1;
            carta.setId(n);
            n++;
            if (i<=13){
                carta.setNaipe("copas");
            }else if(i<=26){
                carta.setNaipe("espadas");
            }else if(i<=39){
                carta.setNaipe("ouros");
            }else carta.setNaipe("paus");
        }
    }
}
