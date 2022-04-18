public class Produto {
    private int preco;
    private int qntEstoque;

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * @return the qntEstoque
     */
    public int getQntEstoque() {
        return qntEstoque;
    }

    /**
     * @param qntEstoque the qntEstoque to set
     */
    public void setQntEstoque(int qntEstoque) {
        this.qntEstoque = qntEstoque;
    }
    
    public Produto(int preco, int qntEstoque){
        this.preco = preco;
        this.qntEstoque = qntEstoque;
    }
}
