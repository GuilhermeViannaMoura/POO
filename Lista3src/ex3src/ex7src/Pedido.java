public class Pedido {
    private Item[] itens = new Item[50];
    private int idCliente;
    private String formaDePagamento;
    private int nItens=0;
    
    float calcTotal(){
        float total=0;
        for (int i=0; i<nItens; i++){
            total += itens[i].getValor();
        }
        return total;
    }
    
    void addItem(Produto p, int q){
        Item item = new Item();
        item.setProduto(p);
        item.setQnt(q);
        itens[nItens] = item;
        nItens++;
    }
}
