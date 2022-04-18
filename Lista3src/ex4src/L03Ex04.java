package l03ex04;

public class L03Ex04 {
    public static void main(String[] args) {
        Data data1 = new Data(29,7,2001);
        Data data2 = new Data(4,3,1968);
        System.out.println(data1.getDia()+"/"+data1.getMes()+"/"+data1.getAno());
        System.out.println(data2.getDia()+"/"+data2.getMes()+"/"+data2.getAno());
        
        System.out.println("----------------------------------");
        
        Data data3 = new Data(29,"Julho",2001);
        Data data4 = new Data(4,"Marco",1968);
        System.out.println(data3.getStrmes()+" "+data3.getDia()+", "+data3.getAno());
        System.out.println(data4.getStrmes()+" "+data4.getDia()+", "+data4.getAno());
        
        System.out.println("----------------------------------");
        
        Data data5 = new Data(210,2001);
        Data data6 = new Data(90,1968);
        System.out.println(data5.getDia()+" "+data5.getAno());
        System.out.println(data6.getDia()+" "+data6.getAno());
    }
    
}
