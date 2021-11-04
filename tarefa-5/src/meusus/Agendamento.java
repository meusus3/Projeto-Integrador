package meusus;

public class Agendamento {
    protected char médico;
    protected String data;
    protected String horário;
    protected String hospital;
    public void status () {
        System.out.println(" Criar agendamento " + this.hospital);
        System.out.println("Marcar dia " + this.data);
        System.out.println("horário " + this.horário);
    }
    
    public void CriarAgendamento () {
        
    }

}
