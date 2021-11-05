package meusus;

public class Agendamento {
    protected String médico;
    protected String data;
    protected String horário;
    protected String hospital;

    public Agendamento(String hospital, String data, String horário, String medico) {
        this.hospital = hospital;
        this.data = data;
        this.horário = horário;
        this.médico = medico;  
    }

    public String getMédico() {
        return médico;
    }

    public void setMédico(String médico) {
        this.médico = médico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorário() {
        return horário;
    }

    public void setHorário(String horário) {
        this.horário = horário;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }    

    public void status () {
        System.out.println("CONSULTA");
        System.out.println("Local: " + this.hospital);
        System.out.println("Marcar dia: " + this.data);
        System.out.println("horário: " + this.horário);
        System.out.println("Médico: " + this.médico);
    }

}
