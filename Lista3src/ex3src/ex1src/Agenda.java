public class Agenda {
    Contato[] Contatos = new Contato[100];
    int qntContatos = 0;
    
    void addContato(String nome, String numero){
        Contato c = new Contato(nome, numero);
        Contatos[qntContatos] = c;
        qntContatos++;
    }
    
    void imprimeAgenda (){
        for(int i=0; i<qntContatos; i++){
            System.out.print(Contatos[i].getNome() + " - ");
            System.out.println(Contatos[i].getNumero());
        }
    }
}
