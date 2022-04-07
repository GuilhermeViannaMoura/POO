public class Agenda {
    Contato[] Contatos = new Contato[100];
    int qntContatos = 0;
    
    void addContato(String nome, String numero){
        Contato c = new Contato();
        c.nome = nome;
        c.numero = numero;
        Contatos[qntContatos] = c;
        qntContatos++;
    }
    
    void imprimeAgenda (){
        for(int i=0; i<qntContatos; i++){
            System.out.print(Contatos[i].nome + " - ");
            System.out.println(Contatos[i].numero);
        }
    }
}
