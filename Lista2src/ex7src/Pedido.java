public class Pedido {
    Item[] itens = new Item[50];
    int idCliente;
    String formaDePagamento;
    int nItens=0;
    
    float calcTotal(){
        float total=0;
        for (int i=0; i<nItens; i++){
            total += itens[i].getValor();
        }
        return total;
    }
    
    void addItem(Produto p, int q){
        Item item = new Item();
        item.produto = p;
        item.qnt = q;
        itens[nItens] = item;
        nItens++;
    }
}
