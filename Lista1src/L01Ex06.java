package l01ex06;

/**
 *
 * @author Guilherme
 */
public class L01Ex06 {
    public static void main(String[] args) {
        int n1=0, n2=1, f;
        System.out.println(0);
        System.out.println(1);
        do{
            f = n1 + n2;
            System.out.println(f);
            n1 = n2;
            n2 = f;
        }while(f<100);
    }
}
