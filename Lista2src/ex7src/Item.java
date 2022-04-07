public class Item {
    Produto produto;
    int qnt;
    
    float getValor(){
        return produto.preco * qnt;
    }
}
