public class Baralho {
    Carta[] baralho = new Carta[52];
    
    void criaBaralho(){
        int n=1;
        for (int i=1; i<=52; i++){
            Carta carta = new Carta();
            if (n == 13) n = 1;
            carta.id = n;
            n++;
            if (i<=13){
                carta.naipe = "copas";
            }else if(i<=26){
                carta.naipe = "espadas";
            }else if(i<=39){
                carta.naipe = "ouros";
            }else carta.naipe = "paus";
        }
    }
}
