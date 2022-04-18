public class L02Ex01 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        System.out.println("Antes...");
        agenda.addContato("Jorge","1234");
        agenda.imprimeAgenda();
        
        System.out.println("Depois...");
        agenda.addContato("Luis","4567");
        agenda.imprimeAgenda();
    }
}
