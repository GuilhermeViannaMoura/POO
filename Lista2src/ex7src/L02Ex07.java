public class L02Ex07 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.preco = 10;
        p1.qntEstoque = 100;
        
        Produto p2 = new Produto();
        p2.preco = 20;
        p2.qntEstoque = 200;
        
        Pedido pedido = new Pedido();
        pedido.addItem(p1, 1);
        pedido.addItem(p2, 2);
        
        System.out.println(pedido.calcTotal());
    }
}
