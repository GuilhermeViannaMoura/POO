package l05ex03;

/**
 *
 * @author Guilherme
 */
public class Evento {
    private String dataInicio;
    private String dataFim;
    private String horarioInicio;
    private String horarioFim;
    private static Palestra palestras[] = new Palestra[20];
    private static int nPalestras = 0;
    
    private static Evento evento;

    private Evento(String dataInicio, String dataFim, String horarioInicio, String horarioFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }
    
    //synchronized?
    // so permite que uma unica instancia dessa classe seja criada
    public static Evento getInstance(String dataInicio, String dataFim, String horarioInicio, String horarioFim) {
	if (evento == null)
            evento = new Evento(dataInicio, dataFim, horarioInicio, horarioFim);

	return evento;
    }
    
    public static void addPalestra(Palestra palestra){
        if (nPalestras<20){
            palestras[nPalestras] = palestra;
            nPalestras++;
        }else{
            System.out.println("O número máximo de palestras já foi atingido!");
        }
    }

    public static void imprimePalestras(){
        for (int i=0; i<nPalestras; i++){
            palestras[i].imprimeDados();
        }
    }
    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the horarioInicio
     */
    public String getHorarioInicio() {
        return horarioInicio;
    }

    /**
     * @param horarioInicio the horarioInicio to set
     */
    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    /**
     * @return the horarioFim
     */
    public String getHorarioFim() {
        return horarioFim;
    }

    /**
     * @param horarioFim the horarioFim to set
     */
    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }
    
}
