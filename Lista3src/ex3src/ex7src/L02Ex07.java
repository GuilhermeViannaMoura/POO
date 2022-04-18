public class L02Ex07 {
    public static void main(String[] args) {
        Produto p1 = new Produto(10,100);
        
        Produto p2 = new Produto(20,200);
        
        Pedido pedido = new Pedido();
        pedido.addItem(p1, 1);
        pedido.addItem(p2, 2);
        
        System.out.println(pedido.calcTotal());
    }
}
